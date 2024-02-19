package chapter.inflearn.array.m05;

import java.util.Scanner;

public class Main_T {

    public int solution(int n){
        int cnt=0;

        int[] ch = new int[n+1];

        // 1 부터 돌필요는 없으므로
        for(int i=2; i<=n; i++){

            // 1이 아니라면 처음 만난 수다 -> 카운팅
            if(ch[i]==0){

                cnt++;

                // 현재 i의 배수를 1이라는 값을 준다
                for(int j=i; j<=n; j=j+i) ch[j]=1;
            }

        }
        return cnt;
    }
    public static void main(String[] args){
        Main_T T = new Main_T();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.println(T.solution(n));
    }
}
