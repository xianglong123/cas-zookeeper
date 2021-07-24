package com.cas.zk;

import org.apache.zookeeper.*;

import java.io.IOException;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/7/23 3:39 下午
 * @desc zk服务器上下线监控
 */
public class DistributeServer {

    private String connect = "hadoop100:2181,hadoop101:2181,hadoop102:2181";
    private int sessionTimeout = 2000;
    private ZooKeeper zk;

    public static void main(String[] args) throws Exception {
        DistributeServer server = new DistributeServer();
        // 1 获取zk连接
        server.getConnect();

        // 2 注册服务器到zk集群
        server.regist(args[0]);

        // 3 启动业务逻辑
        server.business();
    }

    private void business() throws InterruptedException {
        Thread.sleep(Long.MAX_VALUE);
    }

    private void regist(String hostname) throws KeeperException, InterruptedException {
        String nodeCreated = zk.create("/servers/" + hostname, hostname.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
        System.out.println(hostname + "  is online");
    }

    private void getConnect() throws IOException {
        zk = new ZooKeeper(connect, sessionTimeout, event -> { });

    }


}
