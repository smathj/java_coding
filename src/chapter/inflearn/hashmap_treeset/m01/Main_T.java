package chapter.inflearn.hashmap_treeset.m01;

import java.util.HashMap;
import java.util.Scanner;

/*
14 2
1 1 0 0 1 1 0 1 1 0 1 1 0 1

8
 */
public class Main_T {
	public char solution(int n, String s){
		char answer=' ';
		HashMap<Character, Integer> map=new HashMap<>();
		for(char x : s.toCharArray()){
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		//System.out.println(map.containsKey('F'));
		//System.out.println(map.size());
		//System.out.println(map.remove('C'));

		int max=Integer.MIN_VALUE;
		for(char key : map.keySet()){
			//System.out.println(key+" "+map.get(key));
			if(map.get(key)>max){
				max=map.get(key);
				answer=key;
			}
		}
		return answer;
	}

	public static void main(String[] args){
		Main_T T = new Main_T();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		String str=kb.next();
		System.out.println(T.solution(n, str));
	}
}