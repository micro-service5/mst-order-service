# mst-order-service

## Up and Run

1. create db in your MySql

```sql
DROP DATABASE mst_order;
CREATE DATABASE mst_order DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE mst_order;
```

## Tables Design

```
shopping_cart_item
    - <id>
    - userId ----------------->
    - goodsId -----------------+----->
    - goodsCount                \
                                |
order:                          |
    - <id>                      |
    - userId -----------------> |
    - address                   |
    - [goods] <--------------+  |
                             |  |
goods:                       |  |
    - <id>                   |  |
    - orderId ---------------+  |
    - goodsId <-----------------+
    - goodsName
    - goodsPrice
```
