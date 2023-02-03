public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double result = 0.0;
        if (speed >= 1 && speed <= 4) {
            result = speed * 221;
        } else if (speed >= 5 && speed <= 8) {
            result = speed * 221 * 0.9;
        } else if (speed == 9){
            result = speed * 221 * 0.8;
        } else if (speed == 10) {
            result = speed * 221 * 0.77;
        }
        return result;
    }

    public int workingItemsPerMinute(int speed) {
        double result = 0;
        if (speed >= 1 && speed <= 4) {
            result = speed * 221 / 60;
        } else if (speed >= 5 && speed <= 8) {
            result = speed * 221 * 0.9 / 60;
        } else if (speed == 9){
            result = speed * 221 * 0.8 / 60;
        } else if (speed == 10) {
            result = speed * 221 * 0.77 / 60;
        }
        return (int)result;
    }
}


