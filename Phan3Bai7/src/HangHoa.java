
public class HangHoa implements Comparable<HangHoa>{
	private String maHang, tenHang, nhaSX;
	private int gia;
	private int soLuongDaBan, soLuongTonKho;

	public HangHoa(String maHang, String tenHang, String nhaSX, int gia, 
			int soLuongDaBan, int soLuongTonKho) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.nhaSX = nhaSX;
		this.gia = gia;
		this.soLuongDaBan = soLuongDaBan;
		this.soLuongTonKho = soLuongTonKho;
	}
	
	public String getMaHang() {
		return maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public String getNhaSX() {
		return nhaSX;
	}
	public int getGia() {
		return gia;
	}
	public int getSoLuongDaBan() {
		return soLuongDaBan;
	}
	public int getSoLuongTonKho() {
		return soLuongTonKho;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public void setNhaSX(String nhaSX) {
		this.nhaSX = nhaSX;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public void setSoLuongDaBan(int soLuongDaBan) {
		this.soLuongDaBan = soLuongDaBan;
	}
	public void setSoLuongTonKho(int soLuongTonKho) {
		this.soLuongTonKho = soLuongTonKho;
	}
	@Override
	public int compareTo(HangHoa o) {
		return (o.gia)-this.gia;
	}
	
	
}
