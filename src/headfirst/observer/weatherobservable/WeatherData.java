package headfirst.observer.weatherobservable;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();	// setChanged方法用来标记状态已经改变的事实
        notifyObservers();    // 注意,我们没有调用可以传递数据对象的notifyObservers(Object)函数
                              // 这样的话,要采用"拉"的做法来传送数据
        // this.notifyObservers(arg);/
    }

    public void setMeasurements(float temperature, float humidity,
            float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() { //这些方法是为了可以使用拉的做法传送数据
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
