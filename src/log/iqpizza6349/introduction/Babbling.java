package log.iqpizza6349.introduction;

import log.iqpizza6349.Solution;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120956"> 프로그래머스 입문 옹알이(1) </a>
 */
public class Babbling implements Solution<Integer, String> {

    private static final String FIN = "%FIN%";
    private static final String NOT = "%NOT%";
    private static final String[] BABBLING = {"aya", "ye", "woo", "ma"};

    @Override
    public Integer solution(String[] babbling) {
        int count = 0;
        for (String babble : babbling) {
            String check = checkBabbling(babble, 0);
            if (check.equals(FIN)) {
                // 머쓱이의 옹알이로 말할 수 있다면
                count++;
            }
        }

        return count;
    }

    private String checkBabbling(String babble, int index) {
        if (babble.isBlank()) {
            return FIN;
        }
        if (index == 4) {
            return NOT;
        }

        String babbling = BABBLING[index];
        if (babble.startsWith(BABBLING[index])) {
            return checkBabbling(babble.substring(babbling.length()), (index + 1 == 4) ? index : ++index);
        }

        int idx = -1;
        for (int i = 0; i < BABBLING.length; i++) {
            if (babble.startsWith(BABBLING[i])) {
                idx = i;
                break;
            }
        }

        return (idx == -1) ? NOT : checkBabbling(babble, idx);
    }
}
