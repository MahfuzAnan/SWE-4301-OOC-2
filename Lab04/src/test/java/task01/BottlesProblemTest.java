package task01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BottlesProblemTest {
    @Test
    void verse0() {
        String expected = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n";
        BottlesProblem bottlesProblem = new BottlesProblem();
        assertEquals(expected, bottlesProblem.verse(0));
    }

    @Test
    void verse1() {
        String expected = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass it around, no more bottles of beer on the wall.\n";
        BottlesProblem bottlesProblem = new BottlesProblem();
        assertEquals(expected, bottlesProblem.verse(1));
    }

    @Test
    void verse2() {
        String expected = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 more bottle of beer on the wall.\n";
        BottlesProblem bottlesProblem = new BottlesProblem();
        assertEquals(expected, bottlesProblem.verse(2));
    }

    @Test
    void verse3() {
        String expected = "3 bottles of beer on the wall, 3 bottles of beer.\n" +
                "Take one down and pass it around, 2 more bottles of beer on the wall.\n";
        BottlesProblem bottlesProblem = new BottlesProblem();
        assertEquals(expected, bottlesProblem.verse(3));
    }

    @Test
    void RangeVerse(){
        String expected = "10 bottles of beer on the wall, 10 bottles of beer.\n" +
                "Take one down and pass it around, 9 more bottles of beer on the wall.\n"+
                "9 bottles of beer on the wall, 9 bottles of beer.\n" +
                "Take one down and pass it around, 8 more bottles of beer on the wall.\n";
        BottlesProblem bottlesProblem = new BottlesProblem();
        assertEquals(expected, bottlesProblem.verse(10,9));
    }

    @Test
    void fullSong()
    {
        String expected = "99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take one down and pass it around, 98 more bottles of beer on the wall.\n" +
                "98 bottles of beer on the wall, 98 bottles of beer.\n" +
                "Take one down and pass it around, 97 more bottles of beer on the wall.\n" +
                "97 bottles of beer on the wall, 97 bottles of beer.\n" +
                "Take one down and pass it around, 96 more bottles of beer on the wall.\n" +
                "96 bottles of beer on the wall, 96 bottles of beer.\n" +
                "Take one down and pass it around, 95 more bottles of beer on the wall.\n" +
                "95 bottles of beer on the wall, 95 bottles of beer.\n" +
                "Take one down and pass it around, 94 more bottles of beer on the wall.\n" +
                "94 bottles of beer on the wall, 94 bottles of beer.\n" +
                "Take one down and pass it around, 93 more bottles of beer on the wall.\n" +
                "93 bottles of beer on the wall, 93 bottles of beer.\n" +
                "Take one down and pass it around, 92 more bottles of beer on the wall.\n" +
                "92 bottles of beer on the wall, 92 bottles of beer.\n" +
                "Take one down and pass it around, 91 more bottles of beer on the wall.\n" +
                "91 bottles of beer on the wall, 91 bottles of beer.\n" +
                "Take one down and pass it around, 90 more bottles of beer on the wall.\n" +
                "90 bottles of beer on the wall, 90 bottles of beer.\n" +
                "Take one down and pass it around, 89 more bottles of beer on the wall.\n" +
                "89 bottles of beer on the wall, 89 bottles of beer.\n" +
                "Take one down and pass it around, 88 more bottles of beer on the wall.\n" +
                "88 bottles of beer on the wall, 88 bottles of beer.\n" +
                "Take one down and pass it around, 87 more bottles of beer on the wall.\n" +
                "87 bottles of beer on the wall, 87 bottles of beer.\n" +
                "Take one down and pass it around, 86 more bottles of beer on the wall.\n" +
                "86 bottles of beer on the wall, 86 bottles of beer.\n" +
                "Take one down and pass it around, 85 more bottles of beer on the wall.\n" +
                "85 bottles of beer on the wall, 85 bottles of beer.\n" +
                "Take one down and pass it around, 84 more bottles of beer on the wall.\n" +
                "84 bottles of beer on the wall, 84 bottles of beer.\n" +
                "Take one down and pass it around, 83 more bottles of beer on the wall.\n" +
                "83 bottles of beer on the wall, 83 bottles of beer.\n" +
                "Take one down and pass it around, 82 more bottles of beer on the wall.\n" +
                "82 bottles of beer on the wall, 82 bottles of beer.\n" +
                "Take one down and pass it around, 81 more bottles of beer on the wall.\n" +
                "81 bottles of beer on the wall, 81 bottles of beer.\n" +
                "Take one down and pass it around, 80 more bottles of beer on the wall.\n" +
                "80 bottles of beer on the wall, 80 bottles of beer.\n" +
                "Take one down and pass it around, 79 more bottles of beer on the wall.\n" +
                "79 bottles of beer on the wall, 79 bottles of beer.\n" +
                "Take one down and pass it around, 78 more bottles of beer on the wall.\n" +
                "78 bottles of beer on the wall, 78 bottles of beer.\n" +
                "Take one down and pass it around, 77 more bottles of beer on the wall.\n" +
                "77 bottles of beer on the wall, 77 bottles of beer.\n" +
                "Take one down and pass it around, 76 more bottles of beer on the wall.\n" +
                "76 bottles of beer on the wall, 76 bottles of beer.\n" +
                "Take one down and pass it around, 75 more bottles of beer on the wall.\n" +
                "75 bottles of beer on the wall, 75 bottles of beer.\n" +
                "Take one down and pass it around, 74 more bottles of beer on the wall.\n" +
                "74 bottles of beer on the wall, 74 bottles of beer.\n" +
                "Take one down and pass it around, 73 more bottles of beer on the wall.\n" +
                "73 bottles of beer on the wall, 73 bottles of beer.\n" +
                "Take one down and pass it around, 72 more bottles of beer on the wall.\n" +
                "72 bottles of beer on the wall, 72 bottles of beer.\n" +
                "Take one down and pass it around, 71 more bottles of beer on the wall.\n" +
                "71 bottles of beer on the wall, 71 bottles of beer.\n" +
                "Take one down and pass it around, 70 more bottles of beer on the wall.\n" +
                "70 bottles of beer on the wall, 70 bottles of beer.\n" +
                "Take one down and pass it around, 69 more bottles of beer on the wall.\n" +
                "69 bottles of beer on the wall, 69 bottles of beer.\n" +
                "Take one down and pass it around, 68 more bottles of beer on the wall.\n" +
                "68 bottles of beer on the wall, 68 bottles of beer.\n" +
                "Take one down and pass it around, 67 more bottles of beer on the wall.\n" +
                "67 bottles of beer on the wall, 67 bottles of beer.\n" +
                "Take one down and pass it around, 66 more bottles of beer on the wall.\n" +
                "66 bottles of beer on the wall, 66 bottles of beer.\n" +
                "Take one down and pass it around, 65 more bottles of beer on the wall.\n" +
                "65 bottles of beer on the wall, 65 bottles of beer.\n" +
                "Take one down and pass it around, 64 more bottles of beer on the wall.\n" +
                "64 bottles of beer on the wall, 64 bottles of beer.\n" +
                "Take one down and pass it around, 63 more bottles of beer on the wall.\n" +
                "63 bottles of beer on the wall, 63 bottles of beer.\n" +
                "Take one down and pass it around, 62 more bottles of beer on the wall.\n" +
                "62 bottles of beer on the wall, 62 bottles of beer.\n" +
                "Take one down and pass it around, 61 more bottles of beer on the wall.\n" +
                "61 bottles of beer on the wall, 61 bottles of beer.\n" +
                "Take one down and pass it around, 60 more bottles of beer on the wall.\n" +
                "60 bottles of beer on the wall, 60 bottles of beer.\n" +
                "Take one down and pass it around, 59 more bottles of beer on the wall.\n" +
                "59 bottles of beer on the wall, 59 bottles of beer.\n" +
                "Take one down and pass it around, 58 more bottles of beer on the wall.\n" +
                "58 bottles of beer on the wall, 58 bottles of beer.\n" +
                "Take one down and pass it around, 57 more bottles of beer on the wall.\n" +
                "57 bottles of beer on the wall, 57 bottles of beer.\n" +
                "Take one down and pass it around, 56 more bottles of beer on the wall.\n" +
                "56 bottles of beer on the wall, 56 bottles of beer.\n" +
                "Take one down and pass it around, 55 more bottles of beer on the wall.\n" +
                "55 bottles of beer on the wall, 55 bottles of beer.\n" +
                "Take one down and pass it around, 54 more bottles of beer on the wall.\n" +
                "54 bottles of beer on the wall, 54 bottles of beer.\n" +
                "Take one down and pass it around, 53 more bottles of beer on the wall.\n" +
                "53 bottles of beer on the wall, 53 bottles of beer.\n" +
                "Take one down and pass it around, 52 more bottles of beer on the wall.\n" +
                "52 bottles of beer on the wall, 52 bottles of beer.\n" +
                "Take one down and pass it around, 51 more bottles of beer on the wall.\n" +
                "51 bottles of beer on the wall, 51 bottles of beer.\n" +
                "Take one down and pass it around, 50 more bottles of beer on the wall.\n" +
                "50 bottles of beer on the wall, 50 bottles of beer.\n" +
                "Take one down and pass it around, 49 more bottles of beer on the wall.\n" +
                "49 bottles of beer on the wall, 49 bottles of beer.\n" +
                "Take one down and pass it around, 48 more bottles of beer on the wall.\n" +
                "48 bottles of beer on the wall, 48 bottles of beer.\n" +
                "Take one down and pass it around, 47 more bottles of beer on the wall.\n" +
                "47 bottles of beer on the wall, 47 bottles of beer.\n" +
                "Take one down and pass it around, 46 more bottles of beer on the wall.\n" +
                "46 bottles of beer on the wall, 46 bottles of beer.\n" +
                "Take one down and pass it around, 45 more bottles of beer on the wall.\n" +
                "45 bottles of beer on the wall, 45 bottles of beer.\n" +
                "Take one down and pass it around, 44 more bottles of beer on the wall.\n" +
                "44 bottles of beer on the wall, 44 bottles of beer.\n" +
                "Take one down and pass it around, 43 more bottles of beer on the wall.\n" +
                "43 bottles of beer on the wall, 43 bottles of beer.\n" +
                "Take one down and pass it around, 42 more bottles of beer on the wall.\n" +
                "42 bottles of beer on the wall, 42 bottles of beer.\n" +
                "Take one down and pass it around, 41 more bottles of beer on the wall.\n" +
                "41 bottles of beer on the wall, 41 bottles of beer.\n" +
                "Take one down and pass it around, 40 more bottles of beer on the wall.\n" +
                "40 bottles of beer on the wall, 40 bottles of beer.\n" +
                "Take one down and pass it around, 39 more bottles of beer on the wall.\n" +
                "39 bottles of beer on the wall, 39 bottles of beer.\n" +
                "Take one down and pass it around, 38 more bottles of beer on the wall.\n" +
                "38 bottles of beer on the wall, 38 bottles of beer.\n" +
                "Take one down and pass it around, 37 more bottles of beer on the wall.\n" +
                "37 bottles of beer on the wall, 37 bottles of beer.\n" +
                "Take one down and pass it around, 36 more bottles of beer on the wall.\n" +
                "36 bottles of beer on the wall, 36 bottles of beer.\n" +
                "Take one down and pass it around, 35 more bottles of beer on the wall.\n" +
                "35 bottles of beer on the wall, 35 bottles of beer.\n" +
                "Take one down and pass it around, 34 more bottles of beer on the wall.\n" +
                "34 bottles of beer on the wall, 34 bottles of beer.\n" +
                "Take one down and pass it around, 33 more bottles of beer on the wall.\n" +
                "33 bottles of beer on the wall, 33 bottles of beer.\n" +
                "Take one down and pass it around, 32 more bottles of beer on the wall.\n" +
                "32 bottles of beer on the wall, 32 bottles of beer.\n" +
                "Take one down and pass it around, 31 more bottles of beer on the wall.\n" +
                "31 bottles of beer on the wall, 31 bottles of beer.\n" +
                "Take one down and pass it around, 30 more bottles of beer on the wall.\n" +
                "30 bottles of beer on the wall, 30 bottles of beer.\n" +
                "Take one down and pass it around, 29 more bottles of beer on the wall.\n" +
                "29 bottles of beer on the wall, 29 bottles of beer.\n" +
                "Take one down and pass it around, 28 more bottles of beer on the wall.\n" +
                "28 bottles of beer on the wall, 28 bottles of beer.\n" +
                "Take one down and pass it around, 27 more bottles of beer on the wall.\n" +
                "27 bottles of beer on the wall, 27 bottles of beer.\n" +
                "Take one down and pass it around, 26 more bottles of beer on the wall.\n" +
                "26 bottles of beer on the wall, 26 bottles of beer.\n" +
                "Take one down and pass it around, 25 more bottles of beer on the wall.\n" +
                "25 bottles of beer on the wall, 25 bottles of beer.\n" +
                "Take one down and pass it around, 24 more bottles of beer on the wall.\n" +
                "24 bottles of beer on the wall, 24 bottles of beer.\n" +
                "Take one down and pass it around, 23 more bottles of beer on the wall.\n" +
                "23 bottles of beer on the wall, 23 bottles of beer.\n" +
                "Take one down and pass it around, 22 more bottles of beer on the wall.\n" +
                "22 bottles of beer on the wall, 22 bottles of beer.\n" +
                "Take one down and pass it around, 21 more bottles of beer on the wall.\n" +
                "21 bottles of beer on the wall, 21 bottles of beer.\n" +
                "Take one down and pass it around, 20 more bottles of beer on the wall.\n" +
                "20 bottles of beer on the wall, 20 bottles of beer.\n" +
                "Take one down and pass it around, 19 more bottles of beer on the wall.\n" +
                "19 bottles of beer on the wall, 19 bottles of beer.\n" +
                "Take one down and pass it around, 18 more bottles of beer on the wall.\n" +
                "18 bottles of beer on the wall, 18 bottles of beer.\n" +
                "Take one down and pass it around, 17 more bottles of beer on the wall.\n" +
                "17 bottles of beer on the wall, 17 bottles of beer.\n" +
                "Take one down and pass it around, 16 more bottles of beer on the wall.\n" +
                "16 bottles of beer on the wall, 16 bottles of beer.\n" +
                "Take one down and pass it around, 15 more bottles of beer on the wall.\n" +
                "15 bottles of beer on the wall, 15 bottles of beer.\n" +
                "Take one down and pass it around, 14 more bottles of beer on the wall.\n" +
                "14 bottles of beer on the wall, 14 bottles of beer.\n" +
                "Take one down and pass it around, 13 more bottles of beer on the wall.\n" +
                "13 bottles of beer on the wall, 13 bottles of beer.\n" +
                "Take one down and pass it around, 12 more bottles of beer on the wall.\n" +
                "12 bottles of beer on the wall, 12 bottles of beer.\n" +
                "Take one down and pass it around, 11 more bottles of beer on the wall.\n" +
                "11 bottles of beer on the wall, 11 bottles of beer.\n" +
                "Take one down and pass it around, 10 more bottles of beer on the wall.\n" +
                "10 bottles of beer on the wall, 10 bottles of beer.\n" +
                "Take one down and pass it around, 9 more bottles of beer on the wall.\n" +
                "9 bottles of beer on the wall, 9 bottles of beer.\n" +
                "Take one down and pass it around, 8 more bottles of beer on the wall.\n" +
                "8 bottles of beer on the wall, 8 bottles of beer.\n" +
                "Take one down and pass it around, 7 more bottles of beer on the wall.\n" +
                "7 bottles of beer on the wall, 7 bottles of beer.\n" +
                "Take one down and pass it around, 6 more bottles of beer on the wall.\n" +
                "6 bottles of beer on the wall, 6 bottles of beer.\n" +
                "Take one down and pass it around, 5 more bottles of beer on the wall.\n" +
                "5 bottles of beer on the wall, 5 bottles of beer.\n" +
                "Take one down and pass it around, 4 more bottles of beer on the wall.\n" +
                "4 bottles of beer on the wall, 4 bottles of beer.\n" +
                "Take one down and pass it around, 3 more bottles of beer on the wall.\n" +
                "3 bottles of beer on the wall, 3 bottles of beer.\n" +
                "Take one down and pass it around, 2 more bottles of beer on the wall.\n" +
                "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 more bottle of beer on the wall.\n" +
                "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass it around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n";
        BottlesProblem bottlesProblem = new BottlesProblem();
        assertEquals(expected, bottlesProblem.verse(99,0));
    }

    @Test
    void over99()
    {
        String expected = "Out of Bound!";
        BottlesProblem bottlesProblem = new BottlesProblem();
        assertEquals(expected, bottlesProblem.verse(150));
    }
}