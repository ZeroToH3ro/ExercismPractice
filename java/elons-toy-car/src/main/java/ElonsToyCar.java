public class ElonsToyCar {

    private int distance;
    private int battery;

    ElonsToyCar(){
        this.distance = 0;
        this.battery = 100;
    }
    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters",distance);        
    }

    public String batteryDisplay() {
        if(battery==0){
            return "Battery empty";
        }
        return String.format("Battery at %d%%",battery);
    }

    public void drive() {
        if(distance < 2000){
            distance += 20;
            battery--;
        }
    }
}
