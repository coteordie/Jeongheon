package solved_class1.week4.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 기찍 N
 * 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 */
public class BOJ_2742 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		for(int i = N; i > 0; i--) {
			System.out.println(i);
		}
	}

}
