package greedy.week3.day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 행복 유치원
 * 행복 유치원 원장인 태양이는 어느 날 N명의 원생들을 키 순서대로 일렬로 줄 세우고, 총 K개의 조로 나누려고 한다.
 * 각 조에는 원생이 적어도 한 명 있어야 하며, 같은 조에 속한 원생들은 서로 인접해 있어야 한다. 조별로 인원수가 같을 필요는 없다.
 * 이렇게 나뉘어진 조들은 각자 단체 티셔츠를 맞추려고 한다.
 * 조마다 티셔츠를 맞추는 비용은 조에서 가장 키가 큰 원생과 가장 키가 작은 원생의 키 차이만큼 든다.
 * 최대한 비용을 아끼고 싶어 하는 태양이는 K개의 조에 대해 티셔츠 만드는 비용의 합을 최소로 하고 싶어한다.
 * 태양이를 도와 최소의 비용을 구하자.
 */
public class BOJ_13164 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token1 = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(token1.nextToken());
		int K = Integer.parseInt(token1.nextToken());
		
		int[] numArr = new int[N];
		StringTokenizer token2 = new StringTokenizer(br.readLine());
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(token2.nextToken());
		}
		
		// 학생 키차이
		int[] diff = new int[N - 1];
		for(int i = 1; i < numArr.length; i++) {
			diff[i - 1] = numArr[i] - numArr[i - 1];
		}
		
		Arrays.sort(diff);
		
		int result = 0;
		for(int i = 0; i < diff.length - (K - 1); i++) {
			result += diff[i];
		}
		System.out.println(result);
	}

}
