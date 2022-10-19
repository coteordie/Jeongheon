package baekjoon.solved_class1.week5.day24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * A*B
 * 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
 */
public class BOJ_10998 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		System.out.println(Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
	}

}
