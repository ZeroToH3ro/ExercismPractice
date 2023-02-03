class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private final int SPEED = 10;
    private int distanceTraveled;
    private int numberOfVictories;
    
    @Override
    public void drive() {
        distanceTraveled += SPEED;
    }

    public int getDistanceTravelled() {
        return distanceTraveled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.numberOfVictories = numberofVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return this.numberOfVictories - o.getNumberOfVictories();
    }
}
