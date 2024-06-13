-- SQLBook: Code
-- Active: 1718254436114@@mysql-warunq-warunq.d.aivencloud.com@28737@db_warunq
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
    ('089686043204', 'Indomie Goreng Aceh', 3500.00, 80, 3100.00, '2024-05-29')
    ('8993176110074','Minyak Kayu Putih cap Lang', 26000.00,12,24500.00,'2024-05-04');