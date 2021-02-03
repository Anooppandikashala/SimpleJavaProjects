import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Setup a user
        User u1 = new User("alexsmith", "p@55w0rd!");

        // Creating a new store
        Store store = new Store();
        store.setItems(generateItems());

        // Show all games in the store
        System.out.println("\nWelcome to the GOG.com Store");

        // Search for a game
        System.out.println("\nSearching for items with keyword [Kingdom]:");
        store.searchItemsByTitle("Kingdom");

        // Search for another game
        System.out.println("\nSearching for items with keyword [Littlewood]:");
        store.searchItemsByTitle("Littlewood");

        // Buy a game - RollerCoaster Tycoon
        System.out.println("\nTrying to purchase [Kingdom Rush Origins]:");
        store.buyItem(u1, 12);      // 12 = kingdom rush origins

        // User doesn't have enough money, so add money
        System.out.println("\nAdding $100 to account");
        u1.reloadAccount(100);

        // Buy 2 more games
        System.out.println("\nTrying to buy another item [Divinity: Original Sin]");
        store.buyItem(u1, 50);      // 50 = divinity, original sin

        System.out.println("\nTrying to buy another another item [The 99% Occupy Everywhere]:");
        store.buyItem(u1, 30);      // 30 = witcher

        // Check remaining balance
        System.out.println("\nChecking user's remaining balance: ");
        System.out.println("$" + u1.getBalance());

        // What games does the user own?
        System.out.println("\nUser owns the following games:");
        System.out.println(u1.getOwnedItem().getTitle());

        // Play the game
        System.out.println("\nUser is using their item");
        u1.useItem(25);
        u1.useItem(30);

        System.out.println("\nHow many minutes has the user played the game?");
        System.out.println(u1.getOwnedItem().getMinutesUsed());


        // Refund the game
        System.out.println("\nUser doesn't like the item and wants a refund");
        store.issueRefund(u1);

        // Refund
        System.out.println("\nUser complained to customer service, and customer service forced a refund");
        u1.getOwnedItem().setMinutesUsed(0);

        store.issueRefund(u1);

        // Check remaining balance
        System.out.println("\nChecking user's remaining balance: ");
        System.out.println("$" + u1.getBalance());


    }

    public static ArrayList<Item> generateItems() {
        Item heroesGame = new Game(25,"Townsmen: A Kingdom Rebuilt", "Handy Games", 22.79, false);
        Item witcherGame = new Game(30, "Witcher: Assassins of Kings Enhanced Edition", "CD Projekt Red", 26.39, false);
        Item coasterGame = new Game(12, "Kingdom Rush Origins", "Ironhide Game Studio", 19.79, false);
        Item divinityGame = new Game(50, "Divinity: Original Sin", "Larian Studios", 54.99, true);
        Item wondersGame = new Game(8, "Age of Wonders: Shadow Magic", "Paradox Interactive", 15.79, true);
        Item fighterGame = new Game(99, "Street Fighter Alpha 2", "Capcom", 5.69, true);
        Item m1 = new Movie(45, "Deliverance: The Making of Kingdom Come", 6.69, 98);
        Item m2 = new Movie(11, "The 99% Occupy Everywhere", 17.00, 63);

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(heroesGame);
        items.add(witcherGame);
        items.add(coasterGame);
        items.add(divinityGame);
        items.add(wondersGame);
        items.add(fighterGame);
        items.add(m1);
        items.add(m2);

        return items;
    }
}
