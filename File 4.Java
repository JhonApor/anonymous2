import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		
		String name;
        String x = "a";
        String y = "b"; 
        
        
        System.out.println("1. Which of the following is true about java programming language?" 
        +" \n a. it was created in 1995. \n b. it was developed by Bjarne. \n c.");
        
         
        Scanner userInput = new Scanner(System.in);

        
        name = userInput.next();
              System.out.println("Enter your answer:");

        while (true) {
            String input = userInput.next();
            if (input.equals("A")) {
                System.out.println("Correct Answer is : A");
            
           } else if (input==y)
                System.out.println("Incorrect Answer");

           
              
            
        }
	}
}