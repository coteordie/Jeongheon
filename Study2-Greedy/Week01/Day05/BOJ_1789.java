package greedy.week01.day05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 수들의 합
 * 서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?
 */
public class BOJ_1789 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long S = Long.parseLong(br.readLine());
		
		// 1 + 2 + 3 + 4 + 5 + ... + x = S 만족
		// 13이면  1 + 2 + 3 + [7] = 13
		// 100이면 1 + 2 + 3 + 4 + ... + 11 + 12 + [22] = 100 
		long sum = 0;
		
		int i = 0;
		while(true) {
			sum += i;
			if(sum > S) break;
			i++;
		}
		
		System.out.println(i - 1);
	}

}
