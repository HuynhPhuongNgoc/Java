GO
CREATE DATABASE javaQLBH
GO
USE javaQLBH
GO
CREATE TABLE tblChatLieu(
MaChatLieu NVARCHAR(50) PRIMARY KEY NOT NULL,
TenChatLieu NVARCHAR(50) NOT NULL
)
GO 
CREATE TABLE tblKhach(
MaKhach NVARCHAR(10) PRIMARY KEY NOT NULL,
TenKhach NVARCHAR(50) NOT NULL,
DiaChi NVARCHAR(50) NOT NULL,
DienThoai NVARCHAR(15) NOT NULL
)
GO 
CREATE TABLE tblHang(
MaHang NVARCHAR(50) PRIMARY KEY NOT NULL,
TenHang NVARCHAR(50) NOT NULL,
MaChatLieu NVARCHAR(50) NOT NULL,
SoLuong FLOAT NOT NULL,
DonGiaNhap FLOAT NOT NULL,
DonGiaBan FLOAT NOT NULL,
Anh NVARCHAR(200) NOT NULL,
GhiChu NVARCHAR(200)
CONSTRAINT fk_HCL FOREIGN KEY(MaChatLieu) REFERENCES dbo.tblChatLieu(MaChatLieu)
)
GO
CREATE TABLE tblNhanVien(
MaNhanVien NVARCHAR(10) PRIMARY KEY  NOT NULL,
TenNhanVien NVARCHAR(50) NOT NULL,
GioiTinh NVARCHAR(10) NOT NULL,
DiaChi NVARCHAR(50) NOT NULL,
DienThoai NVARCHAR(15) NOT NULL,
NgaySinh NVARCHAR(20) NOT NULL
)
GO 
CREATE TABLE tblHDBan(
MaHDBan NVARCHAR(30) PRIMARY KEY NOT NULL,
MaNhanVien NVARCHAR(10) NOT NULL,
NgayBan NVARCHAR(20) NOT NULL,
MaKhach NVARCHAR(10) NOT NULL,
TongTien FLOAT NOT NULL,
CONSTRAINT fk_HDNV FOREIGN KEY(MaNhanVien) REFERENCES dbo.tblNhanVien(MaNhanVien),
CONSTRAINT fk_HDK FOREIGN KEY(MaKhach) REFERENCES dbo.tblKhach(MaKhach)
)
GO
CREATE TABLE tblChitietHDBan(
MaHDBan NVARCHAR(30) NOT NULL,
MaHang NVARCHAR(50) NOT NULL,
SoLuong FLOAT NOT NULL,
DonGia FLOAT NOT NULL,
GiamGia FLOAT NOT NULL,
ThanhTien FLOAT NOT NULL,
CONSTRAINT pr_key PRIMARY KEY(MaHDBan,MaHang),
CONSTRAINT fk_CTH FOREIGN KEY(MaHang) REFERENCES dbo.tblHang(MaHang),
CONSTRAINT fk_CTHDB FOREIGN KEY(MaHDBan) REFERENCES dbo.tblHDBan(MaHDBan)
)
GO
INSERT dbo.tblChatLieu
        ( MaChatLieu, TenChatLieu )
VALUES  ( N'MCL01', -- MaChatLieu - nvarchar(50)
          N'Thép'  -- TenChatLieu - nvarchar(50)
          )
GO 
INSERT dbo.tblChatLieu
        ( MaChatLieu, TenChatLieu )
VALUES  ( N'MCL02', -- MaChatLieu - nvarchar(50)
          N'Đồng'  -- TenChatLieu - nvarchar(50)
          )
GO 
INSERT dbo.tblChatLieu
        ( MaChatLieu, TenChatLieu )
VALUES  ( N'MCL03', -- MaChatLieu - nvarchar(50)
          N'Gang'  -- TenChatLieu - nvarchar(50)
          )
GO
INSERT dbo.tblKhach
        ( MaKhach ,
          TenKhach ,
          DiaChi ,
          DienThoai
        )
