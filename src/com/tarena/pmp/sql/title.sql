/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : tarena

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2011-06-28 21:25:43
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
  `turn` int(20) NOT NULL,
  `description` varchar(50) default NULL,
  `dept_id` int(20) NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_TITLE_DEPT_ID` (`dept_id`),
  CONSTRAINT `FK_TITLE_DEPT_ID` FOREIGN KEY (`dept_id`) REFERENCES `dept` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of title
-- ----------------------------
INSERT INTO `title` VALUES ('1', 'xmjl', '项目经理', '31', null, '1');
INSERT INTO `title` VALUES ('2', 'fzr', '项目部负责人', '10', null, '1');
INSERT INTO `title` VALUES ('3', 'zj', '助教', '30', null, '2');
INSERT INTO `title` VALUES ('4', 'zb', '质量保障主管', '5', null, '2');
