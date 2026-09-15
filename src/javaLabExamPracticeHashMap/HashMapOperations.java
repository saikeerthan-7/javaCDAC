package javaLabExamPracticeHashMap;
import java.util.*;

public class HashMapOperations {
	HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
	Scanner s = new Scanner(System.in);
	
	public void addNewEmployee() {
		System.out.println("Enter Employee ID : ");
		int id = s.nextInt();
		if(hm.containsKey(id)) {
			System.out.println("Employee ID already exists");
		}
		else {
			hm.put(id, new Employee(s.nextInt(), s.next(), s.next(), s.nextDouble(), s.nextFloat()));
		}
	}
	
	public void searchByEmployeeID() {
		System.out.println("Enter Employee ID : ");
		int id = s.nextInt();
		for(Map.Entry<Integer, Employee> obj : hm.entrySet()) {
			if(obj.getKey() == id) {
				obj.getValue().displayEmployeeDetails();
				return;
			}
		}
		System.out.println("Employee ID not found");
		
	}
	
	public void searchByEmployeeName() {
		System.out.println("Enter Employee Name : ");
		s.nextLine();
		String name = s.nextLine();
		for(Map.Entry<Integer, Employee> obj : hm.entrySet()) {
			if(obj.getValue().employeeName.equals(name)) {
				obj.getValue().displayEmployeeDetails();
		        return;
			}
		}
		System.out.println("Employee Name not found");
	}
	
	public void updateEmployeeDetails() {
		System.out.println("Enter Employee ID to update details : ");
		int id = s.nextInt();
		for(Map.Entry<Integer, Employee> obj : hm.entrySet()) {
			if(obj.getKey() == id) {
				System.out.println("Enter Employee New Name : ");
				s.nextLine();
				String newName = s.nextLine();
				System.out.println("Enter Department : ");
				String newDepart = s.nextLine();
				System.out.println("Enter the Salary : ");
				double newSal = s.nextDouble();
				System.out.println("Enter experience : ");
				float newExp = s.nextFloat();
				obj.getValue().employeeName = newName;
				obj.getValue().department = newDepart;
				obj.getValue().salary = newSal;
				obj.getValue().experience = newExp;
				return;
			}
		}
		System.out.println("Employee ID Not Found");
	}
	
	public void deleteEmployeeID() {
		System.out.println("Enter Employee ID to delete : ");
		int id = s.nextInt();
		
		for(Map.Entry<Integer, Employee> obj : hm.entrySet()) {
			if(obj.getValue().employeeID == id) {
				hm.remove(obj.getKey());
				return;
			}
		}
		System.out.println("Employee Deleted Successfully");
	}
	
	public void sortBySalaryAscending() {
		hm.entrySet().stream().sorted(Comparator.comparingDouble(s -> s.getValue().salary))
		.forEach(s -> s.getValue().displayEmployeeDetails());
	}
	
	public void sortBySalaryDescending() {
		hm.entrySet()
		  .stream()
		  .sorted(Comparator.comparingDouble((Map.Entry<Integer, Employee> s) -> s.getValue().salary).reversed())
		  .forEach(s -> s.getValue().displayEmployeeDetails());
	}
	
	public void sortByEmployeeName() {
		hm.entrySet().stream()
		.sorted(Comparator.comparing((Map.Entry<Integer, Employee> s) -> s.getValue().employeeName))
		.forEach(s -> s.getValue().displayEmployeeDetails());
	}
	
}
