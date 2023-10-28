import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
     Scanner obj = new Scanner(System.in);
      long userInput = obj.nextInt();
      
      int totalDigit = 0;
      
      while(userInput != 0){
         userInput = userInput/10;
         totalDigit++;
      }
      
      System.out.println("Total number of digits in the entered integer are : "+totalDigit);      
    }
}