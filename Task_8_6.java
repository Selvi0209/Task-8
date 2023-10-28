import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
      Scanner obj = new Scanner(System.in);
      int userInput = obj.nextInt();
      
      long outputValue = 1;
      
      for(int i = 1; i <= userInput; i++) {
          outputValue = outputValue*i;
      }
      
      System.out.printf("The factorial of %d = %d", userInput, outputValue);
           
    }
}