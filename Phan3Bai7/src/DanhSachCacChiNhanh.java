import java.util.ArrayList;

public class DanhSachCacChiNhanh {
	private ArrayList<ChiNhanh> danhSachChiNhanh = new ArrayList<ChiNhanh>();

//	Phương thức thêm chi nhánh vào danh sách
	public void ThemChiNhanhVaoDS(ChiNhanh chiNhanh) {
		this.danhSachChiNhanh.add(chiNhanh);
	}

//	6) Tìm hàng hóa có số lượng bán ra nhiều nhất ở mỗi chi nhánh
	public void HangHoaBanChayNhat(ChiNhanh chiNhanh) {
		System.out.println("Danh sách hàng hóa bán chạy nhất ở chi nhánh " + chiNhanh.getTenChiNhanh());
		chiNhanh.getdS().HangHoaBanChayNhat();
	}

//	7) Lấy ra danh sách hàng hóa yêu thích ở mỗi chi nhánh (hàng hóa yêu thích là hàng hóa có số lượng đã bán từ 100 trở lên)
	public void HangHoaDuocYeuThich(ChiNhanh chiNhanh) {
		System.out.println("Danh sách hàng hóa được yêu thích ở chi nhánh " + chiNhanh.getTenChiNhanh());
		chiNhanh.getdS().HangHoaDuocYeuThich();
	}

//	8) chi nhánh có nhiều hàng hóa yêu thích nhất
	public void TimChiNhanhCoNhieuHangYeuThichNhat() {
		ChiNhanh chiNhanhNhieuHangYeuThichNhat = this.danhSachChiNhanh.get(0);
		for (int i = 0; i < this.danhSachChiNhanh.size(); i++) {
			if (chiNhanhNhieuHangYeuThichNhat.getdS().SoLuongHangHoaDuocYeuThich() < this.danhSachChiNhanh.get(i)
					.getdS().SoLuongHangHoaDuocYeuThich()) {
				chiNhanhNhieuHangYeuThichNhat = this.danhSachChiNhanh.get(i);
			}
		}
		int soLuongMax = chiNhanhNhieuHangYeuThichNhat.getdS().SoLuongHangHoaDuocYeuThich();
		for (int i = 0; i < this.danhSachChiNhanh.size(); i++) {
			if (soLuongMax == this.danhSachChiNhanh.get(i).getdS().SoLuongHangHoaDuocYeuThich()) {
				System.out.println(this.danhSachChiNhanh.get(i) + " với số lượng yêu thích là " + soLuongMax);
			}
		}
	}
	
//	10)Sắp xếp hàng hóa ở mỗi chi nhánh tăng dần theo tên và giảm dần theo giá (sử dụng interface Comparable hoặc Comparator)

	public void SapXepMoiHangHoaOMoiChiNhanh() {
		for (int i = 0; i < this.danhSachChiNhanh.size(); i++) {
			System.out.println();
			System.out.println("Chi nhánh: "+this.danhSachChiNhanh.get(i).getTenChiNhanh());
			this.danhSachChiNhanh.get(i).getdS().SapXep();
		}
	}
	
//	11)Thống kê số lượng hàng hóa tồn kho ở tất cả các chi nhanh theo loại. Ví dụ Hàng thực phẩm: 300, Hàng sành sứ: 100, … 

	public void ThongKeSoLuongTonKho() {
		for (int i = 0; i < this.danhSachChiNhanh.size(); i++) {
			System.out.println();
			System.out.println("Thống kê sô lượng tồn kho ở chi nhánh "+this.danhSachChiNhanh.get(i).getTenChiNhanh());
			this.danhSachChiNhanh.get(i).getdS().SoLuongTonKho();
		}
	}
}
