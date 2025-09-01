-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: studenttable
-- ------------------------------------------------------
-- Server version	8.0.40

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `studenttable`
--

DROP TABLE IF EXISTS `studenttable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studenttable` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) DEFAULT NULL,
  `mobile` varchar(15) DEFAULT NULL,
  `address` varchar(75) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `degree` varchar(45) DEFAULT NULL,
  `dob` varchar(45) DEFAULT NULL,
  `subject1` varchar(45) DEFAULT NULL,
  `subject2` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studenttable`
--

LOCK TABLES `studenttable` WRITE;
/*!40000 ALTER TABLE `studenttable` DISABLE KEYS */;
INSERT INTO `studenttable` VALUES (2,'Purvesh','324234','sdsfef','MALE','BE','2025-08-08','JAVA',''),(4,'Vedant','324234','sdsfef','MALE','BE','BE','JAVA',''),(5,'Tanmay','324234','sdsfef','MALE','DIPLOMA','2025-08-30','JAVA',''),(7,'Vedant','324234','sdsfef','MALE','BE','BE','JAVA',''),(8,'Vedant','324234','sdsfef','MALE','BE','BE','JAVA',''),(9,'dahun','324234','sdsfef','MALE','BE','BE','JAVA',''),(10,'bhavesh','345345','gdfv','MALE','BE','2025-08-13','JAVA',''),(11,'Aadesh','324234','sdsfef','MALE','BE','BE','JAVA',''),(12,'paras','324234','sdsfef','MALE','BE','BE','JAVA',''),(13,'Siddhant','4583274385','Nagar','MALE','MCA','2025-08-08','JAVA',''),(14,'Krishna','524654754','Banglore','MALE','BE','2025-08-06','JAVA','');
/*!40000 ALTER TABLE `studenttable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-09-01 21:17:55