VALUES  ( N'MK01' , -- MaKhach - nvarchar(10)
          N'Tèo' , -- TenKhach - nvarchar(50)
          N'Nha trang' , -- DiaChi - nvarchar(50)
          N'15561'  -- DienThoai - nvarchar(15)
        )
GO
INSERT dbo.tblKhach
        ( MaKhach ,
          TenKhach ,
          DiaChi ,
          DienThoai
        )
VALUES  ( N'MK02' , -- MaKhach - nvarchar(10)
          N'Tí' , -- TenKhach - nvarchar(50)
          N'Cam Ranh' , -- DiaChi - nvarchar(50)
          N'456984'  -- DienThoai - nvarchar(15)
        )
GO
INSERT dbo.tblKhach
        ( MaKhach ,
          TenKhach ,
          DiaChi ,
          DienThoai
        )
VALUES  ( N'MK03' , -- MaKhach - nvarchar(10)
          N'Tôm' , -- TenKhach - nvarchar(50)
          N'Ninh Hòa' , -- DiaChi - nvarchar(50)
          N'555546'  -- DienThoai - nvarchar(15)
        )
GO
INSERT dbo.tblHang
        ( MaHang ,
          TenHang ,
          MaChatLieu ,
          SoLuong ,
          DonGiaNhap ,
          DonGiaBan ,
          Anh ,
          GhiChu
        )
VALUES  ( N'MH01' , -- MaHang - nvarchar(50)
          N'Lô thép' , -- TenHang - nvarchar(50)
          N'MCL01' , -- MaChatLieu - nvarchar(50)
          12.0 , -- SoLuong - float
          140.0 , -- DonGiaNhap - float
          150.0 , -- DonGiaBan - float
          N'Ảnh thép' , -- Anh - nvarchar(200)
          N'Ko'  -- GhiChu - nvarchar(200)
        )
GO
INSERT dbo.tblHang
        ( MaHang ,
          TenHang ,
          MaChatLieu ,
          SoLuong ,
          DonGiaNhap ,
          DonGiaBan ,
          Anh ,
          GhiChu
        )
VALUES  ( N'MH02' , -- MaHang - nvarchar(50)
          N'Lô gang' , -- TenHang - nvarchar(50)
          N'MCL02' , -- MaChatLieu - nvarchar(50)
          3.0 , -- SoLuong - float
          120.0 , -- DonGiaNhap - float
          150.0 , -- DonGiaBan - float
          N'Ảnh gang' , -- Anh - nvarchar(200)
          N'Nhập ngay'  -- GhiChu - nvarchar(200)
        )
GO
INSERT dbo.tblHang
        ( MaHang ,
          TenHang ,
          MaChatLieu ,
          SoLuong ,
          DonGiaNhap ,
          DonGiaBan ,
          Anh ,
          GhiChu
        )
VALUES  ( N'MH03' , -- MaHang - nvarchar(50)
          N'Lô đồng' , -- TenHang - nvarchar(50)
          N'MCL03' , -- MaChatLieu - nvarchar(50)
          5.0 , -- SoLuong - float
          180.0 , -- DonGiaNhap - float
          200.0 , -- DonGiaBan - float
          N'Ảnh đồng' , -- Anh - nvarchar(200)
          N'Ko'  -- GhiChu - nvarchar(200)
        )
GO
INSERT dbo.tblNhanVien
        ( MaNhanVien ,
          TenNhanVien ,
          GioiTinh ,
          DiaChi ,
          DienThoai ,
          NgaySinh
        )
VALUES  ( N'MNV01' , -- MaNhanVien - nvarchar(10)
          N'A' , -- TenNhanVien - nvarchar(50)
          N'Nữ' , -- GioiTinh - nvarchar(10)
          N'Trần Phú' , -- DiaChi - nvarchar(50)
          N'463318' , -- DienThoai - nvarchar(15)
          N'03/02/1990'  -- NgaySinh - nvarchar(20)
        )
GO
INSERT dbo.tblNhanVien
        ( MaNhanVien ,
          TenNhanVien ,
          GioiTinh ,
          DiaChi ,
          DienThoai ,
          NgaySinh
        )
