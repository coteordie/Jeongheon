package solved_class1.week4.day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 단어 공부
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 * 단, 대문자와 소문자를 구분하지 않는다.
 */
public class BOJ_1157 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] alphaArr = br.readLine().toUpperCase().toCharArray();
		int[] cntArr = new int[26];
		
		for(int i = 0; i < alphaArr.length; i++) {
			cntArr[alphaArr[i] - 65]++;
		}
		
		char result = ' ';
		int max = 0;
		for(int i = 0; i < cntArr.length; i++) {
			int temp = cntArr[i];
			if(temp > max) {
				max = temp;
				result =  (char)(i + 65);
			} else if(temp == max) result = '?';
		}
		
		bw.write(result);
		bw.flush();
	}

}
