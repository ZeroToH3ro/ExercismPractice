class Darts {
    int score(double xOfDart, double yOfDart) {
        int result = 0;
        double distanceDartAndCenter = Math.sqrt(xOfDart*xOfDart + yOfDart*yOfDart);

        if(distanceDartAndCenter > 10){
            result = 0;
        } else if (distanceDartAndCenter > 5) {
            result = 1;
        } else if (distanceDartAndCenter > 1) {
            result = 5;
        } else {
            result = 10;
        }

        return result;
    }
}
