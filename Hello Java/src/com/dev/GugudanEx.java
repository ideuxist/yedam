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
	     //�޼ҵ� �����Ϸ��� new Ŭ���� �̸�(); ex) Student s1 = new Student();
		//Student.callStatic();;
		int cnt =1;	
		for (int i = 2; i<10; i++) {
	        
			//System.out.print("["+i+"��]");
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
//	printStar(i,"��");//�ۡ�
//	System.out.println();
int result =sum( sum(10,20),sum(5,7));
int[] newAry = { 10,20,30};
result= sum(newAry);

System.out.println("�����"+result);
	
	System.out.println(divide(10,0));
printGugudan();
}
//������ �޼ҵ� (int,  int ) ������ 0���� ���� 0�� return
//��ȯ�� double
public static int sum(int[] ary) {
	//�迭�Ű������� �� ����� ���� ���ϴ� �޼ҵ�
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
	System.out.println("[ " +dan+ "��]");
	for (int i= 2; i <10; i++) {
		System.out.printf("%2d * %2d = %2d\n", dan,i,(i*dan));
	}
	System.out.println();
	
		
	}
public static int sum (int n1, int n2 ) {
	return n1+n2;
	
}




}






