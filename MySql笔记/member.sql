/*
Navicat MySQL Data Transfer

Source Server         : sqlTestMa
Source Server Version : 50619
Source Host           : localhost:3306
Source Database       : sqltest

Target Server Type    : MYSQL
Target Server Version : 50619
File Encoding         : 65001

Date: 2021-01-06 13:47:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `id` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `sex` varchar(6) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  `department` varchar(30) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES ('1', '小王', '男', '3500', '市场部', '23');
INSERT INTO `member` VALUES ('2', '小李', '女', '1800', '销售部', '21');
INSERT INTO `member` VALUES ('3', '小刘', '男', '2300', '生产部', '24');
INSERT INTO `member` VALUES ('4', '小赵视图修改', '女', '2000', '财务部', '45');
INSERT INTO `member` VALUES ('5', '大黄', '男', '3500', '市场部', '26');
INSERT INTO `member` VALUES ('6', '吴工', '女', '4500', '生产部', '36');
INSERT INTO `member` VALUES ('7', '小孙', '男', '3600', '法务部', '27');
INSERT INTO `member` VALUES ('8', '老胡', '男', '7500', '人力部', '28');
INSERT INTO `member` VALUES ('9', '温哥', '男', '10000', '总务部', '23');
INSERT INTO `member` VALUES ('41', '张41', '男', '6800', '法务部', '44');
INSERT INTO `member` VALUES ('55', '阿斌', '男', '20000', '总务部', '20');
