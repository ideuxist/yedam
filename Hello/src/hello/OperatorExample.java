package hello;

public class OperatorExample {

	public static void main(String[] args) {
		int num1, num2, result;
		
		num1 = 10;
		num2 = 100;
		
		num1 += 20;
		num2 -= 50;
		
		num1++;
		num2--;
		num2--;
	    num1 >>= 2; // num1 = num1 >> 2;
		
	    result = num1 + num2;
		System.out.println("result=>"+result);
		
		// �� ������(true false)
		int myAge=5;

		
		boolean isAdult = myAge >=20;
		
		if (isAdult ) {
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("�̼������Դϴ�");
		}
		

	}

}
