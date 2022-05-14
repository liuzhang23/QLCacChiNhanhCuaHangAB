
public class HangDienMay extends HangHoa{
	private int thoiGianBaoHanh;
	private double dienAp, congSuat;
	public HangDienMay(String maHang, String tenHang, String nhaSX, int gia, 
			int soLuongDaBan, int soLuongTonKho, 
			int thoiGianBaoHanh, double dienAp, double congSuat) {
		super(maHang, tenHang, nhaSX, gia, soLuongDaBan, soLuongTonKho);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.dienAp = dienAp;
		this.congSuat = congSuat;
	}
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public double getDienAp() {
		return dienAp;
	}
	public double getCongSuat() {
		return congSuat;
	}
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public void setDienAp(double dienAp) {
		this.dienAp = dienAp;
	}
	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}
	@Override
	public String toString() {
		return "Mã hàng: "+getMaHang() + " - Tên Hàng: "+getTenHang()+ " - NSX: "+getNhaSX() + " - Giá: "+getGia() 
		+" - Số lượng đã bán: "+getSoLuongDaBan() + " - Số lượng tồn kho: "+ getSoLuongTonKho()
		+" - Thời gian bảo hành (tháng)"+ getThoiGianBaoHanh() + "- Điện áp: "+getDienAp()
		+" - Công suất: "+getCongSuat();
	}
}
