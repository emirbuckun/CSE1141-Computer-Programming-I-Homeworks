/* Payroll class represents the payroll of the employees.
 * 
 * Student Name - Student ID: Emir BÜÇKÜN - 150119024 */

package hw5;

public class Payroll {
	private int workHour;
	private int itemCount;
	
	public Payroll (int workHour, int itemCount) {
		this.workHour = workHour;
		this.itemCount = itemCount;
	}
	
	public int calculateSalary() {
		return workHour * 3 + itemCount * 2;
	}
	
	public String toString() {
		return "The work hour is " + workHour + " and the produced item count is " + itemCount + ".";
	}
}
