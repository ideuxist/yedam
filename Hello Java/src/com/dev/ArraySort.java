package com.dev;

public class ArraySort {
public static void sorting (int[] ary) {
	int loopCnt = ary.length-1; //������ ���� ó����ġ�� �̵��Ϸ��� �迭ũ�� -1
	for (int cnt =0; cnt< loopCnt; cnt++) {
		int temp =ary[0];// ù��° ������ tmp ���� ����
		for (int i=0;i<loopCnt; i++) {
			if (ary[i] > ary[i+1]) {
				temp = ary[i]; // 34 25 ��ġ����
				ary[i] = ary[i+1];
				ary[i+1] = temp;
}
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intAry = { 32, 25, 48, 12 }; //���� ������ ���� �ּҰ��̶�� ����
		int[] intAry1 = { 2, 56, 99, 12 };
		int[] intAry2 = { 2, 32, 11, 12 };
		sorting(intAry);
				for (int i=0; i<intAry.length ; i ++) {
					System.out.println(intAry[i]+ " ");
				}
System.out.println();


			

		
		//���� ��� ���
		for (int i=0; i<intAry.length ; i++) {
			System.out.println(intAry[i]+ " ");
		}
	System.out.println("\nend of prog");
	}

}
