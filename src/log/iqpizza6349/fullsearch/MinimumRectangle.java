package log.iqpizza6349.fullsearch;

import log.iqpizza6349.Solution;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/86491">프로그래머스 최소 직사각형</a>
 */
public class MinimumRectangle implements Solution<Integer, Integer> {

    @Override
    public Integer solution(Integer[][] sizes) {
        int maxWidth = 0;
        int maxLength = 0;
        for (Integer[] size : sizes) {
            int width = Math.max(size[0], size[1]);
            int length = Math.min(size[0], size[1]);
            maxWidth = Math.max(maxWidth, width);
            maxLength = Math.max(maxLength, length);
        }

        return maxWidth * maxLength;
    }
}
