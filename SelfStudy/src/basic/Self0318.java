package basic;

class Self0318 {
public static void main(String[] args) {
	MyMath mm = new MyMath();
//	개정판 p.171 객체지향 메서드 부분인데요.
//
//	1. ◆같은 클래스 내의 메서드끼리는 참조변수를 사용하지 않고도 서로 호출이 가능하지만
//
//	 static메서드는 같은 클래스 내의 인스턴스 메서드를 호출할 수 없다.◆wer
//
//	 
//
//	2. ◆MyMath클래스의 'add(long a, longb)'를 호출하기 위해서는 먼저 'Mymath mm = new MyMath();'와 같이 해서,
//
//	MyMath클래스의 인스턴스를 생성한 다음 참조변수 mm을 통해야한다.◆
//
//	 
//
//	솔직히 아직도 100% 이해를 했다고 자부할 수 없지만... 그냥 넘어갈 수는 있겟다 싶은.. 그래도 찝찝함은 남아있는
//
//	평생 이해 못하면 어쩌나 아 ㅠㅋㅋㅋㅋㅋ
//
//	 
//
//	2. 의 경우 꼭 인스턴스 생성을 해야합니까? add메서드를 이용하는데 객체가 없어도 되잖아요.
//
//	단지, 꼭 이 mm.add()를 쓰기위해 mm이 가르키는 객체가 필요하다는 말입니까?(지극히 당연한 순서인뎅..)
//
//	설명이 없는건지. 제가 이해를 못하는건지...
//
//	당연한 것을 묻는건지도 모르겠는데, 당연한걸 써놔서 오히려 더 헛갈리는 것인지 모르겠네요.
//
//	 
//
//	다시,
//
//	◆MyMath클래스의 'add(long a, longb)'를 ★호출★<-(호출이라는 개념이 클래스가 다른 곳에서 부르는 것을 일컫는 건가요??)
//
//	하기 위해서는 먼저 'Mymath mm = new MyMath();'와 같이 해서,MyMath클래스의 인스턴스를 생성한 다음 참조변수 mm을 통해야한다.◆
//	[출처] 2판 p.171 부근에서 멘붕오신 분들 참고하세용 (남궁성의 코드초보스터디(자바 java, c언어, javascript, python) | 작성자 내가할수있을까
	long result = mm.add(5L, 3L) ;
}

	class MyMath {
		long add(long a, long b) {
			long result = a + b;
			return result;

		}

		long subtract(long a, long b) {
			return a - b;
		}

		long multiply(long a, long b) {
			return a * b;
		}

		double divide(double a, double b) {
			return a / 6;
		}
	}

}
