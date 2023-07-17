package java.org.smataeva.bicycle.entity;

import java.util.Objects;

public class Frame {
    private String type;
    private int holeCount;

    public Frame(){

    }
    public Frame(int holeCount) {
        setHoleCount(holeCount);
        this.type = determineFrameType(holeCount);
    }

    private String determineFrameType(int holeCount) {
        if (holeCount == 1) {
                return "Mono";
        }
          else if (holeCount == 2) {
            return "Road";
        } else if (holeCount == 3) {
            return "Tricycle";
        } else {
            return "Multi";
        }
    }

    public int getHoleCount() {
        return holeCount;
    }

    public void setHoleCount(int holeCount) {
        this.holeCount = holeCount;
        this.type = determineFrameType(holeCount);
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
        return holeCount == frame.holeCount && Objects.equals(type, frame.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, holeCount);
    }

    @Override
    public String toString() {
        return "Frame{" +
                "type='" + type + '\'' +
                ", holeCount=" + holeCount +
                '}';
    }
}