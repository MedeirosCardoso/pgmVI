package observers;

import subject.Subject;
import subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(WeatherData wd) {
		this.temperature = wd.getTemperature();
		this.humidity = wd.getHumidity();
		this.pressure = wd.getPressure();
		display();
	}

	@Override
	public void display() {
		System.out.println("Condicoes atual: " + temperature + "°C " + " humidade " + humidity + "% "
				+ " pressao atmosferica " + pressure);
	}

}
