package log.iqpizza6349.hash;

import log.iqpizza6349.Solution;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=java">프로그래머스 1단계 폰켓몬</a>
 */
public class PhoneCatMon implements Solution<Integer, Integer> {

    @Override
    public Integer solution(final Integer[] nums) {
        final int length = nums.length;
        final Set<Integer> pokemon = Arrays.stream(nums).collect(Collectors.toSet());
        return Math.min(pokemon.size(), length / 2);
    }
}
