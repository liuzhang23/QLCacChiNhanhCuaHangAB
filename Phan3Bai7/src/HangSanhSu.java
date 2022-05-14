
public class HangSanhSu extends HangHoa{
	String loaiNguyenLieu;
	public HangSanhSu(String maHang, String tenHang, String nhaSX, int gia, int soLuongDaBan, int soLuongTonKho,
			String loaiNguyenLieu) {
		super(maHang, tenHang, nhaSX, gia, soLuongDaBan, soLuongTonKho);
		this.loaiNguyenLieu = loaiNguyenLieu;
	}
	public String getLoaiNguyenLieu() {
		return loaiNguyenLieu;
	}
	public void setLoaiNguyenLieu(String loaiNguyenLieu) {
		this.loaiNguyenLieu = loaiNguyenLieu;
	}
	@Override
	public String toString() {
		return "Mã hàng: "+getMaHang() + " - Tên Hàng: "+getTenHang()+ " - NSX: "+getNhaSX() + " - Giá: "+getGia() 
		+" - Số lượng đã bán: "+getSoLuongDaBan() + " - Số lượng tồn kho: "+ getSoLuongTonKho()
		+"Loại nguyên Liệu: "+getLoaiNguyenLieu();
	}
}
