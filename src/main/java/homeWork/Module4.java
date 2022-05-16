package homeWork;

import static utils.Utils.*;

public class Module4 {
    // 1. print if one string is part of another: for example: String a = Category, String b = Cat, compareStrings(a, b)
//output "Cat is the part of Category"
    public void compareString(String a, String b) {
        if (isStringValid(a) && isStringValid(b)) {
            a = a.toLowerCase();
            b = b.toLowerCase();
            if (a.equals(b)) {
                System.out.println("Strings are equals");
            } else if (a.length() < b.length()) {
                if (b.contains(a)) {
                    System.out.println(a + " is the part of " + b);
                } else {
                    System.out.println(a + " is not the part of " + b);
                }
            } else if (a.contains(b)) {
                System.out.println(b + " is the part of " + a);
            } else {
                System.out.println(b + " is not the part of " + a);
            }
        } else {
            System.out.println("Can not compare Strings");
        }
    }
// Given a string, write a program to check if it is palindrome or not (return boolean).
//A string is said to be palindrome if the reverse of the string is the same as string. For example, “racecar” is a
// palindrome, but “carrace” is not a palindrome. Return boolean true or false.

    public boolean isPalindrome (String str){
        boolean flag = false;
       if (isStringValid(str)){
           String reverse = "";
           for(int i = str.length() -1; i >=0; i--){
               reverse += str.charAt(i);
           } if (str.equals(reverse)){
               flag = true;
           }
       } return flag;
    }
    public static void main(String[] args) {
        Module4 mod4 = new Module4();

        print(task + 1);
        line(line);

        mod4.compareString("Cat", "Category");
        mod4.compareString("Category", "cat");
        mod4.compareString("Cat", "Current");
        mod4.compareString("category", "Category");
        mod4.compareString(null, "Category");

        print(task + 2);
        line(line);

        System.out.println(mod4.isPalindrome("racecar"));
        System.out.println(mod4.isPalindrome("carrace"));

    }


}
