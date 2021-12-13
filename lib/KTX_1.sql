USE [master]
GO
/****** Object:  Database [KTX_1]    Script Date: 12/11/2021 3:59:12 AM ******/
CREATE DATABASE [KTX_1]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'KTX_1', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\KTX_1.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'KTX_1_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\KTX_1_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [KTX_1] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [KTX_1].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [KTX_1] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [KTX_1] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [KTX_1] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [KTX_1] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [KTX_1] SET ARITHABORT OFF 
GO
ALTER DATABASE [KTX_1] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [KTX_1] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [KTX_1] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [KTX_1] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [KTX_1] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [KTX_1] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [KTX_1] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [KTX_1] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [KTX_1] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [KTX_1] SET  ENABLE_BROKER 
GO
ALTER DATABASE [KTX_1] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [KTX_1] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [KTX_1] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [KTX_1] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [KTX_1] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [KTX_1] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [KTX_1] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [KTX_1] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [KTX_1] SET  MULTI_USER 
GO
ALTER DATABASE [KTX_1] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [KTX_1] SET DB_CHAINING OFF 
GO
ALTER DATABASE [KTX_1] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [KTX_1] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [KTX_1] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [KTX_1] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [KTX_1] SET QUERY_STORE = OFF
GO
USE [KTX_1]
GO
/****** Object:  Table [dbo].[DichVu]    Script Date: 12/11/2021 3:59:12 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DichVu](
	[MaDV] [char](10) NOT NULL,
	[TenDV] [nvarchar](50) NOT NULL,
	[GiaDV] [float] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaDV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DienNuoc]    Script Date: 12/11/2021 3:59:12 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DienNuoc](
	[MaDienNuoc] [int] IDENTITY(1,1) NOT NULL,
	[MaDV] [char](10) NULL,
	[MaPhong] [char](10) NULL,
	[ChiSoCuDien] [int] NOT NULL,
	[ChiSoMoiDien] [int] NOT NULL,
	[ChiSoCuNuoc] [int] NOT NULL,
	[ChiSoMoiNuoc] [int] NOT NULL,
	[SuDungDien] [int] NOT NULL,
	[SuDungNuoc] [int] NOT NULL,
	[TongTienDien] [float] NOT NULL,
	[TongTienNuoc] [float] NOT NULL,
	[Thang] [nvarchar](10) NOT NULL,
	[TrangThai] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaDienNuoc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 12/11/2021 3:59:12 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHoaDon] [int] IDENTITY(1,1) NOT NULL,
	[MaHopDong] [int] NULL,
	[TienPhong] [float] NULL,
	[NgayTao] [date] NULL,
	[TrangThai] [nvarchar](20) NULL,
	[Thang] [nvarchar](10) NULL,
	[MaSV] [char](10) NULL,
	[Hoten] [nvarchar](50) NULL,
	[MaPhong] [char](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HopDong]    Script Date: 12/11/2021 3:59:12 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HopDong](
	[MaHopDong] [int] IDENTITY(1,1) NOT NULL,
	[MaPhong] [char](10) NULL,
	[MaSV] [char](10) NULL,
	[NgayTao] [date] NOT NULL,
	[TrangThai] [nvarchar](20) NULL,
	[GiaThue] [float] NOT NULL,
	[Thang] [nvarchar](10) NULL,
	[TrangThaiThu] [nvarchar](20) NULL,
	[HoTen] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHopDong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Phong]    Script Date: 12/11/2021 3:59:12 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Phong](
	[MaPhong] [char](10) NOT NULL,
	[TenPhong] [nvarchar](100) NOT NULL,
	[GiaPhong] [float] NOT NULL,
	[TrangThai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[QuanLy]    Script Date: 12/11/2021 3:59:12 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[QuanLy](
	[TenDangNhap] [char](30) NOT NULL,
	[MatKhau] [varchar](30) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[TenDangNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SinhVien]    Script Date: 12/11/2021 3:59:12 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SinhVien](
	[MaSV] [char](10) NOT NULL,
	[HoTen] [nvarchar](50) NOT NULL,
	[GioiTinh] [bit] NULL,
	[NgaySinh] [date] NULL,
	[SDT] [nvarchar](15) NOT NULL,
	[CMND] [nvarchar](15) NOT NULL,
	[Email] [varchar](40) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaSV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [GiaDV]) VALUES (N'DIEN      ', N'DIEN', 5000)
INSERT [dbo].[DichVu] ([MaDV], [TenDV], [GiaDV]) VALUES (N'NUOC      ', N'NUOC', 7000)
GO
SET IDENTITY_INSERT [dbo].[DienNuoc] ON 

INSERT [dbo].[DienNuoc] ([MaDienNuoc], [MaDV], [MaPhong], [ChiSoCuDien], [ChiSoMoiDien], [ChiSoCuNuoc], [ChiSoMoiNuoc], [SuDungDien], [SuDungNuoc], [TongTienDien], [TongTienNuoc], [Thang], [TrangThai]) VALUES (1, NULL, N'P101      ', 10, 15, 12, 18, 5, 6, 25000, 30000, N'Tháng 1', 1)
SET IDENTITY_INSERT [dbo].[DienNuoc] OFF
GO
SET IDENTITY_INSERT [dbo].[HoaDon] ON 

INSERT [dbo].[HoaDon] ([MaHoaDon], [MaHopDong], [TienPhong], [NgayTao], [TrangThai], [Thang], [MaSV], [Hoten], [MaPhong]) VALUES (8, 9, 300, CAST(N'2021-12-06' AS Date), N'0', N'1', N'PC01121   ', N'Nguyễn Văn Hoa', N'P102      ')
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaHopDong], [TienPhong], [NgayTao], [TrangThai], [Thang], [MaSV], [Hoten], [MaPhong]) VALUES (9, 10, 300, CAST(N'2021-12-06' AS Date), N'1', N'1', N'PC00366`  ', N'Huỳnh Nhật Toàn', N'P101      ')
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaHopDong], [TienPhong], [NgayTao], [TrangThai], [Thang], [MaSV], [Hoten], [MaPhong]) VALUES (13, 10, 300, CAST(N'2021-12-07' AS Date), N'0', N'1', N'PC00366`  ', N'Huỳnh Nhật Toàn', N'P101      ')
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaHopDong], [TienPhong], [NgayTao], [TrangThai], [Thang], [MaSV], [Hoten], [MaPhong]) VALUES (14, 10, 300, CAST(N'2021-12-07' AS Date), N'0', N'1', N'PC00366`  ', N'Huỳnh Nhật Toàn', N'P101      ')
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaHopDong], [TienPhong], [NgayTao], [TrangThai], [Thang], [MaSV], [Hoten], [MaPhong]) VALUES (15, 10, 300, CAST(N'2021-12-07' AS Date), N'0', N'1', N'PC00366`  ', N'Huỳnh Nhật Toàn', N'P101      ')
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaHopDong], [TienPhong], [NgayTao], [TrangThai], [Thang], [MaSV], [Hoten], [MaPhong]) VALUES (16, 10, 300, CAST(N'2021-12-07' AS Date), N'0', N'1', N'PC00366`  ', N'Huỳnh Nhật Toàn', N'P101      ')
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaHopDong], [TienPhong], [NgayTao], [TrangThai], [Thang], [MaSV], [Hoten], [MaPhong]) VALUES (17, 11, 300, CAST(N'2021-12-07' AS Date), N'Đã thu', N'1', N'PC3333    ', N'Lê Thị Lan', N'P101      ')
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaHopDong], [TienPhong], [NgayTao], [TrangThai], [Thang], [MaSV], [Hoten], [MaPhong]) VALUES (18, 11, 300, CAST(N'2021-12-07' AS Date), N'Ðã thu', N'1', N'PC3333    ', N'Lê Thị Lan', N'P101      ')
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaHopDong], [TienPhong], [NgayTao], [TrangThai], [Thang], [MaSV], [Hoten], [MaPhong]) VALUES (19, 12, 300, CAST(N'2021-12-07' AS Date), N'Ðã thu', N'1', N'PC00911   ', N'Nguyễn Thị Lú', N'P101      ')
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaHopDong], [TienPhong], [NgayTao], [TrangThai], [Thang], [MaSV], [Hoten], [MaPhong]) VALUES (20, 13, 300, CAST(N'2021-12-07' AS Date), N'Ðã thu', N'2', N'PC00902   ', N'Nguyễn Hiếu Thiên', N'P101      ')
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaHopDong], [TienPhong], [NgayTao], [TrangThai], [Thang], [MaSV], [Hoten], [MaPhong]) VALUES (21, 11, 300, CAST(N'2021-12-11' AS Date), N'Đã thu', N'1', N'PC3333    ', N'Lê Thị Lan', N'P101      ')
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaHopDong], [TienPhong], [NgayTao], [TrangThai], [Thang], [MaSV], [Hoten], [MaPhong]) VALUES (22, 12, 300, CAST(N'2021-12-11' AS Date), N'Chưa thu', N'1', N'PC00911   ', N'Nguyễn Thị Lú', N'P101      ')
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaHopDong], [TienPhong], [NgayTao], [TrangThai], [Thang], [MaSV], [Hoten], [MaPhong]) VALUES (23, 15, 300, CAST(N'2021-12-11' AS Date), N'Đã thu', N'12', N'PC0099    ', N'thị nở', N'P102      ')
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaHopDong], [TienPhong], [NgayTao], [TrangThai], [Thang], [MaSV], [Hoten], [MaPhong]) VALUES (24, 16, 300, CAST(N'2021-12-11' AS Date), N'Đã thu', N'4', N'PC0099    ', N'thị nở', N'P101      ')
SET IDENTITY_INSERT [dbo].[HoaDon] OFF
GO
SET IDENTITY_INSERT [dbo].[HopDong] ON 

INSERT [dbo].[HopDong] ([MaHopDong], [MaPhong], [MaSV], [NgayTao], [TrangThai], [GiaThue], [Thang], [TrangThaiThu], [HoTen]) VALUES (9, N'P102      ', N'PC01121   ', CAST(N'2021-12-04' AS Date), N'1', 300, N'1', N'0', N'Nguyễn Văn Hoa')
INSERT [dbo].[HopDong] ([MaHopDong], [MaPhong], [MaSV], [NgayTao], [TrangThai], [GiaThue], [Thang], [TrangThaiThu], [HoTen]) VALUES (10, N'P101      ', N'PC00366`  ', CAST(N'2021-12-06' AS Date), N'1', 300, N'1', N'0', N'Huỳnh Nhật Toàn')
INSERT [dbo].[HopDong] ([MaHopDong], [MaPhong], [MaSV], [NgayTao], [TrangThai], [GiaThue], [Thang], [TrangThaiThu], [HoTen]) VALUES (11, N'P101      ', N'PC3333    ', CAST(N'2021-12-07' AS Date), N'hoạt động', 300, N'1', N'Chưa thu', N'Lê Thị Lan')
INSERT [dbo].[HopDong] ([MaHopDong], [MaPhong], [MaSV], [NgayTao], [TrangThai], [GiaThue], [Thang], [TrangThaiThu], [HoTen]) VALUES (12, N'P101      ', N'PC00911   ', CAST(N'2021-12-07' AS Date), N'hoạt động', 300, N'1', N'Chưa thu', N'Nguyễn Thị Lú')
INSERT [dbo].[HopDong] ([MaHopDong], [MaPhong], [MaSV], [NgayTao], [TrangThai], [GiaThue], [Thang], [TrangThaiThu], [HoTen]) VALUES (13, N'P101      ', N'PC00902   ', CAST(N'2021-12-07' AS Date), N'hoạt động', 300, N'2', N'Chưa thu', N'Nguyễn Hiếu Thiên')
INSERT [dbo].[HopDong] ([MaHopDong], [MaPhong], [MaSV], [NgayTao], [TrangThai], [GiaThue], [Thang], [TrangThaiThu], [HoTen]) VALUES (14, N'P101      ', N'PC123     ', CAST(N'2021-12-09' AS Date), N'hoạt động', 300, N'1', N'Chưa thu', N'Nguyễn Văn An')
INSERT [dbo].[HopDong] ([MaHopDong], [MaPhong], [MaSV], [NgayTao], [TrangThai], [GiaThue], [Thang], [TrangThaiThu], [HoTen]) VALUES (15, N'P102      ', N'PC0099    ', CAST(N'2021-12-11' AS Date), N'hoạt động', 300, N'12', N'Chưa thu', N'thị nở')
INSERT [dbo].[HopDong] ([MaHopDong], [MaPhong], [MaSV], [NgayTao], [TrangThai], [GiaThue], [Thang], [TrangThaiThu], [HoTen]) VALUES (16, N'P101      ', N'PC0099    ', CAST(N'2021-12-11' AS Date), N'hoạt động', 300, N'4', N'Chưa thu', N'thị nở')
INSERT [dbo].[HopDong] ([MaHopDong], [MaPhong], [MaSV], [NgayTao], [TrangThai], [GiaThue], [Thang], [TrangThaiThu], [HoTen]) VALUES (18, N'P101      ', N'PC01121   ', CAST(N'2021-12-11' AS Date), N'hoạt động', 300, N'1', N'Chưa thu', N'Nguyễn Văn Hoa')
INSERT [dbo].[HopDong] ([MaHopDong], [MaPhong], [MaSV], [NgayTao], [TrangThai], [GiaThue], [Thang], [TrangThaiThu], [HoTen]) VALUES (19, N'P101      ', N'PC222     ', CAST(N'2021-12-11' AS Date), N'hoạt động', 300, N'1', N'Chưa thu', N'LAN LAN')
INSERT [dbo].[HopDong] ([MaHopDong], [MaPhong], [MaSV], [NgayTao], [TrangThai], [GiaThue], [Thang], [TrangThaiThu], [HoTen]) VALUES (20, N'P101      ', N'PC00902   ', CAST(N'2021-12-11' AS Date), N'hoạt động', 300, N'1', N'Chưa thu', N'Nguyễn Hiếu Thiên')
INSERT [dbo].[HopDong] ([MaHopDong], [MaPhong], [MaSV], [NgayTao], [TrangThai], [GiaThue], [Thang], [TrangThaiThu], [HoTen]) VALUES (21, N'P101      ', N'PC123     ', CAST(N'2021-12-11' AS Date), N'hoạt động', 300, N'1', N'Chưa thu', N'Nguyễn Văn An')
INSERT [dbo].[HopDong] ([MaHopDong], [MaPhong], [MaSV], [NgayTao], [TrangThai], [GiaThue], [Thang], [TrangThaiThu], [HoTen]) VALUES (22, N'P101      ', N'PC222     ', CAST(N'2021-12-11' AS Date), N'hoạt động', 300, N'1', N'Chưa thu', N'LAN LAN')
INSERT [dbo].[HopDong] ([MaHopDong], [MaPhong], [MaSV], [NgayTao], [TrangThai], [GiaThue], [Thang], [TrangThaiThu], [HoTen]) VALUES (23, N'P101      ', N'PC00911   ', CAST(N'2021-12-11' AS Date), N'hoạt động', 300, N'1', N'Chưa thu', N'Nguyễn Thị Lú')
INSERT [dbo].[HopDong] ([MaHopDong], [MaPhong], [MaSV], [NgayTao], [TrangThai], [GiaThue], [Thang], [TrangThaiThu], [HoTen]) VALUES (24, N'P101      ', N'PC123     ', CAST(N'2021-12-11' AS Date), N'hoạt động', 300, N'1', N'Chưa thu', N'Nguyễn Văn An')
INSERT [dbo].[HopDong] ([MaHopDong], [MaPhong], [MaSV], [NgayTao], [TrangThai], [GiaThue], [Thang], [TrangThaiThu], [HoTen]) VALUES (25, N'P104      ', N'PC0099    ', CAST(N'2021-12-11' AS Date), N'hoạt động', 300000, N'1', N'Chưa thu', N'thị nở')
SET IDENTITY_INSERT [dbo].[HopDong] OFF
GO
INSERT [dbo].[Phong] ([MaPhong], [TenPhong], [GiaPhong], [TrangThai]) VALUES (N'P101      ', N'Phòng 1 lầu 1', 300000, 1)
INSERT [dbo].[Phong] ([MaPhong], [TenPhong], [GiaPhong], [TrangThai]) VALUES (N'P102      ', N'Phòng 2 lầu 1', 300000, 1)
INSERT [dbo].[Phong] ([MaPhong], [TenPhong], [GiaPhong], [TrangThai]) VALUES (N'P103      ', N'Phòng 3 lầu 1', 300000, 1)
INSERT [dbo].[Phong] ([MaPhong], [TenPhong], [GiaPhong], [TrangThai]) VALUES (N'P104      ', N'PHÒNG 104', 300000, 1)
INSERT [dbo].[Phong] ([MaPhong], [TenPhong], [GiaPhong], [TrangThai]) VALUES (N'P105      ', N'phòng 5', 1000000, 1)
GO
INSERT [dbo].[QuanLy] ([TenDangNhap], [MatKhau]) VALUES (N'hntoan                        ', N'123')
GO
INSERT [dbo].[SinhVien] ([MaSV], [HoTen], [GioiTinh], [NgaySinh], [SDT], [CMND], [Email]) VALUES (N'PC00366`  ', N'Huỳnh Nhật Toàn', 1, CAST(N'1212-12-12' AS Date), N'0123123123', N'372016491', N'toanhnpc00366@fpt.edu.vn')
INSERT [dbo].[SinhVien] ([MaSV], [HoTen], [GioiTinh], [NgaySinh], [SDT], [CMND], [Email]) VALUES (N'PC00902   ', N'Nguyễn Hiếu Thiên', 1, CAST(N'2020-03-01' AS Date), N'0242342344', N'789987789', N'thiennhpc00902@fpt.edu.vn')
INSERT [dbo].[SinhVien] ([MaSV], [HoTen], [GioiTinh], [NgaySinh], [SDT], [CMND], [Email]) VALUES (N'PC00911   ', N'Nguyễn Thị Lú', 0, CAST(N'2001-11-01' AS Date), N'0123123123', N'234234234', N'lu@gmail.com')
INSERT [dbo].[SinhVien] ([MaSV], [HoTen], [GioiTinh], [NgaySinh], [SDT], [CMND], [Email]) VALUES (N'PC0099    ', N'thị nở', 0, CAST(N'2000-12-12' AS Date), N'0456456456', N'456456456', N'no@gmail.com')
INSERT [dbo].[SinhVien] ([MaSV], [HoTen], [GioiTinh], [NgaySinh], [SDT], [CMND], [Email]) VALUES (N'PC01121   ', N'Nguyễn Văn Hoa', 0, CAST(N'2000-12-13' AS Date), N'0123123123', N'123123123', N'hoa@fpt.edu.vn')
INSERT [dbo].[SinhVien] ([MaSV], [HoTen], [GioiTinh], [NgaySinh], [SDT], [CMND], [Email]) VALUES (N'PC123     ', N'Nguyễn Văn An', 0, CAST(N'2002-02-02' AS Date), N'0123123124', N'123123445', N'an1@gmail.com')
INSERT [dbo].[SinhVien] ([MaSV], [HoTen], [GioiTinh], [NgaySinh], [SDT], [CMND], [Email]) VALUES (N'PC222     ', N'LAN LAN', 1, CAST(N'2000-12-12' AS Date), N'0123123123', N'123123123', N'LAN@GMAIL.COM')
INSERT [dbo].[SinhVien] ([MaSV], [HoTen], [GioiTinh], [NgaySinh], [SDT], [CMND], [Email]) VALUES (N'PC3333    ', N'Lê Thị Lan', 1, CAST(N'2000-03-04' AS Date), N'0456456456', N'567567567', N'lan@gmail.com')
GO
ALTER TABLE [dbo].[DienNuoc]  WITH CHECK ADD FOREIGN KEY([MaDV])
REFERENCES [dbo].[DichVu] ([MaDV])
GO
ALTER TABLE [dbo].[DienNuoc]  WITH CHECK ADD FOREIGN KEY([MaPhong])
REFERENCES [dbo].[Phong] ([MaPhong])
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD FOREIGN KEY([MaHopDong])
REFERENCES [dbo].[HopDong] ([MaHopDong])
GO
ALTER TABLE [dbo].[HopDong]  WITH CHECK ADD FOREIGN KEY([MaPhong])
REFERENCES [dbo].[Phong] ([MaPhong])
GO
ALTER TABLE [dbo].[HopDong]  WITH CHECK ADD FOREIGN KEY([MaSV])
REFERENCES [dbo].[SinhVien] ([MaSV])
GO
/****** Object:  StoredProcedure [dbo].[thongKeThang]    Script Date: 12/11/2021 3:59:12 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROC [dbo].[thongKeThang] (@TrangThai bit)
AS BEGIN
	SELECT
	MaPhong Phong,
		Thang Thang,
		SUM(TienPhong) DoanhThu
	FROM HoaDon 
	WHERE TrangThai = @TrangThai
	group by MaPhong, Thang
END
GO
USE [master]
GO
ALTER DATABASE [KTX_1] SET  READ_WRITE 
GO
