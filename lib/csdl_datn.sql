create database KTX_1
 
 create table QuanLy(
	TenDangNhap char(30) not null,
	MatKhau varchar(30) not null,
	primary key (TenDangNhap)
 )

 create table DichVu(
	MaDV char(10),
	TenDV nvarchar(50) not null,
	GiaDV float not null,
	primary key (MaDV)
 )
 create table Phong(
	MaPhong char(10),
	TenPhong nvarchar(100) not null,
	GiaPhong float not null,
	TrangThai bit, 
	primary key (MaPhong)
 )
 create table DienNuoc(
	MaDienNuoc int identity(1,1),
	MaDV char(10),
	MaPhong char(10),
	ChiSoCuDien int not null,
	ChiSoMoiDien int not null,
	ChiSoCuNuoc int not null,
	ChiSoMoiNuoc int not null,
	SuDungDien int not null,
	SuDungNuoc int not null,
	TongTienDien float not null,
	TongTienNuoc float not null,
	Thang NVARCHAR(10) NOT NULL,
	TrangThai bit not null,
	primary key (MaDienNuoc),
	foreign key (MaDV)references DichVu (MaDV),
	foreign key (MaPhong)references Phong (MaPhong)
 )

   create table SinhVien(
	MaSV char(10),
	HoTen nvarchar(50) not null,
	GioiTinh bit,
	NgaySinh Date,
	SDT nvarchar(15) not null,
	CMND nvarchar(15) not null,
	Email varchar(40) not null,
	primary key (MaSV)
 )
 
 create table HopDong(
	MaHopDong int identity(1,1),
	MaPhong char(10),
	MaSV char(10),
	NgayTao date not null,
	TrangThai bit not null,
	GiaThue float not null,
	Thang nvarchar(10) not null,
	primary key (MaHopDong),
	foreign key (MaPhong)references Phong (MaPhong),
	foreign key (MaSV)references SinhVien (MaSV),
 )

 create table HoaDon(
	MaHoaDon int identity(1,1),
	MaHopDong int,
	TienPhong float,
	NgayTao date,
	TrangThai bit,
	primary key (MaHoaDon),
	foreign key (MaHopDong)references HopDong (MaHopDong)
 )

select * from SinhVien
select * from DienNuoc
select * from HoaDon
select * from HoaDonChiTiet
select * from HopDong

select * from Dien
select * from Nuoc
select * from HopDong

drop table DichVu
drop table Phong
drop table SinhVien
drop table HopDong
drop table HoaDon
drop table DienNuoc

ALTER TABLE Nuoc
  ADD Thang date not null;

ALTER TABLE HopDong
  ALTER COLUMN Thang NVARCHAR(10) NOT NULL;

delete from Nuoc


select * from Dien
select * from Nuoc
SELECT d.TongTien, n.TongTien
FROM Dien d
INNER JOIN Nuoc n ON d.MaPhong = n.MaPhong and d.Thang = n.Thang
