import java.util.Date;
import java.util.ArrayList;



// like an entry point, cafeutil is only a class with different methods
// inside testjava, we are pressin a button, 
// cafeutil we have different methods but we only need to prss the ones we need
// 
public class CafeUtil {
    
    public int getStreakGoal() { 
        // You do not need to code here, this is an example method
        int sum = 0;
        for (int x = 0; x < 11; x++ ) {
            
            sum += x;
        }
    
        return sum; 
    }

    
    public double getOrderTotal(double[] prices) {
        // YOUR CODE HERE
        double i; 
        double sum = 0;
        for (int x = 0; x < prices.length; x++) {
            i = prices[x];
            
            sum += i;

        } 
        return sum; 
    } 

    
    public void displayMenu(ArrayList<String> menuItems) {
        // YOUR CODE HERE 
        for (int x = 0; x < menuItems.size(); x++) {
            System.out.println(x+1 + " " + menuItems.get(x) );
        }
    }
    
    public String addCustomer(ArrayList<String> customers ) {
        // YOUR CODE HERE
        System.out.println("Please Enter Your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, ") ;

        return "hrllo";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

