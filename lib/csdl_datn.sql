create database KTX_1
 
 create table QuanLy(
	TenDangNhap char(30) not null,
	MatKhau varchar(30) not null,
	primary key (TenDangNhap)
 )

 create table DichVu(
	MaDV char(10),
	TenDV nvarchar(50) not null,
	GiaDV decimal(9,2); not null,
	primary key (MaDV)
 )
 create table Phong(
	MaPhong char(10),
	TenPhong nvarchar(100) not null,
	GiaPhong decimal(9,2); not null,
	TrangThai nvarchar(20),
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
	TongTienDien decimal(9,2); not null,
	TongTienNuoc decimal(9,2); not null,
	Thang NVARCHAR(10) NOT NULL,
	TrangThai nvarchar(20) not null,
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
	TrangThai nvarchar(20) not null,
	primary key (MaSV)
 )
 
 create table HopDong(
	MaHopDong int identity(1,1),
	MaPhong char(10),
	MaSV char(10),
	NgayTao date not null,
	TrangThai nvarchar(20) not null,
	GiaThue decimal(9,2); not null,
	Thang nvarchar(10) not null,
	TrangThaiThu nvarchar(20),
	HoTen nvarchar(50) not null,
	primary key (MaHopDong),
	foreign key (MaPhong)references Phong (MaPhong),
	foreign key (MaSV)references SinhVien (MaSV),
 )

 create table HoaDon(
	MaHoaDon int identity(1,1),
	MaHopDong int,
	TienPhong decimal(9,2);
	NgayTao date,
	TrangThai nvarchar(20),
	Thang nvarchar(10) not null,
	MaSV char(10),
	Hoten nvarchar(50) not null,
	MaPhong char(10),
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

ALTER TABLE SinhVien
  ADD TrangThai nvarchar(20)

	Hoten nvarchar(50),
	MaPhong char(10)

ALTER TABLE HopDong
  ALTER COLUMN HoTen nvarchar(50)

  ALTER TABLE DienNuoc
  ALTER COLUMN TrangThai nvarchar(20)

  SELECT * FROM HopDong WHERE TrangThai=N'hoạt động' order by MaPhong


