/*
 Navicat Premium Data Transfer

 Source Server         : local_MySQL
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : cloud_user

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 12/06/2022 22:35:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for poizon_user
-- ----------------------------
DROP TABLE IF EXISTS `poizon_user`;
CREATE TABLE `poizon_user`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '收件人姓名',
  `useraddress` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '收件人地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of poizon_user
-- ----------------------------
INSERT INTO `poizon_user` VALUES (1, '柳岩', '湖南省衡阳市');
INSERT INTO `poizon_user` VALUES (2, '文二狗', '陕西省西安市');
INSERT INTO `poizon_user` VALUES (3, '华沉鱼', '湖北省十堰市');
INSERT INTO `poizon_user` VALUES (4, '张必沉', '天津市');
INSERT INTO `poizon_user` VALUES (5, '郑爽爽', '辽宁省沈阳市大东区');
INSERT INTO `poizon_user` VALUES (6, '范兵兵', '山东省青岛市');

SET FOREIGN_KEY_CHECKS = 1;
