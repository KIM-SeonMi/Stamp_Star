import java.util.Scanner;

public class No_02 { // 피라미드 반대로

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 : ");
		int n = sc.nextInt();
		
		for(int i = n; i > 0; i--) { // 밑으로 갈수록 별이 줄어듦
			for(int 공백 = n - i; 공백 > 0; 공백--) { /* 3-3 공백 찍을 거 없음 ->
			                                      3-2 공백 하나 찍음 -> 3-1 공백 2개찍음 */
				System.out.print(".");
			}
			for(int j = i*2-1; j > 0; j--) { // 피라미드 모양을 보면 양 옆으로 2개씩 줄어듦 j가 1까지 실행이 되고 반복문 종료
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
