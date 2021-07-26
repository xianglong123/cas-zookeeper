### zookeeper学习笔记


### 配置环境
    1、将zoo.cgf的地址修改成
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
