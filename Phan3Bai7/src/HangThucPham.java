
public class HangThucPham extends HangHoa{
	private Ngay ngaySX, hanSuDung;
	public HangThucPham(String maHang, String tenHang, String nhaSX, int gia, int soLuongDaBan, int soLuongTonKho,
			Ngay ngaySX, Ngay hanSuDung) {
		super(maHang, tenHang, nhaSX, gia, soLuongDaBan, soLuongTonKho);
		this.ngaySX = ngaySX;
		this.hanSuDung = hanSuDung;
	}
	public Ngay getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(Ngay ngaySX) {
		this.ngaySX = ngaySX;
	}
	public Ngay getHanSuDung() {
		return hanSuDung;
	}
	public void setHanSuDung(Ngay hanSuDung) {
		this.hanSuDung = hanSuDung;
	}
	
	public boolean KiemTraHangHoaDaHetHanSuDungHayChua(Ngay toDay) {
		if (this.getHanSuDung().getNam() < toDay.getNam()) {
			return true;
		}else if (this.getHanSuDung().getNam() > toDay.getNam()) {
			return false;
		}else {
			if (this.getHanSuDung().getThang() < toDay.getThang()) {
				return true;
			}else if (this.getHanSuDung().getThang() > toDay.getThang()) {
				return false;
			}else {
				if (this.getHanSuDung().getNgay() < toDay.getNgay()) {
					return true;
				}else if (this.getHanSuDung().getNgay() > toDay.getNgay()) {
					return false;
				}else {
					return true;
				}
			}
		}
	}
	
	@Override
	public String toString() {
		return "Mã hàng: "+getMaHang() + " - Tên Hàng: "+getTenHang()+ " - NSX: "+getNhaSX() + " - Giá: "+getGia() 
		+" - Số lượng đã bán: "+getSoLuongDaBan() + " - Số lượng tồn kho: "+ getSoLuongTonKho()
		+"NSX: "+getNgaySX() +"HSD: "+getHanSuDung();
	}
}
