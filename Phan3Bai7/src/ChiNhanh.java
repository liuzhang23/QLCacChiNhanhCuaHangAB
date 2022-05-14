
public class ChiNhanh {
	private String tenChiNhanh, diaChi;
	private DanhSachHangHoa dS;
	
	public ChiNhanh(String tenChiNhanh, String diaChi, DanhSachHangHoa dS) {
		this.tenChiNhanh = tenChiNhanh;
		this.diaChi = diaChi;
		this.dS = dS;
	}
	public String getTenChiNhanh() {
		return tenChiNhanh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public DanhSachHangHoa getdS() {
		return dS;
	}
	public void setTenChiNhanh(String tenChiNhanh) {
		this.tenChiNhanh = tenChiNhanh;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public void setdS(DanhSachHangHoa dS) {
		this.dS = dS;
	}
	@Override
	public String toString() {
		return "["+"Chi Nhánh: "+getTenChiNhanh()+"]" +" - [Địa chỉ: "+getDiaChi()+"]";
	}
	
	
}
