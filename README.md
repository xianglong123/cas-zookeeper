### zookeeper学习笔记


### 配置环境
*1、将zoo.cgf的地址修改成*
```bash
dataDir=/usr/local/zookeeper-3.5.7/zkData
```

### 启动zk
```bash
[root@hadoop100 bin]# ./zkServer.sh start
ZooKeeper JMX enabled by default
Using config: /usr/local/zookeeper-3.5.7/bin/../conf/zoo.cfg
Starting zookeeper ... STARTED
[root@hadoop100 bin]# jps -l
1464 sun.tools.jps.Jps
1423 org.apache.zookeeper.server.quorum.QuorumPeerMain
```

### 客户端连接
```bash
[root@hadoop100 bin]# ./zkCli.sh 
Connecting to localhost:2181
2021-07-22 22:30:44,308 [myid:] - INFO  [main:Environment@109] - Client environment:zookeeper.version=3.5.7-f0fdd52973d373ffd9c86b81d99842dc2c7f660e, built on 02/10/2020 11:30 GMT
2021-07-22 22:30:44,310 [myid:] - INFO  [main:Environment@109] - Client environment:host.name=hadoop100
2021-07-22 22:30:44,310 [myid:] - INFO  [main:Environment@109] - Client environment:java.version=1.8.0_291
2021-07-22 22:30:44,312 [myid:] - INFO  [main:Environment@109] - Client environment:java.vendor=Oracle Corporation
2021-07-22 22:30:44,312 [myid:] - INFO  [main:Environment@109] - Client environment:java.home=/usr/local/jdk1.8.0_291/jre
2021-07-22 22:30:44,312 [myid:] - INFO  [main:Environment@109] - Client environment:java.class.path=/usr/local/zookeeper-3.5.7/bin/../zookeeper-server/target/classes:/usr/local/zookeeper-3.5.7/bin/../build/classes:/usr/local/zookeeper-3.5.7/bin/../zookeeper-server/target/lib/*.jar:/usr/local/zookeeper-3.5.7/bin/../build/lib/*.jar:/usr/local/zookeeper-3.5.7/bin/../lib/zookeeper-jute-3.5.7.jar:/usr/local/zookeeper-3.5.7/bin/../lib/zookeeper-3.5.7.jar:/usr/local/zookeeper-3.5.7/bin/../lib/slf4j-log4j12-1.7.25.jar:/usr/local/zookeeper-3.5.7/bin/../lib/slf4j-api-1.7.25.jar:/usr/local/zookeeper-3.5.7/bin/../lib/netty-transport-native-unix-common-4.1.45.Final.jar:/usr/local/zookeeper-3.5.7/bin/../lib/netty-transport-native-epoll-4.1.45.Final.jar:/usr/local/zookeeper-3.5.7/bin/../lib/netty-transport-4.1.45.Final.jar:/usr/local/zookeeper-3.5.7/bin/../lib/netty-resolver-4.1.45.Final.jar:/usr/local/zookeeper-3.5.7/bin/../lib/netty-handler-4.1.45.Final.jar:/usr/local/zookeeper-3.5.7/bin/../lib/netty-common-4.1.45.Final.jar:/usr/local/zookeeper-3.5.7/bin/../lib/netty-codec-4.1.45.Final.jar:/usr/local/zookeeper-3.5.7/bin/../lib/netty-buffer-4.1.45.Final.jar:/usr/local/zookeeper-3.5.7/bin/../lib/log4j-1.2.17.jar:/usr/local/zookeeper-3.5.7/bin/../lib/json-simple-1.1.1.jar:/usr/local/zookeeper-3.5.7/bin/../lib/jline-2.11.jar:/usr/local/zookeeper-3.5.7/bin/../lib/jetty-util-9.4.24.v20191120.jar:/usr/local/zookeeper-3.5.7/bin/../lib/jetty-servlet-9.4.24.v20191120.jar:/usr/local/zookeeper-3.5.7/bin/../lib/jetty-server-9.4.24.v20191120.jar:/usr/local/zookeeper-3.5.7/bin/../lib/jetty-security-9.4.24.v20191120.jar:/usr/local/zookeeper-3.5.7/bin/../lib/jetty-io-9.4.24.v20191120.jar:/usr/local/zookeeper-3.5.7/bin/../lib/jetty-http-9.4.24.v20191120.jar:/usr/local/zookeeper-3.5.7/bin/../lib/javax.servlet-api-3.1.0.jar:/usr/local/zookeeper-3.5.7/bin/../lib/jackson-databind-2.9.10.2.jar:/usr/local/zookeeper-3.5.7/bin/../lib/jackson-core-2.9.10.jar:/usr/local/zookeeper-3.5.7/bin/../lib/jackson-annotations-2.9.10.jar:/usr/local/zookeeper-3.5.7/bin/../lib/commons-cli-1.2.jar:/usr/local/zookeeper-3.5.7/bin/../lib/audience-annotations-0.5.0.jar:/usr/local/zookeeper-3.5.7/bin/../zookeeper-*.jar:/usr/local/zookeeper-3.5.7/bin/../zookeeper-server/src/main/resources/lib/*.jar:/usr/local/zookeeper-3.5.7/bin/../conf:.:/usr/local/jdk1.8.0_291/lib:/usr/local/jdk1.8.0_291/jre/lib:
2021-07-22 22:30:44,312 [myid:] - INFO  [main:Environment@109] - Client environment:java.library.path=/usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib
2021-07-22 22:30:44,312 [myid:] - INFO  [main:Environment@109] - Client environment:java.io.tmpdir=/tmp
2021-07-22 22:30:44,312 [myid:] - INFO  [main:Environment@109] - Client environment:java.compiler=<NA>
2021-07-22 22:30:44,312 [myid:] - INFO  [main:Environment@109] - Client environment:os.name=Linux
2021-07-22 22:30:44,312 [myid:] - INFO  [main:Environment@109] - Client environment:os.arch=amd64
2021-07-22 22:30:44,312 [myid:] - INFO  [main:Environment@109] - Client environment:os.version=3.10.0-1160.el7.x86_64
2021-07-22 22:30:44,313 [myid:] - INFO  [main:Environment@109] - Client environment:user.name=root
2021-07-22 22:30:44,313 [myid:] - INFO  [main:Environment@109] - Client environment:user.home=/root
2021-07-22 22:30:44,313 [myid:] - INFO  [main:Environment@109] - Client environment:user.dir=/usr/local/zookeeper-3.5.7/bin
2021-07-22 22:30:44,313 [myid:] - INFO  [main:Environment@109] - Client environment:os.memory.free=13MB
2021-07-22 22:30:44,314 [myid:] - INFO  [main:Environment@109] - Client environment:os.memory.max=247MB
2021-07-22 22:30:44,314 [myid:] - INFO  [main:Environment@109] - Client environment:os.memory.total=15MB
2021-07-22 22:30:44,316 [myid:] - INFO  [main:ZooKeeper@868] - Initiating client connection, connectString=localhost:2181 sessionTimeout=30000 watcher=org.apache.zookeeper.ZooKeeperMain$MyWatcher@5fcfe4b2
2021-07-22 22:30:44,328 [myid:] - INFO  [main:X509Util@79] - Setting -D jdk.tls.rejectClientInitiatedRenegotiation=true to disable client-initiated TLS renegotiation
2021-07-22 22:30:44,333 [myid:] - INFO  [main:ClientCnxnSocket@237] - jute.maxbuffer value is 4194304 Bytes
2021-07-22 22:30:44,342 [myid:] - INFO  [main:ClientCnxn@1653] - zookeeper.request.timeout value is 0. feature enabled=
2021-07-22 22:30:44,351 [myid:localhost:2181] - INFO  [main-SendThread(localhost:2181):ClientCnxn$SendThread@1112] - Opening socket connection to server localhost/0:0:0:0:0:0:0:1:2181. Will not attempt to authenticate using SASL (unknown error)
Welcome to ZooKeeper!
2021-07-22 22:30:44,367 [myid:localhost:2181] - INFO  [main-SendThread(localhost:2181):ClientCnxn$SendThread@959] - Socket connection established, initiating session, client: /0:0:0:0:0:0:0:1:56254, server: localhost/0:0:0:0:0:0:0:1:2181
JLine support is enabled
2021-07-22 22:30:44,459 [myid:localhost:2181] - INFO  [main-SendThread(localhost:2181):ClientCnxn$SendThread@1394] - Session establishment complete on server localhost/0:0:0:0:0:0:0:1:2181, sessionid = 0x100000b865d0000, negotiated timeout = 30000

WATCHER::

WatchedEvent state:SyncConnected type:None path:null
[zk: localhost:2181(CONNECTED) 0] ls
ls [-s] [-w] [-R] path
[zk: localhost:2181(CONNECTED) 1] ls /
[zookeeper]
[zk: localhost:2181(CONNECTED) 2] quit

WATCHER::

WatchedEvent state:Closed type:None path:null
2021-07-22 22:31:02,805 [myid:] - INFO  [main:ZooKeeper@1422] - Session: 0x100000b865d0000 closed
2021-07-22 22:31:02,806 [myid:] - INFO  [main-EventThread:ClientCnxn$EventThread@524] - EventThread shut down for session: 0x100000b865d0000
[root@hadoop100 bin]# client_loop: send disconnect: Broken pipe

```

