package log.iqpizza6349.greedy;

import log.iqpizza6349.Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * <a href="https://www.acmicpc.net/problem/11399">백준 온라인 저지 11399 번 ATM</a>
 */
public class ATM implements Solution<Integer, Void> {

    @Override
    public Integer solution() {
        try (final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(bufferedReader.readLine());
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int[] times = new int[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                times[i++] = Integer.parseInt(stringTokenizer.nextToken());
            }
            int sum = 0;
            Arrays.sort(times);
            for (int j = 0; j < i; j++) {
                int wait = 0;
                for (int k = j; k >= 0; k--) {
                    wait += times[k];
                }
                sum += wait;
            }

            return sum;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
