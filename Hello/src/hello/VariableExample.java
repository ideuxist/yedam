package hello;

public class VariableExample {

	public static void main(String[] args) {
		// ������ Ÿ��
	int num1 = 100; //
	double num2 = 100.5; //�Ҽ������� ǥ��
	double result = (double) num1 * num2; // �ڵ�����ȯ(promotion) : �������� -> ū����, 
    System.out.println("���: " +result  ); // 
	// ��������ȯ(casting) : ū���� -> ��������
    int val1 = 100;
    double val2 = 20.5;
    int sum = val1 +(int) val2;
	System.out.println("���: "+sum);
	
	
	int n1 =11;
	int n2 = 4;
double n3 = (double)n1 / n2;
	System.out.println(n3);//10/4 =>2.5 (������� doubleŸ������) 
	//�Ѵ� integerŸ���̹Ƿ� ������� integer�� �����ҽ� ������ǥ��
	//type������ ���갡�� ������� double�� �����ϴ��� 2.0
	//������ ���� ó���ǹǷ� 2.0
	
	// ������ 10�� 3���� ���� ������ =>1
	int n4 = n1 % n2 ;
	System.out.println("������ : "+n4);
	// �ۼ�, Ȧ��
	if (n1 % 2 == 1) {
		System.out.println(n1 + "�� ¦���Դϴ�."); 
	    System.out.println(n1+ "�� Ȧ���Դϴ�.");
	}
	
	
	}

}
