

-- db202 数据库执行
CREATE TABLE `account` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `balance` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `payment_msg` (
  `id` int NOT NULL AUTO_INCREMENT,
  `order_id` int unsigned NOT NULL,
  `status` int unsigned NOT NULL DEFAULT '0' COMMENT '0 未发送；1 发送成功； 2 超过最大发送次数',
  `falure_cnt` int NOT NULL DEFAULT '0' COMMENT '失败次数 最大5次',
  `create_time` datetime NOT NULL,
  `create_user` int NOT NULL,
  `update_time` datetime NOT NULL,
  `update_user` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4i;


-- db203 数据库执行
CREATE TABLE `t_order` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `order_status` int unsigned NOT NULL DEFAULT '0' COMMENT '0 未支付；1 已支付',
  `order_amount` decimal(10,2) NOT NULL,
  `receive_user` varchar(255) NOT NULL,
  `receive_mobile` varchar(11) NOT NULL,
  `create_time` datetime NOT NULL,
  `create_user` int NOT NULL,
  `update_time` datetime NOT NULL,
  `update_user` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;