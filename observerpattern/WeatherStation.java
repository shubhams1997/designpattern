package observerpattern;

public class WeatherStation{
	public static void main(String[] args){
		WeatherData weatherData = new WeatherData();

		CurrentConditionDisplay ccd = new CurrentConditionDisplay(weatherData);

		weatherData.setMeasurement(80, 65, 7.5f);
		weatherData.setMeasurement(82, 63, 8.5f);
		weatherData.setMeasurement(87, 62, 12.5f);
	}
}