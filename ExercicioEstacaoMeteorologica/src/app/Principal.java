package app;

import observers.CurrentConditionsDisplay;
import observers.ForecastDisplay;
import observers.StatisticsDisplay;
import subject.WeatherData;

public class Principal {

	public static void main(String[] args) {
		WeatherData dadosMeteorologicos = new WeatherData();

		CurrentConditionsDisplay displayAtual = new CurrentConditionsDisplay(dadosMeteorologicos);
		StatisticsDisplay statistica = new StatisticsDisplay(dadosMeteorologicos);
		ForecastDisplay previsao = new ForecastDisplay(dadosMeteorologicos);

		dadosMeteorologicos.setMeasurements(80, 65, 30);
		dadosMeteorologicos.setMeasurements(50, 30, 20);
		dadosMeteorologicos.setMeasurements(30, 30, 20);

	}

}
