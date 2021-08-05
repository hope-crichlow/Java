import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
// All you need to add in this file:
// Create an instance of the CafeUtil class
// in order to use the methods. Hint: it will need 
// to correspond with the variable name used below..
        CafeUtil appTest = new CafeUtil();

// App Test Cases

    System.out.println("----- Military Hours Test -----");
    appTest.militaryHoursTest();

    System.out.println("----- Coffee Notification Test -----");
    appTest.coffeeNotification();

    System.out.println("----- Special Alerts Test -----");
    appTest.specialsAlert();

    System.out.println("----- Leads At Day 10 Test -----");
    appTest.leadsAtDay10();
    System.out.printf("Leads at day 10: %s \n", appTest.leadsAtDay10());
    
    System.out.println("----- Display Menu Test-----");
    String[] menu1 = {
        "drip coffee -- $1.50",
        "cappucino -- $3.50",
        "latte -- $4.50",
        "mocha -- $3.50"
        };
    String[] menu2 = {
        "bagel -- $1.50",
        "avocado toast -- $6.50",
        "croissant -- $4.00",
        "quiche -- $2.00"
        };
    System.out.println("----- Menu 1-----");
    appTest.displayMenu(menu1);
    System.out.println("----- Menu 2-----");
    appTest.displayMenu(menu2);
    
    System.out.println("----- Get Order Total Test-----");
    double[] lineItems = {3.5, 1.5, 4.0, 4.5};
    System.out.printf("Order total: %s \n",appTest.getOrderTotal(lineItems));

    System.out.println("----- Get Highest Price Test-----");
    double[] priceIndex = {1.5, 3.5, 4.5, 3.5, 1.5, 6.5, 4, 2};
    System.out.printf("Highest price: %s \n",appTest.getHighestPrice(priceIndex));
    
    System.out.println("----- Get Raffle Winners Test-----");
    String[] customers = {
        "Cindhuri", "Noah", "Sam", "Jimmy", 
        "Ian Curtis", "Ada", "Brandon Stantman", 
        "Zoe", "Jesse"};
    System.out.println(appTest.raffleWinners(customers));
        
    }
}
