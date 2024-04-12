package app.observer;

import app.Sensor.Sensor;

public abstract class Observer {

    protected Sensor sensor;
    public abstract void update();
}
