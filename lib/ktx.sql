USE [master]
GO
/****** Object:  Database [KTX_1]    Script Date: 10/29/2021 9:28:03 PM ******/
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
/****** Object:  Table [dbo].[DienNuoc]    Script Date: 10/29/2021 9:28:03 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DienNuoc](
	[MaDienNuoc] [int] IDENTITY(1,1) NOT NULL,
	[GiaDien] [float] NOT NULL,
	[GiaNuoc] [float] NOT NULL,
	[ChiSoDienCu] [int] NOT NULL,
	[ChiSoNuocCu] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaDienNuoc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 10/29/2021 9:28:03 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHoaDon] [int] IDENTITY(1,1) NOT NULL,
	[MaHopDong] [int] NULL,
	[TongTien] [float] NULL,
	[NgayTao] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDonChiTiet]    Script Date: 10/29/2021 9:28:03 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDonChiTiet](
	[MaHDCT] [int] IDENTITY(1,1) NOT NULL,
	[MaHoaDon] [int] NULL,
	[NgayTao] [date] NULL,
	[TienDien] [float] NULL,
	[TienNuoc] [float] NULL,
	[TienPhong] [float] NULL,
	[TongTien] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHDCT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HopDong]    Script Date: 10/29/2021 9:28:03 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HopDong](
	[MaHopDong] [int] IDENTITY(1,1) NOT NULL,
	[MaSV] [char](10) NULL,
	[MaPhong] [char](10) NULL,
	[NgayTao] [date] NULL,
	[TrangThai] [bit] NULL,
	[GiaThue] [float] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHopDong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Phong]    Script Date: 10/29/2021 9:28:03 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Phong](
	[MaPhong] [char](10) NOT NULL,
	[MaDienNuoc] [int] NULL,
	[TenPhong] [nvarchar](100) NULL,
	[GiaPhong] [float] NOT NULL,
	[TrangThai] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[QuanLy]    Script Date: 10/29/2021 9:28:03 PM ******/
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
/****** Object:  Table [dbo].[SinhVien]    Script Date: 10/29/2021 9:28:03 PM ******/
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
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD FOREIGN KEY([MaHopDong])
REFERENCES [dbo].[HopDong] ([MaHopDong])
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD FOREIGN KEY([MaHoaDon])
REFERENCES [dbo].[HoaDon] ([MaHoaDon])
GO
ALTER TABLE [dbo].[HopDong]  WITH CHECK ADD FOREIGN KEY([MaPhong])
REFERENCES [dbo].[Phong] ([MaPhong])
GO
ALTER TABLE [dbo].[HopDong]  WITH CHECK ADD FOREIGN KEY([MaSV])
REFERENCES [dbo].[SinhVien] ([MaSV])
GO
ALTER TABLE [dbo].[Phong]  WITH CHECK ADD FOREIGN KEY([MaDienNuoc])
REFERENCES [dbo].[DienNuoc] ([MaDienNuoc])
GO
USE [master]
GO
ALTER DATABASE [KTX_1] SET  READ_WRITE 
GO
