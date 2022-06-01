package homeWork_Module7;

import java.util.Arrays;
import static utils.Utils.*;

public class Module7SelfTraining {
    // 1 You're in the midst of creating a typing game.
//Create a function that takes in two arrays: the array of user-typed words, and the array of correctly-typed words and
// outputs an array containing 1s (correctly-typed words) and -1s (incorrectly-typed words).
//Inputs:
//User-typed Array: ["cat", "blue", "skt", "umbrells", "paddy"]
//Correct Array: ["cat", "blue", "sky", "umbrella", "paddy"]
//Output: [1, 1, -1, -1, 1]  
    public static String[] getTypedWords(String[] array1, String[] array2) {
        if (array1 != null && array2 != null && array1.length == array2.length && array1.length != 0) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i].equals(array2[i])) {
                    array1[i] = "1";
                } else {
                    array1[i] = "-1";
                }
            }
            return array1;
        }
        return new String[]{};
    }

    // 2 Create a method that accepts a string (of a person's first and last name) and returns a string with the first and
// last name swapped.
//Examples
//nameShuffle("Donald Trump") ➞ "Trump Donald"
//nameShuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie"
//nameShuffle("Seymour Butts") ➞ "Butts Seymour"
    public static String getSwappedName(String name) {
        if (isStringValid(name)) {
            String[] arr = name.split(" ");
            if (arr.length == 2) {
                name = arr[1] + " " + arr[0];
                return name;
            }
        }
        return "Error";
    }
// 3 Create a function that takes a word and returns true if the word has two consecutive identical letters.
//Examples
//doubleLetters("loop") ➞ true
//doubleLetters("yummy") ➞ true
//doubleLetters("orange") ➞ false

    public static boolean isIdenticalLetter(String str) {
        if (isStringValid(str)) {
            str = str.trim().toLowerCase();
            char [] arr = str.toCharArray();
            Arrays.sort(arr);
            int count = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == arr[i - 1]) {
                    count++;
                }
            }
            return count > 0;
        }
        return false;
    }

    // 4 Andy, Ben and Charlotte are playing a board game. The three of them decided to come up with a new scoring system.
// A player's first initial ("A", "B" or "C") denotes that player scoring a single point. Given a string of capital
// letters, return an array of the players' scores.
//For instance, if ABBACCCCAC is written when the game is over, then Andy scored 3 points, Ben scored 2 points,
// and Charlotte scored 5 points, since there are 3 instances of letter A, 2 instances of letter B, and 5 instances of
// letter C. So the array [3, 2, 5] should be returned.
//Examples
//calculateScores("A") ➞ [1, 0, 0]
//calculateScores("ABC") ➞ [1, 1, 1]
//calculateScores("ABCBACC") ➞ [2, 2, 3]
    public static int[] calculateScore(String str) {
        if (isStringValid(str.trim())) {
            str = str.toUpperCase();
            char[] arr = str.toCharArray();
            int countA = 0;
            int countB = 0;
            int countC = 0;
            for (char c : arr) {
                if (c == 'A') {
                    countA++;
                } else if (c == 'B') {
                    countB++;
                } else if (c == 'C') {
                    countC++;
                } else return new int[]{};
            }
            return new int[] {countA, countB, countC};
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        print(task + 1);
        line(line);

        String[] array1 = new String[]{"cat", "blue", "skt", "umbrells", "paddy"};
        String[] array2 = new String[]{"cat", "blue", "sky", "umbrella", "paddy"};

        System.out.println(Arrays.toString(getTypedWords(array1, array2)));

        print(task2 + 2);
        line(line);

        System.out.println(getSwappedName("Donald Trump"));
        System.out.println(getSwappedName("Rosie O'Donnell"));

        print(task3 + 3);
        line(line);

        System.out.println(isIdenticalLetter("loop"));
        System.out.println(isIdenticalLetter("YuMmy"));
        System.out.println(isIdenticalLetter("pipe"));
        System.out.println(isIdenticalLetter("orange"));

        print(task4 + 4);
        line(line);

        System.out.println(Arrays.toString(calculateScore("AAACCBB")));
        System.out.println(Arrays.toString(calculateScore("CCABABC")));
        System.out.println(Arrays.toString(calculateScore("lldjfire")));
        System.out.println(Arrays.toString(calculateScore(" ")));
    }

}

