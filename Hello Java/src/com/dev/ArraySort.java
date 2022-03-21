package com.dev;

public class ArraySort {
public static void sorting (int[] ary) {
	int loopCnt = ary.length-1; //마지막 값이 처음위치로 이동하려면 배열크기 -1
	for (int cnt =0; cnt< loopCnt; cnt++) {
		int temp =ary[0];// 첫번째 값으로 tmp 값을 지정
		for (int i=0;i<loopCnt; i++) {
			if (ary[i] > ary[i+1]) {
				temp = ary[i]; // 34 25 위치변경
				ary[i] = ary[i+1];
				ary[i+1] = temp;
}
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intAry = { 32, 25, 48, 12 }; //제일 마지막 값이 최소값이라고 가정
		int[] intAry1 = { 2, 56, 99, 12 };
		int[] intAry2 = { 2, 32, 11, 12 };
		sorting(intAry);
				for (int i=0; i<intAry.length ; i ++) {
					System.out.println(intAry[i]+ " ");
				}
System.out.println();


			

		
		//변경 결과 출력
		for (int i=0; i<intAry.length ; i++) {
			System.out.println(intAry[i]+ " ");
		}
	System.out.println("\nend of prog");
	}

}
