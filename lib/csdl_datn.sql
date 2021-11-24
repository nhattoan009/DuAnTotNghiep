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
 create table Dien(
	MaDien int identity(1,1),
	MaDV char(10),
	MaPhong char(10),
	ChiSoCu int not null,
	ChiSoMoi int not null,
	SuDung int not null,
	TongTien float not null,
	Thang NVARCHAR(10) NOT NULL,
	primary key (MaDien),
	foreign key (MaDV)references DichVu (MaDV),
	foreign key (MaPhong)references Phong (MaPhong)
 )
 create table Nuoc(
	MaNuoc int identity(1,1),
	MaDV char(10),
	MaPhong char(10),
	ChiSoCu int not null,
	ChiSoMoi int not null,
	SuDung int not null,
	TongTien float not null,
	Thang NVARCHAR(10) NOT NULL,
	primary key (MaNuoc),
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
	primary key (MaHopDong),
	foreign key (MaPhong)references Phong (MaPhong),
	foreign key (MaSV)references SinhVien (MaSV),
 )

 create table HoaDon(
	MaHoaDon int identity(1,1),
	MaHopDong int,
	TienDien float,
	TienNuoc float,
	TienPhong float,
	TongTien float,
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
select * from HopDong

drop table DichVu
drop table Phong 
drop table SinhVien
drop table HopDong
drop table HoaDon
drop table Dien
drop table Nuoc

ALTER TABLE Nuoc
  ADD Thang date not null;

ALTER TABLE Nuoc
  ALTER COLUMN Thang NVARCHAR(10) NOT NULL;