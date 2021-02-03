import java.util.ArrayList;

class WordBank {

    public WordBank()
    {
        this.currentIndex = 0;
        this.words = new ArrayList<Word>();
    }

    public void initializeWordBank()
    {
    }

    public Word getNextWord()
    {
        int temp = this.currentIndex;
        this.currentIndex++;
        return words.get(temp);
    }

    int currentIndex;
    public ArrayList<Word> words;
}