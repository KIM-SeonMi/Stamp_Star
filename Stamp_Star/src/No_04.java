import java.util.Scanner;

public class No_04 { // 이등변삼각형 반대로

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) { // 위쪽 이등변 삼각형
			for(int 공백 = 1; 공백 <= n - i; 공백++) {
				System.out.print(" ");
				}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
		} System.out.println();
	}
		
		for(int i = n - 1; i > 0; i--) { // 아래쪽 이등변 삼각형
			for(int 공백 = 1; 공백 <= n - i; 공백++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}