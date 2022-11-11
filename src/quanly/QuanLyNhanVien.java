package quanly;

import model.Fulltime;
import model.NhanVien;
import model.PartTime;

import java.util.Scanner;

public class QuanLyNhanVien {
    Scanner scanner = new Scanner(System.in);
    NhanVien[] nhanViens = new NhanVien[0];

    public void show() {
        for (int i = 0; i < nhanViens.length; i++) {
            System.out.println(nhanViens[i].toString());
        }
    }
    public void add(NhanVien nhanVien) {
        NhanVien[] newArr = new NhanVien[nhanViens.length + 1];
        for (int i = 0; i < nhanViens.length; i++) {
            newArr[i] = nhanViens[i];
        }
        newArr[newArr.length - 1] = nhanVien;
        nhanViens = newArr;
    }

    public NhanVien taoNhanvien(boolean isFulltime) {
        System.out.println("Nhập vào tên của nhân viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi của nhân viên: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính nhân viên: ");
        String gender = scanner.nextLine();
        if (isFulltime) {
            System.out.println("Nhập vào hệ số nhân viên: ");
            double heso = Double.parseDouble(scanner.nextLine());
            return new Fulltime(name,age,gender,heso);
        }
        else {
            System.out.println("Nhập vào số buổi nhân viên: ");
            int sobuoi = Integer.parseInt(scanner.nextLine());
            return new PartTime(name,age,gender,sobuoi);
        }
    }

    public int findIndexByName(String name){
        for (int i = 0; i < nhanViens.length; i++) {
            if (name.equals(nhanViens[i].getName())) {
                return i;
            }
        }
        return -1;
    }
    public void edit(String name) {
        int index = findIndexByName(name);
        System.out.println("Bạn muốn sửa thành nhân viên gì?");
        System.out.println("1. Fulltime");
        System.out.println("2. Parttime");
        int choice  = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            NhanVien full = taoNhanvien(true);
            nhanViens[index] = full;
        }
        if (choice == 2) {
            NhanVien part = taoNhanvien(false);
            nhanViens[index] = part;
        }
    }
    public void delete(String name) {
        int index = findIndexByName(name);
        if (index!=-1) {
            NhanVien[] newArr = new NhanVien[nhanViens.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                if (i < index) {
                    newArr[i] = nhanViens[i];
                } else {
                    newArr[i] = nhanViens[i+1];
                }
            }
            nhanViens = newArr;
        }
    }
    public void tinhLuong() {
        for (int i = 0; i < nhanViens.length; i++) {
            System.out.println(nhanViens[i].getName() + " có lương là: " + nhanViens[i].tinhluong());
        }
    }
}
