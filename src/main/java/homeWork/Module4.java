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
// 2 Given a string, write a program to check if it is palindrome or not (return boolean).
//A string is said to be palindrome if the reverse of the string is the same as string. For example, “racecar” is a
// palindrome, but “carrace” is not a palindrome. Return boolean true or false.

    public boolean isPalindrome (String str){
       if (isStringValid(str)){
           String reverse = "";
           for(int i = str.length() -1; i >=0; i--){
               reverse += str.charAt(i);
           }
           return str.equals(reverse);
       } return false;
    }

    //3 Given a string, take the last char and return a new string with the last char added at the beginning and the end,
// so "dog" will become "gdogg". The original string should be length 1 or more.

    public String getNewString (String str){
        if(isStringValid(str)){
            str = str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
        }
        return str;
    }
// 4 Return true if the given string begins with "max", except the 'm' can be anything, so "pax", "9ax" .. all count.

    public boolean maxStart (String str){
        if (isStringValid(str)){
            str = str.trim();
            return str.charAt(1) == 'a' && str.charAt(2) == 'x';
        }
        return false;
    }
// 5 Given string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both
// the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged

    public String getFizzOrBuzz (String str){
        if (isStringValid(str)){
            String str1 = "";
            str1 = str.trim().toLowerCase();
            if(str1.charAt(0) == 'f' && str1.charAt(str1.length() - 1) == 'b'){
                return "Fizz Buzz";
            } else  if(str1.charAt(0) == 'f'){
               return  "Fizz";
            } else if (str1.charAt(str1.length() - 1) == 'b'){
                return "Buzz";
            }
            return str;
        }
        return "Error";
    }
// 6 Return true if the given string contains a "bib" string, but where the middle 'i' char can be any char.
    public boolean isThereBib (String str){
        if (isStringValid(str)){
            if (str.contains("b")){
                str = str.substring(str.indexOf('b'));
                return str.charAt(2) == 'b';
            }
            return false;
        }
        return false;
    }
// 7 Given a string and a non-negative int n, return a larger string that is n copies of the original string.
    public String getStringNTimes (String str, int n){
        if(isStringValid(str) && n > 0){
            str = str.repeat(n);
            return str;
        }
        return "Error";
    }
// 8 Create a function that takes in a word and determines whether or not it is plural. A plural word is one that
// ends in "s".

    public boolean isPlural (String str){
        if(isStringValid(str)){
            str = str.trim();
            return str.charAt(str.length() -1) == 's';
        }
        return false;
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

        print(task2 + 3);
        line(line);

        System.out.println(mod4.getNewString("dog"));
        System.out.println(mod4.getNewString("red"));
        System.out.println(mod4.getNewString("xy"));

        print(task2 + 4);
        line(line);
        System.out.println(mod4.maxStart("max snacks"));
        System.out.println(mod4.maxStart("pax snacks"));
        System.out.println(mod4.maxStart("paz snacks"));

        print(task3 + 5);
        line(line);

        System.out.println(mod4.getFizzOrBuzz("fig"));
        System.out.println(mod4.getFizzOrBuzz("dib"));
        System.out.println(mod4.getFizzOrBuzz("fib"));
        System.out.println(mod4.getFizzOrBuzz("Fig"));
        System.out.println(mod4.getFizzOrBuzz("  fib "));
        System.out.println(mod4.getFizzOrBuzz("  gun"));
        System.out.println(mod4.getFizzOrBuzz(""));

        print(task3 + 6);
        line(line);

        System.out.println(mod4.isThereBib("xyzbib"));
        System.out.println(mod4.isThereBib("cob9bun"));
        System.out.println(mod4.isThereBib("xyzbac"));
        System.out.println(mod4.isThereBib(null));

        print(task4 + 7);
        line(line);

        System.out.println(mod4.getStringNTimes("Hi", 3));
        System.out.println(mod4.getStringNTimes("Hi", 8));
        System.out.println(mod4.getStringNTimes("Hi", 0));

        print(task4 + 8);
        line(line);

        System.out.println(mod4.isPlural("changes"));
        System.out.println(mod4.isPlural("change"));
        System.out.println(mod4.isPlural("dudes"));
        System.out.println(mod4.isPlural("magic"));
    }


}
