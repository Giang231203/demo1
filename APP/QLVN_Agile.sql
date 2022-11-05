CREATE DATABASE QLNV
go
use QLNV
go



CREATE TABLE nhan_vien (
	ma_nv VARCHAR(50) primary key not null,
	ten_nv NVARCHAR(50),
	gioi_tinh BIT,
	nam_sinh INT,
	chuc_vu NVARCHAR(50),
	so_gio_lam float,
	luong float,
	anh NVARCHAR(50)
)

INSERT INTO nhan_vien(ma_nv, ten_nv, gioi_tinh, nam_sinh, chuc_vu, so_gio_lam, luong, anh)
VALUES ('PH23038',N'Đặng Thanh Phương',1,2003,N'Trưởng phòng',200,13000000,'1.jpg')

SELECT * FROM nhan_vien