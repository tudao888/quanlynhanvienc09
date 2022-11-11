import model.NhanVien;
import quanly.QuanLyNhanVien;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
    public static void menuCreateStaff() {
        System.out.println("1. full time");
        System.out.println("2. part time");
        int choice2 = Integer.parseInt(scanner.nextLine());
        if (choice2 == 1) {
            NhanVien full = quanLyNhanVien.taoNhanvien(true);
            quanLyNhanVien.add(full);
        }
        if (choice2 == 2) {
            NhanVien part = quanLyNhanVien.taoNhanvien(false);
            quanLyNhanVien.add(part);
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Quản lý nhân viên");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Sửa nhân viên");
            System.out.println("3. Xóa nhân viên");
            System.out.println("4. Hiển thị nhân viên");
            System.out.println("5. Hiển thị Lương nhân viên");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    menuCreateStaff();
                    break;
                case 2:
                    System.out.println("Nhập tên muốn sửa");
                    String nameEdit = scanner.nextLine();
                    quanLyNhanVien.edit(nameEdit);
                    break;
                case 3:
                    System.out.println("Nhập tên muốn xóa");
                    String nameDelete = scanner.nextLine();
                    quanLyNhanVien.delete(nameDelete);
                    break;
                case 4:
                    quanLyNhanVien.show();
                    break;
                case 5:
                    quanLyNhanVien.tinhLuong();
                    break;
                default:
                    return;
            }
        }
    }


}