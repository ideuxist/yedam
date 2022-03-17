package basic;

public class check {
	public static void deposit() {
		System.out.println("예금기능");
		System.out.println("계좌번호>> ");
		String ano = scn.next();

//		for (int i=0; i<banks.length; i++) {
//		if (banks[i] != null && banks[i].getAccNo().equals(ano)) {
//		break;
//		}else {
//			System.out.println("계좌번호를 잘못입력하셨습니다");
//			System.out.println("계좌번호>> ");
//			ano = scn.next();
//		}
//		}

		System.out.println("예금액 입력>> ");
		int amt = scn.nextInt();
		int checkCnt = 0; // 조회가 됐는지 체크 여부 변수
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(ano)) {// 계좌가 있을경우
				// 계좌번호 조회됐을때
				checkCnt = 1;
				int currAmt = banks[i].getMoney();

				// 예금액이 10만원을 초과하지 못하도록
				if (currAmt + amt > 100000) {
					checkCnt = 2;
					break;
				} else {
					banks[i].setMoney(currAmt + amt); // 잔액 + 입금액
					break;
				}
			} else {
				System.out.println("계좌번호가 없습니다.");
				break;
			}
		}
		if (checkCnt == 1) {
			System.out.println("정상적으로 처리되었습니다.");
		} else if (checkCnt == 2) {
			System.out.println("입금한도액을 초과했습니다.");
		} else {
			System.out.println("계좌번호를 확인해주세요");

		}
	}

}
