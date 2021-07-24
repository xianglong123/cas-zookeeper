package com.cas.zk;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/7/23 12:12 下午
 * @desc
 */
public class ZkClient {


    private ZooKeeper zk;

    @Before
    public void init() throws IOException {
        String connect = "hadoop100:2181,hadoop101:2181,hadoop102:2181";
        int sessionTimeout = 2000;
        zk = new ZooKeeper(connect, sessionTimeout, event -> {
            List<String> children = null;
            try {
                children = zk.getChildren("/", true);
                children.forEach(System.out::print);
            } catch (Exception e) {

            }
        });
    }

    /**
     * 创建节点
     * @throws KeeperException
     * @throws InterruptedException
     */
    @Test
    public void create() throws KeeperException, InterruptedException {
        String nodeCreated = zk.create("/cas", "xianglong".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println(nodeCreated);
    }

    /**
     * 监听节点变化
     * @throws KeeperException
     * @throws InterruptedException
     */
    @Test
    public void getChildren() throws KeeperException, InterruptedException {
        List<String> children = zk.getChildren("/", true);
        children.forEach(System.out::print);
        // 延时
        Thread.sleep(Integer.MAX_VALUE);
    }

    /**
     * 判断节点是否存在
     */
    @Test
    public void esist() throws KeeperException, InterruptedException {
        Stat exists = zk.exists("/cas", false);
        System.out.println(exists == null ? "not exist" : "exist");
    }

}
