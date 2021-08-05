// import java.util.ArrayList;
public class CafeUtil {

//(void) militaryHoursTest
// Write a method that prints all the numbers from 0 to 23.
    public void militaryHoursTest(){
        for(int i=0; i<24; i++){
            System.out.println(i);
        }
    }

// (void) coffeeNotification
// Starting at 0 and ending after 23, for every hour in the day, print out each hour as a string like so: "It's 4:00 hours, do you need a coffee break?". 
    public void coffeeNotification(){
        for(int i=0; i<24; i ++){
            System.out.println("It's " + i + ":00 hours, do you need a coffee break?");
        }
    }

// (void) specialsAlert
// Starting at 6 and ending at 15, iterate through each number, representing an hour, if the hour is a multiple of 3, print "Buy one get one free for the next 15 minutes!" Otherwise, print "Stay tuned for deals announced throughout the day."
    public void specialsAlert(){
        for(int i=6; i<16; i++){
            if(i % 3 == 0){
                System.out.println("Buy one get one free for the next 15 minutes");
            } else {
                System.out.println("Stay tuned for deals announced throughout the day."); 
            }
        }
    }


// (int) leadsAtDay10
// Starting with 1, sum together all the numbers from 1 to 10. This will calculate how many leads a sales rep needs to have after 10 days to get the reward for that period. Return the sum after it has been calculated.
    public int leadsAtDay10(){
        int sum = 0;

        for(int i=1; i<11; i ++){
            sum += i;
        }
        // System.out.println(sum);
        return sum;
    }

// (void) displayMenu
// Given an array of menu item names (strings), iterate through the array and print all the menu items in the array.
    public void displayMenu(String[] menu){
        // System.out.println(menu);
        // System.out.println(menu.length);
        for(String menuItem : menu){
            System.out.println(menuItem);
        }
    }

// (double) getOrderTotal
// Given an array of the prices from the items in a customer order, iterate over the array to sum each item price and to return the total
    public double getOrderTotal(double[] order){
        double orderTotal = 0.00;
        for(double eachPrice : order){
            orderTotal += eachPrice;
        }
        return orderTotal;
    }


// (double) getHighestPrice
// Given an array of all the item prices, find the highest price for any item


// (ArrayList<String>) getRaffleWinners
// In your method, create an empty array,  winners . Iterate over a given array of customers and add every 4th customer to the winners array. Return the winners array, when you've added all the winners.



}