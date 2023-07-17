import java.org.smataeva.bicycle.entity.Bicycle;
import java.org.smataeva.bicycle.entity.Frame;
import java.org.smataeva.bicycle.entity.Wheel;
import java.org.smataeva.bicycle.exception.BicycleException;
import java.org.smataeva.bicycle.exception.WheelException;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Frame frame = new Frame(2);
        bicycle.setFrame(frame);
        bicycle.setGears(7);
        bicycle.changeGear(6);
        try {
            bicycle.setModel("LTD1");
            Wheel[] wheels = new Wheel[]{
                    new Wheel(80), new Wheel(80)
            };
            bicycle.setWheels(wheels);
            bicycle.checkFrameCompatibility();

        } catch (BicycleException e){
            System.out.println("BicycleException: " + e.getMessage());
        } catch (WheelException e){
            System.out.println("WheelException" + e.getMessage());
        }

    }


}