### zoo.cfg解读
```bash
[root@hadoop100 conf]# cat zoo.cfg 
#The number of milliseconds of each tick
# 通信心跳时间
tickTime=2000 
# The number of ticks that the initial 
# synchronization phase can take
initLimit=10
# The number of ticks that can pass between 
# sending a request and getting an acknowledgement
syncLimit=5
# the directory where the snapshot is stored.
# do not use /tmp for storage, /tmp here is just 
# example sakes.
dataDir=/usr/local/zookeeper-3.5.7/zkData
# the port at which the clients will connect
# 客户端连接端口
clientPort=2181
# the maximum number of client connections.
# increase this if you need to handle more clients
#maxClientCnxns=60
#
# Be sure to read the maintenance section of the 
# administrator guide before turning on autopurge.
#
# http://zookeeper.apache.org/doc/current/zookeeperAdmin.html#sc_maintenance
#
# The number of snapshots to retain in dataDir
#autopurge.snapRetainCount=3
# Purge task interval in hours
# Set to "0" to disable auto purge feature
#autopurge.purgeInterval=1
```

### 配置myid 
```bash
[root@hadoop100 zkData]# vi myid
[root@hadoop100 zkData]# cat myid 
2
```
[myid3](./src/main/resources/static/myid3.png)
[myid4](./src/main/resources/static/myid4.png)

