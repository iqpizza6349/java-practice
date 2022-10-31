package log.iqpizza6349.greedy;

import log.iqpizza6349.Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * <a href="https://www.acmicpc.net/problem/1026">백준 온라인 저지 1026번 보물</a>
 */
public class Treasure implements Solution<Integer, Void> {

    @Override
    public Integer solution() {
        try (final BufferedReader bufferedReader
                     = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(bufferedReader.readLine());
            int[][] AB = new int[2][N];
            for (int i = 0; i < 2; i++) {
                int j = 0;
                StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                while (stringTokenizer.hasMoreTokens()) {
                    AB[i][j++] = Integer.parseInt(stringTokenizer.nextToken());
                }
            }

            Arrays.sort(AB[0]);
            Integer[] copyB = Arrays.stream(AB[1]).boxed().toArray(Integer[]::new);
            Arrays.sort(copyB, Collections.reverseOrder());

            int S = 0;
            for (int i = 0; i < N; i++) {
                S += (AB[0][i] * copyB[i]);
            }
            return S;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
