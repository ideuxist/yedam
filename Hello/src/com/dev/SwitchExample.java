package com.dev;

public class SwitchExample {

	public static void main(String[] args) {
		// ����(1) ����(2) ��(3)
		int ranVal = (int) (Math.random() * 3) + 1;
//		if (ranVal == 1) {
//			System.out.println("�����Դϴ�");
//		} else if (ranVal ==2) {
//			System.out.println("�����Դϴ�");
//		} else if (ranVal ==3) {
//			System.out.println("���Դϴ�");
//		}
			
        switch(ranVal) {
        case 1:
        	System.out.println("�����Դϴ�");
        	break;
        case 2:
        	System.out.println("�����Դϴ�");
        	break;
        case 3:
        	System.out.println("���Դϴ�");
        }
        System.out.println("��");
	}

}
