package log.iqpizza6349.greedy;

import log.iqpizza6349.Solution;

import java.util.Scanner;

/**
 * <a href="https://www.acmicpc.net/problem/2839">백준 온라인 저지 2839 번 설탕 배달</a>
 */
public class SugarDelivery implements Solution<Integer> {

    @Override
    public Integer solution() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N == 4 || N == 7) {
            return -1;
        }
        else if (N % 5 == 0) {
            return N / 5;
        }
        else if (N % 5 == 1 || N % 5 == 3) {
            return (N / 5) + 1;
        }
        else if (N % 5 == 2 || N % 5 == 4) {
            return (N / 5) + 2;
        }
        return -1;
    }
}
