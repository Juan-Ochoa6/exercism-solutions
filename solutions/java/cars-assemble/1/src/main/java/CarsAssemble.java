public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double Produccion = 0;
        if (speed >= 1 && speed <= 4) {
           Produccion = speed*221;
        }
        if (speed >= 5 && speed<=8 ){
             Produccion = speed*221*0.9;
    }if (speed == 9) {
              Produccion = speed*221*0.8;
        }if (speed == 10) {
             Produccion = speed*221*0.77;
        }
return Produccion;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour( speed)/60;
    }
}
