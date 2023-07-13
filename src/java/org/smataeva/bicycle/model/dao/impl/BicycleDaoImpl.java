package java.org.smataeva.bicycle.model.dao.impl;

import java.org.smataeva.bicycle.model.dao.BicycleDao;

public class BicycleDaoImpl implements BicycleDao {
    @Override
    public void ride() {
        System.out.println("Riding the bicycle");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("Changed gear to: " + gear);
    }
}

