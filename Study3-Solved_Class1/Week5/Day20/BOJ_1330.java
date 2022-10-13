package solved_class1.week5.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 두 수 비교하기
 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 */
public class BOJ_1330 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split(" ");
		int minus = Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]);
		if(minus > 0) System.out.println(">");
		else if(minus < 0) System.out.println("<");
		else System.out.println("==");
	}

}
