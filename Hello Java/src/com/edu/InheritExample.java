package com.edu;

public class InheritExample {
	//�л� ������ ģ�� => ������ ��Ƴ��� ���α׷�
	//�б� �г�
	//����� ����
	//�������
	public static void main(String[] args) {
		Students student = new Students();
		student.setName("ȫ�浿");
		student.setAge(15);
		student.setSchool("�߾Ӱ�");
		student.setGrade(2);
		
		Worker worker = new Worker();
		worker.setName("������");
		worker.setAge(35);
		worker.setCompany("īī��");
		worker.setJob("��������");
				
		//�θ� Ŭ������ ���������� �ڽ� Ŭ������ �������� (�ڵ�����ȯ(promotion))
				Person p1= new Person();
				p1=(Person)student;
				p1=worker;
				
				
	}
	
	
}

