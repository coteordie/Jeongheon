package greedy.week01.day04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 상근이는 2863번에서 표를 너무 열심히 돌린 나머지 5와 6을 헷갈리기 시작했다.
 * 상근이가 숫자 5를 볼 때, 5로 볼 때도 있지만, 6으로 잘못 볼 수도 있고, 6을 볼 때는, 6으로 볼 때도 있지만, 5로 잘못 볼 수도 있다.
 * 두 수 A와 B가 주어졌을 때, 상근이는 이 두 수를 더하려고 한다. 
 * 이때, 상근이가 구할 수 있는 두 수의 가능한 합 중, 최솟값과 최댓값을 구해 출력하는 프로그램을 작성하시오.
 */
public class BOJ_2864 {
	
	private static int sumMin(int num, int min) {
		for(int i = 0; i < Math.log10(num) + 1; i++) {
			int temp = (int) (num % Math.pow(10, i + 1) / Math.pow(10, i));
			if(temp == 6) min += 5 * Math.pow(10, i); // 각 자릿수 중 6 포함 시 5로 치환 후 합산
			else min += temp * Math.pow(10, i);
		}
		return min;
	}
	
	private static int sumMax(int num, int max) {
		for(int i = 0; i < Math.log10(num) + 1; i++) {
			int temp = (int) (num % Math.pow(10, i + 1) / Math.pow(10, i));
			if(temp == 5) max += 6 * Math.pow(10, i);
			else max += temp * Math.pow(10, i);
		}
		return max;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputArr = br.readLine().split(" ");
		int A = Integer.parseInt(inputArr[0]);
		int B = Integer.parseInt(inputArr[1]);
		
		int min = 0;
		int max = 0;
		min = sumMin(A, min);
		min = sumMin(B, min);
		max = sumMax(A, max);
		max = sumMax(B, max);
		
		System.out.println(min + " " + max);
	}

}
