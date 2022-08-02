package ss10_dsa_stack_queue.practice.modle;

public abstract class DienThoai {
    private int id;
    private String tenDienThoai;
    private int soTien;
    private int soLuong;
    private String nhaSanXuat;

    public DienThoai() {
    }

    public DienThoai(int id, String tenDienThoai, int soTien, int soLuong, String nhaSanXuat) {
        this.id = id;
        this.tenDienThoai = tenDienThoai;
        this.soTien = soTien;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDienThoai() {
        return tenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        this.tenDienThoai = tenDienThoai;
    }

    public int getSoTien() {
        return soTien;
    }

    public void setSoTien(int soTien) {
        this.soTien = soTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return "DienThoai " +
                "id=" + id +
                ", tenDienThoai=" + tenDienThoai +
                ", soTien=" + soTien +
                ", soLuong=" + soLuong +
                ", nhaSanXuat=" + nhaSanXuat ;
    }
}
