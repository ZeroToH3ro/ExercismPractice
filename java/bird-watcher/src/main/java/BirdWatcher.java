
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay; 
    }

    public int getToday() {
        return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean checkWithoutBird = false;
        for (int i : birdsPerDay) {
            if (i == 0){
                checkWithoutBird = true;
                return checkWithoutBird;
            }
        }
        return checkWithoutBird;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int result = 0;

        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }

        for(int i=0; i<numberOfDays; i++){
            result += birdsPerDay[i];
        }
        return result;
    }

    public int getBusyDays() {
        int countBusyDay = 0;
        for (int i : birdsPerDay) {
            if (i >= 5) countBusyDay += 1;
        }
        return countBusyDay;
    }
}
