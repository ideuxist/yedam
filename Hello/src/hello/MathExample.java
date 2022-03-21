package hello;
import java.util.Scanner;
public class MathExample {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("첫번째 수를 입력하세요");
	double a = scn.nextDouble();
	System.out.println("두번째 수를 입력하세요");
	double b = scn.nextDouble();
//	double c= a+b;
//	double d= a-b;
//	double e= a*b;		
//	double f= a/b;
	System.out.println("두수의 합은 "+ (a+b));
	System.out.println("두수의 차는 "+ (a-b));
	System.out.println("두수의 곱은 "+ (a*b));
	System.out.println("두수의 나누기는 "+(a/b));
	scn.close();
	
	}

}
