package log.iqpizza6349;

import log.iqpizza6349.greedy.MeetingRoom;

public class Main {

    public static void main(String[] args) {
        Solution<?> solution = new MeetingRoom();
        System.out.println(solution.solution());
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.print(usedMemory + " bytes");
    }
}
