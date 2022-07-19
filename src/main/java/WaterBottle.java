public class WaterBottle {

    public int volume;
    public int drink;

    public WaterBottle() {
        this.volume = 100;
        this.drink = 0;
    }

    public int fullVolume(){
        return volume;
    }

    public int reduceVolume(){
        return volume - 10;
    }

    public int ToDrink(){
        return drink + 10;
    }

    public int emptyWaterBottle(){
        return volume = 0;
    }

    public int fillWaterBottle(){
        return volume;
    }




}
