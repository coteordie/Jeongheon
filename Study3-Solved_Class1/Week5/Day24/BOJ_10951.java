package baekjoon.solved_class1.week5.day24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * A+B - 4
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
public class BOJ_10951 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String inputStr;
		
		// System.in은 사용자가 ctrl + z키를 입력하면 키 입력 종료로 인식
		while((inputStr = br.readLine()) != null) {
			st = new StringTokenizer(inputStr);
			
			int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}

}
