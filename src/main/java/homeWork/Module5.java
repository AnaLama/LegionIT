package homeWork;

import java.util.*;

import static utils.Utils.*;

public class Module5 {
    public String getDay(int day) {
        ArrayList<String> daysName = new ArrayList<>();
        daysName.add("Monday");
        daysName.add("Tuesday");
        daysName.add("Wednesday");
        daysName.add("Thursday");
        daysName.add("Friday");
        daysName.add("Saturday");
        daysName.add("Sunday");
        if (day > 0 && day < 8) {
            return daysName.get(day - 1);
        }
        return "Error";
    }

    // 2 The online Toys store has 5 different products – Bat mobile (ID12), Light Saber(ID45), Wonder Woman (ID6),
// Hello Kitty Bag(ID201), and Junior QA Analyst Doll (ID56). Each product has its own unique ID. Please create a Method
// “public String getToyById(int id)” which will build the hashmap of ids/products described above
// (Hashmap<Integer, String>) and return the name of the toy by ID. For example, calling getToyById(6) from the main method
// will return and print “Wonder Woman”.
//Additional requirement: If there is no product with an id specified in the call, return “No such Toy” String instead.
// For example calling getToyById(999) will return and print “No such Toy”.
//Optional task:
//Instead of providing the id, get the user output by using the Scanner. Here is an example:
//Get user input of id using Scanner class
    public String getToysById(int id) {
        HashMap<Integer, String> toysName = new HashMap<>();
        toysName.put(12, "Bat mobile");
        toysName.put(45, "Light Saber");
        toysName.put(6, "Wonder Woman");
        toysName.put(201, "Hello Kitty Bag");
        toysName.put(56, "Junior QA Analyst Doll");
        return toysName.getOrDefault(id, "No such Toy");
    }

// 3 The program should receive an ArrayList of Strings and print all the words with no duplicates.
//for example: input [Steve, Tim, Lucy, Steve, Pat, Angela, Tom, Tim, Anna, Lucy]
//output:[Steve, Tim, Lucy, Pat, Angela, Tom, Anna]

    public ArrayList<String> printNames(ArrayList<String> names) {
        if (names.size() != 0) {
            Collections.sort(names);
            for (int i = 0; i < names.size() - 1; i++) {
                if (names.get(i).equals(names.get(i + 1))) {
                    names.remove(i);
                }

            }
            return names;
        }
        return new ArrayList<>();
    }

    // self training
// Given an array of ints, return true if the array contains a 2 next to a 2 somewhere
//has22([1, 2, 2]) → true
//has22([1, 2, 1, 2]) → false
//has22([2, 1, 2]) → false
    public boolean has22(int[] array) {
        if (array != null && array.length != 0) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] == array[i-1]) {

                    return true;
                }
            }
            return false;
        }
        return false;
    }
// 5 Given an array of ints, return true if the array contains no 1's and no 3's.
//lucky13([0, 2, 4]) → true
//lucky13([1, 2, 3]) → false
//lucky13([1, 2, 4]) → false

    public boolean lucky13(int[] array) {
        if (array != null && array.length != 0) {
            int count1 = 0;
            int count3 = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {
                    count1++;
                } else if (array[i] == 3) {
                    count3++;
                }
            }
            return (count1 == 0 || count3 == 0);

        }
        return false;
    }
// Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
// The array length will be at least 1.
//maxTriple([1, 2, 3]) → 3
//maxTriple([1, 5, 3]) → 5
//maxTriple([5, 2, 3]) → 5

    public int getMax(int[] array) {
        if ((array != null && array.length % 2 != 0)) {
            int max = array[0];
            if (max < array[array.length / 2]) {
                max = array[array.length / 2];
            }
            if (max < array[array.length - 1]) {
                max = array[array.length - 1];
            }
            return max;
        }
        return Integer.MIN_VALUE;
    }
