package hello;

public class Variables {
	public static void main(String[] args) {
		int age = 20;
		int num1 = 30;
		int num2 = 50;
		int result = num1 + num2;
		System.out.println("age변수 : " + age);
		System.out.println("20+10=30");
		System.out.println(num1 + "+" + num2 + "=" + result);
		String name = "홍길동";
		name = "최민규";
		System.out.println(name + "의 나이는" + age + "입니다");
		
		final String myName = "권경완";
		
		String ph = "010 1234 5678";
		String email = "test@email.com ";
	    System.out.println(myName +"의 전화번호는 "+ph+"이고 이메일은"+ email+"입니다");
	}

}
