package chapter.book.자바알고리즘문제풀이입문.stack_queue.m01;

import java.util.Scanner;

/*
(()(()))(()

NO

)(())(
NO

((())())())(
NO
 */
public class Main {
    public void solution(char[] arr) {

        /**
         * ( () ( () ) )  (    ()
         * () () ()
         * ((( )))
         */

//		System.out.println("arr = " + Arrays.toString(arr));

		int openCount = 0;
		int closeCount = 0;

		for (int i = 0; i < arr.length; i++) {

			if (i == 0 && arr[i] == ')') {
				System.out.println("NO");
				return;
			}
			if (i == arr.length-1 && arr[i] == '(') {
				System.out.println("NO");
				return;
			}

			if (arr[i] == '(') {
				openCount++;
			} else {
				closeCount++;
			}

		}

//		System.out.println("openCount = " + openCount);
//		System.out.println("closeCount = " + closeCount);

		if (openCount == closeCount) {
			System.out.println("YES");
		} else{
			System.out.println("NO");
		}

    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

		String text = kb.next();
		char[] charArray = text.toCharArray();

		T.solution(charArray);


    }
}