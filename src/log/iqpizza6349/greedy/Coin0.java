package log.iqpizza6349.greedy;

import log.iqpizza6349.Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * <a href="https://www.acmicpc.net/problem/11047">백준 온라인 저지 11047 번 동전 0</a>
 */
public class Coin0 implements Solution<Integer, Void> {

    @Override
    public Integer solution() {
        try (final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = 0, K = 0, sum = 0;
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            while (stringTokenizer.hasMoreTokens()) {
                if (N == 0) {
                    N = Integer.parseInt(stringTokenizer.nextToken());
                }
                else {
                    K = Integer.parseInt(stringTokenizer.nextToken());
                }
            }

            Integer[] coinTypes = new Integer[N];
            for (int i = 0; i < N; i++) {
                coinTypes[i] = Integer.parseInt(bufferedReader.readLine());
            }

            Arrays.sort(coinTypes, Collections.reverseOrder());
            while (K > 0) {
                int highestNumber = highestNumber(coinTypes, K, N);
                sum += (K / highestNumber);
                K %= highestNumber;
            }

            return sum;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private int highestNumber(Integer[] coinTypes, int K, int N) {
        for (int i = 0; i < N; i++) {
            if (K >= coinTypes[i]) {
                return coinTypes[i];
            }
        }

        return 1;
    }
}
