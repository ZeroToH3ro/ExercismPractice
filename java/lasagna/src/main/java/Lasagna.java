public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
    public int remainingMinutesInOven(int actualTimes) {
        return expectedMinutesInOven() - actualTimes;    
    }
    public int preparationTimeInMinutes(int layer) {
        return layer * 2;
    }
    public int totalTimeInMinutes(int layer, int actualTimes){
        return actualTimes + preparationTimeInMinutes(layer);
    }
}