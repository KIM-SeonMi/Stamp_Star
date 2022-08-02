import java.util.Scanner;

public class No_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) { // i, j 모두 n만큼 별을 찍음
			for(int j = 1; j <= n; j++) {
				if(i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
// *** i = 1, j = 1, 2, 3
// * * i = 2, j = 1, 3
// *** i = 3, j = 1, 2, 3