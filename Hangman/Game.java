
import java.util.Scanner;
class Game {

    private void printMenu()
    {
        System.out.println("1. SPORTS");
        System.out.println("2. MOVIES");
        System.out.println("3. Exit");
    }

    private String getGameStatus()
    {
        String status = "continue";
        if(this.player.missed_letters < 10 )
        {
            status = "continue";
        }
        else{
            status = "lose";
        }

        return status;
    }

    private void startGame(String choice)
    {
        if(choice == "sports")
        {
            wordBank = new SportWords();
            wordBank.initializeWordBank();
        }
        else{
            wordBank = new MovieWords();
            wordBank.initializeWordBank();
        }

        Scanner scanner = new Scanner(System.in);
        HangmanPics hangmanPics = new HangmanPics();
        
        for(int level = 1; level <=3 ; level ++)
        {
            boolean key = false;
            Word word = wordBank.getNextWord();
            this.player.reset();
            
            while(true){
                System.out.println("Level : "+level);
                System.out.println("Missed : "+this.player.missed_letters);
                System.out.println(hangmanPics.HANGMANPICS.get(this.player.missed_letters));
                System.out.println(word.getUpdatedWord());

                System.out.println("Enter letter from a to z");
                char c = scanner.next().toString().toLowerCase().toCharArray()[0];

                if(!word.updateWord(c))
                {
                    System.out.print("Sorry '");
                    System.out.print(c);
                    System.out.print("' is not in the word\n");
                    this.player.missed_letters++;
                }
                
                if(getGameStatus().equalsIgnoreCase("lose"))
                {
                    key = true;
                    break;
                }

                if(level == 3 && word.isComplete())
                {
                    System.out.println("YOU WIN");
                    return;
                }
                else if(word.isComplete()){
                    System.out.print("\nLevel ");
                    System.out.print(level);
                    System.out.print(" Completed!\n");
                    break;
                }
            }

            if(key){
                System.out.println(hangmanPics.HANGMANPICS.get(this.player.missed_letters));
                System.out.println("YOU LOSE");
                break;
            }
        }
    }

    public void start()
    {
        Scanner scanner = new Scanner(System.in);        
        System.out.println("What is your name :");
        String playerName = scanner.next();
        this.player = new Player(playerName);
        
        while(true)
        {
            System.out.println("Welcome to Hangman. Please choose a category:");
            printMenu();
            int choice = scanner.nextInt();
            if(choice == 1)
            {
                startGame("sports");
                break;
            }
            else if(choice == 2)
            {
                startGame("movies");
                break;
            }
            else if(choice == 3)
            {
                break;
            }
            else{
                System.out.println("Please select valid option!");
                continue;
            }
        };     

        
    }

    private Player player;
    private WordBank wordBank;
    private Word currentWord;
        
}