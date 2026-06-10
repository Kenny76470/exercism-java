
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        //int[] lastWeeksCounts = new int[] {0, 2, 5, 3, 7, 8, 4};
        //return lastWeeksCounts;

        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        birdsPerDay[6]++;   
    }

    public boolean hasDayWithoutBirds() {
        for(int birds : birdsPerDay){
            if(birds == 0){
                return true;
            }
        } 
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;

        for(int i = 0; i < numberOfDays && i < birdsPerDay.length ; i++){
            sum = sum + birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int count = 0;
        for(int birds : birdsPerDay ){
            if(birds >= 5){
                count++;
            }
        }
        return count;
    }
}
