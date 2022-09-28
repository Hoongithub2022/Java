package sub7;

/*
 * 날짜 : 2022/09/28
 * 이름 : 김훈
 * 내용 : Java 총정리 연습문제
 */
class Member {
	private String name;
	
	
	
	
	
	public void show () {
		System.out.println("---------------");
		System.out.println(name + " 입니다. ");
	}
}

class Employee extends Mamber {
	public Employee(String name) {
		~~~~~
	}
	
	public void show() {
		~~~~~
		System.out.println("작업을 합니다.");
	}
}

class Developer extends Member {
	public Developer(String name) {
		~~~~~~~
	}
	
	public void show() {
		~~~~~
		System.out.println("개발을 합니다.");
	}
}

class Professor extends Member {
	public Professor(String name) {
		~~~~~
	}
	
	public void show() {
		~~~~
		System.out.println("연구를 합니다.");
	}
}

public class Test05 {
		public static void main(String[] args) {
			
			Employee employee = new Employee("김유신");
			Developer developer = new Developer("김춘추");
			Professor professor = new Professor("장보고");
			
			~~~~ people = { employee, developer, professor };
			
			for(Member human : people) {
				human.show();
			}
		}
}