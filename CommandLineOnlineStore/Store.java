import java.util.ArrayList;

public class Store {
    // class variables
    private ArrayList<Item> storeItems = new ArrayList<Item>();

    public Store() {

    }

    public void setItems(ArrayList<Item> games) {
        this.storeItems = games;
    }

    public Item getItem(int id) {
        // @TODO: Implement this method
        for(Item item : this.storeItems)
        {
            if(item.getId() == id)
            {
                return item;
            }
        }
        return null;
    }

    public void searchItemsByTitle(String keyword) {
        // @TODO: Implement this method
        // You can check if a string contains another string by using the "contains" function
        // Example:
        //      String p = "apple pie";
        //      if (p.contains("pie")) { return true }
        ArrayList<Item> searchedItems=new ArrayList<Item>();
        for(Item item : this.storeItems)
        {
            
            if(item.getName().toLowerCase().contains(keyword.toLowerCase()))
            {
                searchedItems.add(item);
            }
            
        }
        if(searchedItems.size() > 0)
        {
            for(Item item : searchedItems)
            {
                item.display();
            }
        }
        else{
            System.out.println("No items Found");
        }

    }

    public boolean buyItem(User u, int itemId) {
        // @TODO: Implement this method
        Item item = getItem(itemId);
        if(u.getBalance() >= item.getPrice())
        {
            u.setOwnedItem(item);
            double price = -1*(item.getPrice());
            u.reloadAccount(price);
            return true;
        }
        return false;
    }

    public boolean issueRefund(User u)  {
        // @TODO: Implement this method
        if(u.getOwnedItem().getMinutesUsed() > 30)
        {
            return false;
        }
        else{
            double price = u.getOwnedItem().geItem().getPrice();
            u.reloadAccount(price);
            return true;
        }
    }


}
