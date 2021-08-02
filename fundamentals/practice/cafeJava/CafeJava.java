public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.0;
        double lattePrice = 2.5;
        double cappucinoPrice = 2.75;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //

        // Cindhuri ordered a coffee. Show her the correct status message.

            // If isReadyOrder1 == true, print ready message + displayToalMessage + dripCoffeePrice, else print pendingMessage
        if(isReadyOrder1 == true){
            System.out.println(customer1 + readyMessage + ". " + displayTotalMessage + dripCoffeePrice + ".");
        } else {
            System.out.println(customer1 + pendingMessage + ".");
        }

        // Noah ordered a cappucino. Check the status of his order and let him know. If it is ready, also tell him his total.
        System.out.println(generalGreeting + customer4);
        if(isReadyOrder2 == true){
            System.out.println(customer4 + readyMessage + ". " + displayTotalMessage + cappucinoPrice + ".");
        } else {
            System.out.println(customer4 + pendingMessage + ".");
        }

        // Sam just order 2 lattes, and would like the total up front. Also give them their order status.
        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + lattePrice*2 );

        if(isReadyOrder3 == true){
            System.out.println(customer2 + readyMessage + ". " + displayTotalMessage + lattePrice*2 + ".");
        } else {
            System.out.println(customer2 + pendingMessage + ".");
        }

        // Jimmy just realized he was charged for a coffee but had ordered a latte. Tell him his new total (what he owes) to make up the difference.
        System.out.println(generalGreeting + customer3);
        System.out.println("Your new total is $" + (lattePrice-dripCoffeePrice) + ".");
    }
}
