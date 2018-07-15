-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 11, 2018 at 06:11 PM
-- Server version: 10.1.33-MariaDB
-- PHP Version: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `database1`
--

-- --------------------------------------------------------

--
-- Table structure for table `t_nume`
--

CREATE TABLE `t_nume` (
  `Id` int(55) NOT NULL,
  `Nume` varchar(50) NOT NULL,
  `Prenume` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_nume`
--

INSERT INTO `t_nume` (`Id`, `Nume`, `Prenume`) VALUES
(0, 'Alvez', 'Garcia'),
(1, 'Prodan', 'Iulian'),
(2, 'Mihaila', 'Mirela'),
(3, 'Gilberto', 'Mibey'),
(4, 'Creanga', 'John'),
(5, 'Ahr', 'Gustav');

-- --------------------------------------------------------

--
-- Table structure for table `t_products`
--

CREATE TABLE `t_products` (
  `Id` int(50) NOT NULL,
  `ProductName` varchar(50) NOT NULL,
  `ProductReview` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_products`
--

INSERT INTO `t_products` (`Id`, `ProductName`, `ProductReview`) VALUES
(0, 'Web App', 5),
(1, 'Desktop App', 5),
(2, 'Embedded System App', 5),
(3, 'Artificial Intelligence App', 5),
(4, 'Mobile App ', 5);

-- --------------------------------------------------------

--
-- Table structure for table `t_systems`
--

CREATE TABLE `t_systems` (
  `Id` int(50) NOT NULL,
  `SystemName` varchar(50) NOT NULL,
  `SystemDescription` varchar(100) NOT NULL,
  `SystemScore` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_systems`
--

INSERT INTO `t_systems` (`Id`, `SystemName`, `SystemDescription`, `SystemScore`) VALUES
(0, 'Windows98', '0', 1),
(1, 'WindowsXP', '0', 3),
(2, 'WindowsVista', '0', 1),
(3, 'Windows7', '0', 4),
(4, 'Windows10', '0', 5);

-- --------------------------------------------------------

--
-- Table structure for table `t_tool`
--

CREATE TABLE `t_tool` (
  `Id` int(50) NOT NULL,
  `ToolName` varchar(50) NOT NULL,
  `ToolDescription` varchar(50) NOT NULL,
  `ToolScore` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_tool`
--

INSERT INTO `t_tool` (`Id`, `ToolName`, `ToolDescription`, `ToolScore`) VALUES
(0, 'Debbuging Tool', 'Simple debbuging tool.', 5),
(1, 'MSI Packaging Tool', 'Simple tool to pack your apps in .msi format.', 5),
(2, 'APPX Packaging Tool', 'Simple tool to pack your apps in .appx format.', 5),
(3, 'Decoding Tool', 'Used for decoding encoded texts.', 5),
(4, 'Encoding Tool', 'Used for encoding texts.', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `t_nume`
--
ALTER TABLE `t_nume`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `t_products`
--
ALTER TABLE `t_products`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `t_systems`
--
ALTER TABLE `t_systems`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `t_tool`
--
ALTER TABLE `t_tool`
  ADD PRIMARY KEY (`Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
