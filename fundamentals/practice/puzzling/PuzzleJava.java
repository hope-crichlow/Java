import java.util.Random;

public class PuzzleJava {

// Create an instance of Random in order to use methods from the Random Library
    Random randMachine = new Random();

// getTenRolls
    public int[] getTenRolls(){
// Generate an array with 10 random numbers between 1 and 20 inclusive.
        int[] tenRolls = new int[10];
        for(int i=0; i < 10; i++){
            tenRolls[i] = randMachine.nextInt(21);
        }
// Return generated array
        return tenRolls;
    }

// getRandomLetter
    public char getRandomLetter(){
// Create an array within the method that contains all 26 letters of the alphabet. 
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
// Verify that array contains 26 values.
        // System.out.println("Alphabet Array Length:" + alphabet.length);
// Generate a random index between 0-25, and use it to pull a random letter out of the array.
        char randomLetter = alphabet[randMachine.nextInt(26)];
// Return the random letter.
        return randomLetter;
    }

// generatePassword
    public String generatePassword(){
// Use the previous method to create a random string of eight characters
        String password = "";
        for(int i=0; i<8; i++){
            password += this.getRandomLetter();
        }
// Verify that password string contains 8 characters
        // System.out.println("Password Length:" + password.length());
// Return created string.
        return password;
    }

// getNewPasswordSet
    public String[] getNewPasswordSet(int amountOfNewPasswords){
// Take in an int length as an argument and create an array.
        String[] passwordSet = new String[amountOfNewPasswords];
// Create an array, of the given length, of random eight character words.
        for(int i=0; i< amountOfNewPasswords; i++){
            passwordSet[i] = this.generatePassword();
        }
        return passwordSet;
    }

}