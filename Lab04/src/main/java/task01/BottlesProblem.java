package task01;

public class BottlesProblem {
    String song;
    public String verse(int verseNumber){
        if(verseNumber>99)
        {
            return "Out of Bound!";
        }
        switch (verseNumber){
            case 0 : {
                String line;
                line = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall.\n";

                return line;
            }
            case 1 : {
                String line;
                line = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                        "Take one down and pass it around, no more bottles of beer on the wall.\n";
                return line;
            }
            case 2 : {
                String line;
                line = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                        "Take one down and pass it around, 1 more bottle of beer on the wall.\n";
                return line;
            }
            default:{
                String line;
                line = verseNumber+" bottles of beer on the wall, "+verseNumber+" bottles of beer.\n" +
                        "Take one down and pass it around, "+(verseNumber-1)+" more bottles of beer on the wall.\n";
                return line;
            }
        }
    }

    public String verse(int starting, int ending){
        String song = "";
        for(int i = starting ; i >= ending ; i--)
        {
            song = song + verse(i);
        }
        return song;
    }
}