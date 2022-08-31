package test1;
public class no3 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("☆");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("★");
			}
			System.out.println("");
		}
		System.out.println("\n");

		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print("☆");
			}
			for (int k = 1; k < i + i; k++) {
				System.out.print("★");
			}

			for (int end = 1; end < 5 - i; end++) {
				System.out.print("☆");
			}
			System.out.println("");
		}
	}
}


