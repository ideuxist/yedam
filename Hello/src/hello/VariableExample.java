package hello;

public class VariableExample {

	public static void main(String[] args) {
		// 변수의 타입
	int num1 = 100; //
	double num2 = 100.5; //소수점까지 표현
	double result = (double) num1 * num2; // 자동형변환(promotion) : 작은범위 -> 큰범위, 
    System.out.println("결과: " +result  ); // 
	// 강제형변환(casting) : 큰범위 -> 작은범위
    int val1 = 100;
    double val2 = 20.5;
    int sum = val1 +(int) val2;
	System.out.println("결과: "+sum);
	
	
	int n1 =11;
	int n2 = 4;
double n3 = (double)n1 / n2;
	System.out.println(n3);//10/4 =>2.5 (결과값을 double타입으로) 
	//둘다 integer타입이므로 결과값도 integer로 선언할시 정수만표현
	//type같으면 연산가능 결과값을 double로 선언하더라도 2.0
	//연산이 먼저 처리되므로 2.0
	
	// 나머지 10을 3으로 나눈 나머지 =>1
	int n4 = n1 % n2 ;
	System.out.println("나머지 : "+n4);
	// 작수, 홀수
	if (n1 % 2 == 1) {
		System.out.println(n1 + "은 짝수입니다."); 
	    System.out.println(n1+ "은 홀수입니다.");
	}
	
	
	}

}
