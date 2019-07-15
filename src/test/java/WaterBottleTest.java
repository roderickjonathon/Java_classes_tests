import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before

    public void before()

    {
        waterBottle = new WaterBottle(100);
    }



    @Test
    public void hasVolume(){
        assertEquals(true, waterBottle.hasVolume());
    }

    @Test
    public void volumeLeft(){
        assertEquals(100, waterBottle.volumeLeft());
    }

    @Test
    public void takeDrink(){
        waterBottle.drink();
        assertEquals(90, waterBottle.volumeLeft());
    }

    @Test
    public void emptyBottle(){
        waterBottle.empty();
        assertEquals(0, waterBottle.volumeLeft());
    }

    @Test
    public void fillBottle(){
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100, waterBottle.volumeLeft());
    }


}
