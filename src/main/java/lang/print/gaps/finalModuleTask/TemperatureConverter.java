package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double fahrenheitTemperature = (double) (temperatureCelsius * 9 / 5) + 32;
        System.out.println(fahrenheitTemperature);
    }
}
