package thi_module_2.modle;

public class XeTai extends PhuongTien {
    private double trongTai;


    public XeTai() {
    }


    public XeTai(int maPhuongTien, String tenPhuongTien, String hangSanXuat, String namSanXuat,
                 double congXuat, double dungTich, double trongTai) {
        super(maPhuongTien, tenPhuongTien, hangSanXuat, namSanXuat, congXuat, dungTich);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,",getMaPhuongTien(),getTenPhuongTien(),getHangSanXuat(),
                getNamSanXuat(),getCongXuat(),getDungTich(),getTrongTai());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", trongTai " + trongTai;
    }
}
