package app.observer;

import app.Sensor.Sensor;

public class WeightObserver extends Observer {

    public WeightObserver(Sensor sensor) {
        this.sensor = sensor;
        this.sensor.attach(this);
    }
    @Override
    public void update() {
        System.out.println("WeightObserver: " + Integer.toHexString(sensor.getState()).toUpperCase());
    }
}
