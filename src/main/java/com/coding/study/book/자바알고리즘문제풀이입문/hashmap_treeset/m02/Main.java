package chapter.book.자바알고리즘문제풀이입문.hashmap_treeset.m02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
AbaAeCe
baeeACA

YES


abaCC
Caaab

NO
 */
public class Main {

	public void solution(String a, String b){
		String result = "YES";

		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();

		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();

		for (int i = 0; i < arr1.length; i++) {
			char c = arr1[i];
			map1.put(c, map1.getOrDefault(c, 0) + 1);
		}
		for (int i = 0; i < arr2.length; i++) {
			char c = arr2[i];
			map2.put(c, map2.getOrDefault(c, 0) + 1);
		}


//		System.out.println("map1 = " + map1);
//		System.out.println("map2 = " + map2);

		for (Character c : map1.keySet()) {
			Integer v1 = map1.get(c);
			Integer v2 = map2.get(c);

//			System.out.println("v1 = " + v1);
//			System.out.println("v2 = " + v2);

			if(v1 != v2) {
				result = "NO";
				break;
			}
		}

		System.out.println(result);






	}



	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		T.solution(a, b);
	}
}