package com.dev;

public class GugudanEx {
	public static void printStar(int runCnt, String shape){
		for (int i=0; i<runCnt; i++) {
		System.out.print(shape);
	}
	}

	public static void getScore() {

	}

	public static void printGugudan() {
	     //메소드 실행하려면 new 클래스 이름(); ex) Student s1 = new Student();
		//Student.callStatic();;
		int cnt =1;	
		for (int i = 2; i<10; i++) {
	        
			//System.out.print("["+i+"단]");
			//System.out.println();
		
			
			for (i=2; i<10; i++) {
				
			System.out.print(i+"*" +cnt+ "=" +(i*cnt)+" ");
			for (cnt=2; cnt<10; cnt++) {
				
			}
			
			
			
			}
		}
	}
// end of main()
// ===============================================

public static void main(String[] args) {
//	for (int i =1; i<=5; i++) {
//	printStar(i,"★");//○★
//	System.out.println();
int result =sum( sum(10,20),sum(5,7));
int[] newAry = { 10,20,30};
result= sum(newAry);

System.out.println("결과는"+result);
	
	System.out.println(divide(10,0));
printGugudan();
}
//나누기 메소드 (int,  int ) 나누기 0값으 오면 0을 return
//반환값 double
public static int sum(int[] ary) {
	//배열매개변수의 각 요소의 합을 구하는 메소드
	int sum = 0;
	for (int i=0 ; i<ary.length;i++) {
		
		sum +=ary[i];
	}
	return sum;
}



public static double divide(int n1, int n2) {
	if (n1!=0 && n2!=0) {
	return n1 / (double)n2;
    	
}else 
	return 0;
}

public static void gugudan (int dan) {
	System.out.println("[ " +dan+ "단]");
	for (int i= 2; i <10; i++) {
		System.out.printf("%2d * %2d = %2d\n", dan,i,(i*dan));
	}
	System.out.println();
	
		
	}
public static int sum (int n1, int n2 ) {
	return n1+n2;
	
}




}






