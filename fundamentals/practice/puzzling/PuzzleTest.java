import java.util.Random;
import java.util.Arrays;

public class PuzzleTest {
    public static void main(String[] args){

        PuzzleJava appTest = new PuzzleJava();

// App Test Cases
        // System.out.println("----- Get Ten Rolls Test -----");
        // int[] tenRolls = appTest.getTenRolls();
        // System.out.println(Arrays.toString(tenRolls));
        
        // System.out.println("----- Get Random Letter Test -----");
        // appTest.getRandomLetter();
        // System.out.println("Random Letter: " + appTest.getRandomLetter());
        

        System.out.println("----- Generate Password Test -----");
        appTest.generatePassword();
        System.out.println("Generated Password: " + appTest.generatePassword());
        
        // System.out.println("----- Get New Password Set Test -----");
        // appTest.getNewPasswordSet();
        // System.out.println("----- Shuffle Array Test -----");
        // appTest.shuffleArray();
    }
}