import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachHangHoa {
	
	private ArrayList<HangHoa> danhSachHangHoa = new ArrayList<HangHoa>();

	public void ThemHangHoaVaoDS(HangHoa hangHoa) {
		this.danhSachHangHoa.add(hangHoa);
	}

//	3) Phương thức xác định loại của hàng hóa
	public void XacDinhLoaiHangHoa(HangHoa hangHoa) {
		if (hangHoa.getMaHang() == "DM") {
			System.out.println(hangHoa.getTenHang() + " Là hàng điện máy");
		} else if (hangHoa.getMaHang() == "SS") {
			System.out.println(hangHoa.getTenHang() + " Là hàng sành sứ");
		} else if (hangHoa.getMaHang() == "TP") {
			System.out.println(hangHoa.getTenHang() + " Là hàng thực phẩm");
		}
	}

//	Phân loại hàng hóa
	public void PhanLoaiHangHoa() {
		System.out.println("Hàng điện máy: ");
		for (int i = 0; i < this.danhSachHangHoa.size(); i++) {
			if (this.danhSachHangHoa.get(i).getMaHang() == "DM") {
				System.out.println(this.danhSachHangHoa.get(i));
			}
		}
		System.out.println("Hàng sành sứ gồm: ");
		for (int i = 0; i < this.danhSachHangHoa.size(); i++) {
			if (this.danhSachHangHoa.get(i).getMaHang() == "SS") {
				System.out.println(this.danhSachHangHoa.get(i));
			}
		}
		System.out.println("Hàng thực phẩm gồm: ");
		for (int i = 0; i < this.danhSachHangHoa.size(); i++) {
			if (this.danhSachHangHoa.get(i).getMaHang() == "TP") {
				System.out.println(this.danhSachHangHoa.get(i));
			}
		}
	}

//	4) Phương thức kiểm tra hàng hóa là sành sứ và được sản xuất bởi 1 nhà sản xuất có tên cho trước hay không?
	public boolean KiemTraHangHoaLaSanhSuDuocSanXuatBoiMotNhaSX(HangHoa hangHoa, String nSX) {
		if (hangHoa.getMaHang() == "SS") {
			if (hangHoa.getNhaSX() == nSX) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

//	hàng hóa có số lượng bán ra nhiều nhất trong danh sách
	public void HangHoaBanChayNhat() {
		int soLuongBanNhieuNhat = this.danhSachHangHoa.get(0).getSoLuongDaBan();
		for (int i = 0; i < this.danhSachHangHoa.size(); i++) {
			if (soLuongBanNhieuNhat < this.danhSachHangHoa.get(i).getSoLuongDaBan()) {
				soLuongBanNhieuNhat = this.danhSachHangHoa.get(i).getSoLuongDaBan();
			}
		}
		for (int i = 0; i < this.danhSachHangHoa.size(); i++) {
			if (soLuongBanNhieuNhat == this.danhSachHangHoa.get(i).getSoLuongDaBan()) {
				System.out.println(
						this.danhSachHangHoa.get(i).getTenHang() + " , với số lượng đã bán " + soLuongBanNhieuNhat);
			}
		}

	}

//	những hàng hóa được yêu thích nhất trong danh sách
	public void HangHoaDuocYeuThich() {
		for (int i = 0; i < this.danhSachHangHoa.size(); i++) {
			if (this.danhSachHangHoa.get(i).getSoLuongDaBan() >= 100) {
				System.out.println(this.danhSachHangHoa.get(i).getTenHang() + " , với số lượng đã bán "
						+ this.danhSachHangHoa.get(i).getSoLuongDaBan());
			}
		}
	}

//	lấy ra số lượng hàng hóa được yêu thích
	public int SoLuongHangHoaDuocYeuThich() {
		int demSoLuongHangHoaDuocYeuThich = 0;
		for (int i = 0; i < this.danhSachHangHoa.size(); i++) {
			if (this.danhSachHangHoa.get(i).getSoLuongDaBan() >= 100) {
				demSoLuongHangHoaDuocYeuThich++;
			}
		}
		return demSoLuongHangHoaDuocYeuThich;
	}

//	Phương thức sắp xếp
	public void SapXep() {
		System.out.println();
		System.out.println("Sắp xếp giảm dần theo giá");
		Collections.sort(danhSachHangHoa);
		for (HangHoa hangHoa : danhSachHangHoa) {
			System.out.println(hangHoa);
		}
		System.out.println();
		System.out.println("Sắp xếp tăng dần theo tên");
		Collections.sort(danhSachHangHoa, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				return o1.getTenHang().compareTo(o2.getTenHang());
			}
		});
		for (HangHoa hangHoa : danhSachHangHoa) {
			System.out.println(hangHoa);
		}
	}
	
//	hiển thị số lượng hàng tồn kho của mỗi loại
	public void SoLuongTonKho() {
		int demSLTKHDM=0, demSLTKHSS=0, demSLTKHTP=0;
		for (int i = 0; i < this.danhSachHangHoa.size(); i++) {
			if (this.danhSachHangHoa.get(i).getMaHang()=="DM") {
				demSLTKHDM = demSLTKHDM + this.danhSachHangHoa.get(i).getSoLuongTonKho();
			}
			if (this.danhSachHangHoa.get(i).getMaHang()=="SS") {
				demSLTKHSS = demSLTKHSS + this.danhSachHangHoa.get(i).getSoLuongTonKho();
			}
			if (this.danhSachHangHoa.get(i).getMaHang()=="TP") {
				demSLTKHTP = demSLTKHTP + this.danhSachHangHoa.get(i).getSoLuongTonKho();
			}
		}
		System.out.println();
		System.out.println("Hàng điện máy: "+demSLTKHDM);
		System.out.println("Hàng sành sứ: "+demSLTKHSS);
		System.out.println("Hàng thực phẩm: "+demSLTKHTP);
	}

}
