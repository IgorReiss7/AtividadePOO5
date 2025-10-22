package parte3;

public class Temperatura {
    public double celsius;


    public double paraFahrenheit(){
        return (celsius * 1.8) + 32;
    }
    
    public double paraKelvin () {
        return celsius + 273.15;
    }
}
