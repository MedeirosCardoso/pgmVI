package subject;

public class WeatherData implements Subject {
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {

	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void measurementsChaged() {

	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers();
	}

	@Override
	public void registerObserver() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeObserver() {
		// TODO Auto-generated method stub

	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub

	}

}
