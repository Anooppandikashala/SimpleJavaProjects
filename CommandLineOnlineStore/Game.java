public class Game extends Item {
    //@TODO: Implement this class per the requirements
	private String publisher;
	private boolean isMultiplayer;
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public boolean getIsMultiplayer() {
		return isMultiplayer;
	}
	public void setIsMultiplayer(boolean isMultiplayer) {
		this.isMultiplayer = isMultiplayer;
	}
	public Game(int id, String name, String publisher, double price, boolean isMultiplayer) {
		super(id, name, price);
		// TODO Auto-generated constructor stub
		this.publisher = publisher;
		this.isMultiplayer = isMultiplayer;
	
	}
	
 	@Override
	public void display()
    {
        System.out.print("\n[game]");
        super.display();
        System.out.println("Publisher :"+this.publisher);
        System.out.println("Has Multi-player :"+this.isMultiplayer);

    }
}
