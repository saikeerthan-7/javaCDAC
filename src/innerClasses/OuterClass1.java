package innerClasses;

public class OuterClass1 {
	private int id = 101;
	public static void main(String[] args) {
		int salary = 75000;
		class LocalClass{
			public void print() {
				System.out.println("Salary is : " + salary);
			}
		}
		LocalClass lc = new LocalClass();
		lc.print();
	}

}
