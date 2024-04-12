package app.observer;

import app.Sensor.Observer;
import app.Sensor.Sensor;

public class TemperatureObserver extends Observer {

    public TemperatureObserver(Sensor sensor) {
        this.sensor = sensor;
        this.sensor.attach(this);
    }
    @Override
    public void update() {
        System.out.println("TemperatureObserver: " + Integer.toOctalString(sensor.getState()));
    }
}
