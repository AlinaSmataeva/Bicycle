package java.org.smataeva.bicycle.entity;

import java.util.Arrays;
import java.util.Objects;

public class Bicycle {
    private String model;
    private int gears;
    private Wheel[] wheels;
    private Frame frame;

    public Bicycle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Frame getFrame() {
        return frame;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public void setWheels(Wheel[] wheels) {
        if (wheels == null || wheels.length < 1) {
            throw new IllegalArgumentException("Invalid number of wheels");
        }

        int wheelCount = wheels.length;
        this.wheels = wheels;
        this.frame = new Frame(wheelCount);
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
}



