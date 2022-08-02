import java.util.Scanner;

public class No_03 { // 이등변삼각형

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(); // i가 n만큼 일때까지 별을 찍음
		}
		for(int i = n - 1; i > 0; i--) { // 위에 별찍기가 끝나면 밑에 별찍기 시작
			for(int j = 1; j <= i; j++) { // n보다 1작게 별을 찍기 시작 -> 하나씩 줄어들게
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
