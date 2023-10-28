import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        int d = obj.nextInt(); 
        
        int sumAandB = a+b;
        int sumCandD = c+d;
        
        if(sumAandB > sumCandD) {
            System.out.println("The sum of a and b is greaterthan c and d");
        } else {
            System.out.println("The sum of a and b is not greaterthan c and d");
        } 
        
    }
}