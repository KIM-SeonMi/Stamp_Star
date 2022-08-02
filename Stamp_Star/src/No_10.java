import java.util.Scanner;

public class No_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) { // i가 n만큼 반복문 시작(세로)
			for(int j = 1; j <= n; j++) { // j가 n보다 작거나 같을 때까지 줄바꿈(가로)
				if(n - j >= i) { // n - j 가 i보다 작거나 같을 때까지 공백을 찍는다.
					System.out.print(" "); // n-j>=i(5-1 >= 1 공백을 4번 찍은 다음에 마지막 5번째에 별찍기)
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}