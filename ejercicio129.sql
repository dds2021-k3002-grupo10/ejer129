-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-05-2021 a las 01:36:27
-- Versión del servidor: 10.4.13-MariaDB
-- Versión de PHP: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ejercicio129`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `ID_CLIENTE` int(11) NOT NULL,
  `NOMBRE` varchar(50) NOT NULL,
  `NUMERO_DNI` int(4) NOT NULL,
  `ESTADO` char(1) NOT NULL,
  `FECHA_ALTA` date NOT NULL,
  `FECHA_BAJA` date DEFAULT NULL,
  `FECHA_ULTIMA_MODIF` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`ID_CLIENTE`, `NOMBRE`, `NUMERO_DNI`, `ESTADO`, `FECHA_ALTA`, `FECHA_BAJA`, `FECHA_ULTIMA_MODIF`) VALUES
(1, 'GASTON', 111, 'A', '2021-05-16', NULL, '2021-05-16'),
(2, 'DANIEL', 222, 'A', '2021-05-16', NULL, '2021-05-16');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta`
--

CREATE TABLE `cuenta` (
  `ID_CUENTA` int(11) NOT NULL,
  `DESCRIPCION` varchar(50) NOT NULL,
  `VALOR` float NOT NULL,
  `ID_CLIENTE` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cuenta`
--

INSERT INTO `cuenta` (`ID_CUENTA`, `DESCRIPCION`, `VALOR`, `ID_CLIENTE`) VALUES
(1, 'CUENTA1-1', 1000, 1),
(2, 'CUENTA2-1', 2000, 1),
(3, 'CUENTA3-1', 3000, 1),
(4, 'CUENTA4-1', 4000, 1),
(5, 'CUENTA1-2', 100, 1),
(6, 'CUENTA2-2', 200, 2),
(7, 'CUENTA3-2', 3000, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`ID_CLIENTE`),
  ADD UNIQUE KEY `NUMERO_DNI` (`NUMERO_DNI`);

--
-- Indices de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  ADD PRIMARY KEY (`ID_CUENTA`),
  ADD UNIQUE KEY `DESCRIPCION` (`DESCRIPCION`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `ID_CLIENTE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  MODIFY `ID_CUENTA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
