package bruteforce.week01.day02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 별찍기
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 */
public class BOJ_2438 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputNum = Integer.parseInt(br.readLine());
		for(int i = 0; i < inputNum; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
