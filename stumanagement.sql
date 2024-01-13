/*
 Navicat Premium Data Transfer

 Source Server         : 111
 Source Server Type    : MySQL
 Source Server Version : 80033 (8.0.33)
 Source Host           : localhost:3306
 Source Schema         : stumanagement

 Target Server Type    : MySQL
 Target Server Version : 80033 (8.0.33)
 File Encoding         : 65001

 Date: 10/01/2024 18:03:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for may_area
-- ----------------------------
DROP TABLE IF EXISTS `may_area`;
CREATE TABLE `may_area`  (
  `my_Aid` int NOT NULL,
  `my_Aname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`my_Aid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of may_area
-- ----------------------------
INSERT INTO `may_area` VALUES (1, '杭州');
INSERT INTO `may_area` VALUES (2, '温州');
INSERT INTO `may_area` VALUES (3, '嘉兴');

-- ----------------------------
-- Table structure for may_class
-- ----------------------------
DROP TABLE IF EXISTS `may_class`;
CREATE TABLE `may_class`  (
  `my_Classid` int NOT NULL,
  `my_Classname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `my_Mid` int NULL DEFAULT NULL,
  PRIMARY KEY (`my_Classid`) USING BTREE,
  INDEX `my_Mid`(`my_Mid` ASC) USING BTREE,
  CONSTRAINT `may_class_ibfk_1` FOREIGN KEY (`my_Mid`) REFERENCES `may_major` (`my_Mid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of may_class
-- ----------------------------
INSERT INTO `may_class` VALUES (1, '教育技术21', 1);
INSERT INTO `may_class` VALUES (2, '电气师范21', 2);
INSERT INTO `may_class` VALUES (3, '机械师范21', 3);

-- ----------------------------
-- Table structure for may_course
-- ----------------------------
DROP TABLE IF EXISTS `may_course`;
CREATE TABLE `may_course`  (
  `my_Cid` int NOT NULL,
  `my_Cname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `my_Tid` int NULL DEFAULT NULL,
  `my_Csemesters` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `my_Chours` int NULL DEFAULT NULL,
  `my_Cexamtype` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `my_Ccredits` float NULL DEFAULT NULL,
  `my_Classid` int NULL DEFAULT NULL,
  `my_Cposition` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`my_Cid`) USING BTREE,
  INDEX `my_Tid`(`my_Tid` ASC) USING BTREE,
  INDEX `my_Classid`(`my_Classid` ASC) USING BTREE,
  CONSTRAINT `may_course_ibfk_1` FOREIGN KEY (`my_Tid`) REFERENCES `may_teacher` (`my_Tid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `may_course_ibfk_2` FOREIGN KEY (`my_Classid`) REFERENCES `may_class` (`my_Classid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of may_course
-- ----------------------------
INSERT INTO `may_course` VALUES (1, '数据库', 1, '2022第二学期', 3, '考试', 3, 1, '广a101');
INSERT INTO `may_course` VALUES (2, '教学系统设计', 2, '2022第一学期', 4, '考察', 4, 2, '仁和101');

-- ----------------------------
-- Table structure for may_major
-- ----------------------------
DROP TABLE IF EXISTS `may_major`;
CREATE TABLE `may_major`  (
  `my_Mid` int NOT NULL,
  `my_Mname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`my_Mid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of may_major
-- ----------------------------
INSERT INTO `may_major` VALUES (1, '教育技术学');
INSERT INTO `may_major` VALUES (2, '电气师范');
INSERT INTO `may_major` VALUES (3, '机械师范');

-- ----------------------------
-- Table structure for may_report
-- ----------------------------
DROP TABLE IF EXISTS `may_report`;
CREATE TABLE `may_report`  (
  `my_Sid` int NULL DEFAULT NULL,
  `my_Cid` int NULL DEFAULT NULL,
  `my_Tid` int NULL DEFAULT NULL,
  `my_Rscore` float NULL DEFAULT NULL,
  INDEX `my_Sid`(`my_Sid` ASC) USING BTREE,
  INDEX `my_Cid`(`my_Cid` ASC) USING BTREE,
  INDEX `my_Tid`(`my_Tid` ASC) USING BTREE,
  CONSTRAINT `may_report_ibfk_1` FOREIGN KEY (`my_Sid`) REFERENCES `may_student` (`my_Sid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `may_report_ibfk_2` FOREIGN KEY (`my_Cid`) REFERENCES `may_course` (`my_Cid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `may_report_ibfk_3` FOREIGN KEY (`my_Tid`) REFERENCES `may_teacher` (`my_Tid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of may_report
-- ----------------------------
INSERT INTO `may_report` VALUES (1, 1, 1, 90);
INSERT INTO `may_report` VALUES (2, 2, 2, 85.2);
INSERT INTO `may_report` VALUES (1, 2, 2, 100);

-- ----------------------------
-- Table structure for may_student
-- ----------------------------
DROP TABLE IF EXISTS `may_student`;
CREATE TABLE `may_student`  (
  `my_Sid` int NOT NULL,
  `my_Sname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `my_Sgender` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `my_Sage` int NULL DEFAULT NULL,
  `my_Aid` int NULL DEFAULT NULL,
  `my_Classid` int NULL DEFAULT NULL,
  `my_Scredits` float NULL DEFAULT NULL,
  PRIMARY KEY (`my_Sid`) USING BTREE,
  INDEX `my_Aid`(`my_Aid` ASC) USING BTREE,
  INDEX `my_Classid`(`my_Classid` ASC) USING BTREE,
  CONSTRAINT `may_student_ibfk_1` FOREIGN KEY (`my_Aid`) REFERENCES `may_area` (`my_Aid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `may_student_ibfk_2` FOREIGN KEY (`my_Classid`) REFERENCES `may_class` (`my_Classid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of may_student
-- ----------------------------
INSERT INTO `may_student` VALUES (1, '欧阳晨飞', '男', 21, 3, 1, 3.5);
INSERT INTO `may_student` VALUES (2, '麻阳', '女', 20, 1, 2, 0);

-- ----------------------------
-- Table structure for may_teacher
-- ----------------------------
DROP TABLE IF EXISTS `may_teacher`;
CREATE TABLE `may_teacher`  (
  `my_Tid` int NOT NULL,
  `my_Tname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `my_Tgender` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `my_Tage` int NULL DEFAULT NULL,
  `my_Tposition` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `my_Tphone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`my_Tid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of may_teacher
-- ----------------------------
INSERT INTO `may_teacher` VALUES (1, '许玮', '女', 18, '讲师', '123-456-7890');
INSERT INTO `may_teacher` VALUES (2, '刘豫钧', '男', 40, '教授', '987-654-3210');

-- ----------------------------
-- View structure for courseavgscore
-- ----------------------------
DROP VIEW IF EXISTS `courseavgscore`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `courseavgscore` AS select `c`.`my_Cid` AS `my_cid`,`c`.`my_Cname` AS `my_cname`,avg(`r`.`my_Rscore`) AS `AvgScore` from (`may_course` `c` join `may_report` `r` on((`c`.`my_Cid` = `r`.`my_Cid`))) group by `c`.`my_Cid`;

-- ----------------------------
-- View structure for may_allinfo
-- ----------------------------
DROP VIEW IF EXISTS `may_allinfo`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `may_allinfo` AS select `s`.`my_Sid` AS `my_Sid`,`s`.`my_Sname` AS `my_Sname`,`s`.`my_Sgender` AS `my_Sgender`,`s`.`my_Sage` AS `my_Sage`,`a`.`my_Aname` AS `my_Aname`,`c`.`my_Classname` AS `my_classname`,`m`.`my_Mname` AS `my_Mname`,`s`.`my_Scredits` AS `my_Scredits` from (((`may_student` `s` join `may_area` `a` on((`s`.`my_Aid` = `a`.`my_Aid`))) join `may_class` `c` on((`s`.`my_Classid` = `c`.`my_Classid`))) join `may_major` `m` on((`c`.`my_Mid` = `m`.`my_Mid`))) order by `s`.`my_Sid`;

-- ----------------------------
-- View structure for studentscore
-- ----------------------------
DROP VIEW IF EXISTS `studentscore`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `studentscore` AS select `s`.`my_Sid` AS `学生编号`,`s`.`my_Sname` AS `学生姓名`,`c`.`my_Cid` AS `课程编号`,`c`.`my_Cname` AS `课程名称`,`t`.`my_Tname` AS `任课教师`,`r`.`my_Rscore` AS `成绩` from (((`may_student` `s` join `may_report` `r` on((`r`.`my_Sid` = `s`.`my_Sid`))) join `may_course` `c` on((`c`.`my_Cid` = `r`.`my_Cid`))) join `may_teacher` `t` on((`t`.`my_Tid` = `r`.`my_Tid`))) order by `s`.`my_Sid`;

SET FOREIGN_KEY_CHECKS = 1;
