public class Item {
    // @TODO: properties
	private String name;
	private double price;
	private double usedTime;
	int id;

    // @TODO: constructor
	public Item(int id, String name, double price)
 	{
		this.name = name;
		this.price = price;
		this.id = id;
		this.usedTime = 0;
 	}

    // @TODO: methods
	public void display()
    {
        System.out.println(name + "( $"+ price + " )");
    }
    // @TODO: getters
	public String getName()
	{
		return this.name;
	}
	public double getPrice()
	{
		return this.price;
	}
	public int getId()
	{
		return this.id;
	}
	public double getUsedTime()
	{
		return this.usedTime;
	}
	
	

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void useItem(double time) {
		this.usedTime += time;
	}

	public void setUsedTime(double time) {
		this.usedTime = time;
	}
}
