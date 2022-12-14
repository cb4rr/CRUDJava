-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: mydbinstituto
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.24-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alumnos`
--

DROP TABLE IF EXISTS `alumnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumnos` (
  `runAlum` varchar(10) NOT NULL,
  `nroexpeAlum` varchar(10) DEFAULT NULL,
  `nomAlum` varchar(45) DEFAULT NULL,
  `appAlum` varchar(45) DEFAULT NULL,
  `apmAlum` varchar(45) DEFAULT NULL,
  `fecnacAlum` varchar(10) DEFAULT NULL,
  `codCurso` varchar(5) DEFAULT NULL,
  `runAlumD` varchar(10) DEFAULT NULL,
  `dirAlum` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`runAlum`),
  KEY `codCurso_A_idx` (`codCurso`),
  KEY `runAlumD_A_idx` (`runAlumD`),
  CONSTRAINT `codCurso_A` FOREIGN KEY (`codCurso`) REFERENCES `cursos` (`codCurso`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumnos`
--

LOCK TABLES `alumnos` WRITE;
/*!40000 ALTER TABLE `alumnos` DISABLE KEYS */;
INSERT INTO `alumnos` VALUES ('10008469-4','38493','Raul','Barra','Burgos','26-07-1978','23KIO','10008469-4','Paseo Estado #337'),('11111111-1','87563','Alfredo','Boix','Armengol','13-05-1988','2KL23','11111111-1','Santa Magdalena #94'),('12765974-1','26896','Daniela','Arroyo','Bueno','20-10-1984','JK214',NULL,'Avda Lo Ovalle #601'),('14597345-5','32464','Samanta','Heredia','Perales','31-06-1998','187AA',NULL,' Avenida Vitacura #5480'),('14868384-4','32467','Silvia','Coromilas','Antunez','11-01-2006','1CV1A',NULL,'Mariano Latorre #1942'),('14976873-6','38463','Trinidad','Polo','Grau','11-02-1978','2KL23','','Del Inca #4446'),('15678397-4','87321','Heraclio','Pera','Estevéz','21-01-1986','23KIO','','Calle Queilén #6095'),('16986351-7','22348','Isaura','Moreno','Bas','01-07-1976','JK214','16986351-7','Camino El Otoño #11'),('18763981-1','76845','Samuel','Hurtado','Gonzales','13-06-1976','JK214',NULL,'Río De Janeiro #335'),('18783495-6','86331','Pelayo','Seve','Muñoz','11-07-1976','2KL23',NULL,'Calle Salvador Gutiérrez #6716'),('18897763-1','56796','Pilar','Gracia','Lucena','30-12-1987','1CV1A','18897763-1','Calle Sierra Bella #1211'),('19198268-1','38273','Aránzazu','Borrel','Sanchez','10-04-1996','2KL23','','Av. Los Héroes #113'),('21836487-6','23467','Cipriano','Galindo','Fiol','10-04-1994','UY241',NULL,'Calle Las Clarisas #124'),('22222222-2','48653','Evelia','Batalla','Arranz','07-08-1989','187AA','22222222-2','Calle Frankfort #4220'),('33333333-3','34875','Dalila','Lerma','Lucena','03-04-1990','UY241','33333333-3','Isabel Bongard #1470'),('33545783-1','90218','Rosa','Macías','Estevéz','19-04-1996','23KIO',NULL,'Vilumilla #859'),('35456234-1','91028','Rosa','Marí','Reyes','17-02-1994','UI215',NULL,'Avenida Vicuña Mackenna #4571'),('35973867-1','22222','Nacho','Cabezas','Cobo','23-04-2000','1CV1A',NULL,NULL),('38864083-5','90323','Duilio','Leal','Olivé','18-04-1995','2KL23',NULL,'El Roble #734'),('44444444-4','98757','Lino','Rómulo','Flores','10-08-1991','OP231',NULL,' Avenida Alemania #0672'),('55555555-5','91239','Odalis','Balaguer','Vallejo','10-09-1992','23KIO',NULL,'Calle María Auxiliadora #779'),('66666666-6','71263','Lázaro','Querol','Donoso','10-10-1993','UY241',NULL,'Calle Serrano #12'),('67389764-1','12674','Macario','Rubio','Barrera','21-04-1998','OP231','67389764-1','Carmen #2239'),('76839876-4','11111','Estella','Abella','Carnobell','22-04-1999','187AA',NULL,'Pasaje Corral #1415'),('86334556-2','98734','Juan','Gimenez','Berenguer','20-04-1997','UI215','86334556-2','Astorga #62');
/*!40000 ALTER TABLE `alumnos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cursos`
--

DROP TABLE IF EXISTS `cursos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cursos` (
  `codCurso` varchar(5) NOT NULL,
  `nomCurso` varchar(45) DEFAULT NULL,
  `runAlumD` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`codCurso`),
  KEY `runAlumD_C_idx` (`runAlumD`),
  CONSTRAINT `runAlumD_C` FOREIGN KEY (`runAlumD`) REFERENCES `alumnos` (`runAlumD`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursos`
--

LOCK TABLES `cursos` WRITE;
/*!40000 ALTER TABLE `cursos` DISABLE KEYS */;
INSERT INTO `cursos` VALUES ('187AA','Técnico en Enfermería','22222222-2'),('1CV1A','Técnico en Informática ','18897763-1'),('23KIO','Técnico en Preparación Física','10008469-4'),('2KL23','Técnico en Odontología','11111111-1'),('JK214','Administración de Empresas','16986351-7'),('OP231','Técnico en Automatización y Control Industria','67389764-1'),('UI215','Técnico en Educación Parvularia','86334556-2'),('UY241','Técnico en Contabilidad y Gestión de Negocios','33333333-3');
/*!40000 ALTER TABLE `cursos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `impartir`
--

DROP TABLE IF EXISTS `impartir`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `impartir` (
  `codImpar` int(3) NOT NULL AUTO_INCREMENT,
  `runProf` varchar(10) DEFAULT NULL,
  `codMod` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`codImpar`),
  KEY `runProf_Imp_idx` (`runProf`),
  KEY `codMod_Imp_idx` (`codMod`),
  CONSTRAINT `codMod_Imp` FOREIGN KEY (`codMod`) REFERENCES `modulos` (`codMod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `runProf_Imp` FOREIGN KEY (`runProf`) REFERENCES `profesores` (`runProf`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=41358 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `impartir`
--

LOCK TABLES `impartir` WRITE;
/*!40000 ALTER TABLE `impartir` DISABLE KEYS */;
INSERT INTO `impartir` VALUES (12341,'11222333-1','FI301'),(12342,'13456634-7','ANA19'),(12343,'13134134-1','PLA11'),(12344,'12123123-2','283SK'),(12345,'15457456-1','COND1'),(12346,'22333444-2','KLK21');
/*!40000 ALTER TABLE `impartir` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jornadas`
--

DROP TABLE IF EXISTS `jornadas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jornadas` (
  `codJorn` varchar(5) NOT NULL,
  `nomJorn` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`codJorn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jornadas`
--

LOCK TABLES `jornadas` WRITE;
/*!40000 ALTER TABLE `jornadas` DISABLE KEYS */;
INSERT INTO `jornadas` VALUES ('DIUR1','Diurno'),('VESP1','Vespertino');
/*!40000 ALTER TABLE `jornadas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `matriculas`
--

DROP TABLE IF EXISTS `matriculas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `matriculas` (
  `codMatri` int(11) NOT NULL AUTO_INCREMENT,
  `runAlum` varchar(10) DEFAULT NULL,
  `codMod` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`codMatri`),
  KEY `runAlum_Matri_idx` (`runAlum`),
  KEY `codMod_Matri_idx` (`codMod`),
  CONSTRAINT `codMod_Matri` FOREIGN KEY (`codMod`) REFERENCES `modulos` (`codMod`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `runAlum_Matri` FOREIGN KEY (`runAlum`) REFERENCES `alumnos` (`runAlum`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=89424 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `matriculas`
--

LOCK TABLES `matriculas` WRITE;
/*!40000 ALTER TABLE `matriculas` DISABLE KEYS */;
INSERT INTO `matriculas` VALUES (0,'10008469-4','ANA19'),(89387,'11111111-1','283SK'),(89388,'14597345-5','FI301'),(89389,'14868384-4','ANA19'),(89390,'14976873-6','FI301'),(89391,'14597345-5','COND1'),(89392,'14976873-6','283SK'),(89393,'15678397-4','KLK21'),(89394,'11111111-1','ANA19'),(89395,'16986351-7','FI301'),(89396,'10008469-4','COND1'),(89397,'18897763-1','KLK21'),(89398,'16986351-7','KLK21'),(89399,'18763981-1','FI301'),(89400,'12765974-1','283SK'),(89401,'33545783-1','283SK'),(89402,'18783495-6','PLA11'),(89403,'33333333-3','COND1'),(89404,'18897763-1','PLA11'),(89405,'22222222-2','ANA19'),(89406,'21836487-6','COND1'),(89407,'21836487-6','KLK21'),(89408,'19198268-1','COND1'),(89409,'19198268-1','PLA11'),(89410,'38864083-5','PLA11'),(89411,'44444444-4','PLA11'),(89412,'35456234-1','PLA11'),(89413,'44444444-4','KLK21'),(89414,'38864083-5','KLK21'),(89415,'76839876-4','KLK21'),(89416,'35456234-1','FI301'),(89417,'66666666-6','FI301'),(89418,'35973867-1','283SK'),(89419,'55555555-5','283SK'),(89420,'67389764-1','283SK'),(89421,'35973867-1','COND1'),(89422,'66666666-6','COND1'),(89423,'86334556-2','COND1');
/*!40000 ALTER TABLE `matriculas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modulos`
--

DROP TABLE IF EXISTS `modulos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `modulos` (
  `codMod` varchar(5) NOT NULL,
  `nomMod` varchar(50) DEFAULT NULL,
  `codSeme` varchar(5) DEFAULT NULL,
  `canthrsMod` int(11) DEFAULT NULL,
  `codJorn` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`codMod`),
  KEY `CodSeme_M_idx` (`codSeme`),
  KEY `CodJorn_M_idx` (`codJorn`),
  CONSTRAINT `CodJorn_M` FOREIGN KEY (`codJorn`) REFERENCES `jornadas` (`codJorn`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `CodSeme_M` FOREIGN KEY (`codSeme`) REFERENCES `semestres` (`codSeme`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modulos`
--

LOCK TABLES `modulos` WRITE;
/*!40000 ALTER TABLE `modulos` DISABLE KEYS */;
INSERT INTO `modulos` VALUES ('283SK','Vagología','SEME3',400,'VESP1'),('ANA19','Anatomía y Fisiología Funcional','SEME2',100,'VESP1'),('COND1','Entrenamiento de la Condición Aeróbica','SEME1',100,'DIUR1'),('FI301','Fisiología del Ejercicio','SEME2',150,'VESP1'),('KLK21','Tecnología de redes','SEME1',80,'DIUR1'),('PLA11','Planificación del Entrenamiento Físico para la Sal','SEME1',200,'DIUR1');
/*!40000 ALTER TABLE `modulos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesores`
--

DROP TABLE IF EXISTS `profesores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesores` (
  `runProf` varchar(10) NOT NULL,
  `nomProf` varchar(45) DEFAULT NULL,
  `appProf` varchar(45) DEFAULT NULL,
  `apmProf` varchar(45) DEFAULT NULL,
  `dirProf` varchar(50) DEFAULT NULL,
  `telProf` varchar(13) DEFAULT NULL,
  `fecnacProf` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`runProf`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesores`
--

LOCK TABLES `profesores` WRITE;
/*!40000 ALTER TABLE `profesores` DISABLE KEYS */;
INSERT INTO `profesores` VALUES ('11222333-1','Fernanda','Angulo','Francisco','Cuevas #969','+56911111111','10-04-1996'),('12123123-2','Gema','Plana','Vélez','Calle Agustinas #1442','+56922222222','13-01-1985'),('13134134-1','Vito','Ferrández','Vall','Santo Domingo #4780','+56933333333','15-11-1986'),('13456634-7','Bienvenida','Gámez','Abella','Av. Del Mar #1300','+56944444444','21-05-1987'),('15457456-1','Adalberto','Campillo ','Meléndez','Porvenir #662','+56955555555','13-04-1987'),('22333444-2','Pepito','Granados','Adadia','Pasaje El Pirquinero #1679','+56966666666','07-03-1988');
/*!40000 ALTER TABLE `profesores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `semestres`
--

DROP TABLE IF EXISTS `semestres`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `semestres` (
  `codSeme` varchar(5) NOT NULL,
  `nomSeme` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codSeme`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `semestres`
--

LOCK TABLES `semestres` WRITE;
/*!40000 ALTER TABLE `semestres` DISABLE KEYS */;
INSERT INTO `semestres` VALUES ('SEME1','Primer Semestre'),('SEME2','Segundo Semestre'),('SEME3','Tercer Semestre'),('SEME4','Cuarto Semestre');
/*!40000 ALTER TABLE `semestres` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-11 20:46:23
