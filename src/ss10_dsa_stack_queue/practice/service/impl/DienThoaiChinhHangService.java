package ss10_dsa_stack_queue.practice.service.impl;

import ss10_dsa_stack_queue.practice.exception.KhongTimThaySanPhamException;
import ss10_dsa_stack_queue.practice.exception.SoLuongEception;
import ss10_dsa_stack_queue.practice.exception.SoTienException;
import ss10_dsa_stack_queue.practice.exception.ThoiGianBaoHanhException;
import ss10_dsa_stack_queue.practice.modle.DienThoai;
import ss10_dsa_stack_queue.practice.modle.DienThoaiChinhHang;
import ss10_dsa_stack_queue.practice.service.IDienThoaiChinhHangService;
import ss10_dsa_stack_queue.practice.utils.FileDienThoaiUtils;
import ss10_dsa_stack_queue.practice.utils.MenuDienThoaiUtil;

import java.util.List;
import java.util.Scanner;

public class DienThoaiChinhHangService implements IDienThoaiChinhHangService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "src/s0_null/practice/data/dienthoaichinhhang.csv";

    @Override
    public void add() {
        List<DienThoai> dienThoaiList = FileDienThoaiUtils.readDienThoaiFile(PATH);

        int id;
        if (dienThoaiList.size() == 0) {
            id = 1;
        } else {
            id = dienThoaiList.get(dienThoaiList.size() - 1).getId() + 1;
        }

        System.out.println("tên điện thoại ");
        String tenDienThoai = SCANNER.nextLine();

        int soTien;
        while (true) {
            try {
                System.out.println("nhập số tiền");
                soTien = Integer.parseInt(SCANNER.nextLine());
                if (soTien <= 0) {
                    throw new SoTienException("Số tiền phải lớn hơn 0");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (SoTienException e) {
                System.out.println(e.getMessage());
            }
        }

        int soLuong;
        while (true) {
            try {
                System.out.println("vui lòng nhập số lượng");
                soLuong = Integer.parseInt(SCANNER.nextLine());
                if (soLuong <= 0) {
                    throw new SoLuongEception("Số lượng phải lớn hơn 0");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập số!");
            } catch (SoLuongEception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("nhà sản xuất");
        String nhaSanXuat = SCANNER.nextLine();

        int thoiGianBaoHanh;
        while (true) {
            try {
                System.out.println("thời gian bảo hành");
                thoiGianBaoHanh = Integer.parseInt(SCANNER.nextLine());
                if (thoiGianBaoHanh <= 0 || thoiGianBaoHanh > 730) {
                    throw new ThoiGianBaoHanhException("Thời gian bảo hành phải >0 và <=730 ngày");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            } catch (ThoiGianBaoHanhException e) {
                System.out.println(e.getMessage());
            }
        }


        String phamViBaoHanh = MenuDienThoaiUtil.phamViBaoHanh();

        dienThoaiList.add(new DienThoaiChinhHang(id, tenDienThoai, soTien, soLuong, nhaSanXuat, thoiGianBaoHanh, phamViBaoHanh));
        FileDienThoaiUtils.writeDienThoaiFile(PATH, dienThoaiList);
        System.out.println("cập nhập thành công");

    }

    @Override
    public void remove() {
        List<DienThoai> dienThoaiList = FileDienThoaiUtils.readDienThoaiFile(PATH);
        boolean tonTai = false;
        int timSanPham;

        do {
            System.out.println("Mời bạn nhập id cần xóa: ");
            timSanPham = Integer.parseInt(SCANNER.nextLine());
            for (DienThoai dienThoai : dienThoaiList) {
                if (dienThoai.getId() == timSanPham) {
                    System.out.println("Điện thoại cần xóa: ");
                    System.out.println(dienThoai);
                    System.out.println("Bạn có chắc muốn xóa hay không? \n" +
                            "1. Nhấn phím '1' nếu chọn CÓ. \n" +
                            "2. Nhấn phím khác nếu chọn KHÔNG.");
                    String luaChon = SCANNER.nextLine();
                    if (luaChon.equals("1")) {
                        dienThoaiList.remove(dienThoai);
                        FileDienThoaiUtils.writeDienThoaiFile(PATH, dienThoaiList);
                        System.out.println("xóa thành công");
                    }
                    tonTai = true;
                    break;
                }
            }
            try {
                if (!tonTai) {
                    throw new KhongTimThaySanPhamException("Id không tồn tại");
                }
            } catch (KhongTimThaySanPhamException e) {
                System.out.println(e.getMessage());
            }

        } while (!tonTai);

    }


    @Override
    public void display() {
        List<DienThoai> dienThoaiList = FileDienThoaiUtils.readDienThoaiFile(PATH);
        for (DienThoai dienThoai : dienThoaiList) {
            System.out.println(dienThoai);
        }
    }

    @Override
    public void find() {
        List<DienThoai> dienThoaiList = FileDienThoaiUtils.readDienThoaiFile(PATH);
        boolean tonTai = false;
        System.out.println("nhập id hoặc tên");
        String timKiem = SCANNER.nextLine();
        for (DienThoai dienThoai : dienThoaiList) {
            if (dienThoai.getTenDienThoai().contains(timKiem) || Integer.toString(dienThoai.getId()).contains(timKiem)) {
                System.out.println(dienThoai);
                tonTai = true;
            }
        }
        if (!tonTai) {
            System.out.println("không tìm thấy");
        }
    }
}
