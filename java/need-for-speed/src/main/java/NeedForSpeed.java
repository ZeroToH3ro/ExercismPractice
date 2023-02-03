class NeedForSpeed {
    private int speed;
    private int batteryPerDrained;

    public int getBatteryPerDrained() {
        return batteryPerDrained;
    }

    public void setBatteryPerDrained(int batteryPerDrained) {
        this.batteryPerDrained = batteryPerDrained;
    }

    private int distanceCoverd = 0;
    private int batteryPercentage = 100;

    public NeedForSpeed(int speed, int batteryPerDrained) {
        this.setSpeed(speed);
        this.batteryPerDrained = batteryPerDrained;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean batteryDrained() {
        return this.batteryPercentage == 0;
    }

    public int distanceDriven() {
        return this.distanceCoverd;
    }

    public void drive() {
        if (this.batteryPercentage == 0) {
            return;
        }
        this.distanceCoverd += this.getSpeed();
        this.batteryPercentage -= this.batteryPerDrained;
        this.batteryPercentage = this.batteryPercentage < 0 ? 0 : this.batteryPercentage;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        double needDriveTime = (double) this.distance / car.getSpeed();
        double drainedBatteryToFinish = (double) needDriveTime * car.getBatteryPerDrained();
        return drainedBatteryToFinish <= 100;
    }
}
