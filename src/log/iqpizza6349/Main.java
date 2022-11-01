package log.iqpizza6349;

import log.iqpizza6349.hash.PhoneCatMon;

public class Main {

    public static void main(String[] args) {
        Solution<?, Integer> solution = new PhoneCatMon();
        System.out.println(solution.solution(new Integer[]{3, 1, 2, 3}));
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.print((usedMemory / 1024) + " kb");
    }
}
