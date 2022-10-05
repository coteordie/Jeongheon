package greedy.week3.day13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 회의실 배정
 * 한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의에 대하여 회의실 사용표를 만들려고 한다.
 * 각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수를 찾아보자.
 * 단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다.
 * 회의의 시작시간과 끝나는 시간이 같을 수도 있다. 이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.
 */
public class BOJ_1931 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] timeArr = new int[N][2];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			timeArr[i][0] = Integer.parseInt(st.nextToken());
			timeArr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// 끝나는 시간을 기준으로 정렬
		Arrays.sort(timeArr, (o1, o2) -> {
			if(o1[1] == o2[1]) return Integer.compare(o1[0], o2[0]);
			else return Integer.compare(o1[1], o2[1]);
		});
		
		int cnt = 0;
		int end = 0;
		for(int i = 0; i < timeArr.length; i++) {
			if(timeArr[i][0] >= end) {
				end = timeArr[i][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
