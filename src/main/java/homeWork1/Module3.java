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

    public void getPyramid (int rows){
        for (int i = rows; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
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
    }
}
