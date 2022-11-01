package log.iqpizza6349;

import log.iqpizza6349.introduction.Babbling;

public class Main {

    public static void main(String[] args) {
        Solution<?, String> solution = new Babbling();
        System.out.println(solution.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.print((usedMemory / 1024) + " kb");
    }
}
