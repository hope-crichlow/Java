import java.util.Date;
public class AlfredQuotes {
    /*
    * Inputs: None
    * Return Type: String
    * Description: Returns a generic greeting that Alfred will say to anyone.
    */
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    /* 
    * Inputs: String name, String dayPeriod 
    *                      Assume "morning", "afternoon" or "evening".
    * Return Type: String
    * Description: Returns a greeting that includes the person's name
    *         as well as the day period. For example:
    *        "Good evening, Beth Kane. Lovely to see you."
    * Tip: Try using the String.format method for string interpolation in Java.
    */
    public String guestGreeting(String name, String dayPeriod) {

        String greetGuest = "Good " + dayPeriod + ", " + name + ". ";
        String pleasantry = "Lovely to see you.";

        return greetGuest + pleasantry;

    }

    /* 
    * Inputs: None
    * Return Type: String
    * Description: Returns a polite announcement of the current date.
    */
    public String dateAnnouncement() {

        Date todaysDate = new Date();

        return "Today is  " + todaysDate;
    }
    
    /*********************************************
    Final Challenge!
    Alfred is listening. Write a method that accepts any string of conversation. 
    If "Alexis" appears in the conversation return a snarky response, such as:
    "Right away, sir. She certainly isn't sophisticated enough for that." 
    
    If "Alfred" is in the conversation return an obliging response, for example: 
    "At your service. As you wish, naturally." 
    
    If neither name is found, return an appropriate response, for instance:
    "Right. And with that I shall retire." 
    **********************************************/

    /*
    * Inputs: String (A conversation)
    * Return Type: String (Something Alfred would say in response)
    * 
    * Tip: Use the indexOf String method
    */
    public String respondBeforeAlexis(String conversation) {

        // If "Alexis" appears in conversation
        if(conversation.indexOf("Alexis") > -1){
            // Return snarky comment
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        // If "Alfred" appears in conversation
        if(conversation.indexOf("Alfred") > -1){
            // Return an obliging response
            return "At your service. As you wish, naturally.";
        }
        // If neither name is found, return an appropriate response
        return "Right. And with that I shall retire.";
    }

    // NINJA BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
    /* 
    * Inputs: None
    * Return Type: String
    * Description: Returns a fun fact.
    */
    public String funFact(){
        return "Fun Fact: Coconut trees have the ability to convert heavy salty water into fresh useable water. Coconut trees are halophytes. Halophytes are salt-tolerant plants that grow in waters or soils with high levels of salinity. Whereas saltwater kills most plants, coconut trees grow in and around the sea unperturbed.";
    }
}

