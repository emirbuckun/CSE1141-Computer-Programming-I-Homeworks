/* Employee class represents an employee working for the factory.
 * 
 * Student Name - Student ID: Emir BÜÇKÜN - 150119024 */

package hw5;

public class Employee {
	private int id;
	private String name;
	private String surname;
	private int workHour;
	private int speed;
	private Item[] items;
	private Payroll payroll;
	
	public Employee(int id, String name, String surname, int workHour, int speed) {
		this.id = id;
		this.setName(name);
		this.setSurname(surname);
		this.workHour = workHour;
		this.speed = speed;
		this.items = new Item[workHour * speed];
	}
	
	public Item[] startShift() {
		int expected = workHour * speed;
		
		// Generate randomly ids and insert them into Item array
		for (int i = 0; i < expected; i++) {
			int randomId = (int) (Math.random() * (100 - 1)) + 1;
			Item randomItem = new Item(randomId);
			items[i] = randomItem;
		}
		
		return items;
	}
	
	public Payroll endShift() {
		payroll = new Payroll(workHour, items.length);
		return payroll;
	}

	public String toString() {
		return "This is the employee with id " + id + " speed " + speed + ". The work hour "
				+ "is " + workHour + " and the produced item count is " + items.length + ".";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
