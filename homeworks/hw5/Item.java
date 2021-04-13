/* Item class represents an item generated 
 * by the employees working for the factory.
 * 
 * Student Name - Student ID: Emir BÜÇKÜN - 150119024 */

package hw5;

public class Item {
	private int id;
	public static int numberOfItems;
	
	public Item (int id) {
		this.setId(id);
		numberOfItems++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
