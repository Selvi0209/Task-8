import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
     Scanner obj = new Scanner(System.in);
     int userInput = obj.nextInt();
     
     if(userInput >= 60){
         
         System.out.println("Yes, he is a senior citizen");
     }
     else {
         
         System.out.println("No, he is not a Senior Citizen");
     }
         
     
    }
}