import java.util.ArrayList;

public class DanhSachCacLoaiHangHoa {
	private ArrayList<String> danhSachCacLoaiHangHoa = new ArrayList<String>();
	
//	Phương thức thêm loại hàng hóa vào danh sách
	public void ThemChiNhanhVaoDS(String loaiHangHoa) {
		this.danhSachCacLoaiHangHoa.add(loaiHangHoa);
	}
	
//	Danh sách các loại hàng hóa trong cửa hàng
	public void HienThiDanhSach() {
		for(int i=0; i<this.danhSachCacLoaiHangHoa.size(); i++) {
			System.out.println(this.danhSachCacLoaiHangHoa.get(i));
		}
	}
}
