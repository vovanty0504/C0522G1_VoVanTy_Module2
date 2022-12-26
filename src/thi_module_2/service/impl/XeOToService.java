package thi_module_2.service.impl;

import thi_module_2.exeption.MaPhuongTienEception;
import thi_module_2.modle.PhuongTien;
import thi_module_2.modle.XeOTo;
import thi_module_2.service.IXeOToService;
import thi_module_2.utils.DocVietFileUtil;

import java.util.List;
import java.util.Scanner;

public class XeOToService implements IXeOToService {
    private static final String PATH_XEOTO = "src/thi_module_2/data/xeoto.csv";
    private static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public void hienThi() {
        List<PhuongTien> phuongTienList = DocVietFileUtil.docPhuongTienFile(PATH_XEOTO);
        for (PhuongTien phuongTien : phuongTienList) {
            System.out.println(phuongTien);
        }

    }


    @Override
    public void dangKi() {
        List<PhuongTien> phuongTienList = DocVietFileUtil.docPhuongTienFile(PATH_XEOTO);

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

        int soChoNgoi;
        while (true) {
            try {
                System.out.println("nhập số chỗ ngồi");
                soChoNgoi = Integer.parseInt(SCANNER.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập số");
            }
        }

        System.out.println("loại động cơ:");
        String loaiDongCo = SCANNER.nextLine();

        phuongTienList.add(new XeOTo(maPhuongTien, tenPhuongTien, hangSanXuat, namSanXuat,
                congXuat, dungTich, soChoNgoi, loaiDongCo));
        DocVietFileUtil.vietPhuongTienFile(PATH_XEOTO, phuongTienList);
        System.out.println("cập nhập thành công!");
    }

    @Override
    public void xoa() {

    }

    @Override
    public void timKiem() {

    }
}
