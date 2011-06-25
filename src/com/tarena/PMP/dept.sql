/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : tarena

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2011-06-25 15:19:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `dept`
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` int(20) NOT NULL auto_increment,
  `code` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `description` varchar(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', 'xm', '项目部', null);
INSERT INTO `dept` VALUES ('2', 'jx', '教学研发部', null);

