import java.util.ArrayList;

public class DanhSachCacCuaHang {
	private ArrayList<CuaHang> danhSachCuaHang = new ArrayList<CuaHang>();
	
	public void ThemCuaHangVaoDS(CuaHang cuaHang) {
		this.danhSachCuaHang.add(cuaHang);
	}
	
//	8) chi nhánh có nhiều hàng hóa yêu thích nhất của cửa hàng?
	public void ChiNhanhCoNhieuHangYeuThichNhatTrongCuaHang(DanhSachCacChiNhanh dSCCN) {
		for (int i=0; i<this.danhSachCuaHang.size(); i++) {
			System.out.println("Danh sách các chi nhánh có nhiều hàng hóa yêu thích nhất của cửa hàng "+ this.danhSachCuaHang.get(i).getTenCuaHang());
			this.danhSachCuaHang.get(i).getdSCN().TimChiNhanhCoNhieuHangYeuThichNhat();
		}
	}
	
//	12)Hiển thị danh sách các loại hành hóa ở mỗi cửa hàng
	
	public void HienThiDanhSachCacLoaiHangHoaOMoiCuaHang () {
		for (int i=0; i<this.danhSachCuaHang.size(); i++) {
			System.out.println("Cửa hàng: "+this.danhSachCuaHang.get(i).getTenCuaHang());
			this.danhSachCuaHang.get(i).getdSCLHH().HienThiDanhSach();
		}
	}
	
}
