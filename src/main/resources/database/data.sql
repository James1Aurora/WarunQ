-- SQLBook: Code
-- Active: 1718285019228@@mysql-warunq-warunq.d.aivencloud.com@28737@db_warunq
INSERT INTO `akun` (`nama`, `kata_sandi`)
VALUES ('admin', 'admin');


SHOW DATABASES;
SHOW TABLES;

DELETE FROM `detail_transaksi`;
DELETE FROM `transaksi`;
DELETE FROM `pesanan`;
DELETE FROM `barang`;

INSERT INTO `barang`(`kode`,`nama`,`harga`,`stok`,`biaya_belanja`,`tanggal_belanja`) 
VALUES  ('08968617072', 'Indomie Goreng', 3000.00, 80, 2700.50, '2024-06-12'),
    ('8886057883665', 'Kratindaeng - 150ml', 5000.00, 50, 4300.00, '2024-06-12'),
    ('0735745243602', 'MINYAKKITA - 2L', 36000.00, 60, 32800.00,' 2024-05-29'),
    ('8991002105560', 'Kapal Api - Special Mix', 1500.00, 60, 1250.00,' 2024-06-04'),
    ('8998866613767', 'Super Sol - 19mL', 1500.00, 15, 1200.00, '2024-06-11'),
    ('89940416010929', 'Tisu Basah', 10000.00, 9, 9300.00, '2024-06-11'),
    ('089686043204', 'Indomie Goreng Aceh', 3500.00, 80, 3100.00, '2024-05-29'),
    ('8993176110074', 'Minyak Kayu Putih cap Lang', 26000.00, 12, 24500.00, '2024-05-04');

-- Insert dummy data into `akun` table
INSERT INTO `akun` (`nama`, `kata_sandi`) VALUES 
('admin', 'adminpassword'),
('kasir1', 'kasirpassword1'),
('kasir2', 'kasirpassword2');

-- Insert dummy data into `barang` table
INSERT INTO `barang` (`kode`, `nama`, `harga`, `stok`, `tanggal_belanja`, `biaya_belanja`) VALUES 
('BRG001', 'Beras', 50000.00, 100, '2024-06-01', 45000.00),
('BRG002', 'Gula', 12000.00, 50, '2024-06-02', 10000.00),
('BRG003', 'Minyak Goreng', 25000.00, 70, '2024-06-03', 22000.00),
('BRG004', 'Telur', 20000.00, 200, '2024-06-04', 18000.00),
('BRG005', 'Tepung Terigu', 9000.00, 80, '2024-06-05', 8500.00),
('BRG006', 'Mie Instan', 3000.00, 500, '2024-06-06', 2800.00);

-- Insert dummy data into `transaksi` table
INSERT INTO `transaksi` (`tanggalwaktu`, `total`) VALUES 
('2024-06-10 08:30:00', 0.00),
('2024-06-10 09:45:00', 0.00),
('2024-06-10 10:15:00', 0.00);

-- Insert dummy data into `detail_transaksi` table
INSERT INTO `detail_transaksi` (`id_transaksi`, `kode_barang`, `kuantitas_barang`, `subtotal`) VALUES 
(1, 'BRG001', 2, 100000.00),
(1, 'BRG002', 5, 60000.00),
(2, 'BRG003', 3, 75000.00),
(3, 'BRG004', 2, 40000.00),
(3, 'BRG005', 5, 45000.00);

-- Setelah data `detail_transaksi` dimasukkan, trigger `hitung_total_transaksi` akan menghitung ulang total transaksi dalam `transaksi` table.


INSERT INTO `transaksi` (`tanggalwaktu`) VALUES 
('2024-06-10 08:30:00'),
('2024-06-10 09:45:00'),
('2024-06-10 10:15:00');

-- Insert dummy data into `detail_transaksi` table without specifying `subtotal`
INSERT INTO `detail_transaksi` (`id_transaksi`, `kode_barang`, `kuantitas_barang`) VALUES 
(10, 'BRG001', 2),
(10, 'BRG002', 5),
(11, 'BRG003', 3),
(12, 'BRG004', 2),
(12, 'BRG005', 5);