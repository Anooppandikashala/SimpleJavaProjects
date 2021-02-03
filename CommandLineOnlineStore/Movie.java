public class Movie extends Item{
    //@TODO: Implement this class per the requirements
	private double length;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public Movie(int id, String name, double price, double length) {
		super(id, name, price);
		// TODO Auto-generated constructor stub
		this.length = length;
		
	}
	
 	@Override
	public void display()
    {
        System.out.print("\n[movie]");
        super.display();
        System.out.println("Length :"+length +" min");

    }
}
