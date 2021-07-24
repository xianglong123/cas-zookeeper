package com.cas.zk;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/7/23 3:53 下午
 * @desc 服务器上下线监控
 */
public class DistributeClient {

    private String connect = "hadoop100:2181,hadoop101:2181,hadoop102:2181";
    private int sessionTimeout = 2000;
    private ZooKeeper zk;

    public static void main(String[] args) throws Exception {
        DistributeClient client = new DistributeClient();

        // 1 获取zk连接
        client.getConnect();

        // 2 监听/servers 下面子节点的增加和删除
        client.getServerList();

        // 3 业务逻辑
        client.business();
    }

    private void business() throws InterruptedException {
        Thread.sleep(Long.MAX_VALUE);
    }

    private void getServerList() throws KeeperException, InterruptedException {
        List<String> children = zk.getChildren("/servers", true);
        List<String> servers = new ArrayList<>();
        children.forEach(ch -> {
            try {
                servers.add(new String(zk.getData("/servers/" + ch, false, null)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // 打印
        System.out.println(servers);
    }

    private void getConnect() throws IOException {
        zk = new ZooKeeper(connect, sessionTimeout, event -> {
            try {
                getServerList();
            } catch (KeeperException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

    }




}
