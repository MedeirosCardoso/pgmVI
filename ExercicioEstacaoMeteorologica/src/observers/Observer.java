package observers;

import subject.WeatherData;

public interface Observer {
	public void update(WeatherData wd);
}
