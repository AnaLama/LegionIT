package homeWork1;

import static utils.Utils.*;

public class Module3 {

    public void printNumbers(int a) {
        if (a > 0 && a < 101) {
            for (int i = a; i < 101; i++) {
                if (i % 2 == 0 && i % 3 == 0) {
                    System.out.println(i + " is divisible by two and three");
                } else if (i % 3 == 0) {
                    System.out.println(i + " is divisible by three");
                } else if (i % 2 == 0) {
                    System.out.println(i + " is odd");
                } else {
                    System.out.println(i + " is even");
                }
            }
        } else {
            System.out.println("Error");
        }
    }
// Create a method that will receive 2 numbers and calculate the summary of all the numbers between them.
//for example: a=1; b=3, the result should be 6 (1+2+3)

    public void getSum(int b, int c) {

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        int sum = 0;
        for (int i = b; i <= c; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void getPyramid(int rows) {
        for (int i = rows; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void isNeighbor(int n) {
        if (100 - n <= 10) {
            System.out.println("nearHundred (" + n + ") --> true");
        } else {
            System.out.println("nearHundred (" + n + ") --> false");
        }
    }
//Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. Note that the %
//            "mod" operator computes remainders, so 17 % 10 is 7.

    public void isLastDigitTheSame(int l, int m) {
        if (l >= 0 && m >= 0) {
            if (l % 10 == m % 10) {
                System.out.println("lastDigit (" + l + ", " + m + ") --> true");
            } else {
                System.out.println("lastDigit (" + l + ", " + m + ") --> false");
            }
        } else {
            System.out.println("Error - there is at least one negative number");
        }
    }
// Given three int values, a b c, print the largest.
//  public void maxInt (int a, int b, int c){
//        int max = Integer.MIN_VALUE;
//        if (b <= a && a > c){
//            max = a;
//        } else if (a < b && b >= c){
//            max = b;
//        } else if (a < c && c > b){ // если убрать из условий равно, предупреждение исчезнет, но будет выдавать max min value, если b = c
//            max = c;
//        }
//        System.out.println("intMax (" + a + ", " + b + ", " + c + ") -->" + max);
//    }

    public void maxInt1(int a, int b, int c) {
        int max;
        if (a <= b) {
            max = b;
        } else if (b <= c) {
            max = c;
        } else
            max = a;

        System.out.println("intMax (" + a + ", " + b + ", " + c + ") -->" + max);
    }

    // Everyone loves the number 7. Given two int values, a and b, print true if either one is 7. Or if
    // their sum or difference is 7.
    public void loveSeven(int a, int b) {
        if (Math.abs(a) == 7 || Math.abs(b) == 7) {
            System.out.println("loveSeven (" + a + ", " + b + ") --> true");
        } else if (a + b == 7 || a - b == 7 || b - a == 7) {
            System.out.println("loveSeven (" + a + ", " + b + ") --> true");
        } else
            System.out.println("loveSeven (" + a + ", " + b + ") --> false");
    }

// Your cell phone rings. Print true if you should answer it. Normally you answer, except in the morning you only answer
// if it is your mom calling. In all cases, if you are asleep, you do not answer.
    public void answerCell ( boolean isMorning, boolean isMom, boolean isAsleep) {
        if ( isMorning && isMom  && isAsleep){
            System.out.println("answerCall (" + isMorning + ", " + isMom + ", " + isAsleep + ") --> true");
        } else
            System.out.println("answerCall (" + isMorning + ", " + isMom + ", " + isAsleep + ") --> false");
    }

// Create a function that determines whether or not it's possible to split a pie fairly given these three parameters:
//Total number of slices.  Number of recipients. How many slices each person gets.The function will be in this form:
//equalSlices(total slices, no. recipients, slices each)
// equalSlices(11, 5, 2) ➞ true 5 people x 2 slices each = 10 slices < 11 slices

    public void isEqual (int total, int people, int slices){
        if (people * slices <= total){
            System.out.println("equalSlices (" + total + ", " + people + ", " + slices + ") --> true");
        } else
            System.out.println("equalSlices (" + total + ", " + people + ", " + slices + ") --> false");

    }

    public static void main(String[] args) {
        print(task + 1);
        line(line);

        Module3 module3 = new Module3();
        module3.printNumbers(1);

        print(task2 + 2);
        line(line);

        module3.getSum(1, 3);

        print(task3 + 3);
        line(line);

        module3.getPyramid(7);

        print(task + 4);
        line(line);

        module3.isNeighbor(90);
        module3.isNeighbor(89);

        print(task2 + 5);
        line(line);

        module3.isLastDigitTheSame(7, 17);
        module3.isLastDigitTheSame(6, 17);
        module3.isLastDigitTheSame(3, 113);
        module3.isLastDigitTheSame(-7, 17);

        print(task3 + 6);
        line(line);

//        module3.maxInt(2, 3, 3);
//        module3.maxInt(2, -3, 3);
//        module3.maxInt(-2, 0, -3);

        module3.maxInt1(2, 3, 3);
        module3.maxInt1(2, -3, 3);
        module3.maxInt1(-2, 0, -3);

        print(task + 7);
        line(line);

        module3.loveSeven(7, 4);
        module3.loveSeven(4, 1);
        module3.loveSeven(2, 5);
        module3.loveSeven(-7, 4);

        print(task2 + 8);
        line(line);
        module3.answerCell(true, true, true);
        module3.answerCell(true, true, false);
        module3.answerCell(false, false, false);

        print(task3 + 9);
        line(line);

        module3.isEqual(11, 5, 2);
        module3.isEqual(11, 5, 3);
        module3.isEqual(8, 3, 2);
        module3.isEqual(8, 3, 3);
        module3.isEqual(24, 12, 2);
}
}
