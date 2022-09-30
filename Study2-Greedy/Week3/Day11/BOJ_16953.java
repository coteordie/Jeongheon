package greedy.week3.day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * A -> B
 * 정수 A를 B로 바꾸려고 한다. 가능한 연산은 다음과 같은 두 가지이다.
 * 		2를 곱한다.
 * 		1을 수의 가장 오른쪽에 추가한다. 
 * A를 B로 바꾸는데 필요한 연산의 최솟값을 구해보자.
 */
public class BOJ_16953 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(token.nextToken());
		int B = Integer.parseInt(token.nextToken());
		
		int cnt = 1;
		while(A < B) {
			if(B % 10 == 1) B /= 10; 	// 가장 오른쪽 1을 제거하는 경우
			else if(B % 2 == 0) B /= 2; // 2로 나누는 경우
			else {
				cnt = -1;
				break;
			}
			cnt++;
			if(B < A) cnt = -1;
		}
		System.out.println(cnt);
		
	}

}
