package app.observer;

import app.Sensor.Sensor;

public class ColorObserver extends Observer {

    public ColorObserver(Sensor sensor) {
        this.sensor = sensor;
        this.sensor.attach(this);
    }
    @Override
    public void update() {
        System.out.println("ColorObserver: " + Integer.toBinaryString(sensor.getState()));
    }
}
