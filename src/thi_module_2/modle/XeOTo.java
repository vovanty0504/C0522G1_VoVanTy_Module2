package thi_module_2.modle;

public class XeOTo extends PhuongTien {
    private int soChoNgoi;
    private String loaiDongCo;

    public XeOTo() {
    }

    public XeOTo(int maPhuongTien, String tenPhuongTien, String hangSanXuat, String namSanXuat,
                 double congXuat, double dungTich, int soChoNgoi, String loaiDongCo) {
        super(maPhuongTien, tenPhuongTien, hangSanXuat, namSanXuat, congXuat, dungTich);
        this.soChoNgoi = soChoNgoi;
        this.loaiDongCo = loaiDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getLoaiDongCo() {
        return loaiDongCo;
    }

    public void setLoaiDongCo(String loaiDongCo) {
        this.loaiDongCo = loaiDongCo;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s\n", getMaPhuongTien(), getTenPhuongTien(), getHangSanXuat(),
                getNamSanXuat(), getCongXuat(), getDungTich(), getSoChoNgoi(), getLoaiDongCo());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", soChoNgoi= " + soChoNgoi +
                ", loaiDongCo= " + loaiDongCo;
    }
}
