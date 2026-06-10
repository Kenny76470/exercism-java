public class CarsAssemble {

    private static final int baseCarInProduction = 221;
    
    public double productionRatePerHour(int speed) {
         return speed * successRate(speed) * baseCarInProduction;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60) ;
    }
    public double successRate(int speed){
      /*if(speed >= 1 && speed <= 4){
            return 1.0;
        }else if(speed >= 5 && speed <= 8){
            return 0.9;
        }else if(speed == 9){
            return 0.8;
        }else if(speed == 10){
            return 0.77;
        }else{
            return 0;
        } */
        return switch(speed){
            case 1,2,3,4 -> 1.0;
            case 5,6,7,8 -> 0.9;
            case 9       -> 0.8;
            case 10      -> 0.77;
            default      -> 0.0;
        };
    }
}
