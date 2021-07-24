package com.cas.lock;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.ExponentialBackoffRetry;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/7/23 4:59 下午
 * @desc 框架级别zk分布式锁
 */
public class CuratorLockTest {


    public static void main(String[] args) {

        // 创建分布式锁1
        InterProcessMutex lock1 = new InterProcessMutex(getCuratorFramework(), "/locks");

        InterProcessMutex lock2 = new InterProcessMutex(getCuratorFramework(), "/locks");

        new Thread(() -> {
            try {
                lock1.acquire();
                System.out.println("线程1 获取到锁");

                lock1.acquire();
                System.out.println("线程1 再次获取到锁");

                Thread.sleep(5 * 1000);

                lock1.release();
                System.out.println("线程1 释放锁");

                lock1.release();
                System.out.println("线程1 再次释放锁");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();


        new Thread(() -> {
            try {
                lock2.acquire();
                System.out.println("线程2 获取到锁");

                lock2.acquire();
                System.out.println("线程2 再次获取到锁");

                Thread.sleep(5 * 1000);

                lock2.release();
                System.out.println("线程2 释放锁");

                lock2.release();
                System.out.println("线程2 再次释放锁");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();


    }

    private static CuratorFramework getCuratorFramework() {
        ExponentialBackoffRetry policy = new ExponentialBackoffRetry(3000, 3);

        CuratorFramework client = CuratorFrameworkFactory.builder().connectString("hadoop100:2181,hadoop101:2181,hadoop102:2181")
                .connectionTimeoutMs(2000)
                .sessionTimeoutMs(2000)
                .retryPolicy(policy).build();

        // 启动客户端
        client.start();

        return client;
    }


}
