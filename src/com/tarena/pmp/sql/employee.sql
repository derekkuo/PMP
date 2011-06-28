/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : tarena

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2011-06-28 21:25:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(20) NOT NULL auto_increment,
  `login_name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `name` varchar(50) default NULL,
  `gender` varchar(1) default NULL,
  `birthday` date default NULL,
  `place_of_birth` varchar(50) default NULL,
  `native_province` varchar(50) default NULL,
  `ethnic_group` varchar(50) default NULL,
  `id_number` varchar(50) default NULL,
  `mobile_phone` varchar(50) default NULL,
  `personal_email` varchar(50) default NULL,
  `qq` varchar(50) default NULL,
  `msn` varchar(50) default NULL,
  `graduated_university` varchar(50) default NULL,
  `educational_background` varchar(50) default NULL,
  `graduation_date` date default NULL,
  `working_experience` varchar(50) default NULL,
  `employee_no` varchar(50) default NULL,
  `has_left` int(1) default NULL,
  `employment_date` date default NULL,
  `office_phone` varchar(50) default NULL,
  `office_email` varchar(50) default NULL,
  `title_id` int(20) default NULL,
  `dept_id` int(20) default NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_TITLE_ID` (`title_id`),
  KEY `FK_DEPT_ID` (`dept_id`),
  CONSTRAINT `FK_DEPT_ID` FOREIGN KEY (`dept_id`) REFERENCES `dept` (`id`),
  CONSTRAINT `FK_TITLE_ID` FOREIGN KEY (`title_id`) REFERENCES `title` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', 'jiangzerui', 'sa123', '蒋泽瑞', 'M', null, null, null, null, null, '', null, null, null, null, null, null, null, null, null, null, null, 'jiangzr@tarena.com.cn', '4', '2');
INSERT INTO `employee` VALUES ('3', 'guodaxi', 'guodaxi', '郭大喜', 'M', null, null, null, null, null, '13911607119', null, null, null, null, null, null, null, null, null, '2006-10-23', null, 'guodx@tarena.com.cn', '1', '1');
INSERT INTO `employee` VALUES ('5', 'yuechengyang', 'yuechengyang', '岳城阳', 'M', null, null, null, null, null, '', null, null, null, null, null, null, null, null, null, '2011-06-23', null, '', '1', '1');
INSERT INTO `employee` VALUES ('7', 'zhangyue', 'zhangyue', '张月', 'F', null, null, null, null, null, '', null, null, null, null, null, null, null, null, null, null, null, '', '1', '1');
INSERT INTO `employee` VALUES ('9', 'dongzheng', 'dongzheng', '董正', 'M', null, null, null, null, null, '139', null, null, null, null, null, null, null, null, null, null, null, 'dongzheng@tarena.com.cn', '1', '1');
INSERT INTO `employee` VALUES ('41', 'huzijiang', 'huzijiang', '胡秭江', 'M', null, null, null, null, null, '13671160373', null, null, null, null, null, null, null, null, null, '2010-09-28', null, 'huzj@tarena.com', '1', '1');
INSERT INTO `employee` VALUES ('56', 'aa', 'aa', 'dd', 'F', null, null, null, null, null, '12344', null, null, null, null, null, null, null, null, null, '2011-06-28', null, '', '1', '1');
INSERT INTO `employee` VALUES ('58', 'asdf', 'sfd', 'sfd', 'M', null, null, null, null, null, '', null, null, null, null, null, null, null, null, null, null, null, '', '1', '1');
