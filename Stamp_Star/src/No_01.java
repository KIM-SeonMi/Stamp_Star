import java.util.Scanner;

public class No_01 { // 피라미드 모양

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요. : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			for(int o = 1; o < n-i; o++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}