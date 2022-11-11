package model;

public class Fulltime extends NhanVien{
    private double heso;
    @Override
    public double tinhluong() {
        return heso*500;
    }

    public Fulltime(String name, int age, String gender, double heso) {
        super(name, age, gender);
        this.heso = heso;
    }

    public double getHeso() {
        return heso;
    }

    public void setHeso(double heso) {
        this.heso = heso;
    }

    @Override
    public String toString() {
        return "Fulltime{" +
                super.toString() +
                "heso=" + heso +
                '}';
    }
}
