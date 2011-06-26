/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : tarena

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2011-06-26 00:41:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `r_dept_title`
-- ----------------------------
DROP TABLE IF EXISTS `r_dept_title`;
CREATE TABLE `r_dept_title` (
  `id` int(20) NOT NULL auto_increment,
  `dept_id` int(20) NOT NULL,
  `title_id` int(20) NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_RDT_TITLE_ID` (`title_id`),
  KEY `FK_RDT_DEPT_ID` (`dept_id`),
  CONSTRAINT `FK_RDT_DEPT_ID` FOREIGN KEY (`dept_id`) REFERENCES `dept` (`id`),
  CONSTRAINT `FK_RDT_TITLE_ID` FOREIGN KEY (`title_id`) REFERENCES `title` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of r_dept_title
-- ----------------------------
INSERT INTO `r_dept_title` VALUES ('1', '1', '1');
INSERT INTO `r_dept_title` VALUES ('2', '1', '3');
INSERT INTO `r_dept_title` VALUES ('3', '1', '4');
INSERT INTO `r_dept_title` VALUES ('4', '2', '2');
INSERT INTO `r_dept_title` VALUES ('5', '2', '4');
INSERT INTO `r_dept_title` VALUES ('6', '2', '5');
