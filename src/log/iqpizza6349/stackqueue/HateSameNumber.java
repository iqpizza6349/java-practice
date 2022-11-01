package log.iqpizza6349.stackqueue;

import log.iqpizza6349.Solution;

import java.util.Stack;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12906">프로그래머스 같은 숫자는 싫어</a>
 */
public class HateSameNumber implements Solution<Integer[], Integer> {

    @Override
    public Integer[] solution(Integer[] arr) {
        Stack<Integer> integerStack = new Stack<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                integerStack.add(arr[i]);
            }
        }

        integerStack.add(arr[arr.length - 1]);
        return integerStack.toArray(Integer[]::new);
    }
}
