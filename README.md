# mst-order-service

## Up and Run

1. create db in your MySql

```sql
DROP DATABASE mst_order;
CREATE DATABASE mst_order DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE mst_order;
```

2. run

```shell
# a) bootRun
$ ./gradlew bootRun

# b) build & run app.jar
$ ./gradlew shadowJar
$ java -jar build/libs/mst-order-service-*.jar

# c) IntelliJ IDEA
# (^M): MstOrderServiceApplication
```

## Tables Design

```
shopping_cart_item
    - <id>
    - userId
    - goodsId -----------------+
    - goodsCount                \
                                |
order:                          |
    - <id>                      |
    - userId                    |
    - address                   |
    - status                    |
    - [goods] <--------------+  |
                             |  |
goods:                       |  |
    - <id>                   |  |
    - orderId ---------------+  |
    - goodsId <-----------------+
    - name
    - price
    - count
    - description
```

## Moco Server

因为 Goods Service 不在线, 需要一个 mock server, 这里用了 moco.

首先下载 [Standalone Moco Runner .jar 文件](http://central.maven.org/maven2/com/github/dreamhead/moco-runner/0.12.0/moco-runner-0.12.0-standalone.jar),
放到代码根目录, 然后运行:

```shell
java -jar moco-runner-*-standalone.jar http -p 12306 -c moco-goods-stub.json
```

启动后就能调试了.

再启动 MstOrderServiceApplication, 用 curl 来请求数据:

```shell
# 查询商品
$ curl localhost:8091/goods/1
{"id":1,"name":"DUEPLAY UGG 兔子耳","price":840.0,"description":"绒毛兔耳朵设计，俏皮之余显洋气。加厚棉映衬，打造极佳保暖性。舒适平底设计，轻松出行倍减压。","stockCount":123}

# 购买商品
$ curl -X POST localhost:8091/goods/1/buy/1
okay
```

有了这, 就能创建订单了.
