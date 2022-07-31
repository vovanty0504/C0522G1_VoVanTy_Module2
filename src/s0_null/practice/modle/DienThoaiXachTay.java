package s0_null.practice.modle;

public class DienThoaiXachTay extends DienThoai {
    private String quocGia;
    private String trangThai;


    public DienThoaiXachTay() {
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public DienThoaiXachTay(int id, String tenDienThoai, int soTien, int soLuong,
                            String nhaSanXuat, String quocGia, String trangThai) {
        super(id, tenDienThoai, soTien, soLuong, nhaSanXuat);
        this.trangThai = trangThai;
        this.quocGia = quocGia;


    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s\n", getId(), getTenDienThoai(), getSoTien()
                , getSoLuong(), getNhaSanXuat(), getQuocGia(), getTrangThai());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", trangThai= " + quocGia +
                ", quocGia= " + trangThai ;
    }
}
