package model;

public class PartTime extends NhanVien {
    private int sobuoi;
    @Override
    public double tinhluong() {
        return sobuoi*20;
    }

    public PartTime(String name, int age, String gender, int sobuoi) {
        super(name, age, gender);
        this.sobuoi = sobuoi;
    }

    public int getSobuoi() {
        return sobuoi;
    }

    public void setSobuoi(int sobuoi) {
        this.sobuoi = sobuoi;
    }

    @Override
    public String toString() {
        return "PartTime{" +
                super.toString() +
                "sobuoi=" + sobuoi +
                '}';
    }
}
