/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50716
 Source Host           : localhost
 Source Database       : demodb

 Target Server Type    : MySQL
 Target Server Version : 50716
 File Encoding         : utf-8

 Date: 06/26/2018 01:31:36 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `UserInfo`
-- ----------------------------
DROP TABLE IF EXISTS `UserInfo`;
CREATE TABLE `UserInfo` (
  `id` varchar(255) NOT NULL,
  `create_time` int(11) DEFAULT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `user_status` varchar(255) DEFAULT NULL,
  `notes` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`) USING BTREE,
  KEY `name` (`name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `UserInfo`
-- ----------------------------
BEGIN;
INSERT INTO `UserInfo` VALUES ('1', '222222222', 'testContact1', 'testName1', 'prospective', 'testNote1'), ('2', '222222211', 'testContact2', 'testName2', 'current', 'testNote2');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
