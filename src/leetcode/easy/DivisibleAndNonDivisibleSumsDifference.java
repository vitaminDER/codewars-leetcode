package leetcode.easy;
/*
 * Divisible and Non-divisible Sums Difference
 * */
public class DivisibleAndNonDivisibleSumsDifference {
    public int differenceOfSums(int n, int m) {
        int divisible = 0;
        int notDivisible = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                divisible += i;
            } else {
                notDivisible += i;
            }
        }
        return notDivisible - divisible;
    }
}
