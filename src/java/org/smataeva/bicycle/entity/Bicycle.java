package java.org.smataeva.bicycle.entity;

public class Bicycle {
    private String brand;
    private int gears;
    private Wheel wheel;
    private Frame frame;

    public Bicycle(String brand, int gears, Wheel wheel, Frame frame) {
        this.brand = brand;
        this.gears = gears;
        this.wheel = wheel;
        this.frame = frame;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }
}
