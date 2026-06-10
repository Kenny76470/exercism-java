public class CarsAssemble {

    //private static int final baseProducedCarsEachHours = 221;
    private static final int baseProducedCarsEachHours = 221;
    
    public double productionRatePerHour(int speed) {
        //return baseProducedCarsEachHours * successRate() * speed ; 
        return baseProducedCarsEachHours * successRate(speed) * speed ; 
    }

    public int workingItemsPerMinute(int speed) {
        //return productionRatePerHour/60 ;
        return (int) (productionRatePerHour(speed) / 60);
    }

    public double successRate(int speed){
        if (speed > 0 && speed < 5){
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
