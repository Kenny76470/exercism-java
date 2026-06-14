class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int battery = 100;
    private int distanceDriven = 0;
    private int maxTotalDistance;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if(this.battery >= this.batteryDrain){
            return false;
        }else{
            return true;
        }
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if(this.battery >= this.batteryDrain){
            this.distanceDriven = this.speed + this.distanceDriven;
            this.battery = this.battery - this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
    public int maxTotalDistance(){
        return (100/ this.batteryDrain) * this.speed;
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        if(car.maxTotalDistance() >= distance){
            return true;
        }else{
            return false;
        }
    }
}
