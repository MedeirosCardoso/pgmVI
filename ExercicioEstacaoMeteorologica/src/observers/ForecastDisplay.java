package observers;

import subject.Subject;
import subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
	private String mensagem;
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(WeatherData wd) {
		if (wd.getTemperature() > 30 && wd.getHumidity() > 20) {
			this.mensagem = "Probabilidade de chuva";
		} else {
			this.mensagem = "Não tem probabilidade de chuva";
		}
		display();
	}

	@Override
	public void display() {
		System.out.println(mensagem);
	}

}
