/* Storage class represents a storage area for the factory.
 * 
 * Student Name - Student ID: Emir BÜÇKÜN - 150119024 */

package hw5;

public class Storage {
	private int capacity;
	private Item[] items;
	
	public Storage(int capacity) {
		this.capacity = capacity;
		items = new Item[0];
	}
	
	public void addItem(Item item) {
		items = new Item[items.length + 1];
		for (int i = 0; i < capacity; i++) {
			if (items[i] == null) {
				items[i] = item;
				break;
			} 
		}
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}
}
