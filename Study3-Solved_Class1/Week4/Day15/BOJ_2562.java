package solved_class1.week4.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 최댓값
 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 * 예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61이 주어지면,
 * 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
 */
public class BOJ_2562 {

	private static int NUM = 9;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0, cnt = 0;
		for(int i = 0; i < NUM; i++) {
			int temp = Integer.parseInt(br.readLine());
			if(max < temp) {
				max = temp;
				cnt = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(cnt);
	}

}
