/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : tarena

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2011-06-25 15:23:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `title`
-- ----------------------------
DROP TABLE IF EXISTS `title`;
CREATE TABLE `title` (
  `id` int(20) NOT NULL auto_increment,
  `code` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `description` varchar(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of title
-- ----------------------------
INSERT INTO `title` VALUES ('1', 'xmjl', '项目经理', null);
INSERT INTO `title` VALUES ('2', 'zj', '助教', null);
INSERT INTO `title` VALUES ('3', 'zz', '组长', null);
INSERT INTO `title` VALUES ('4', 'fzr', '负责人', null);
INSERT INTO `title` VALUES ('5', 'zj', '质量保障主管', null);

