package hello;

//�̸��� �Է¹޵���... (String)scn.nextLine();
//����ó �Է� (String) ->scn.nextLine();
//���� �Է� (int) -> scn.nextInt();
//Ű �Է� (double) -> scn.nextDouble();
import java.util.Scanner;

public class TodayExample {

	public static void main(String[] args) {
	  String name, phNum;
	  int age;
	  double tall, weigt;
		Scanner scn = new Scanner(System.in);
	   System.out.println("�̸��� �Է��ϼ���");
	   name = scn.next();
	   System.out.println("����ó�� �Է��ϼ���");
	   phNum =scn.next();
	   System.out.println("���̸� �Է��ϼ���");
	   age = scn.nextInt();
       System.out.println("Ű�� �Է��ϼ���");
	   tall = scn.nextDouble();
	   System.out.println("�����Ը� �Է��ϼ���");
	   weigt = scn.nextDouble();
	   
	   System.out.println("�̸�:"+name);
	   System.out.println("����ó:"+phNum);
	   System.out.println("����:"+age);
	   System.out.println("Ű:"+tall);
	   System.out.println("������:"+weigt);
	   Double reweigt = (tall-100) *0.9;
	   if (reweigt -10 < weigt && weigt < reweigt +10 ) {
		   System.out.println("����ü���Դϴ�");
	   } 
	   if (reweigt+10 <weigt ) {
		 
		   System.out.println("��ü���Դϴ�");}
	   if (reweigt-10 >weigt)  {
		   System.out.println("��ü���Դϴ�");
	   }
	   
	   }


	   
	   
	   

	}


