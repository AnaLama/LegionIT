package utils;

public class Utils {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static String line = "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^" + ANSI_RESET;
    public static String task = "\n" + ANSI_YELLOW + "Task # ";
    public static String task2 = "\n" + ANSI_BLUE + "Task #";
    public static String task3 = "\n" + ANSI_PURPLE + " Task #";


    public static void print(String task) {
        System.out.println(task);
    }

    public static void line(String line) {
        System.out.println(line);
    }

    public static void tabLine() {
        System.out.println("_________________________________________________________________________");
    }
}
