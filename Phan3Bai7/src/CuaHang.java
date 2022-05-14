
public class CuaHang {
	private String tenCuaHang, diaChi;
	private DanhSachCacChiNhanh dSCN;
	private DanhSachCacLoaiHangHoa dSCLHH;
	public CuaHang(String tenCuaHang, String diaChi, DanhSachCacChiNhanh dSCN, DanhSachCacLoaiHangHoa dSCLHH) {
		this.tenCuaHang = tenCuaHang;
		this.diaChi = diaChi;
		this.dSCN = dSCN;
		this.dSCLHH = dSCLHH;
	}
	
	public String getTenCuaHang() {
		return tenCuaHang;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public DanhSachCacChiNhanh getdSCN() {
		return dSCN;
	}
	public void setTenCuaHang(String tenCuaHang) {
		this.tenCuaHang = tenCuaHang;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public void setdSCN(DanhSachCacChiNhanh dSCN) {
		this.dSCN = dSCN;
	}

	public DanhSachCacLoaiHangHoa getdSCLHH() {
		return dSCLHH;
	}

	public void setdSCLCH(DanhSachCacLoaiHangHoa dSCLCH) {
		this.dSCLHH = dSCLCH;
	}
	
	
}
