package solved_class1.week4.day17;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 숫자의 개수
 * 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 * 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,
 * 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 */
public class BOJ_2577 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		String[] arr = Integer.toString(A * B * C).split("");
		for(int i = 0; i < 10; i++) {
			int sum = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j].equals(Integer.toString(i))) sum++; 
			}
			System.out.println(sum);
		}
	}

}