### 配置集群
**在zoo.cfg末尾加如下配置**
```bash
#####################cluster##################
server.2=hadoop100:2888:3888
server.3=hadoop101:2888:3888
server.4=hadoop102:2888:3888
```

### 启动一台zk集群的效果
```bash
[root@hadoop100 zookeeper-3.5.7]# bin/zkServer.sh start
ZooKeeper JMX enabled by default
Using config: /usr/local/zookeeper-3.5.7/bin/../conf/zoo.cfg
Starting zookeeper ... STARTED
[root@hadoop100 zookeeper-3.5.7]# bin/zkServer.sh status
ZooKeeper JMX enabled by default
Using config: /usr/local/zookeeper-3.5.7/bin/../conf/zoo.cfg
Client port found: 2181. Client address: localhost.
Error contacting service. It is probably not running.
```

### 再启动一台zk看效果
```bash
[root@hadoop100 zookeeper-3.5.7]# bin/zkServer.sh status
ZooKeeper JMX enabled by default
Using config: /usr/local/zookeeper-3.5.7/bin/../conf/zoo.cfg
Client port found: 2181. Client address: localhost.
Mode: follower 
```
```bash
[root@hadoop102 zookeeper-3.5.7]# bin/zkServer.sh status
ZooKeeper JMX enabled by default
Using config: /usr/local/zookeeper-3.5.7/bin/../conf/zoo.cfg
Client port found: 2181. Client address: localhost.
Mode: leader
```

### 启动和停止脚本
```bash
[root@hadoop102 bin]# cat zk
#!/bin/bash

case $1 in
"start"){
	for host in hadoop100 hadoop101  hadoop102
	do
        echo ================== $host ===================
            ssh $host "/usr/local/zookeeper-3.5.7/bin/zkServer.sh start"
	done
}
;;
"stop"){
        for host in hadoop100 hadoop101  hadoop102
        do
        echo ================== $host ===================
            ssh $host "/usr/local/zookeeper-3.5.7/bin/zkServer.sh start"
        done
}
;;
"status"){
        for host in hadoop100 hadoop101  hadoop102
        do
        echo ================== $host ===================
            ssh $host "/usr/local/zookeeper-3.5.7/bin/zkServer.sh start"
        done
}
;;
esac
```

