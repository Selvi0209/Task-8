import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int userInput = obj.nextInt();
        
        if(userInput % 2 == 0) {
           System.out.println("Yes, it is an even number");
        } else { 
            System.out.println("No, it is not an even number");
        }
    }
}