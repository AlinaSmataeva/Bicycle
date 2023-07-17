package java.org.smataeva.bicycle.entity;

import java.org.smataeva.bicycle.exception.BicycleException;
import java.org.smataeva.bicycle.exception.WheelException;
import java.util.Arrays;
import java.util.Objects;

public class Bicycle implements BicycleI {
    private String model;
    private int gears;
    private Wheel[] wheels;
    private Frame frame;

    public Bicycle(){

    }

    public Bicycle(String model, int gears, Wheel[] wheels, Frame frame) throws WheelException {
        this.model = model;
        this.gears = gears;
        setWheels(wheels);
        this.frame = frame;
    }

    public Bicycle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) throws WheelException{
        if (wheels == null || wheels.length != 2) {
            throw new WheelException("Invalid number of wheels");
        }

        int wheelCount = wheels.length;
        this.wheels = wheels;

        for (int i = 0; i < wheels.length; i++) {
            if (wheels[i].isFlat()) {
                throw new WheelException("One or more wheels are flat");
            }
        }

        if (frame.getHoleCount() != wheelCount) {
            throw new WheelException("Number of wheels does not match the number of frame holes");
        }
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return gears == bicycle.gears && Objects.equals(model, bicycle.model) && Arrays.equals(wheels, bicycle.wheels) && Objects.equals(frame, bicycle.frame);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(model, gears, frame);
        result = 31 * result + Arrays.hashCode(wheels);
        return result;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "model='" + model + '\'' +
                ", gears=" + gears +
                ", wheels=" + Arrays.toString(wheels) +
                ", frame=" + frame +
                '}';
    }

    public void ride() {
        System.out.println("Riding the bicycle");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("Changed gear to: " + gear);
    }
    public void checkFrameCompatibility() {
        int wheelCount = wheels.length;
        int frameHoleCount = frame.getHoleCount();

        if (wheelCount != frameHoleCount) {
            throw new BicycleException("Invalid number of wheels");
        }
    }


}