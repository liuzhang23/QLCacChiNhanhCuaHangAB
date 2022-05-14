
public class Main {
	public static void main(String[] args) {
		
//		Khởi tạo
		
//		Hàng hóa
		DanhSachHangHoa dSHH = new DanhSachHangHoa();
		DanhSachHangHoa dSHH2 = new DanhSachHangHoa();
		DanhSachHangHoa dSHH3 = new DanhSachHangHoa();
		
		Ngay toDay = new Ngay(13, 5, 2022);
		
		Ngay nSXTP1 = new Ngay(10, 2, 2022);
		Ngay nHHTP1 = new Ngay(10, 3, 2022);
		Ngay nSXTP2 = new Ngay(13, 5, 2022);
		Ngay nHHTP2 = new Ngay(20, 5, 2022);
		
		HangHoa tiVi = new HangDienMay("DM", "TV SamSung", "SamSung", 1500000, 2012, 1000, 12, 220, 150);
		HangHoa mayBomNuoc = new HangDienMay("DM", "Máy bơm HP", "META", 3450000, 142, 20, 24, 220, 1500);
		HangHoa chumRuou = new HangSanhSu("SS", "Chum rượu", "Bách Việt", 690000, 10, 30, "Sanh Su");
		HangHoa chenSu = new HangSanhSu("SS", "Chén sứ", "AVA", 50000, 1000, 900, "Su");
		HangHoa thitHeo = new HangThucPham("TP", "Thịt heo", "OMa", 100000, 300, 321, nSXTP1, nHHTP1);
		HangHoa gaKFC = new HangThucPham("TP", "Gà KFC", "HarLand Sanders", 200000, 2012, 910, nSXTP2, nHHTP2);
		
		HangThucPham thitHeo2 = new HangThucPham("TP", "Thịt heo", "OMa", 100000, 300, 321, nSXTP1, nHHTP1);
		HangThucPham gaKFC2 = new HangThucPham("TP", "Gà KFC", "HarLand Sanders", 200000, 2012, 910, nSXTP2, nHHTP2);
		
//		thêm hàng hóa vào danh sách
		dSHH.ThemHangHoaVaoDS(tiVi);
		dSHH.ThemHangHoaVaoDS(mayBomNuoc);
		dSHH.ThemHangHoaVaoDS(chumRuou);
		dSHH.ThemHangHoaVaoDS(chenSu);
		dSHH.ThemHangHoaVaoDS(thitHeo);
		dSHH.ThemHangHoaVaoDS(gaKFC);
		
		dSHH2.ThemHangHoaVaoDS(tiVi);
		dSHH2.ThemHangHoaVaoDS(mayBomNuoc);
		dSHH2.ThemHangHoaVaoDS(chumRuou);
		dSHH2.ThemHangHoaVaoDS(chenSu);
		dSHH2.ThemHangHoaVaoDS(thitHeo);
		dSHH2.ThemHangHoaVaoDS(gaKFC);
		
		dSHH3.ThemHangHoaVaoDS(tiVi);
		dSHH3.ThemHangHoaVaoDS(mayBomNuoc);
		dSHH3.ThemHangHoaVaoDS(chumRuou);
		dSHH3.ThemHangHoaVaoDS(chenSu);
		dSHH3.ThemHangHoaVaoDS(thitHeo);
		dSHH3.ThemHangHoaVaoDS(gaKFC);
		
//		Chi Nhánh
		
		DanhSachCacChiNhanh dSCCN = new DanhSachCacChiNhanh();
		
		ChiNhanh chiNhanh = new ChiNhanh("Quận 9", "Quận 9", dSHH);
		ChiNhanh chiNhanh2 = new ChiNhanh("Quận 10", "Quận 10", dSHH2);
		ChiNhanh chiNhanh3 = new ChiNhanh("Quận 2", "Quận 2", dSHH3);
		
		
		dSCCN.ThemChiNhanhVaoDS(chiNhanh);
		dSCCN.ThemChiNhanhVaoDS(chiNhanh2);
		dSCCN.ThemChiNhanhVaoDS(chiNhanh3);
		
//		Các loại hàng hóa
		DanhSachCacLoaiHangHoa dSCLHH = new DanhSachCacLoaiHangHoa();
		dSCLHH.ThemChiNhanhVaoDS("Hàng điện máy");
		dSCLHH.ThemChiNhanhVaoDS("Hàng sành sứ");
		dSCLHH.ThemChiNhanhVaoDS("Hàng thực phẩm");
		
//		Cửa hàng
		DanhSachCacCuaHang dSCCH = new DanhSachCacCuaHang();
		CuaHang cuaHang = new CuaHang("Sieu Thi CoopMart", "Quận 9", dSCCN, dSCLHH);
		dSCCH.ThemCuaHangVaoDS(cuaHang);
		
		
		
		
//		3) Phương thức xác định loại của hàng hóa
		
		System.out.println("----------Xác định loại hàng hóa----------");
		dSHH.XacDinhLoaiHangHoa(tiVi);
		dSHH.XacDinhLoaiHangHoa(mayBomNuoc);
		dSHH.XacDinhLoaiHangHoa(chumRuou);
		dSHH.XacDinhLoaiHangHoa(chenSu);
		dSHH.XacDinhLoaiHangHoa(thitHeo);
		dSHH.XacDinhLoaiHangHoa(gaKFC);
		
//		Phân loại hàng hóa
		System.out.println();
		System.out.println("----------Danh sách phân loại hàng hóa----------");
		dSHH.PhanLoaiHangHoa();
		
//		4) Phương thức kiểm tra hàng hóa là sành sứ và được sản xuất bởi 1 nhà sản xuất có tên cho trước hay không?
		
		System.out.println();
		System.out.println("----------kiểm tra hàng hóa là sành sứ và được SX bởi 1 nhà SX có tên cho trước----------");
		System.out.println(tiVi.getTenHang() + " là hàng sành sứ và được sản xuất bởi AVA: "
			    +dSHH.KiemTraHangHoaLaSanhSuDuocSanXuatBoiMotNhaSX(tiVi, "AVA"));
		System.out.println(mayBomNuoc.getTenHang() + " là hàng sành sứ và được sản xuất bởi AVA: "
			    +dSHH.KiemTraHangHoaLaSanhSuDuocSanXuatBoiMotNhaSX(mayBomNuoc, "AVA"));
		System.out.println(chumRuou.getTenHang() + " là hàng sành sứ và được sản xuất bởi AVA: "
			    +dSHH.KiemTraHangHoaLaSanhSuDuocSanXuatBoiMotNhaSX(chumRuou, "AVA"));
		System.out.println(chenSu.getTenHang() + " là hàng sành sứ và được sản xuất bởi AVA: "
			    +dSHH.KiemTraHangHoaLaSanhSuDuocSanXuatBoiMotNhaSX(chenSu, "AVA"));
		System.out.println(thitHeo.getTenHang() + " là hàng sành sứ và được sản xuất bởi AVA: "
			    +dSHH.KiemTraHangHoaLaSanhSuDuocSanXuatBoiMotNhaSX(thitHeo, "AVA"));
		System.out.println(gaKFC.getTenHang() + " là hàng sành sứ và được sản xuất bởi AVA: "
			    +dSHH.KiemTraHangHoaLaSanhSuDuocSanXuatBoiMotNhaSX(gaKFC, "AVA"));
		
//		5) Phương thức kiểm tra hàng hóa đã hết hạn sử dụng hay chưa?
		System.out.println();
		System.out.println("----------Phương thức kiểm tra hàng hóa đã hết hạn sử dụng hay chưa----------");
		System.out.println(thitHeo2.getTenHang() +" đã hết hạn sử dụng: "+thitHeo2.KiemTraHangHoaDaHetHanSuDungHayChua(toDay));
		System.out.println(gaKFC2.getTenHang() +" đã hết hạn sử dụng: "+gaKFC2.KiemTraHangHoaDaHetHanSuDungHayChua(toDay));
		
//		6) Tìm hàng hóa có số lượng bán ra nhiều nhất ở mỗi chi nhánh
		System.out.println();
		System.out.println("----------hàng hóa có số lượng bán ra nhiều nhất ở mỗi chi nhánh----------");
		dSCCN.HangHoaBanChayNhat(chiNhanh);
		
//		7) Lấy ra danh sách hàng hóa yêu thích ở mỗi chi nhánh (hàng hóa yêu thích là hàng hóa có số lượng đã bán từ 100 trở lên)
		System.out.println();
		System.out.println("----------danh sách hàng hóa yêu thích ở mỗi chi nhánh----------");
		dSCCN.HangHoaDuocYeuThich(chiNhanh);
		
//		8) Tìm chi nhánh có nhiều hàng hóa yêu thích nhất của cửa hàng?
		System.out.println();
		System.out.println("----------chi nhánh có nhiều hàng hóa yêu thích nhất của cửa hàng----------");
//		dSCCN.TimChiNhanhCoNhieuHangYeuThichNhat();
		dSCCH.ChiNhanhCoNhieuHangYeuThichNhatTrongCuaHang(dSCCN);
		
//		10)Sắp xếp hàng hóa ở mỗi chi nhánh tăng dần theo tên và giảm dần theo giá (sử dụng interface Comparable hoặc Comparator)
		System.out.println();
		System.out.println("----------Sắp xếp hàng hóa ở mỗi chi nhánh----------");
		dSCCN.SapXepMoiHangHoaOMoiChiNhanh();
		
//		11)Thống kê số lượng hàng hóa tồn kho ở tất cả các chi nhanh theo loại. Ví dụ Hàng thực phẩm: 300, Hàng sành sứ: 100, … 
		System.out.println();
		System.out.println("----------Thống kê số lượng hàng hóa tồn kho ở tất cả các chi nhanh theo loại----------");
		dSCCN.ThongKeSoLuongTonKho();
		
		
//		12)Hiển thị danh sách các loại hành hóa ở mỗi cửa hàng
		System.out.println();
		System.out.println("----------Danh sách các loại hành hóa ở mỗi cửa hàng----------");
		dSCCH.HienThiDanhSachCacLoaiHangHoaOMoiCuaHang();
	}
}