#### 问题1:在使用ssh命令的时候出现了找不到JAVA_HOME的问题
    通过ssh登陆之后会发现找不到JAVA_HOME ，我的JAVA_HOME是定义在/etc/profile 里面的。
    
    研究后发现远程登录和直接登录执行的文件是不一样的：
    
    /etc/profile: 当用户登录时,该文件被执行.
    /etc/bashrc: 当bash shell被打开时,该文件被执行.
    ssh作为远程登录的方式进入，当然就无法触发/etc/profile的执行，所以会发生找不到JAVA_HOME的问题，所以需要将java的配置信息配置到bashrc的文件中去，配置步骤如下所示：
    
    .bashrc是一个隐藏的文件，要打开并修改该文件需要：
    
    (1) 命令 vim ~/.bashrc 进入到文件；
    
    (2) 直接按 i 键可以对文件进行修改， Esc + ：+ wq退出并保存修改之后的文件
    
    (3) 命令 ：source ~/.bashrc 更新 .bashrc
    
    对该文件进行修改保存后，在执行相关的操作，就不会发生如上的问题啦。
    
#### 节点类型
    持久(Persistent): 客户端和服务端断开连接后，创建的节点不会删除。
    短暂(Ephemeral): 客户端和服务器端断开连接后，创建的节点自己删除
    
### 创建节点
```bash
[zk: localhost:2181(CONNECTED) 0] ls /
[zookeeper]
[zk: localhost:2181(CONNECTED) 1] create /sanguo "diaochao"
Created /sanguo
[zk: localhost:2181(CONNECTED) 2] ls /
[sanguo, zookeeper]
[zk: localhost:2181(CONNECTED) 3] create /sanguo/shuguo "liubei"
Created /sanguo/shuguo
[zk: localhost:2181(CONNECTED) 4] ls /
[sanguo, zookeeper]
[zk: localhost:2181(CONNECTED) 5] ls /sanguo/
Path must not end with / character
[zk: localhost:2181(CONNECTED) 6] ls /sanguo
[shuguo]
[zk: localhost:2181(CONNECTED) 7] get -s /sanguo
diaochao
cZxid = 0x300000002
ctime = Fri Jul 23 00:24:28 CST 2021
mZxid = 0x300000002
mtime = Fri Jul 23 00:24:28 CST 2021
pZxid = 0x300000003
cversion = 1
dataVersion = 0
aclVersion = 0
ephemeralOwner = 0x0
dataLength = 8
numChildren = 1
[zk: localhost:2181(CONNECTED) 8] 
```

### 创建带序号的节点
**带序号可以重复创建 [create -s ...]**
```bash
[zk: localhost:2181(CONNECTED) 8] create /sanguo/weiguo "caocao"
Created /sanguo/weiguo
[zk: localhost:2181(CONNECTED) 9] create -s /sanguo/weiguo/zhangliao "zhangliao"
Created /sanguo/weiguo/zhangliao0000000000
[zk: localhost:2181(CONNECTED) 10] create -s /sanguo/weiguo/zhangliao "zhangliao"
Created /sanguo/weiguo/zhangliao0000000001
[zk: localhost:2181(CONNECTED) 11] 
[zk: localhost:2181(CONNECTED) 11] create -s /sanguo/weiguo/zhangliao "zhangliao"
Created /sanguo/weiguo/zhangliao0000000002
[zk: localhost:2181(CONNECTED) 12] ls /sanguo/weiguo
[zhangliao0000000000, zhangliao0000000001, zhangliao0000000002]
[zk: localhost:2181(CONNECTED) 13] 
```

