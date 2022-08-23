package ch05;

public class p148 {
	public static void main(String[] args) {
		Student Student1 = new Student();
		Student1.studentName = "안연수";
		System.out.println(Student1.getStudentName());
		Student student2 = new Student();
		student2.studentName = "안승연";
		System.out.println(student2.getStudentName());
	}
}