package isDivisible;
import java.util.Scanner;
//Write a method that returns whether a is divisible by b.
//
//Your method signature should be
//
//public boolean isDivisible(int a, int b)
public class IsDivisible {
    public static void main(String[] args) {
        int a;
        int b;
        boolean c;
        System.out.println("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = Divisible(a,b);
        if(c){
            System.out.println("Yes! "+ a +" is divisible by "+ b);
        }
        else{
            System.out.println("No! "+ a +" is not divisible by "+ b);
        }
    }
    private static boolean Divisible(int A, int B) {
        return A % B == 0;
    }
}
