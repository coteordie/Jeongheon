package solved_class1.week4.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 최소, 최대
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 */
public class BOJ_10818 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int min = Integer.parseInt(st.nextToken());
		int max = min;
		for(int i = 0; i < N - 1; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if(min > temp) min = temp;
			if(max < temp) max = temp;
		}
		
		System.out.println(min + " " + max);
	}

}
