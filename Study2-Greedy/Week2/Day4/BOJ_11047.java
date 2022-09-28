package greedy.week01.day01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 동전0
 * 준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다. 
 * 동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
 */
public class BOJ_11047 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputNums = br.readLine().split(" ");
		int N = Integer.parseInt(inputNums[0]);
		int K = Integer.parseInt(inputNums[1]);
		
		int[] NList = new int[N];
		for(int i = 0; i < N; i++) {
			NList[i] = Integer.parseInt(br.readLine());
		}
		
		int cnt = 0;
		for(int i = NList.length - 1; i >= 0; i--) {
			cnt += K / NList[i];
			K %= NList[i];
		}
		System.out.println(cnt);
	}

}
