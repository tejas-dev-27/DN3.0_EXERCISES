/* Normal recursion */

/*public class Main {

    public static double calculateFutureValue(double initialValue, double growthRate, int periods) {

        if (periods == 0) {
            return initialValue;
        }

        return calculateFutureValue(initialValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.05;
        int periods = 10;

        double futureValue = calculateFutureValue(initialValue, growthRate, periods);
        System.out.printf("Future Value after %d periods: %.2f%n", periods, futureValue);
    }
}*/

/*Use of memoization*/

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static double calculateFutureValue(double initialValue, double growthRate, int periods, Map<Integer, Double> memo) {

        if (periods == 0) {
            return initialValue;
        }

        if (memo.containsKey(periods)) {
            return memo.get(periods);
        }

        double futureValue = calculateFutureValue(initialValue * (1 + growthRate), growthRate, periods - 1, memo);
        memo.put(periods, futureValue);
        return futureValue;
    }

    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.05;
        int periods = 10;

        Map<Integer, Double> memo = new HashMap<>();
        double futureValue = calculateFutureValue(initialValue, growthRate, periods, memo);
        System.out.println();
        System.out.printf("Future Value after %d periods: %.2f%n", periods, futureValue);
    }
}
