GO 
CREATE DATABASE javaQLDV
GO 
USE javaQLDV
GO
CREATE TABLE ChiDoan(
MaChiDoan VARCHAR(10) PRIMARY KEY NOT NULL,
TenChiDoan NVARCHAR(50) NOT NULL
)
GO
CREATE TABLE TinTuc(
MaTinTuc VARCHAR(10) PRIMARY KEY NOT NULL,
TenTinTuc NVARCHAR(100) NOT NULL,
NoiDungTT NVARCHAR(MAX) NOT NULL,
ThoiGianDang VARCHAR(20) NOT NULL,
NguoiDang NVARCHAR(50) NOT NULL
)
GO 
CREATE TABLE DoanVienTN(
MaDV VARCHAR(10) PRIMARY KEY NOT NULL,
HoDV NVARCHAR(50) NOT NULL,
TenDV NVARCHAR(50) NOT NULL,
NgaySinh VARCHAR(20) NOT NULL,
GioiTinh NVARCHAR(10) NOT NULL,
QueQuan NVARCHAR(100) NOT NULL,
Email VARCHAR(50) NOT NULL,
SDT VARCHAR(15)NOT NULL,
DanToc NVARCHAR(50)NOT NULL,
TonGiao NVARCHAR(50) NOT NULL,
NgayVaoDoan VARCHAR(20) NOT NULL,
ChooHienNay NVARCHAR(100) NOT NULL,

MaChiDoan VARCHAR(10) NOT NULL,
CONSTRAINT dv_cd FOREIGN KEY(MaChiDoan) REFERENCES dbo.ChiDoan(MaChiDoan)
)
GO
CREATE TABLE HoatDongPT(
MaHDPT VARCHAR(10) PRIMARY KEY NOT NULL,
NgayBatDau VARCHAR(20) NOT NULL,
NgayKetThuc VARCHAR(20) NOT NULL,
NoiDungHD NVARCHAR(100) NOT NULL,
DiaDiem NVARCHAR(100) NOT NULL,
MaDV VARCHAR(10) NOT NULL,
CONSTRAINT ht_dv FOREIGN KEY(MaDV) REFERENCES dbo.DoanVienTN(MaDV)
)
GO 
CREATE TABLE DoanPhi(
MaDoanPhi VARCHAR(10) PRIMARY KEY NOT NULL,
Ngay VARCHAR(20) NOT NULL,
SoTien VARCHAR(20) NOT NULL,
NoiDungDP NVARCHAR(100) NOT NULL,
MaDV VARCHAR(10) NOT NULL,
CONSTRAINT dp_dv FOREIGN KEY(MaDV) REFERENCES dbo.DoanVienTN(MaDV)
)
GO
CREATE TABLE KyLuat(
MaKyLuat VARCHAR(10) PRIMARY KEY NOT NULL,
NgayKyLuat VARCHAR(20) NOT NULL,
NoiDungKL NVARCHAR(200) NOT NULL,
MaDV VARCHAR(10) NOT NULL,
CONSTRAINT kl_dv FOREIGN KEY(MaDV) REFERENCES dbo.DoanVienTN(MaDV)
)
GO
CREATE TABLE KhenThuong(
MaKhenThuong VARCHAR(10) PRIMARY KEY NOT NULL,
NgayKhenThuong VARCHAR(20) NOT NULL,
NoiDungKT NVARCHAR(200) NOT NULL,
MaDV VARCHAR(10) NOT NULL,
CONSTRAINT kt_dv FOREIGN KEY(MaDV) REFERENCES dbo.DoanVienTN(MaDV)
)
GO
CREATE TABLE ChucVu(
MaChucVu VARCHAR(10) PRIMARY KEY NOT NULL,
TenChucVu NVARCHAR(50) NOT NULL,
NgayNhamChuc VARCHAR(20) NOT NULL,
NgayHetNhiemKy VARCHAR(20) NOT NULL,
MaDV VARCHAR(10) NOT NULL,
CONSTRAINT cv_dv FOREIGN KEY(MaDV) REFERENCES dbo.DoanVienTN(MaDV)
)
GO 
INSERT dbo.ChiDoan
        ( MaChiDoan, TenChiDoan )
