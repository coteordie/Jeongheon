package bruteforce.week01.day01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
 * 분해합
 * 어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다.
 * 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다.
 * 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다.
 * 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
 * 자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
 */
public class BOJ_2231 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		// N자릿수는 M자릿수보다 같거나 하나 클 수 있다. 
		int len = (int) Math.log10(N) + 1;
		
		ArrayList<Integer> MList = new ArrayList<Integer>();
		
		int M = (int) Math.pow(10, len - 1); 
		while(M <= (int) Math.pow(10, len + 1)) {
			int sum = 0;
			for(int i = len; i > 0; i--) {
				sum += ((M % Math.pow(10, i)) / Math.pow(10, i - 1));
			}
			if(N == M + sum) MList.add(M);
			M++;
		}
		
		if(MList.isEmpty()) System.out.println(0);
		else System.out.println(Collections.min(MList));
	}

}
