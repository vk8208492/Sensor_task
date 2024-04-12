package app;

import app.Sensor.Sensor;
import app.observer.ColorObserver;
import app.observer.TemperatureObserver;
import app.observer.WeightObserver;


public class Main {

    public static void main(String[] args){

        Sensor sensor = new Sensor();
        new ColorObserver(sensor);
        new WeightObserver(sensor);
        new TemperatureObserver(sensor);

        System.out.println("First temperature: -1");
        sensor.setState(-1);
        System.out.println("First weight: 1");
        sensor.setState(1);
        System.out.println("First state.color: white");

        System.out.println("Second temperature: 1");
        sensor.setState(1);
        System.out.println("Second weight: 3");
        sensor.setState(3);
        System.out.println("Second state.color: black");
    }
}
