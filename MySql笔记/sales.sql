/*
MySQL Data Transfer
Source Host: localhost
Source Database: test
Target Host: localhost
Target Database: test
Date: 2020/10/30 16:16:46
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for sales
-- ----------------------------
DROP TABLE IF EXISTS `sales`;
CREATE TABLE `sales` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `companyid` varchar(11) DEFAULT NULL,
  `salesvolume` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `sales` VALUES ('1', '关羽', '01', 10000);
INSERT INTO `sales` VALUES ('10', '张辽', '03', 10500);
INSERT INTO `sales` VALUES ('11', '吕布', '05', 18000);
INSERT INTO `sales` VALUES ('2', '张飞', '01', 11000);
INSERT INTO `sales` VALUES ('3', '赵云', '01', 12000);
INSERT INTO `sales` VALUES ('4', '马超', '01', 9000);
INSERT INTO `sales` VALUES ('5', '黄忠', '01', 8500);
INSERT INTO `sales` VALUES ('6', '甘宁', '02', 5000);
INSERT INTO `sales` VALUES ('7', '黄盖', '02', 3000);
INSERT INTO `sales` VALUES ('8', '周泰', '03', 6000);
INSERT INTO `sales` VALUES ('9', '徐晃', '03', 9500);
