package assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NextDateGiverTest {
    @Test
    public void dateTest(){
        NextDateGiver nextDateGiver = new NextDateGiver(19, 11, 2022);
        String expected = "Day: 20 Month: 11 Year: 2022";
        assertEquals(expected,nextDateGiver.GetNextDay());
    }

    @Test
    public void monthTest(){
        NextDateGiver nextDateGiver = new NextDateGiver(30, 11, 2022);
        String expected = "Day: 1 Month: 12 Year: 2022";
        assertEquals(expected,nextDateGiver.GetNextDay());
    }

    @Test
    public void yearTest(){
        NextDateGiver nextDateGiver = new NextDateGiver(31, 12, 2022);
        String expected = "Day: 1 Month: 1 Year: 2023";
        assertEquals(expected,nextDateGiver.GetNextDay());
    }

    @Test
    public void leapYearTest(){
        NextDateGiver nextDateGiver = new NextDateGiver(28, 2, 2020);
        String expected = "Day: 29 Month: 2 Year: 2020";
        assertEquals(expected,nextDateGiver.GetNextDay());
    }
}
