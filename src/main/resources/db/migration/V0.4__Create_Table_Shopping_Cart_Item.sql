CREATE TABLE `shopping_cart_item` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT(20) NOT NULL,
  `goods_id` BIGINT(20) NOT NULL,
  `count` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_unique_user_id_goods_id` (`user_id`,`goods_id`)
);