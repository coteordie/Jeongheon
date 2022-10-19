package baekjoon.solved_class1.week5.day24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * A+B - 3
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
public class BOJ_10950 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tcNum = Integer.parseInt(br.readLine());
		for(int i = 0; i < tcNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			bw.write(Integer.toString(sum) + "\n");
		}
		bw.flush();
	}

}
