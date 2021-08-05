import java.util.Random;

public class PuzzleJava {

// Create an instance of Random in order to use methods from the Random Library
    Random randMachine = new Random();

// getTenRolls
// Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 
    public int[] getTenRolls(){
        int[] tenRolls = new int[10];
        for(int i=0; i < 10; i++){
            tenRolls[i] = randMachine.nextInt(21);
        }
        return tenRolls;
    }

// getRandomLetter
// Write a method that will:
// Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
// Generate a random index between 0-25, and use it to pull a random letter out of the array.
// Return the random letter.

// generatePassword
// Write a method that uses the previous method to create a random string of eight characters, and return that string.

// getNewPasswordSet
// Write a method that takes an int length as an argument and creates an array of random eight character words. The array should be the length passed in as an int.



// SENSEI BONUS: shuffleArray
// Write a method that takes an array and and mixes up all the values in a pseudo-random way. Hint: use random indexes within the array, and swap values repeatedly. 
}