class ProductionRemoteControlCar implements RemoteControlCar,Comparable<ProductionRemoteControlCar> {

    private int distanceTravelled = 0;
    private int numberOfVictories = 0;

    public void drive() {
        distanceTravelled = distanceTravelled + 10;
        //distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
    @Override
    public int compareTo(ProductionRemoteControlCar other){
        return Integer.compare(other.getNumberOfVictories(), this.numberOfVictories);
    }
}
