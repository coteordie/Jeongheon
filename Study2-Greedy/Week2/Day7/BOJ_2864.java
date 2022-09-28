package greedy.week01.day04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 5와 6의 차이
 * 상근이는 2863번에서 표를 너무 열심히 돌린 나머지 5와 6을 헷갈리기 시작했다.
 * 상근이가 숫자 5를 볼 때, 5로 볼 때도 있지만, 6으로 잘못 볼 수도 있고, 6을 볼 때는, 6으로 볼 때도 있지만, 5로 잘못 볼 수도 있다.
 * 두 수 A와 B가 주어졌을 때, 상근이는 이 두 수를 더하려고 한다. 
 * 이때, 상근이가 구할 수 있는 두 수의 가능한 합 중, 최솟값과 최댓값을 구해 출력하는 프로그램을 작성하시오.
 */
public class BOJ_2864 {
	
	private static String minmax(String str) {
		String minStr = "", maxStr = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '5' || str.charAt(i) == '6') {
				minStr += "5";
				maxStr += "6";
			}
			else {
				minStr += str.charAt(i);
				maxStr += str.charAt(i);
			}
		}
		return minStr + " " + maxStr;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(br.readLine());
		String A = token.nextToken();
		String B = token.nextToken();
		
		String[] resultA = minmax(A).split(" ");
		String[] resultB = minmax(B).split(" ");
		
		int min = Integer.parseInt(resultA[0]) + Integer.parseInt(resultB[0]);
		int max = Integer.parseInt(resultA[1]) + Integer.parseInt(resultB[1]);
		
		System.out.println(min + " " + max);
		
	}

}
