package solved_class1.week5.day23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * X보다 작은 수
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 */
public class BOJ_10871 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] inputArr = br.readLine().split(" ");
		int len = Integer.parseInt(inputArr[0]);
		int num = Integer.parseInt(inputArr[1]);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < len; i++) {
			int temp  = Integer.parseInt(st.nextToken());
			if(temp < num) bw.write(temp + " ");
		}
		bw.flush();
	}

}
