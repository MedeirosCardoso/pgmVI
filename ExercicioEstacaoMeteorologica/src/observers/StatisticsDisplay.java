package observers;

import java.util.ArrayList;
import java.util.List;

import subject.Subject;
import subject.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float tempMax;
	private float tempMin;
	private float tempMed;
	private float soma;
	List<WeatherData> leituras = new ArrayList<WeatherData>();
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(WeatherData wd) {
		leituras.add(wd);
		if (leituras.size() == 1) {
			this.tempMax = wd.getTemperature();
			this.tempMin = wd.getTemperature();
		} else {
			for (int i = 0; i < leituras.size(); i++) {
				if (this.tempMax < leituras.get(i).getTemperature()) {
					this.tempMax = leituras.get(i).getTemperature();
				}
				if (this.tempMin > leituras.get(i).getTemperature()) {
					this.tempMin = leituras.get(i).getTemperature();
				}

			}
		}
		soma += wd.getTemperature();
		this.tempMed = soma / leituras.size();
		display();
	}

	@Override
	public void display() {
		System.out.println("Temperatura maxima: " + this.tempMax);
		System.out.println("Temperatura minima: " + this.tempMin);
		System.out.println("Media temperatura: " + this.tempMed);
	}
}
