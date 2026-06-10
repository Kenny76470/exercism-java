public class CarsAssemble {

    public final int baseCarInProduction = 221;
    
    public double productionRatePerHour(int speed) {
         return speed * successRate(speed) * baseCarInProduction;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) ((speed * successRate(speed) * baseCarInProduction) / 60) ;
    }
    public double successRate(int speed){
        if(speed > 0 && speed < 5){
            return 1.0;
        }else if(speed > 4 && speed < 9){
            return 0.9;
        }else if(speed == 9){
            return 0.8;
        }else if(speed == 10){
            return 0.77;
        }else{
            return 0;
        }
    }
}
