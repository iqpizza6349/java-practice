package log.iqpizza6349.greedy;

import log.iqpizza6349.Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * <a href="https://www.acmicpc.net/problem/1931">백준 온라인 저지 1931 번 회의실 배정</a>
 */
public class MeetingRoom implements Solution<Integer, Void> {

    @Override
    public Integer solution() {
        try (final BufferedReader bufferedReader
                     = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(bufferedReader.readLine());
            int[][] rooms = new int[N][2];
            for (int i = 0; i < N; i++) {
                StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                rooms[i][0] = Integer.parseInt(stringTokenizer.nextToken());
                rooms[i][1] = Integer.parseInt(stringTokenizer.nextToken());
            }

            Arrays.sort(rooms, (o1, o2) -> {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            });

            int maxCount = 0;
            int prevEndTime = 0;
            for (int i = 0; i < N; i++) {
                if (prevEndTime <= rooms[i][0]) {
                    prevEndTime = rooms[i][1];
                    maxCount++;
                }
            }

            return maxCount;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
