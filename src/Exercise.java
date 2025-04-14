// package domain;

public class Exercise {
    public static String Calculate(int start, int end) {
        StringBuilder result = new StringBuilder();

        for (int i = Math.max(2, start); i <= end; i++) {
            if (isPrime(i)) {
                if (result.length() > 0) {
                    result.append(", ");
                }
                result.append(i);
            }
        }

        return result.toString();
    }

    private static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
