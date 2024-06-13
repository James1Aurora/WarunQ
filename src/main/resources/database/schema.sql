-- SQLBook: Code
-- mysql -h mysql-warunq-warunq.d.aivencloud.com -P 28737 -u avnadmin -p "AVNS_dHcesTccniEeErK2qOH" --ssl-ca=c:\Users\hp\Downloads\ca.pem  defaultdb

SHOW DATABASES;
SHOW TABLES;

USE `db_warunq`;

DROP TABLE IF EXISTS `detail_transaksi`;
DROP TABLE IF EXISTS `pesanan`;
DROP TABLE IF EXISTS `transaksi`;
DROP TABLE IF EXISTS `barang`;
DROP TABLE IF EXISTS `akun`;

CREATE TABLE `akun` (
    `id` INT UNSIGNED AUTO_INCREMENT,
    `nama` VARCHAR(255) NOT NULL UNIQUE,
    `kata_sandi` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `barang` (
    `kode` VARCHAR(255),
    `nama` VARCHAR(255) NOT NULL UNIQUE,
    `harga` DECIMAL(15, 2) NOT NULL DEFAULT 0.00,
    `stok` INT UNSIGNED NOT NULL DEFAULT 0,
    `tanggal_belanja` DATE NULL DEFAULT (CURRENT_DATE),
    `biaya_belanja` DECIMAL(15, 2) NULL,
    PRIMARY KEY (`kode`)
);

CREATE TABLE `transaksi` (
    `id` INT UNSIGNED AUTO_INCREMENT,
    `tanggalwaktu` DATETIME NOT NULL DEFAULT (CURRENT_TIMESTAMP),
    `total` DECIMAL(15, 2) NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `detail_transaksi` (
    `id_transaksi` INT UNSIGNED AUTO_INCREMENT,
    `kode_barang` VARCHAR(255),
    `kuantitas_barang` INT UNSIGNED NOT NULL DEFAULT 0,
    `subtotal` DECIMAL(15, 2) NOT NULL DEFAULT 0.00,
    PRIMARY KEY (`id_transaksi`, `kode_barang`),
    FOREIGN KEY (`id_transaksi`) REFERENCES `transaksi`(`id`),
    FOREIGN KEY (`kode_barang`) REFERENCES `barang`(`kode`)
);

CREATE TABLE `pesanan` (
    `id` INT UNSIGNED AUTO_INCREMENT,
    `kode_barang` VARCHAR(255),
    `nama_pemesan` VARCHAR(255) NOT NULL,
    `kuantitas_barang` INT NOT NULL DEFAULT 0,
    `tenggat_pesanan` DATE NULL DEFAULT (CURRENT_DATE),
    `subtotal` DECIMAL(15, 2) NULL DEFAULT 0.00,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`kode_barang`) REFERENCES `barang`(`kode`)
);



DETERMINISTIC //
CREATE TRIGGER `hitung_stok`
AFTER INSERT
ON `detail_transaksi`
FOR EACH ROW
BEGIN
    UPDATE `barang`
    SET `stok` = `stok` - NEW.`kuantitas_barang`;
END//
DETERMINISTIC ;

CREATE VIEW `resi` AS
SELECT `detail_transaksi`.`id_transaksi`,
    `barang`.`nama`,
    `barang`.`harga`,
    `detail_transaksi`.`kuantitas_barang`,
    `detail_transaksi`.`subtotal`
FROM `detail_transaksi`
JOIN `barang` ON `barang`.`kode` = `detail_transaksi`.`kode_barang`;

CREATE VIEW `laporan` AS
SELECT `t.tanggalwaktu`, `dt.id_transaksi`, `dt.kode_barang` AS `id`, `n.nama` AS `nama_barang`,
SUM(`dt.kuantitas_barang`) AS `kuantitas`, `b.harga` AS `nilai_satuan`, SUM(`dt.subtotal`) AS total
FROM `detail_transaksi` AS `dt` INNER JOIN `transaksi` AS `t` ON `dt.id_transaksi` = `t.id`
INNER JOIN `barang` AS `b` ON `dt.kode_barang` = `b.kode` GROUP BY `dt.id_transaksi`, `dt.kode_barang`;