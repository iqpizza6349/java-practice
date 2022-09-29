package log.iqpizza6349;

import log.iqpizza6349.greedy.Treasure;

public class Main {

    public static void main(String[] args) {
        Solution<?> solution = new Treasure();
        System.out.println(solution.solution());
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.print((usedMemory / 1024) + " kb");
    }
}
