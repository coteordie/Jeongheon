package solved_class1.week5.day23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 사칙연산
 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
 */
public class BOJ_10869 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = br.readLine().split(" ");
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[1]);
		
		bw.write(Integer.toString(num1 + num2) + "\n");
		bw.write(Integer.toString(num1 - num2) + "\n");
		bw.write(Integer.toString(num1 * num2) + "\n");
		bw.write(Integer.toString(num1 / num2) + "\n");
		bw.write(Integer.toString(num1 % num2) + "\n");
		bw.flush();
	}

}
