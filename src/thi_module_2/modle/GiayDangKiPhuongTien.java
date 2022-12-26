package thi_module_2.modle;

public class GiayDangKiPhuongTien {
    private int soDangKi;
    private String tenChuPhuongTien;
    private int maPhuongTien;
    private String ngayDangKi;

    public GiayDangKiPhuongTien() {
    }

    public GiayDangKiPhuongTien(int soDangKi, String tenChuPhuongTien, int maPhuongTien, String ngayDangKi) {
        this.soDangKi = soDangKi;
        this.tenChuPhuongTien = tenChuPhuongTien;
        this.maPhuongTien = maPhuongTien;
        this.ngayDangKi = ngayDangKi;
    }

    public int getSoDangKi() {
        return soDangKi;
    }

    public void setSoDangKi(int soDangKi) {
        this.soDangKi = soDangKi;
    }

    public String getTenChuPhuongTien() {
        return tenChuPhuongTien;
    }

    public void setTenChuPhuongTien(String tenChuPhuongTien) {
        this.tenChuPhuongTien = tenChuPhuongTien;
    }

    public int getMaPhuongTien() {
        return maPhuongTien;
    }

    public void setMaPhuongTien(int maPhuongTien) {
        this.maPhuongTien = maPhuongTien;
    }

    public String getNgayDangKi() {
        return ngayDangKi;
    }

    public void setNgayDangKi(String ngayDangKi) {
        this.ngayDangKi = ngayDangKi;
    }

    public String getInfo(){
        return String.format("%s,%s,%s,%s,\n",getSoDangKi(),getTenChuPhuongTien(),getMaPhuongTien(),getNgayDangKi());
    }

    @Override
    public String toString() {
        return "GiayDangKiPhuongTien{" +
                "soDangKi=" + soDangKi +
                ", tenChuPhuongTien='" + tenChuPhuongTien + '\'' +
                ", maPhuongTien=" + maPhuongTien +
                ", ngayDangKi='" + ngayDangKi + '\'' +
                '}';
    }
}
