package chapter.자바알고리즘문제풀이입문.hashmap_treeset.m01;

import java.util.*;

/*
15
BACBACCACCBDEDE


C
 */
public class Main {

	public void solution(int n, String arr){

		Map<String, Integer> map = new HashMap<>();

		map.put("A", 0);
		map.put("B", 0);
		map.put("C", 0);
		map.put("D", 0);
		map.put("E", 0);

		String[] split = arr.split("");

		for (String m : split) {
			map.put(m, map.get(m) + 1);
		}

		String student = "";
		int studentScore = 0;

		for (String key : map.keySet()) {
			String man = key;
			Integer count = map.get(key);

			if (count > studentScore) {
				studentScore = count;
				student = key;
			}
		}

		System.out.println(student);

	}



	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		String a = kb.next();
		T.solution(n, a);
	}
}