//// 7 Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be
// less than 4.
//    arrayFront9([1, 2, 9, 3, 4]) → true
//    arrayFront9([1, 2, 3, 4, 9]) → false
//    arrayFront9([1, 2, 3, 4, 5]) → false

    public boolean arrayFront9(int[] array) {
        if (array != null && array.length != 0) {
            if (array.length <= 4) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == 9) {
                        return true;
                    }
                }
                return false;
            } else                                   //if array.length > 4
                for (int i = 0; i < 4; i++) {
                    if (array[i] == 9) {
                        return true;
                    }
                }
        }
        return false;
    }
// Task 7 better option
    public boolean arrayFront91(int[] array) {
        if (array != null && array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (i < 4 && array[i] == 9) {
                    return true;
                }
            }
        }
        return false;
    }
// 8 Given a list of integers, return a list where each integer is multiplied with itself.
//square([1, 2, 3]) → [1, 4, 9]
//square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
    public int [] getSquare (int[]array){
        if (array != null && array.length != 0){
            for(int i = 0; i < array.length; i++){
                array[i] *= array[i];
            } return array;
        } return new int[]{};
    }

    public static void main(String[] args) {
        Module5 mod5 = new Module5();

        print(task + 1);
        line(line);

        System.out.println(mod5.getDay(2));
        System.out.println(mod5.getDay(5));
        System.out.println(mod5.getDay(0));
        System.out.println(mod5.getDay(8));

        print(task + 2);
        line(line);

        System.out.println(mod5.getToysById(45));
        System.out.println(mod5.getToysById(1));

        print(task + 2 + " optional");
        line(line);
        int count = 1;
        while (count < 3) {
            Scanner scanner = new Scanner(System.in);
            // ask the question in console
            System.out.print("Enter the Toy ID: ");
            // get  input as a String
            int id = Integer.parseInt(scanner.next());


            System.out.println(mod5.getToysById(id));
            count++;
        }

        print(task + 3);
        line(line);
        ArrayList<String> names = new ArrayList<>();
        names.add("Steve");
        names.add("Tim");
        names.add("Lucy");
        names.add("Steve");
        names.add("Pat");
        names.add("Angela");
        names.add("Tom");
        names.add("Tim");
        names.add("Anna");
        names.add("Lucy");
        System.out.println(mod5.printNames(names));

        print(task2 + 4);
        line(line);

        int[] array1 = new int[]{1, 2, 2};
        System.out.println(mod5.has22(array1));

        int[] array2 = new int[]{1, 2, 1, 2};
        System.out.println(mod5.has22(array2));

        int[] array3 = new int[]{2, 1, 2};
        System.out.println(mod5.has22(array3));

        print(task2 + 5);
        line(line);

        int[] array13 = new int[]{0, 2, 4};
        System.out.println(mod5.lucky13(array13));

        int[] array131 = new int[]{0, 2, 4, 1};
        System.out.println(mod5.lucky13(array131));

        int[] array132 = new int[]{1, 2, 3};
        System.out.println(mod5.lucky13(array132));

        int[] array133 = new int[]{1, 1, 4, 5, 3};
        System.out.println(mod5.lucky13(array133));

        print(task3 + 6);
        line(line);

        System.out.println(mod5.getMax(array133));

        int[] array6 = new int[]{2, 9, 50, 0, 9, 2, -1};
        System.out.println(mod5.getMax(array6));

        print(task3 + 7);
        line(line);

        System.out.println(mod5.arrayFront9(array6));  // {2, 9, 50, 0, 9, 2, -1}
        System.out.println(mod5.arrayFront9(array132)); // {1, 2, 3}
        int[] array7 = new int[]{2, 3, 50, 0, 9, 2, -1};
        System.out.println(mod5.arrayFront9(array7));

        print(task3 + 7 + " better option");
        line(line);
        System.out.println(mod5.arrayFront91(array6));  // {2, 9, 50, 0, 9, 2, -1}
        System.out.println(mod5.arrayFront91(array132)); // {1, 2, 3}
        System.out.println(mod5.arrayFront91(array7));

        print(task3 + 8);
        line(line);

        System.out.println(Arrays.toString(mod5.getSquare(array132)));
        System.out.println(Arrays.toString(mod5.getSquare(array6)));

    }
}
