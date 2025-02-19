package leetcode.easy;
/*
* Number of Employees Who Met the Target
*/
public class NumberOfEmployeesWhoMetTheTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] == target || hours[i] > target) {
                count++;
            }
        }
        return count;
    }

}
