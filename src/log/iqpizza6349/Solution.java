package log.iqpizza6349;

public interface Solution<T, V> {

    default T solution() {
        return null;
    }

    default T solution(V[] objects) {
        return null;
    }

    default T solution(V[][] objects) {
        return null;
    }
}
