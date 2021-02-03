import java.util.ArrayList;

class Student {

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    
    private String name;
    private ArrayList<Integer> marks;
    private int studentId;
}

class college
{
    public static void main(String[] args) {
        Student anoop = new Student();
        anoop.setName("Vineeth");
        System.out.println(anoop.getName());
    }
}