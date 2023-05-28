import java.util.Scanner;

public class BinaryPalindromeChecker {
    public static boolean isBP(int x){
        int reversed = 0;
        int original = x;
        while(x > 0){
            reversed <<= 1;
            reversed |= (x & 1);
            x >>= 1;
        }
        return  reversed == original;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(isBP(x)){
            System.out.println("Yes BP");
        } else {
            System.out.println("Nope");
        }
    }
}