VALUES  ( N'MNV02' , -- MaNhanVien - nvarchar(10)
          N'B' , -- TenNhanVien - nvarchar(50)
          N'Nam' , -- GioiTinh - nvarchar(10)
          N'Bắc Sơn' , -- DiaChi - nvarchar(50)
          N'55468' , -- DienThoai - nvarchar(15)
          N'08/08/1890'  -- NgaySinh - nvarchar(20)
        )
GO 
INSERT dbo.tblNhanVien
        ( MaNhanVien ,
          TenNhanVien ,
          GioiTinh ,
          DiaChi ,
          DienThoai ,
          NgaySinh
        )
VALUES  ( N'MNV03' , -- MaNhanVien - nvarchar(10)
          N'C' , -- TenNhanVien - nvarchar(50)
          N'Nam' , -- GioiTinh - nvarchar(10)
          N'Ninh Hòa' , -- DiaChi - nvarchar(50)
          N'42255' , -- DienThoai - nvarchar(15)
          N'03/02/1994'  -- NgaySinh - nvarchar(20)
        )
GO
INSERT dbo.tblHDBan
        ( MaHDBan ,
          MaNhanVien ,
          NgayBan ,
          MaKhach ,
          TongTien
        )
VALUES  ( N'MHDB01' , -- MaHDBan - nvarchar(30)
          N'MNV01' , -- MaNhanVien - nvarchar(10)
          N'03/02/2010' , -- NgayBan - nvarchar(20)
          N'MK01' , -- MaKhach - nvarchar(10)
          19.0  -- TongTien - float
        )
GO
INSERT dbo.tblHDBan
        ( MaHDBan ,
          MaNhanVien ,
          NgayBan ,
          MaKhach ,
          TongTien
        )
VALUES  ( N'MHDB02' , -- MaHDBan - nvarchar(30)
          N'mNV02' , -- MaNhanVien - nvarchar(10)
          N'02/03/2015' , -- NgayBan - nvarchar(20)
          N'MK02' , -- MaKhach - nvarchar(10)
          10.0  -- TongTien - float
        )
GO
INSERT dbo.tblHDBan
        ( MaHDBan ,
          MaNhanVien ,
          NgayBan ,
          MaKhach ,
          TongTien
        )
VALUES  ( N'MHDB03' , -- MaHDBan - nvarchar(30)
          N'MNV03' , -- MaNhanVien - nvarchar(10)
          N'05/02/2014' , -- NgayBan - nvarchar(20)
          N'MK03' , -- MaKhach - nvarchar(10)
          15.0  -- TongTien - float
        )
GO
INSERT dbo.tblChitietHDBan
        ( MaHDBan ,
          MaHang ,
          SoLuong ,
          DonGia ,
          GiamGia ,
          ThanhTien
        )
VALUES  ( N'MHDB01' , -- MaHDBan - nvarchar(30)
          N'MH01' , -- MaHang - nvarchar(50)
          3.0 , -- SoLuong - float
          145.0 , -- DonGia - float
          3.5 , -- GiamGia - float
          24.0  -- ThanhTien - float
        )
GO
INSERT dbo.tblChitietHDBan
        ( MaHDBan ,
          MaHang ,
          SoLuong ,
          DonGia ,
          GiamGia ,
          ThanhTien
        )
VALUES  ( N'MHDB02' , -- MaHDBan - nvarchar(30)
          N'MH02' , -- MaHang - nvarchar(50)
          5.0 , -- SoLuong - float
          140.0 , -- DonGia - float
          0.6, -- GiamGia - float
          26.0  -- ThanhTien - float
        )
GO
INSERT dbo.tblChitietHDBan
        ( MaHDBan ,
          MaHang ,
          SoLuong ,
          DonGia ,
          GiamGia ,
          ThanhTien
        )
VALUES  ( N'MHDB03' , -- MaHDBan - nvarchar(30)
          N'MH03' , -- MaHang - nvarchar(50)
          15.0 , -- SoLuong - float
          80.0 , -- DonGia - float
          1.0 , -- GiamGia - float
          100.0  -- ThanhTien - float
        )

		