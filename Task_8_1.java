import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        int a = 8;
        int b = 9;
        int c = 7;
        int d = 6;
        
        int sumAandB = a+b;
        int sumCandD = c+d;
        
        if(sumAandB > sumCandD) {
            System.out.println("The sum of a and b is greaterthan c and d");
        } else {
             System.out.println("The sum of a and b is not greaterthan c and d");
        }
        
        
    }
}