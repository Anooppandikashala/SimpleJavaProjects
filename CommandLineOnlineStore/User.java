
public class User {
    private String username;
    private String password;
    private double balance;
    private OwnedItem ownedItem;

    // do not modify this constructor!
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // @TODO: Getters
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public OwnedItem getOwnedItem() {
        return ownedItem;
    }

    public void setOwnedItem(Item item) {     
        this.ownedItem = new OwnedItem(item);;
    }


    // HELPER METHODS:
    public void reloadAccount(double amount) {
        // @TODO: You need to implement this function
        this.balance += amount;
    }

    public void useItem(int minutes) {
        // @TODO: You need to implement this function
        this.ownedItem.geItem().useItem(minutes);

    }



}
