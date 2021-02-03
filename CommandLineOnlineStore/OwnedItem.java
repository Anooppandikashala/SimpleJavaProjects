public class OwnedItem {
	//@TODO: Implement this class per the requirements
	private Item ownedItem;

	public OwnedItem(Item item)
	{
		this.ownedItem = item;
	}

	public Item geItem() {
		return ownedItem;
	}

	public void setItem(Item ownedItem) {
		this.ownedItem = ownedItem;
	}

	public String getTitle()
	{
		return this.ownedItem.getName();
	}

	public double getMinutesUsed()
	{
		return this.ownedItem.getUsedTime();
	}

	public void setMinutesUsed(double time)
	{
		this.ownedItem.setUsedTime(time);
	}

	
}
