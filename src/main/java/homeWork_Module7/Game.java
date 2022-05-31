package homeWork_Module7;
// Create Class "Game" with static method and enum
//The enum "GameType" will list three types of games: soccer, hockey, and rugby.
//The method
//public static void writeNumOfPlayersPerTeam(GameType game){}
//will check the type and create a new file with the name of the game as the name of the file
//In the file, it will print 11 in the case of Soccer, 6 if it is Hockey, and 15 for Rugby.
//Please use a switch case.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {
    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }
    public static void createFile (String fileName){
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeToFile(String fileName, String text){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeNumOfPlayersPerTeam(GameType type){
        switch (type){
            case SOCCER:
               createFile("Soccer.txt");
               writeToFile("Soccer.txt", "The number of players is 11");
                break;
            case HOCKEY:
                createFile("Hockey.txt");
                writeToFile("Hockey.txt", "The number of players is 6");
                break;
            case RUGBY:
                createFile("Rugby.txt");
                writeToFile("Rugby.txt", "The number of players is 15");
                break;
            default:
                System.out.println("No such game");
        }
    }

    public static void main(String[] args) {
        writeNumOfPlayersPerTeam(GameType.SOCCER);
        writeNumOfPlayersPerTeam(GameType.HOCKEY);
        writeNumOfPlayersPerTeam(GameType.RUGBY);
    }
}
