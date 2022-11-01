package log.iqpizza6349;

import log.iqpizza6349.fullsearch.MinimumRectangle;

public class Main {

    public static void main(String[] args) {
        Solution<?, Integer> solution = new MinimumRectangle();
        System.out.println(solution.solution(new Integer[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.print((usedMemory / 1024) + " kb");
    }
}
