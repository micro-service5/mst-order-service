CREATE TABLE `order_detail` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT(20) NOT NULL,
  `address` VARCHAR(255) NOT NULL,
  `goodName` VARCHAR(255) NOT NULL,
  `goodPrice` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_unique_user_id_goods_id` (`user_id`,`goods_id`)
);