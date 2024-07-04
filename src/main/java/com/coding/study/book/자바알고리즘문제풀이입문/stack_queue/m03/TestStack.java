package chapter.book.자바알고리즘문제풀이입문.stack_queue.m03;

import java.util.Stack;

public class TestStack {

    public static void main(String[] args) {
        int count = 0;
        Stack<Integer> st = new Stack();

        st.push(1); // | 1 |
        st.push(1); // | 1 |
        st.push(4); // | 4 |
        st.push(2); // | 2 |
        st.push(2); // | 3 |

        System.out.println("st = " + st);
        int popCount = st.search(2);  // pop count, // 1은 맨위를 말함
        System.out.println("popCount = " + popCount);

        int item = st.pop();
        int item2 =st.peek();

        if (item == item2) {
            System.out.println("같누 애니팡!");
            st.pop();
            System.out.println("st = " + st);
        } else {
            System.out.println("다르누 다시껴줌");
            st.push(item);
            System.out.println("st = " + st);
        }

//        for (int i = 0; i < popCount; i++) {
//            st.pop();
//        }

//        System.out.println("st = " + st);
//        int search2 = st.search(2);
//        System.out.println("search2 = " + search2);

    }
}
