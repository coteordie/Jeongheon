package solved_class1.week4.day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 음계
 * 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다.
 * c는 1로, d는 2로, ..., C를 8로 바꾼다.
 * 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
 * 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.
 */
public class BOJ_2920 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] numArr = br.readLine().split(" ");
		String result = "mixed";
		int asc = 1;
		int desc = 8;
		for(int i = 0; i < numArr.length - 1; i++) {
			if(Integer.parseInt(numArr[i]) == asc) asc++;
			if(Integer.parseInt(numArr[i]) == desc) desc--;
		}
		
		if(asc == 8) result = "ascending";
		else if(desc == 1) result = "descending";
		bw.write(result);
		bw.flush();
	}

}
