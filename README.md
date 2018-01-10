# mst-order-service

## Up and Run

1. create db in your MySql

```sql
CREATE DATABASE As_order 
    DEFAULT CHARACTER SET utf8mb4 
    COLLATE utf8mb4_general_ci;
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
