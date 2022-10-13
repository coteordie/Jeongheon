package solved_class1.week5.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * A/B
 * 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 */
public class BOJ_1008 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split(" ");
		System.out.println(Double.parseDouble(arr[0]) / Double.parseDouble(arr[1]));
	}

}
