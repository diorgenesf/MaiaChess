-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 23-Jun-2014 às 04:18
-- Versão do servidor: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `maiachess`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `nick` varchar(15) NOT NULL,
  `email` varchar(60) NOT NULL,
  `senha` varchar(45) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `vitorias` int(11) DEFAULT '0',
  `avatar` varchar(100) DEFAULT NULL,
  `pais` varchar(45) DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL,
  `nasc_dia` int(11) NOT NULL,
  `nasc_mes` int(11) NOT NULL,
  `nasc_ano` int(11) NOT NULL,
  `status` varchar(1) DEFAULT '1' COMMENT 'Verificar se o jogador está disponível para jogar',
  PRIMARY KEY (`nick`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`nick`, `email`, `senha`, `nome`, `vitorias`, `avatar`, `pais`, `sexo`, `nasc_dia`, `nasc_mes`, `nasc_ano`, `status`) VALUES
('teste', 'adsf', 'di', 'adf', 0, 'default.png', NULL, NULL, 1, 1, 1961, '1'),
('user1', 'asdf', 'asdf', 'Usuario 1', 30, 'default.png', NULL, NULL, 1, 1, 1, '1'),
('user10', 'asdf', 'asdf', 'Usuario 10', 15, 'default.png', NULL, NULL, 1, 1, 1, '1'),
('user2', 'asdf', 'asdf', 'Usuario 2', 50, 'default.png', NULL, NULL, 1, 1, 1, '1'),
('user3', 'asdf', 'asdf', 'Usuario 3', 10, 'default.png', NULL, NULL, 1, 1, 1, '1'),
('user4', 'asdf', 'asdf', 'Usuario 4', 0, 'default.png', NULL, NULL, 1, 1, 1, '1'),
('user5', 'asdf', 'asddf', 'Usuario 5', 20, 'default.png', NULL, NULL, 1, 1, 1, '1'),
('user6', 'asdf', 'asdf', 'Usuario 6', 10, 'default.png', NULL, NULL, 1, 1, 1, '1'),
('user7', 'asdf', 'asdf', 'Usuario 7', 10, 'default.png', NULL, NULL, 2, 1, 1, '1'),
('user8', 'asdf', 'asdf', 'Usuario 8', 30, 'default.png', NULL, NULL, 1, 1, 1, '1'),
('user9', 'asdf', 'asdf', 'Usuario 9', 15, 'default.png', NULL, NULL, 1, 1, 1, '1');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
