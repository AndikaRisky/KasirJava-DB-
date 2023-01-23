-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 03 Jan 2022 pada 09.07
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_penjualan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `Barcode` text NOT NULL,
  `tanggal` text NOT NULL,
  `Nama` text NOT NULL,
  `Stok` int(11) NOT NULL,
  `Harga` int(11) NOT NULL,
  `terjual` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`Barcode`, `tanggal`, `Nama`, `Stok`, `Harga`, `terjual`) VALUES
('65433', '3/1/2022', 'Jaket Polos Cowok : M', 20, 220000, 0),
('65431', '3/1/2022', 'Jaket Polos Cowok : S ', 34, 220000, 0),
('65433', '3/1/2022', 'Jaket Polos Cowok : L', 15, 220000, 0),
('65434', '3/1/2022', 'Jaket Polos Cowok : XL', 20, 220000, 0),
('65435', '3/1/2022', 'Jaket Polos Cowok : XLL', 25, 220000, 0),
('67541', '3/1/2022', 'Jaket Polos Cewek : S', 35, 200000, 0),
('67542', '3/1/2022', 'Jaket Polos Cewek : M', 20, 200000, 0),
('67543', '3/1/2022', 'Jaket Polos Cewek : L', 27, 200000, 0),
('67544', '3/1/2022', 'Jaket Polos Cewek : XL', 20, 200000, 0),
('69641', '3/1/2022', 'Jaket Galaxy Cowok : L', 20, 240000, 0),
('69642', '3/1/2022', 'Jaket Galaxy Cowok : XL', 20, 240000, 0),
('69642', '3/1/2022', 'Jaket Galaxy Cowok : XLL', 20, 240000, 0),
('69649', '3/1/2022', 'Jaket Galaxy Cewek : L', 20, 220000, 0),
('69643', '3/1/2022', 'Jaket Galaxy Cewek : S', 20, 220000, 0),
('69645', '3/1/2022', 'Jaket Galaxy Cewek : XL', 20, 220000, 0),
('67891', '3/1/2022', 'T-shirt Hitam Polos : S', 8, 75000, 0),
('67892', '3/1/2022', 'T-shirt Hitam Polos : M', 8, 75000, 0),
('67893', '3/1/2022', 'T-shirt Hitam Polos : L', 30, 75000, 0),
('67894', '3/1/2022', 'T-shirt Hitam Polos : XL', 30, 75000, 0),
('68901', '3/1/2022', 'T-shirt Galaxy : S', 30, 100000, 0),
('68902', '3/1/2022', 'T-shirt Galaxy : M', 30, 100000, 0),
('68903', '3/1/2022', 'T-shirt Galaxy : L', 30, 100000, 0),
('68905', '3/1/2022', 'T-shirt Galaxy : XL', 30, 100000, 0),
('68906', '3/1/2022', 'T-shirt Galaxy : XXL', 30, 100000, 0),
('68871', '3/1/2022', 'Kemeja Flanel : M', 20, 150000, 0),
('68872', '3/1/2022', 'Kemeja Flanel : S', 20, 150000, 0),
('68873', '3/1/2022', 'Kemeja Flanel : L', 20, 150000, 0),
('68874', '3/1/2022', 'Kemeja Flanel : XL', 20, 150000, 0),
('68875', '3/1/2022', 'Kemeja Flanel : XL', 20, 150000, 0),
('68877', '3/1/2022', 'Kemeja Flanel : XXL', 20, 150000, 0),
('63971', '3/1/2022', 'Sepatu Cewek : 36', 20, 250000, 0),
('63972', '3/1/2022', 'Sepatu Cewek : 37', 20, 250000, 0),
('63973', '3/1/2022', 'Sepatu Cewek : 38', 20, 250000, 0),
('63974', '3/1/2022', 'Sepatu Cewek : 39', 20, 250000, 0),
('63975', '3/1/2022', 'Sepatu Cewek : 40', 20, 250000, 0),
('60851', '3/1/2022', 'Sepatu Cowok : 39', 20, 250000, 0),
('60852', '3/1/2022', 'Sepatu Cowok : 40', 20, 250000, 0),
('60853', '3/1/2022', 'Sepatu Cowok : 41', 20, 250000, 0),
('60854', '3/1/2022', 'Sepatu Cowok : 42', 20, 250000, 0),
('60855', '3/1/2022', 'Sepatu Cowok : 43', 20, 250000, 0),
('60856', '3/1/2022', 'Sepatu Cowok : 44', 20, 250000, 0),
('60857', '3/1/2022', 'Sepatu Cowok : 45', 20, 250000, 0),
('65945', '3/1/2022', 'Topi', 20, 100000, 0),
('62941', '3/1/2022', 'Celana Pendek : 27', 20, 70000, 0),
('62942', '3/1/2022', 'Celana Pendek : 28', 20, 70000, 0),
('62943', '3/1/2022', 'Celana Pendek : 29', 20, 70000, 0),
('62944', '3/1/2022', 'Celana Pendek : 30', 20, 70000, 0),
('62945', '3/1/2022', 'Celana Pendek : 31', 20, 70000, 0),
('62946', '3/1/2022', 'Celana Pendek : 32', 20, 70000, 0),
('62947', '3/1/2022', 'Celana Pendek : 33', 20, 70000, 0),
('62948', '3/1/2022', 'Celana Pendek : 34', 20, 70000, 0),
('62949', '3/1/2022', 'Celana Pendek : 35', 20, 70000, 0),
('62978', '3/1/2022', 'Celana Pendek : 36', 20, 70000, 0),
('60921', '3/1/2022', 'Celana Panjang : 27', 20, 100000, 0),
('60922', '3/1/2022', 'Celana Panjang : 28', 20, 100000, 0),
('60923', '3/1/2022', 'Celana Panjang : 28', 20, 100000, 0),
('60925', '3/1/2022', 'Celana Panjang : 29', 20, 100000, 0),
('60926', '3/1/2022', 'Celana Panjang : 31', 20, 100000, 0),
('60927', '3/1/2022', 'Celana Panjang : 32', 20, 100000, 0),
('60928', '3/1/2022', 'Celana Panjang : 33', 20, 100000, 0),
('60929', '3/1/2022', 'Celana Panjang : 34', 20, 100000, 0),
('60932', '3/1/2022', 'Celana Panjang : 35', 20, 100000, 0),
('60934', '3/1/2022', 'Celana Panjang : 36', 20, 100000, 0);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
