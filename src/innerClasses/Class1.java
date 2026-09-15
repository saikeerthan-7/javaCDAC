package innerClasses;

public class Class1 {
	private int id = 101;
	public static void main(String[] args) {
		int salary = 50000;
		
		Class2 c2 = new Class2() {
			@Override
			public void print() {
				System.out.println("Updated Print Method");
			}
		};
		c2.show();
		c2.print();
	}
}


class Class2 {
	public void show() {
		System.out.println("Show Method");
	}
	public void print() {
		System.out.println("Print Method");
	}

}

