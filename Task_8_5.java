import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        
        if(userInput == 1) {
            System.out.println("No, the given input is not a prime number.");
            return;
        }
        
        for(int i = 2; i < userInput; i++) {
            if(userInput % i == 0) {
                System.out.println("No, the given input is not a prime number.");
                return;
            }
        }
        
        System.out.println("Yes. The given input is a prime number");        
    }
}