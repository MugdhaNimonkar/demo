import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //Sum of two numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();    
        System.out.println("Enter the no"); 
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("sSum of num1 and num2 is :" +sum);
    }
    
}



