package bruteforce.week01.day03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 민수는 같은 반 친구들과 369게임을 하고 있다. 369게임은 여러 명이 원형으로 둘러 앉아 시작 위치의 사람이 1을 외치며 시작된다.
 * 이후 시계방향으로 돌아가며 2, 3, 4와 같이 1씩 증가된 수가 자기 수가 된다. 
 * 순서대로 돌아오는 자기 수에 3, 6, 혹은 9가 포함되어 있지 않다면 그 수를 말해야 하며, 3, 6, 혹은 9가 포함되어 있으면 
 * 그 개수만큼 박수를 쳐야 한다. 이 규칙을 지키지 못하면 게임이 종료된다.
 * 민수는 369게임이 N까지 규칙을 지키며 진행된다면 그때까지의 들은 박수의 횟수 가 총 몇 번인지 궁금했다. 
 * 예를 들어 N = 14라면, 3, 6, 9, 13에서 각각 한 번의 박 수를 치게 되므로 총 4회의 박수를 듣게 될 것이다. 
 * N = 36이라면 3, 6, 9, 13, 16, 19, 23, 26, 29, 30, 31, 32, 33, 34, 35, 36에서 박수를 치게 되는데 
 * 33, 36에서는 각 각 두 번 박수를 쳐야 하므로 총 18회가 된다. 
 * 1 이상의 정수 N에 대하여 369게임을 N까지 규칙을 지키며 진행된다면 그때까지 듣게 되는 박수의 총 횟수를 계산하여 출력하는 프로그램을 작성하시오.
 */
public class BOJ_17614 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNum = Integer.parseInt(br.readLine());
		
		int cnt = 0; // 박수 횟수
		
		for(int i = 1; i <= inputNum; i++) {
			int len = (int) Math.log10(inputNum) + 1;
			for(int j = len; j > 0; j--) {
				int num = (int) (i % Math.pow(10, j) / Math.pow(10, j - 1));
				if(num != 0 && num % 3 == 0) cnt++;
			}
		}
		System.out.println(cnt);
	}

}
