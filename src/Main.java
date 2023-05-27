import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int a = sc.nextInt();

        if(a > 10){
            System.out.println("Enter bigger than 10");
        } else {
            System.out.println("Small");
        }

        System.out.println("Enter name");
        String name = sc.next();

        System.out.println("Hello "+name);


    }
}