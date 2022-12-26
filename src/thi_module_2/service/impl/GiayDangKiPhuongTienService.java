package thi_module_2.service.impl;

import thi_module_2.exeption.KhongTimThayPhuongTienException;
import thi_module_2.exeption.MaPhuongTienEception;
import thi_module_2.modle.GiayDangKiPhuongTien;
import thi_module_2.service.IGiayDangKiPhuongTienService;
import thi_module_2.utils.DocVieGiayDangKiFile;
import thi_module_2.utils.RegexExceptionUtil;

import java.util.List;
import java.util.Scanner;

public class GiayDangKiPhuongTienService implements IGiayDangKiPhuongTienService {
    private static final String PATH_GIAY = "src/thi_module_2/data/data/gdkpt.csv";
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void themMoi() {
        List<GiayDangKiPhuongTien> giayDangKiPhuongTienList = DocVieGiayDangKiFile.docDangKiFile(PATH_GIAY);
        int soDAngKi;
        while (true) {
            try {
                System.out.println("nhập số đăng kí: ");
                soDAngKi = Integer.parseInt(scanner.nextLine());
                for (GiayDangKiPhuongTien giayDangKiPhuongTien : giayDangKiPhuongTienList) {
                    if (giayDangKiPhuongTien.getSoDangKi() == soDAngKi) {
                        throw new MaPhuongTienEception("Trùng số đăng kí vui lòng nhập lại!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập số");
            } catch (MaPhuongTienEception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("nhập chủ phương tiện");
        String tenChuPhuongTien = scanner.nextLine();

        int maPhuongTien;
        while (true) {
            try {
                System.out.println("nhập ma phương tiện: ");
                maPhuongTien = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập số");
            }
        }

        System.out.println("ngày đăng đăng kí");
        String soNgayDangKi = RegexExceptionUtil.getDateFormat();

        giayDangKiPhuongTienList.add(new GiayDangKiPhuongTien(soDAngKi, tenChuPhuongTien, maPhuongTien, soNgayDangKi));
        DocVieGiayDangKiFile.vietGiayDangKiFile(PATH_GIAY, giayDangKiPhuongTienList);
        System.out.println("cập nhập thành công");
    }

    @Override
    public void hienThi() {
        List<GiayDangKiPhuongTien> giayDangKiPhuongTienList = DocVieGiayDangKiFile.docDangKiFile(PATH_GIAY);
        for (GiayDangKiPhuongTien giayDangKiPhuongTien : giayDangKiPhuongTienList) {
            System.out.println(giayDangKiPhuongTien);
        }
    }

    @Override
    public void xoa() {
        List<GiayDangKiPhuongTien> giayDangKiPhuongTienList = DocVieGiayDangKiFile.docDangKiFile(PATH_GIAY);
        boolean tonTai = false;
        int soDangKi;

        do {
            System.out.println("Mời bạn nhập id cần xóa: ");
            soDangKi = Integer.parseInt(scanner.nextLine());
            for (GiayDangKiPhuongTien giayDangKiPhuongTien : giayDangKiPhuongTienList) {
                if (giayDangKiPhuongTien.getSoDangKi() == soDangKi) {
                    System.out.println("Điện thoại cần xóa: ");
                    System.out.println(giayDangKiPhuongTien);
                    System.out.println("Bạn có chắc muốn xóa hay không? \n" +
                            "1. Nhấn phím '1' nếu chọn CÓ. \n" +
                            "2. Nhấn phím khác nếu chọn KHÔNG.");
                    String luaChon = scanner.nextLine();
                    if (luaChon.equals("1")) {
                        giayDangKiPhuongTienList.remove(giayDangKiPhuongTien);
                        DocVieGiayDangKiFile.vietGiayDangKiFile(PATH_GIAY, giayDangKiPhuongTienList);
                        System.out.println("xóa thành công");
                    }
                    tonTai = true;
                    break;
                }
            }
            try {
                if (!tonTai) {
                    throw new KhongTimThayPhuongTienException("số đăng kí không tồn tại");
                }
            } catch (KhongTimThayPhuongTienException e) {
                System.out.println(e.getMessage());
            }

        } while (!tonTai);
    }
}
