package greedy.week3.day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 블로그2
 * neighbor 블로그를 운영하는 일우는 매일 아침 풀고 싶은 문제를 미리 정해놓고 글을 올린다. 
 * 그리고 매일 밤 각각의 문제에 대하여, 해결한 경우 파란색, 해결하지 못한 경우 빨간색으로 칠한다.
 * 일우는 각 문제를 칠할 때 아래와 같은 과정을 한 번의 작업으로 수행한다.
 * 		1. 연속된 임의의 문제들을 선택한다.
 * 		2. 선택된 문제들을 전부 원하는 같은 색으로 칠한다.
 * 예를 들어, 각 문제를 위와 같은 색으로 칠하려고 할 때,
 * 1~2번 문제를 파란색, 3번을 빨간색, 4번을 파란색, 5번을 빨간색, 6~7번을 파란색, 8번을 빨간색으로 칠하는 작업을 순서대로 수행하면 6번의 작업을 거쳐야 한다.
 * 하지만, 1~7번 문제를 파란색, 3번을 빨간색, 5번을 빨간색, 8번을 빨간색으로 순서대로 칠한다면 작업 횟수는 4번으로 가장 적다.
 * 일우는 매일 500,000문제까지 시도하기 때문에, 이 작업이 꽤나 귀찮아지기 시작했다.
 * 그래서 가장 효율적인 방법으로 위 작업을 수행하기를 원한다.
 * 일우를 도와 각 문제를 주어진 색으로 칠할 때 필요한 최소한의 작업 횟수를 구하는 프로그램을 작성하라.
 */
public class BOJ_20365 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String inputStr = br.readLine();
		char start = inputStr.charAt(0); // 시작하는 색
		
		int cnt = 1;
		for(int i = 1; i < inputStr.length(); i++) {
			char color = inputStr.charAt(i);
			if(start != color && color != inputStr.charAt(i - 1)) cnt++;
		}
		
		System.out.println(cnt);
	}

}
