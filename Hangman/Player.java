class Player
{
    public Player(String name)
    {
        this.level = 1;
        this.name = name;
        this.missed_letters = 0;
    }

    public void reset()
    {
        this.missed_letters = 0;
    }
    public String name;
    public int missed_letters;
    public int level;

}