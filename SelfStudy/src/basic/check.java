package basic;

public class check {
	public static void deposit() {
		System.out.println("���ݱ��");
		System.out.println("���¹�ȣ>> ");
		String ano = scn.next();

//		for (int i=0; i<banks.length; i++) {
//		if (banks[i] != null && banks[i].getAccNo().equals(ano)) {
//		break;
//		}else {
//			System.out.println("���¹�ȣ�� �߸��Է��ϼ̽��ϴ�");
//			System.out.println("���¹�ȣ>> ");
//			ano = scn.next();
//		}
//		}

		System.out.println("���ݾ� �Է�>> ");
		int amt = scn.nextInt();
		int checkCnt = 0; // ��ȸ�� �ƴ��� üũ ���� ����
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(ano)) {// ���°� �������
				// ���¹�ȣ ��ȸ������
				checkCnt = 1;
				int currAmt = banks[i].getMoney();

				// ���ݾ��� 10������ �ʰ����� ���ϵ���
				if (currAmt + amt > 100000) {
					checkCnt = 2;
					break;
				} else {
					banks[i].setMoney(currAmt + amt); // �ܾ� + �Աݾ�
					break;
				}
			} else {
				System.out.println("���¹�ȣ�� �����ϴ�.");
				break;
			}
		}
		if (checkCnt == 1) {
			System.out.println("���������� ó���Ǿ����ϴ�.");
		} else if (checkCnt == 2) {
			System.out.println("�Ա��ѵ����� �ʰ��߽��ϴ�.");
		} else {
			System.out.println("���¹�ȣ�� Ȯ�����ּ���");

		}
	}

}
