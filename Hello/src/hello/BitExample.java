package hello;

public class BitExample {

	public static void main(String[] args) {
		int num = 10;
		int result = num << 11;
		System.out.println(result);
		int val = 100;
		val = val + 10;
		System.out.println(val);
		val += 20;
		System.out.println(val);
		val = val - 5;
		System.out.println(val);
		val -= 5;
		System.out.println(val);
		val = val * 2;
		System.out.println(val);
		String message = "�ݰ����ϴ�";
		System.out.println(message);
		message = message + " �ǰ���Դϴ�";
		System.out.println(message);
		message += " ���� �Ϸ� �Ǽ���";
		System.out.println(message);
		
		int cnt =0;
		cnt = cnt +1;
		cnt += 1;
		cnt++; //1����
		cnt--; //1����
		System.out.println(cnt);
		
		

	}

}
