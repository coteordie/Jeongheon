package greedy.week3.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 잃어버린 괄호
 * 세준이는 양수와 +, -, 그리고 괄호를 가지고 식을 만들었다. 그리고 나서 세준이는 괄호를 모두 지웠다.
 * 그리고 나서 세준이는 괄호를 적절히 쳐서 이 식의 값을 최소로 만들려고 한다.
 * 괄호를 적절히 쳐서 이 식의 값을 최소로 만드는 프로그램을 작성하시오.
 */
public class BOJ_1541 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inputStr = br.readLine();
	
		// '-'를 기준으로 괄호를 묶으면 최소값 도출
		String[] strArr = inputStr.split("-");
		
		ArrayList<Integer> sumList = new ArrayList<Integer>();
		for(int i = 0; i < strArr.length; i++) {
			// 괄호안의 숫자 각각 덧셈 후 sumList에 추가
			int sum = 0;
			String[] intArr = strArr[i].split("\\+");
			for(int j = 0; j < intArr.length; j++) {
				sum += Integer.parseInt(intArr[j]);
			}
			sumList.add(sum);
		}
		
		// sumList 첫번째 요소에서 나머지요소 뺄셈
		int result = sumList.get(0);
		for(int i = 1; i < sumList.size(); i++) {
			result -= sumList.get(i);
		}
		
		System.out.println(result);
	}

}