### 创建临时节点
**临时节点客户端关闭会自动删除[create -e ...]**
```bash
[zk: localhost:2181(CONNECTED) 5] create -e /sanguo/wuguo "zhouyu"
Created /sanguo/wuguo
[zk: localhost:2181(CONNECTED) 6] ls /sanguo
[shuguo, weiguo, wuguo]
[zk: localhost:2181(CONNECTED) 7] create -e -s /sanguo/wuguo "zhouyu"
Created /sanguo/wuguo0000000003
[zk: localhost:2181(CONNECTED) 8] create -e -s /sanguo/wuguo "zhouyu"
Created /sanguo/wuguo0000000004
[zk: localhost:2181(CONNECTED) 9] create -e -s /sanguo/wuguo "zhouyu"
Created /sanguo/wuguo0000000005
[zk: localhost:2181(CONNECTED) 10] ls /sanguo/wuguo
[]
[zk: localhost:2181(CONNECTED) 11] ls /sanguo
[shuguo, weiguo, wuguo, wuguo0000000003, wuguo0000000004, wuguo0000000005]
[zk: localhost:2181(CONNECTED) 12] 
```

### 修改节点数据值
```bash
[zk: localhost:2181(CONNECTED) 12] get -s /sanguo/wuguo
zhouyu
cZxid = 0x30000000a
ctime = Fri Jul 23 01:10:07 CST 2021
mZxid = 0x30000000a
mtime = Fri Jul 23 01:10:07 CST 2021
pZxid = 0x30000000a
cversion = 0
dataVersion = 0
aclVersion = 0
ephemeralOwner = 0x400005323470001
dataLength = 6
numChildren = 0
[zk: localhost:2181(CONNECTED) 13] set /sanguo/wuguo "xianglong"
[zk: localhost:2181(CONNECTED) 14] get -s /sanguo/wuguo
xianglong
cZxid = 0x30000000a
ctime = Fri Jul 23 01:10:07 CST 2021
mZxid = 0x30000000e
mtime = Fri Jul 23 01:13:29 CST 2021
pZxid = 0x30000000a
cversion = 0
dataVersion = 1
aclVersion = 0
ephemeralOwner = 0x400005323470001
dataLength = 9
numChildren = 0
[zk: localhost:2181(CONNECTED) 15] 
```

### 监控数据变化 [get -w ...]
**注册一次监控一次，要再想监控需要再注册**
*监控数据*
```bash
[zk: localhost:2181(CONNECTED) 0] get -w /sanguo
xishi
[zk: localhost:2181(CONNECTED) 1] 
WATCHER::

WatchedEvent state:SyncConnected type:NodeDataChanged path:/sanguo
```

*改变数据*
```bash
[zk: localhost:2181(CONNECTED) 0] set /sanguo "caocao"
```

### 监控节点变化[ls -w ...]
*监控节点*
```bash
[zk: localhost:2181(CONNECTED) 1] ls -w /sanguo
[shuguo, weiguo]
[zk: localhost:2181(CONNECTED) 2] 
WATCHER::

WatchedEvent state:SyncConnected type:NodeChildrenChanged path:/sanguo
```
*改变节点*
```bash
[zk: localhost:2181(CONNECTED) 1] create -e /sanguo/jin "lvbu"
Created /sanguo/jin
```

### 删除节点
```bash
[zk: localhost:2181(CONNECTED) 6] delete /sanguo/jin
[zk: localhost:2181(CONNECTED) 7] ls /sanguo
[jin1, shuguo, weiguo]
[zk: localhost:2181(CONNECTED) 8] deleteall /sanguo
[zk: localhost:2181(CONNECTED) 9] ls /
[zookeeper]
[zk: localhost:2181(CONNECTED) 10] 
```

### 分布式锁
    原理：
    1、节点序列号最小的获取到锁
    2、未获取到锁的监控上一个节点，上一个节点删除获取到锁
[分布式锁图](./src/main/resources/static/fenbushi.png)

#### 面试1:选举机制
    半数机制，超过半数的投票通过，即通过
    1、第一次启动选举规则：
    投票过半数时，服务器id大的胜出
    2、第二次启动选举规则
    1⃣️EPOCH 大的直接胜出
    2⃣️EPOCH 相同，事物id大的胜出
    3⃣️事务id相同，服务器id大的胜出

#### 面试2:生产集群安装多少zk合适？
    安装奇数台
    生产经验：
    10台服务器：3台zk
    20台服务器：5台zk
    100台服务器：11台zk
    200台服务器：11台zk

## 常用命令
    get ls create delete 


