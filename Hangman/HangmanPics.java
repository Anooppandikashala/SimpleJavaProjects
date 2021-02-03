import java.util.ArrayList;


class HangmanPics {
    public ArrayList<String> HANGMANPICS;

    public HangmanPics()
    {
        this.HANGMANPICS = new ArrayList<String>();

        String x = " ";
        
        this.HANGMANPICS.add(x);

        x = "=========";
        this.HANGMANPICS.add(x);

        x = "    +\n"+
            "    |\n"+
            "    |\n"+
            "    |\n"+
            "    |\n"+
            "    |\n"+
            "=========";
        this.HANGMANPICS.add(x);
        
        x = "+---+\n"+
            "    |\n"+
            "    |\n"+
            "    |\n"+
            "    |\n"+
            "    |\n"+
            "=========";
        this.HANGMANPICS.add(x);
        x = "+---+\n"+
            "|   |\n"+
            "    |\n"+
            "    |\n"+
            "    |\n"+
            "    |\n"+
            "=========";
        this.HANGMANPICS.add(x);
        x = "+---+\n"+
            "|   |\n"+
            "O   |\n"+
            "    |\n"+
            "    |\n"+
            "    |\n"+
            "=========";
        this.HANGMANPICS.add(x);
        x = "+---+\n"+
            "|   |\n"+
            "O   |\n"+
            "|   |\n"+
            "    |\n"+
            "    |\n"+
            "=========";
        this.HANGMANPICS.add(x);
        x = " +---+\n"+
            " |   |\n"+
            " O   |\n"+
            "/|   |\n"+
            "     |\n"+
            "     |\n"+
            "=========";
        this.HANGMANPICS.add(x);
        x = " +---+\n"+
            " |   |\n"+
            " O   |\n"+
            "/|\\  |\n"+
            "     |\n"+
            "     |\n"+
            "=========";
            this.HANGMANPICS.add(x);
        x = " +---+\n"+
            " |   |\n"+
            " O   |\n"+
            "/|\\  |\n"+
            "/    |\n"+
            "     |\n"+
            "=========";
            this.HANGMANPICS.add(x);
        x = " +---+\n"+
            " |   |\n"+
            " O   |\n"+
            "/|\\  |\n"+
            "/ \\  |\n"+
            "     |\n"+
            "=========";
            this.HANGMANPICS.add(x);
    }
}