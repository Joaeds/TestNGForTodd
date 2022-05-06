import org.testng.annotations.Test;

import java.util.Scanner;

import static org.testng.Assert.*;

public class MainTest {
    Main main = new Main();

    @Test
    void cToF(){
        assertEquals(main.cToFCalc(40), 107, "40°C should be 107°F");
    }

    @Test
    void kmToMiles(){
        assertEquals(main.kmToMilesCalc(45), 27.9, "45km should be 27.96 miles");
    }

    @Test
    void lToGallons() {
        assertEquals(main.lToGallonsCalc(38), 10.039, "38L should be 10.039");
    }

}