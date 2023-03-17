-- MySQL dump 10.16  Distrib 10.1.28-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: mvc
-- ------------------------------------------------------
-- Server version	10.1.28-MariaDB

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
-- Table structure for table `country`
--

DROP TABLE IF EXISTS `country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `country` (
  `id` int(11) NOT NULL,
  `country` varchar(50) DEFAULT NULL,
  `capital` varchar(50) DEFAULT NULL,
  `population` int(11) DEFAULT NULL,
  `area` double DEFAULT NULL,
  `density` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `country`
--

LOCK TABLES `country` WRITE;
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` VALUES (1,'アメリカ','ワシントンD.C.',321770000,9834000,32.72015457),(2,'イギリス','ロンドン',64710000,242500,266.8453608),(3,'イタリア','ローマ',59790000,301300,198.4400929),(4,'イラン','テヘラン',79100000,1648000,47.99757282),(5,'インド','ニューデリー',1311050000,3287000,398.8591421),(6,'インドネシア','ジャカルタ',257560000,1905000,135.2020997),(7,'ウガンダ','カンパラ',39030000,241000,161.9502075),(8,'エジプト','カイロ',91500000,1010000,90.59405941),(9,'エチオピア','アディスアベバ',99390000,1104000,90.02717391),(10,'カナダ','オタワ',35940000,9985000,3.599399099),(11,'コンゴ民主共和国','キンシャサ',77260000,2345000,32.9466951),(12,'スコットランド','エディンバラ',5290000,80080,66.05894106),(13,'スペイン','マドリード',46120000,506000,91.14624506),(14,'タイ','バンコク',67950000,513100,132.4303255),(15,'チェコ','プラハ',10540000,78870,133.6376315),(16,'トルコ','アンカラ',78660000,783600,100.3828484),(17,'ドイツ','ベルリン',80680000,357000,225.9943978),(18,'ナイジェリア','アブジャ',182200000,923800,197.2288374),(19,'バングラデシュ','ダッカ',160990000,147600,1090.718157),(20,'パキスタン','イスラムバード',188920000,796100,237.306871),(21,'フィリピン','マニラ',107000000,300000,356.6666667),(22,'フランス','パリ',64390000,643800,100.0155328),(23,'ブラジル','ブラジリア',207840000,8516000,24.40582433),(24,'ベトナム','ハノイ',93440000,331200,282.1256039),(25,'メキシコ','メキシコシティ',127010000,1964000,64.66904277),(26,'ルーマニア','ブカレスト',19510000,238400,81.83724832),(27,'ロシア','モスクワ',143450000,17100000,8.388888889),(28,'中国','北京',1383920000,9597000,144.2033969),(29,'日本','東京',126570000,378000,334.8412698),(30,'韓国','ソウル',50290000,100200,501.8962076);
/*!40000 ALTER TABLE `country` ENABLE KEYS */;
UNLOCK TABLES;

