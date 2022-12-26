package thi_module_2.service.impl;

import thi_module_2.exeption.MaPhuongTienEception;
import thi_module_2.modle.PhuongTien;
import thi_module_2.modle.XeTai;
import thi_module_2.service.IXeTaiService;
import thi_module_2.utils.DocVietFileUtil;

import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IXeTaiService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH_XETAI = "src/thi_module_2/data/xetai.csv";

    @Override
    public void hienThi() {
        List<PhuongTien> phuongTienList = DocVietFileUtil.docPhuongTienFile(PATH_XETAI);
        for (PhuongTien phuongTien : phuongTienList) {
            System.out.println(phuongTien);
        }
    }

    @Override
    public void dangKi() {
        List<PhuongTien> phuongTienList = DocVietFileUtil.docPhuongTienFile(PATH_XETAI);
        int maPhuongTien;
        while (true) {
            try {
                System.out.println("nhập mã phương tiện: ");
                maPhuongTien = Integer.parseInt(SCANNER.nextLine());
                for (PhuongTien phuongTien : phuongTienList) {
                    if (phuongTien.getMaPhuongTien() == maPhuongTien) {
                        throw new MaPhuongTienEception("Trùng mã phương tiện vui lòng nhập lại!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập số!");
            } catch (MaPhuongTienEception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("vui lòng nhập tên phương tiện: ");
        String tenPhuongTien = SCANNER.nextLine();

        System.out.println("hang sản xuất: ");
        String hangSanXuat = SCANNER.nextLine();

        System.out.println("nhập năm sản xuất");
        String namSanXuat = SCANNER.nextLine();

        double congXuat;
        while (true) {
            try {
                System.out.println("nhập công xuất");
                congXuat = Double.parseDouble(SCANNER.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập số");
            }
        }

        double dungTich;
        while (true) {
            try {
                System.out.println("nhập dung tích");
                dungTich = Double.parseDouble(SCANNER.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập số");
            }
        }

        double trongTai;
        while (true) {
            try {
                System.out.println("nhập trong tải: ");
                trongTai = Double.parseDouble(SCANNER.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập số");
            }
        }

        phuongTienList.add(new XeTai(maPhuongTien, tenPhuongTien, hangSanXuat, namSanXuat,
                congXuat, dungTich, trongTai));
        DocVietFileUtil.vietPhuongTienFile(PATH_XETAI, phuongTienList);
        System.out.println("Cập nhập thành công!");


    }

    @Override
    public void xoa() {

    }

    @Override
    public void timKiem() {

    }
}
