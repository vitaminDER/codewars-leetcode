package codewars.kata_8;

//String repeat
/*
public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }

}
*/

//SUM OF POSITIVE
/*
class Solution {
    public static int sum(int[] arr){
        int sum = 0;
        for (int num : arr) {
            if(num > 0 ) sum = sum + num;
        }
    return sum;
    }
 */

//Find the smallest integer in the array
/*
import java.util.Arrays;
public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);

        return args[0];
    }
}*/

//Basic Mathematical Operations
/*
public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {

        if(op == "+") {
            return v1 + v2;
        }
        if (op == "*") {
            return v1 * v2;
        }
        if (op == "-") {
            return v1 - v2;
        }
        if (op == "/") {
            return v1 / v2;
        }
        return 0;
    }

    }
*/

//RETURNING STRINGS
/*
class Kata_8.Kata8 {
    public static String greet(String name) {
        return "Hello, " + name + " how are you doing today?";
    }
}
*/

//Are You Playing Banjo?
/*
public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        if(name.startsWith("R")  || name.startsWith("r")) {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }
}
*/

//CALCULATE BMI
/*
public class Calculate {
    public static String bmi(double weight, double height) {
        double bmi = (weight / Math.pow(height, 2));
        if (bmi <= 18.5) {
            return "Underweight";
        }
        if (bmi <= 25.0) {
            return "Normal";
        }
        if (bmi <= 30.0) {
            return "Overweight";
        }
        if (bmi > 30) {
            return "Obese";
        }
        return null;
    }
}
*/

//Square(n)Sum
/*
public class Kata_8.Kata {
    public static int squareSum(int[] n) {
        int sum = 0;
        for(int num : n) {
            sum += num * num;
        }
        return sum;
    }
}
*/

//REVERSED STRINGS
/*
public class Kata_8.Kata {

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}
*/

//Grasshopper - Summation
/*
public class GrassHopper {

    public static int summation(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
*/

//Century From Year
/*
public class Solution {
    public static int century(int number) {
        int count = 0;

        for(int i = 0; i < number; i+=100) {
            if(count < number) {
                count++;
            }
        }
        return count;
    }
}
*/

//Is n divisible by x and y?
/*
public class DivisibleNb {
    public static boolean isDivisible(long n, long x, long y) {
        boolean result;
        result = (n % x == 0 && n % y == 0) ? true : false;
        return result;
    }
}
*/












