package log.iqpizza6349.implementation;

import log.iqpizza6349.Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.acmicpc.net/problem/2607">백준 온라인 저지 2607번 비슷한 단어</a>
 */
public class SimilarWord implements Solution<Integer> {

    @Override
    public Integer solution() {
        int answer = 0;
        try (final BufferedReader bufferedReader =
                     new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(bufferedReader.readLine());
            String standard = bufferedReader.readLine();
            final int standardLength = standard.length();

            int[] alpha = new int[26];
            for (int i = 0; i < standardLength; i++) {
                alpha[standard.charAt(i) - 'A']++;
            }

            for (int i = 1; i < N; i++) {
                int contain = 0;
                String nextWord = bufferedReader.readLine();
                final int nextLength = nextWord.length();

                int[] alphaClone = alpha.clone();

                for (int j = 0; j < nextLength; j++) {
                    if (alphaClone[nextWord.charAt(j) - 'A'] > 0) {
                        contain++;
                       alphaClone[nextWord.charAt(j) - 'A']--;
                    }
                }

                if (nextLength == standardLength - 1 && contain == nextLength) {
                    answer++;
                }
                else if (nextLength == standardLength) {
                    if (contain == standardLength - 1 || contain == standardLength) {
                        answer++;
                    }
                }
                else if (nextLength == standardLength + 1) {
                    if (contain == standardLength) {
                        answer++;
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return answer;
    }
}