VALUES  ( '7TH1',N'57 Tin học 1'),
		( '8TTQL',N'58 Thông tin quản lý'),
		( '6HTTT',N'56 Hệ thống thông tin')
GO 
INSERT dbo.TinTuc
        ( MaTinTuc ,TenTinTuc ,NoiDungTT ,ThoiGianDang ,NguoiDang)
VALUES  ( 'TT01' ,N'Thanh niên học cảm tình Đoàn' ,N'Hơn 100 sinh viên của Khoa CNTT tham dự lớp cảm tình đoàn vào 3 ngày 24,25,26 tháng 3' ,'26/03/2018' ,N'Trần Văn A'),
		( 'TT02' ,N'Đoàn trường kiểm tra Đoàn khoa CNTT' ,N'Vào 9h sáng ngày 03/03/2018, Ban thường vụ Đoàn trường đã đến kiểm tra Đoàn khoa CNTT tại VP Đoàn khoa. ' ,'03/04/2018' ,N'Lê Thị B'),
		( 'TT03' ,N'Đoàn viên dọn vệ sinh giảng đường G6' ,N'Ngày 01/04 Hơn 50 Đoàn viên tham gia dọn vệ sinh giảng đường G6' ,'04/01/2018' ,N'Nguyễn C')
GO 
INSERT dbo.DoanVienTN
        ( MaDV ,HoDV,TenDV ,NgaySinh ,GioiTinh ,QueQuan ,Email ,SDT ,DanToc ,TonGiao ,NgayVaoDoan ,ChooHienNay ,MaChiDoan)
VALUES  ( 'DV01' ,N'Nguyễn',N'Minh Triết' ,'09/08/1997' , N'Nam' ,N'Nha Trang' ,N'triet@gmail.com' ,'0123456789' ,N'Kinh' , N'Không' ,'26/03/2015' ,N'Nha Trang'  ,'7TH1'),
		( 'DV02' ,N'Lê' ,N'Thị Đào' ,'05/07/1996' , N'Nữ' ,N'Cam Ranh' , N'dao@gmail.com' ,'0987654321' ,N'Khơ me đỏ' , N'Phật giáo' ,'26/03/2014' ,N'Nha Trang'  ,'6HTTT'),
		( 'DV03' ,N'Đào',N' Bá Lộc' ,'04/06/1995' , N'Nam' ,N'Vạn Ninh' ,N'loc@gmail.com' ,'015314316' ,N'Thái' , N'Thiên Chúa giáo' ,'19/05/2015' ,N'Nha Trang' ,'8TTQL'),
		( 'DV04' ,N'Nguyễn',N'Hiền Thục' ,'04/08/1998' , N'Nữ' ,N'Vạn Ninh' ,N'thuc@gmail.com' ,'01234756' ,N'Kinh' , N'Thiên Chúa giáo' ,'19/05/2015' ,N'Nha Trang'  ,'6HTTT'),
		( 'DV05' ,N'Đàm' ,N'Vĩnh Hưng','09/06/1997' , N'Nam' ,N'Ninh Hòa' ,N'vinh@gmail.com' ,'0397452' ,N'Kinh' , N'Không' ,'19/05/2015' ,N'Nha Trang' ,'8TTQL')
GO
INSERT dbo.HoatDongPT
        ( MaHDPT ,NgayBatDau ,NgayKetThuc ,NoiDungHD ,DiaDiem ,MaDV)
