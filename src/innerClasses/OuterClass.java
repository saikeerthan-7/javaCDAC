package innerClasses;

public class OuterClass {
	private int id = 101;
	public static void main(String[] args) {
		System.out.println("In main method : OuterClass");
		InnerClass ic = new OuterClass().new InnerClass(); // To create object of Inner Class in Outer Class
		ic.show();
	}
	class InnerClass extends Student implements Employee{
		private int id = 102;
		public void show() {
			int id = 103;
			System.out.println(id); // To access Local Variable
			System.out.println(this.id); // To access Inner class Instance Variable
			System.out.println(OuterClass.this.id); // To access Outer class Instance Variable
			giveExam();
			System.out.println("Marks : " + getMarks());
			System.out.println("Employee ID : " + getEmployeeID());
			calculateSalary();
		}
		// Abstract Class Method
		public void giveExam() {
			System.out.println("Exam Given");
		}
		
		// Interface Methods
		
		public int getEmployeeID() {
			return 1001;
		}
		
		public void calculateSalary() {
			System.out.println("Salary is 3 Lakhs");
		}
		
	}
	
	class InnerClass2 extends InnerClass{
		public void abc() {
			show();
		}
	}

}
