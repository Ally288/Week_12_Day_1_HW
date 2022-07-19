import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestWaterBottle {

    WaterBottle waterBottle;

    @Before public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void bottleHas100Volume() {
        assertEquals(100, waterBottle.fullVolume());
    }

    @Test
    public void canReduceBottleVolume() {
        assertEquals(90, waterBottle.reduceVolume() );
    }
    @Test
    public void canDrinkFromBottle() {
        assertEquals(10, waterBottle.ToDrink() );
    }
    @Test
    public void camEmptyWaterBottle() {
        assertEquals(0, waterBottle.emptyWaterBottle());
    }
    @Test
    public void canFillWaterBottle() {
        assertEquals(100, waterBottle.fillWaterBottle() );
    }

}

