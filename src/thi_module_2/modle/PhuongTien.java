package thi_module_2.modle;

public abstract class PhuongTien {
    private int maPhuongTien;
    private String tenPhuongTien;
    private String hangSanXuat;
    private String namSanXuat;
    private double congXuat;
    private double dungTich;


    public PhuongTien() {
    }

    public PhuongTien(int maPhuongTien, String tenPhuongTien, String hangSanXuat, String namSanXuat, double congXuat, double dungTich) {
        this.maPhuongTien = maPhuongTien;
        this.tenPhuongTien = tenPhuongTien;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.congXuat = congXuat;
        this.dungTich = dungTich;
    }

    public int getMaPhuongTien() {
        return maPhuongTien;
    }

    public void setMaPhuongTien(int maPhuongTien) {
        this.maPhuongTien = maPhuongTien;
    }

    public String getTenPhuongTien() {
        return tenPhuongTien;
    }

    public void setTenPhuongTien(String tenPhuongTien) {
        this.tenPhuongTien = tenPhuongTien;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public double getCongXuat() {
        return congXuat;
    }

    public void setCongXuat(double congXuat) {
        this.congXuat = congXuat;
    }

    public double getDungTich() {
        return dungTich;
    }

    public void setDungTich(double dungTich) {
        this.dungTich = dungTich;
    }

    public abstract String getInfo();


    @Override
    public String toString() {
        return "PhuongTien "  +
                ", maPhuongTien= " + maPhuongTien +
                ", tenPhuongTien= " + tenPhuongTien +
                ", hangSanXuat= " + hangSanXuat +
                ", namSanXuat= " + namSanXuat +
                ", congXuat= " + congXuat +
                ", duTich= " + dungTich ;
    }
}


