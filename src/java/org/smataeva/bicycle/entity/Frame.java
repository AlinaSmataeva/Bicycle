package java.org.smataeva.bicycle.entity;

import java.util.Objects;

public class Frame {
    private String type;

    public Frame(int wheelCount) {
        this.type = determineFrameType(wheelCount);
    }

    private String determineFrameType(int wheelCount) {
        if (wheelCount == 2) {
            return "Road";
        } else if (wheelCount == 3) {
            return "Tricycle";
        } else {
            return "Multiwheel";
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frame frame = (Frame) o;
        return Objects.equals(type, frame.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
