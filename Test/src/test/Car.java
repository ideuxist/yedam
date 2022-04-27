package test;

public class Car {
	
	int x = 10;
	static int y = 10;
	
	public static void main(String[] args) {
		System.out.println(y);
		test();
	}
	

	void test2() {
		x = x + 10;
		y = 10;

	}

	static void test() {
		y = 13;
		System.out.println(y);
		int y = 10;
		y = 11;
		Car c2 = new Car();
		c2.x = 10;
		System.out.println(y);
	}

	public class supercar {
		int x = 5;

	}

	public static class gtcar {
		Car c = new Car();
		Car.supercar sc = c.new supercar();

	}

	
}
