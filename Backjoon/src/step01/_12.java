package step01;
/*
 * 날짜 : 2022/08/19
 * 이름 : 김훈
 * 내용 : 곱셈
 */
import java.util.Scanner;
public class _12 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int A = in.nextInt();
	String B = in.next();
    
	in.close();

	System.out.println(A * (B.charAt(2) - '0'));
	System.out.println(A * (B.charAt(1) - '0'));
	System.out.println(A * (B.charAt(0) - '0'));
	System.out.println(A * Integer.parseInt(B));

}
}
