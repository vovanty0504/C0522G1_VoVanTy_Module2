package ss16_binary_file_serialization.execise1.binary_file.modle;

import java.io.Serializable;

public  class Product implements Serializable {
    private int productCode;
    private String productName;
    private String manufacturer;
    private double price;

    public Product() {
    }

    public Product(int productCode, String productName, String manufacturer, double price) {
        this.productCode = productCode;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    

    @Override
    public String toString() {
        return "Quản lý sản phẩm{" +
                " Mã sản phẩm=" + productCode +
                ", Tên sản phẩm='" + productName + '\'' +
                ", Hãn sản xuất='" + manufacturer + '\'' +
                ", Giá=" + price +
                '}';
    }
}