VALUES  ( 'HD01' ,'03/05/2018' ,'03/09/2018',N'Tham dự múa hát tập thể' ,N'Sân chào cờ' ,'DV01'),
		( 'HD02' ,'03/09/2018' ,'09/10/2018',N'Tham dự RCV' ,N'Sân chào cờ' ,'DV02'),
		( 'HD03' ,'03/01/2018' ,'03/01/2018',N'Tham dự văn nghệ' ,N'Hội trường 3' ,'DV03')
GO
INSERT dbo.DoanPhi
        ( MaDoanPhi ,Ngay ,SoTien ,NoiDungDP ,MaDV)
VALUES  ( 'DP01' ,'03/03/2018' ,'2360000' ,N'Nộp đoàn phí tháng 3' ,'DV01'),
		( 'DP02' ,'04/03/2018' ,'2160000' ,N'Nộp đoàn phí tháng 4' ,'DV02'),
		( 'DP03' ,'05/03/2018' ,'2260000' ,N'Nộp đoàn phí tháng 5' ,'DV03')
GO
INSERT dbo.KyLuat
        ( MaKyLuat ,NgayKyLuat ,NoiDungKL ,MaDV)
VALUES  ( 'KL01' ,'05/06/2018' ,N'Không đóng đoàn phí' ,'DV04'),
		( 'KL02' ,'07/06/2018' ,N'Không sinh hoạt Đoàn' ,'DV05')
GO 
INSERT dbo.KhenThuong
        ( MaKhenThuong ,NgayKhenThuong ,NoiDungKT ,MaDV)
VALUES  ( 'KT01' ,'26/03/2018' ,N'Tích cực tham gia hoạt động Đoàn' ,'DV01'),
		( 'KT02' ,'26/03/2018' ,N'Hoàn thành xuất sắc nhiệm vụ' ,'DV02'),
		( 'KT03' ,'26/03/2018' ,N'Lãnh đạo tốt' ,'DV03')
GO
INSERT dbo.ChucVu
        ( MaChucVu ,TenChucVu ,NgayNhamChuc ,NgayHetNhiemKy ,MaDV)
VALUES  ( 'CV01' , N'Bí thư' ,'02/03/2016' ,'30/06/2018','DV01'),
		( 'CV02' , N'Phó bí thư' ,'01/05/2016' ,'11/06/2018','DV02'),
		( 'CV03' , N'Bí thư' ,'02/03/2016' ,'11/11/2018','DV03')

GO
CREATE TABLE ACCOUNT(
	TAIKHOAN NVARCHAR(50) NOT NULL PRIMARY KEY,
	MATKHAU NVARCHAR(50) NOT NULL
)
GO
INSERT INTO ACCOUNT(TAIKHOAN, MATKHAU)
VALUES('admin', '01030f091a17e5e713e91a0e1ae00ff3')
GO
CREATE PROC ACCOUNT_DS
AS
BEGIN
	SELECT *
	FROM ACCOUNT
END

GO
CREATE PROC ACCOUNT_THEM
	@TAIKHOAN NVARCHAR(50),
	@MATKHAU NVARCHAR(50)
AS
BEGIN
	INSERT INTO ACCOUNT(TAIKHOAN, MATKHAU)
	VALUES(@TAIKHOAN, @MATKHAU)
END

GO
CREATE PROC ACCOUNT_XOA
	@TAIKHOAN NVARCHAR(50)
AS
BEGIN
	DELETE FROM ACCOUNT WHERE TAIKHOAN = @TAIKHOAN
END

GO
CREATE PROC ACCOUNT_SUA
	@TAIKHOAN NVARCHAR(50),
	@MATKHAU NVARCHAR(50)
AS
BEGIN
	UPDATE ACCOUNT SET MATKHAU = @MATKHAU WHERE TAIKHOAN = @TAIKHOAN
END
GO
CREATE PROC SP_DANGNHAP
	@TAIKHOAN NVARCHAR(50),
	@MATKHAU NVARCHAR(50)
AS
BEGIN
	SELECT * FROM ACCOUNT WHERE TAIKHOAN = @TAIKHOAN AND MATKHAU = @MATKHAU
END


    