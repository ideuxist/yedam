package com.prod;

public class ArrayExample3 {
	public static void main(String[] args) {
		String[] names = new String[5]; // �ʱⰪ null
		names[0] = "ȫ�浿";
		names[1] = "234";
		names[2] = "�ǰ��";
		names[3] = "����";

		names[1] = "�̻��";
		names[4] = "�ǰ��";
		names[0] = null;
		String searchName = "����";
		for (int i = 0; i < 5; i++) {
//			if (names[i] != null) {
//				System.out.println(names[i]);
//			}
			if (names[i] != null && names[i].equals(searchName)) {
				System.out.println(i+1+"��° ��ġ�� �ֽ��ϴ�.");
			}
			//int scores[] = new int[] {1,1,1,1,1,1,1};
			//int add(int[] scores) {1,1,1,1,1}
		}
	}

}
