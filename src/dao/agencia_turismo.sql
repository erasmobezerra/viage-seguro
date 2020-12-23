-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 21/12/2020 às 16:15
-- Versão do servidor: 10.4.16-MariaDB
-- Versão do PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `agencia_turismo`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `agendamentos`
--

CREATE TABLE `agendamentos` (
  `codigo_agendamento` int(12) NOT NULL,
  `nome_cliente` varchar(30) DEFAULT NULL,
  `email_cliente` varchar(30) DEFAULT NULL,
  `descricao_servico` varchar(100) DEFAULT NULL,
  `valor` double(15,2) DEFAULT NULL,
  `data_ida` varchar(10) DEFAULT NULL,
  `data_retorno` varchar(10) DEFAULT NULL,
  `observacao` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Despejando dados para a tabela `agendamentos`
--

INSERT INTO `agendamentos` (`codigo_agendamento`, `nome_cliente`, `email_cliente`, `descricao_servico`, `valor`, `data_ida`, `data_retorno`, `observacao`) VALUES
(2, 'Rafael Ribeiro Bezerra', 'rafa@gmail.com', 'Pacote Maceió / Hotel + Aéreo / 4 noites', 876.00, '11/01/2021', '15/01/2021', 'Cliente pretende pagar à vista em espécie'),
(3, 'Erasmo Ribeiro Bezerra', 'erasmobcs09.2@gmail.com', 'Pacote Fortaleza-CE / Hotel + Aéreo + translado / 5 noites', 950.00, '15/01/2021', '20/01/2021', 'Cliente pretende parcelar em 10X');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `agendamentos`
--
ALTER TABLE `agendamentos`
  ADD PRIMARY KEY (`codigo_agendamento`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `agendamentos`
--
ALTER TABLE `agendamentos`
  MODIFY `codigo_agendamento` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
