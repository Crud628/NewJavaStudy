/*
MySQL Data Transfer
Source Host: localhost
Source Database: test20200728
Target Host: localhost
Target Database: test20200728
Date: 2020/10/30 13:52:10
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for studentscore
-- ----------------------------
DROP TABLE IF EXISTS `studentscore`;
CREATE TABLE `studentscore` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `subject` varchar(20) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `studentscore` VALUES ('3', '张三', '语文', '98');
INSERT INTO `studentscore` VALUES ('4', '张三', '数学', '93');
INSERT INTO `studentscore` VALUES ('5', '张三', '英语', '91');
INSERT INTO `studentscore` VALUES ('6', '李四', '语文', '94');
INSERT INTO `studentscore` VALUES ('7', '李四', '数学', '89');
INSERT INTO `studentscore` VALUES ('8', '李四', '英语', '90');
INSERT INTO `studentscore` VALUES ('9', '王五', '语文', '86');
INSERT INTO `studentscore` VALUES ('10', '王五', '数学', '79');
INSERT INTO `studentscore` VALUES ('11', '王五', '英语', '65');
