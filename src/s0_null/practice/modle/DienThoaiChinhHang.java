package s0_null.practice.modle;

public class DienThoaiChinhHang extends DienThoai {
    private int thoiGianBaoHanh;
    private String phamViBaoHanh;

    public DienThoaiChinhHang() {
    }

    public DienThoaiChinhHang(int id, String tenDienThoai, int soTien, int soLuong,
                              String nhaSanXuat, int thoiGianBaoHanh, String phamViBaoHanh) {
        super(id, tenDienThoai, soTien, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s\n", getId(), getTenDienThoai(), getSoTien(),
                getSoLuong(), getNhaSanXuat(), getThoiGianBaoHanh(), getPhamViBaoHanh());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", thoiGianBaoHanh= " + thoiGianBaoHanh +
                ", phamViBaoHanh= " + phamViBaoHanh;
    }
}
