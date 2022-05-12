package homeWork1;

import static utils.Utils.*;

public class Module2 {

    public static void main(String[] args) {
        String hello = "Hello";
        String name = "Anastasiia Lamakina";
        int a = -5;
        int b = 8;
        int c = 6;
        int d = 20;
        int e = -3;
        int result1 = a + b * c;
        double result2 = d + e * (double)Math.abs(a) / b;
        double g = 2.2;
        double h = 4.15;
        double i = 1.3;
        double j = 0.5;
        double k = 8.8;
        double result3 = g * h * i * j * k;

// Write a Java program to print 'Hello' on the screen and then print your name on a separate line.
//Expected Output :
//Hello
//Vasiliy Pupkin
        print(task + 1);
        line(line);
        System.out.println(hello);
        System.out.println(name);
// Write a Java program to print the result of the following operations.
//a. -5 + 8 * 6
//b. 20 + -3*5 / 8

        print(task2 + 2);
        line(line);
        System.out.println(result1);
        System.out.println(result2);

// Write a java program with 5 decimal variables. Multiply all 5 of them and print results in the following format:
//
//number a * number b *.... equals <result>

        print(task3 +3);
        line(line);
        String n = " * number ";
        System.out.println("Number g" + n + "h" + n + "i" + n + "j" + n + "k equals " + String.format("%.4f",result3));





    }
}
