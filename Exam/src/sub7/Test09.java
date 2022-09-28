package sub7;

/*
 * 날짜 : 2022/09/28
 * 이름 : 김훈
 * 내용 : Java 총정리 연습문제
 */





public class Test09 {
	public static void main(String[] args) {
		
		Tv tv = new Tv() {
			@Override
			public void turnOn() {
				System.out.println("Tv를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Tv를 끕니다.");
			}
		};
		
		tv.turnOn();
		tv.turnOff();
	}
}