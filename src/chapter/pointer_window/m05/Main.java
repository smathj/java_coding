package chapter.pointer_window.m05;

import java.util.Scanner;

/*
15
3

12
1

19
1
 */
public class Main {


	public void solution(int n){

		int p2 = 2;

		int count = 0;

		for (int p1 = 1; p1 < n; p1++) {

			int sum = p1;

			while (sum < n) {
				// 연속된 자연수의 합이니 같을때는 p2를 증가시키고 다음 루프를 진행한다
				if(p1 == p2) {
					p2++;
					continue;
				}

				// sum에 누적
				sum += p2++;

				// sum이 n일떄 카운팅하고, p2를 한칸 이동시킨다
				if (sum == n) {
					count++;
					p2 = p1 + 1;

				// sum이 n보다 클때 , p2를 p1 다음칸에 위치하고 루프를 멈춘다
				} else if (sum > n) {
					p2 = p1 + 1;
					break;
				}
			}
		}

		System.out.println(count);


	}



	public static void main(String[] args){
		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n=kb.nextInt();

		T.solution(n);
	}
}