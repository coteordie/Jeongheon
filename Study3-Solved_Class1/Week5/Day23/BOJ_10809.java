package solved_class1.week5.day23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 알파벳 찾기
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
 * 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 */
public class BOJ_10809 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		for(int i = 97; i < 123; i++) {
			int index = -1;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == i) {
					index = j; 
					break;
				}
			}
			bw.write(index + " ");
		}
		bw.flush();
	}

}
