import java.util.ArrayList;

class Word {
    
    public Word(String title)
    {
        this.title = title;
        this.length = title.length();
        convertWordsToDashed();
    }
    public String title;
    private String convertedTitle;
    private int length;
    
    public String getUpdatedWord()
    {
        return convertedTitle;
    }
    public boolean isComplete()
    {
        return title.toLowerCase().equalsIgnoreCase(convertedTitle);
        
    }
    private void convertWordsToDashed()
    {
        String myDash = "";
        char space = ' ';

        for (int i = 0; i < length; i++) {
            if (title.charAt(i) == space)
            {
                myDash = myDash + " ";
            }  
            else
            {
                myDash = myDash + "-";
            }
        }

        this.convertedTitle = myDash;

    }
    public boolean isCharContain(char c)
    {
        if(title.indexOf(c) != -1)
        {
            return true;
        }
        return false;
    }
    private ArrayList<Integer>  getAllIndexes(char c)
    {
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        String lowerCaseTextString = title.toLowerCase();
        
        int index = 0;
        while(index != -1){
            index = lowerCaseTextString.indexOf(c, index);
            if (index != -1) {
                indexes.add(index);
                index++;
            }
        }
        return indexes;
    }

    public boolean updateWord(char c)
    {
        if(isCharContain(c)){
            String str = convertedTitle;
            ArrayList<Integer> indexes = getAllIndexes(c);
            char[] charArray = str.toCharArray();
            for(int index : indexes)
            {            
                charArray[index] = c;            
            }

            convertedTitle =  new String(charArray);
            return true;
        }
        return false;
        
    }
}