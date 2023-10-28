import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
      Scanner obj = new Scanner(System.in);
      String userInput = obj.next();
      
      int outputValue = userInput.length();
      
      System.out.println("The length of given String is : "+outputValue);        
    }
}