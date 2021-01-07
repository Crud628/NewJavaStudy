/*
MySQL Data Transfer
Source Host: localhost
Source Database: test20200417
Target Host: localhost
Target Database: test20200417
Date: 2020/7/31 13:53:46
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for emptest
-- ----------------------------
DROP TABLE IF EXISTS `emptest`;
CREATE TABLE `emptest` (
  `id` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  `mgrname` varchar(30) DEFAULT NULL,
  `deptno` varchar(10) DEFAULT NULL,
  `depyname` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `emptest` VALUES ('1', 'andy', '5000', 'zhangsan', '601', '第一系统发展部');
INSERT INTO `emptest` VALUES ('2', 'zhangsan', '8000', 'meng', '601', '第一系统发展部');
INSERT INTO `emptest` VALUES ('3', 'alin', '5220', 'lix', '602', '第二系统发展部');
INSERT INTO `emptest` VALUES ('4', 'lix', '8050', 'lixue', '602', '第二系统发展部');
INSERT INTO `emptest` VALUES ('5', 'lixue', '9320', 'lixue', '602', '第二系统发展部');
