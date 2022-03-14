package hello;

//이름을 입력받도록... (String)scn.nextLine();
//연락처 입력 (String) ->scn.nextLine();
//나이 입력 (int) -> scn.nextInt();
//키 입력 (double) -> scn.nextDouble();
import java.util.Scanner;

public class TodayExample {

	public static void main(String[] args) {
	  String name, phNum;
	  int age;
	  double tall, weigt;
		Scanner scn = new Scanner(System.in);
	   System.out.println("이름을 입력하세요");
	   name = scn.next();
	   System.out.println("연락처를 입력하세요");
	   phNum =scn.next();
	   System.out.println("나이를 입력하세요");
	   age = scn.nextInt();
       System.out.println("키를 입력하세요");
	   tall = scn.nextDouble();
	   System.out.println("몸무게를 입력하세요");
	   weigt = scn.nextDouble();
	   
	   System.out.println("이름:"+name);
	   System.out.println("연락처:"+phNum);
	   System.out.println("나이:"+age);
	   System.out.println("키:"+tall);
	   System.out.println("몸무게:"+weigt);
	   Double reweigt = (tall-100) *0.9;
	   if (reweigt -10 < weigt && weigt < reweigt +10 ) {
		   System.out.println("적정체중입니다");
	   } 
	   if (reweigt+10 <weigt ) {
		 
		   System.out.println("과체중입니다");}
	   if (reweigt-10 >weigt)  {
		   System.out.println("저체중입니다");
	   }
	   
	   }


	   
	   
	   

	}


