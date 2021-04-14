-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  jeu. 06 août 2020 à 17:23
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP :  7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `examm1`
--

-- --------------------------------------------------------

--
-- Structure de la table `tableadmin`
--

CREATE TABLE `tableadmin` (
  `id` int(10) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `bureau` varchar(50) NOT NULL,
  `poste` varchar(50) NOT NULL,
  `description` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `tableadmin`
--

INSERT INTO `tableadmin` (`id`, `nom`, `prenom`, `bureau`, `poste`, `description`, `email`) VALUES
(1, 'Soufiane', 'Jaida', 'The White-House', 'Président', 'Make the world great again !!!', 's.f.j.dsapro@gmail.com'),
(2, 'Dorré', 'Patrick', '202-Teccart', 'Directeur de l\'école', 'Je ne suis pas disponible pour le moment...', 'PatrickDorré@gmail.com');

-- --------------------------------------------------------

--
-- Structure de la table `tableprof`
--

CREATE TABLE `tableprof` (
  `id` int(10) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `bureau` varchar(50) NOT NULL,
  `poste` varchar(50) NOT NULL,
  `statut` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `tableprof`
--

INSERT INTO `tableprof` (`id`, `nom`, `prenom`, `bureau`, `poste`, `statut`, `email`) VALUES
(1, 'Fernand', 'Bikatal', 'Local-301', 'Prof en Informatique-Robotique', 'Disponible', 'BikatalFernand@gmail.com'),
(2, 'Ricker', 'Alceindor', 'Local-400', 'DataBase spécialiste', 'Disponible', 'Ricker@gmail.com'),
(3, 'Steve', 'Ataki', 'Local-510', 'Prof-VB-ASP-JS', 'Disponible', 'SteveAT@gmail.com');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `tableadmin`
--
ALTER TABLE `tableadmin`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `tableprof`
--
ALTER TABLE `tableprof`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `tableadmin`
--
ALTER TABLE `tableadmin`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `tableprof`
--
ALTER TABLE `tableprof`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
