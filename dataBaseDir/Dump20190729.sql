-- MySQL dump 10.13  Distrib 5.7.26, for Linux (x86_64)
--
-- Host: localhost    Database: cloudgo
-- ------------------------------------------------------
-- Server version	5.7.26-0ubuntu0.19.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `BankRole`
--

DROP TABLE IF EXISTS `BankRole`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BankRole` (
  `user_id` bigint(12) NOT NULL,
  `user_balance` float NOT NULL DEFAULT '0',
  `user_score` bigint(15) NOT NULL DEFAULT '0',
  `payment_code` varchar(6) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BankRole`
--

LOCK TABLES `BankRole` WRITE;
/*!40000 ALTER TABLE `BankRole` DISABLE KEYS */;
INSERT INTO `BankRole` VALUES (667,0,0,'000000'),(10000,170006,0,'123456'),(10001,10000,0,'123');
/*!40000 ALTER TABLE `BankRole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Orders`
--

DROP TABLE IF EXISTS `Orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Orders` (
  `order_id` bigint(30) NOT NULL AUTO_INCREMENT,
  `buyer_id` bigint(12) NOT NULL,
  `seller_id` bigint(12) NOT NULL,
  `product_id` bigint(30) NOT NULL,
  `product_numbers` bigint(10) NOT NULL DEFAULT '0',
  `trading_hour` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  `shipping_address` varchar(50) NOT NULL,
  `transaction_amount` float NOT NULL DEFAULT '0',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Orders`
--

LOCK TABLES `Orders` WRITE;
/*!40000 ALTER TABLE `Orders` DISABLE KEYS */;
INSERT INTO `Orders` VALUES (1,10000,666,13029751,1,'2019-07-28 16:00:00.000000','Xindu',4999),(2,10000,666,13029751,1,'2019-07-28 16:00:00.000000','Xindu',4999),(3,10000,666,13029751,1,'2019-07-28 16:00:00.000000','Xindu',4999),(4,10000,666,13029751,1,'2019-07-28 16:00:00.000000','Xindu',4999),(5,10000,666,13029751,1,'2019-07-28 16:00:00.000000','Xindu',4999),(6,10000,666,13029751,1,'2019-07-28 16:00:00.000000','Xindu',4999),(7,10000,666,13029751,2,'2019-07-29 06:53:12.940602','Xindu',9998);
/*!40000 ALTER TABLE `Orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Users`
--

DROP TABLE IF EXISTS `Users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Users` (
  `user_id` bigint(12) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) NOT NULL,
  `user_password` varchar(16) NOT NULL,
  `user_telephone` bigint(11) NOT NULL,
  `user_email` varchar(30) NOT NULL DEFAULT 'ÎÞ',
  `user_level` int(3) NOT NULL DEFAULT '0',
  `user_gender` char(1) NOT NULL DEFAULT '0',
  `shipping_address` varchar(50) NOT NULL DEFAULT 'ÎÞ',
  `user_description` varchar(200) NOT NULL DEFAULT 'ÎÞ',
  PRIMARY KEY (`user_id`,`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=10002 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Users`
--

LOCK TABLES `Users` WRITE;
/*!40000 ALTER TABLE `Users` DISABLE KEYS */;
INSERT INTO `Users` VALUES (10000,'testUser','123456',17396240612,'1228775831@qq.com',0,'0','恩？','啦啦啦啦'),(10001,'testUser2','123',17396240612,'1228775831@qq.com',0,'0','ÎÞ','ÎÞ');
/*!40000 ALTER TABLE `Users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `example`
--

DROP TABLE IF EXISTS `example`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `example` (
  `name` varchar(20) NOT NULL,
  `age` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `example`
--

LOCK TABLES `example` WRITE;
/*!40000 ALTER TABLE `example` DISABLE KEYS */;
/*!40000 ALTER TABLE `example` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `products` (
  `product_id` bigint(30) NOT NULL,
  `seller_id` bigint(12) NOT NULL,
  `product_name` varchar(100) NOT NULL DEFAULT 'ÎÞ',
  `product_price` float NOT NULL DEFAULT '0',
  `product_remaining` bigint(10) NOT NULL DEFAULT '0',
  `product_sales` bigint(10) NOT NULL DEFAULT '0',
  `product_description` varchar(200) NOT NULL DEFAULT 'ÎÞ',
  `product_image` bigint(20) NOT NULL DEFAULT '0',
  `product_mark` float NOT NULL DEFAULT '0',
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (13029751,666,'小米空调',4999,658,14,'小米制热，业内第一',666,4.4);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sellers`
--

DROP TABLE IF EXISTS `sellers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sellers` (
  `seller_id` bigint(12) NOT NULL AUTO_INCREMENT,
  `seller_name` varchar(30) NOT NULL,
  `seller_password` varchar(30) NOT NULL,
  `seller_telephone` bigint(11) NOT NULL,
  `seller_email` varchar(30) NOT NULL DEFAULT 'ÎÞ',
  `seller_level` int(3) NOT NULL DEFAULT '0',
  `seller_gender` char(1) NOT NULL DEFAULT '0',
  `seller_description` varchar(200) NOT NULL DEFAULT 'ÎÞ',
  PRIMARY KEY (`seller_id`,`seller_name`)
) ENGINE=InnoDB AUTO_INCREMENT=668 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sellers`
--

LOCK TABLES `sellers` WRITE;
/*!40000 ALTER TABLE `sellers` DISABLE KEYS */;
INSERT INTO `sellers` VALUES (666,'小米官方','xiaomi',666666,'xiaomi@qq.com',6,'0','小米官方'),(667,'testSeller','123',17396240612,'1228775831@qq.com',0,'0','ÎÞ');
/*!40000 ALTER TABLE `sellers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-29 15:00:17
