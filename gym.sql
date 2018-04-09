-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 01, 2017 at 03:41 PM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `gym`
--
CREATE DATABASE IF NOT EXISTS `gym` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `gym`;

-- --------------------------------------------------------

--
-- Table structure for table `chart`
--

CREATE TABLE IF NOT EXISTS `chart` (
  `chart_type` varchar(20) NOT NULL,
  `qty` varchar(20) NOT NULL,
  `day1` varchar(20) NOT NULL,
  `day2` varchar(20) NOT NULL,
  `day3` varchar(20) NOT NULL,
  `day4` varchar(20) NOT NULL,
  `day5` varchar(20) NOT NULL,
  `day6` varchar(20) NOT NULL,
  `day7` varchar(20) NOT NULL,
  PRIMARY KEY (`chart_type`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `chart`
--

INSERT INTO `chart` (`chart_type`, `qty`, `day1`, `day2`, `day3`, `day4`, `day5`, `day6`, `day7`) VALUES
('Bulk Chart', '12', 'Chest', 'Legs', 'Arms', 'Cardio', 'Back', 'Sholders', 'Rest'),
('Power Chart', '12', 'Sholders', 'Back', 'Cardio', 'Arms', 'Legs', 'Chest', 'Rest');

-- --------------------------------------------------------

--
-- Table structure for table `instructor`
--

CREATE TABLE IF NOT EXISTS `instructor` (
  `fname` varchar(20) NOT NULL,
  `lname` varchar(20) NOT NULL,
  `title` varchar(10) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `contact` int(10) NOT NULL,
  `chart` varchar(20) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `instructor`
--

INSERT INTO `instructor` (`fname`, `lname`, `title`, `gender`, `username`, `password`, `contact`, `chart`) VALUES
('gayantha', 'nermo', 'Mrs', 'FEMALE', 'gayantha', '12345678', 125479625, 'Power chart'),
('janaka', 'weerasingha', 'Mr', 'MALE', 'janaka123', '12345678', 1234567890, 'Power chart');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE IF NOT EXISTS `payment` (
  `username` varchar(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  `amt` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`username`, `type`, `amt`) VALUES
('malindu', 'Month', 'LKR 5000'),
('sandaru', 'Year', 'LKR 12000'),
('w.g. nishshsanka', 'Month', 'LKR 5000'),
('malindu', 'Year', 'LKR 12000'),
('nermo', 'Year', 'LKR 12000'),
('harsha', 'Month', 'LKR 5000'),
('malindu', 'Month', 'LKR 5000'),
('malindu', 'Year', 'LKR 12000');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `fname` varchar(20) NOT NULL,
  `lname` varchar(20) NOT NULL,
  `title` varchar(10) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `contact` int(10) NOT NULL,
  `chart` varchar(20) NOT NULL,
  `payment` varchar(10) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`fname`, `lname`, `title`, `gender`, `username`, `password`, `contact`, `chart`, `payment`) VALUES
('harsha', 'rachith', 'Mr', 'MALE', 'harsha', 'harsha123', 757536043, 'Bulk Chart', 'Month'),
('Maindu', 'Dilshannn', 'Mr', 'MALE', 'malindu', '12345678', 987654321, 'Bulk Chart', 'Month'),
('malindu', 'dilshan', 'Mr', 'MALE', 'malindu123', '12345678', 1234567890, 'Bulk Chart', 'Month'),
('nishshanka', 'weerasinghe', 'Mr', 'MALE', 'nishshanka', 'nishshanka', 728900535, 'Bulk Chart', 'Month'),
('sandaru', 'sashin', 'Mr', 'MALE', 'sandaru389', '87654321', 987654321, 'Power Chart', 'Year'),
('sashen', 'hewavitharana', 'Mr', 'MALE', 'sashen23', '12345678', 721345678, 'Bulk Chart', 'Month'),
('shane', 'mihran', 'Mr', 'MALE', 'shane', '12345678', 382244022, 'Power Chart', 'Month'),
('Lucifer', 'Soeya', 'Mr', 'MALE', 'wolf1', '20612150', 766711789, 'Power Chart', 'Year');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
