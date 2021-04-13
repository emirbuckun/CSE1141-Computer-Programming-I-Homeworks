/* Factory class represents a factory with employees.
 * 
 * Student Name - Student ID: Emir BÜÇKÜN - 150119024 */

package hw5;

public class Factory {
	private String name;
	private Employee[] employees;
	private Storage storage;
	private Payroll[] payrolls;
	private double itemPrice;

	public Factory(String name, int capacity, double itemPrice) {
		this.setName(name);
		Storage storage = new Storage(capacity);
		this.storage = storage;
		this.itemPrice = itemPrice;
		this.payrolls = new Payroll[0];
		this.employees = new Employee[0];
	}

	public double getRevenue() {
		return storage.getItems().length * itemPrice;
	}

	public double getPaidSalaries() {
		double paidSalaries = 0;
		for (int i = 0; i < payrolls.length; i++) {
			paidSalaries += payrolls[i].calculateSalary();
		}
		return paidSalaries;
	}

	public void addEmployee(Employee employee) {
		Employee[] copyEmployees = new Employee[employees.length + 1];

		// Copy the employees to the resized array
		for (int i = 0; i < employees.length; i++) {
			copyEmployees[i] = employees[i];
		}
		// Add the new employee
		copyEmployees[employees.length] = employee;

		// Add new items to the storage
		Item[] newItems = employee.startShift();
		for (int j = 0; j < newItems.length; j++) {
			storage.addItem(newItems[j]);
		}

		employees = copyEmployees;
	}

	public Employee removeEmployee(int id) {
		// Check the employees array has data or not
		if (employees.length == 0) {
			System.out.println("There are no employees!");
			return null;
		}

		// Search the given id in employees array
		int employeeIndex = 0;
		boolean isExist = false;
		Employee selectedEmployee = null;
		
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getId() == id) {
				isExist = true;
				selectedEmployee = employees[i];
				employeeIndex = i;
				break;
			}
		}
		
		if (!isExist) {
			System.out.println("Employee does not exist!");
			return null;			
		}
		
		addPayroll(selectedEmployee.endShift());

		Employee[] copyEmployees = new Employee[employees.length - 1];

		// Copy the employees to the resized array without the employee who has the given id
		for (int i = 0; i < copyEmployees.length; i++) {
			copyEmployees[i] = i >= employeeIndex ? employees[i + 1] : employees[i];
		}
		employees = copyEmployees;		
		
		return selectedEmployee;
	}

	public void addPayroll(Payroll payroll) {
		Payroll[] copyPayroll = new Payroll[payrolls.length + 1];
		
		// Copy the payrolls to the resized array
		for (int i = 0; i < payrolls.length; i++) {
			copyPayroll[i] = payrolls[i];
		}
		
		// Add new payroll
		copyPayroll[payrolls.length] = payroll;
		payrolls = copyPayroll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
