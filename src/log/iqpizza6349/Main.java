package log.iqpizza6349;

import log.iqpizza6349.stackqueue.HateSameNumber;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution<Integer[], Integer> solution = new HateSameNumber();
        Object result = solution.solution(new Integer[]{1,1,3,3,0,1,1});
        if (result.getClass().isArray()) {
            Object[] objects = (Object[]) result;
            System.out.println(Arrays.toString(objects));
        }
        else {
            System.out.println(result);
        }
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.print((usedMemory / 1024) + " kb");
    }
}
