package bruteforce.week01.day02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 */
public class BOJ_2440 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputNum = Integer.parseInt(br.readLine());
		for(int i = 0; i < inputNum; i++) {
			for(int j = inputNum; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
