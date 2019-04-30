/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.1.180服务器
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : 192.168.1.180:3306
 Source Schema         : aicase

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 30/04/2019 13:58:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(2) NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('gefudong', 21, '232323');
INSERT INTO `user` VALUES ('zyj', 22, 'dafasafdsd');

SET FOREIGN_KEY_CHECKS = 1;
