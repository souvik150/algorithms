import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDoors = sc.nextInt();

        int numOpenDoors = countOpenDoors(numDoors);

        System.out.println("Number of doors open: " + numOpenDoors);
        System.out.println("Number of doors closed: " + (numDoors - numOpenDoors));
    }

    public static int countOpenDoors(int numDoors) {
        int count = 0;
        for (int door = 1; door <= numDoors; door++) {
            if (isDoorOpen(door)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isDoorOpen(int door) {
        int numFactors = 0;
        for (int i = 1; i <= door; i++) {
            if (door % i == 0) {
                numFactors++;
            }
        }
        return numFactors % 2 == 1;
    }
}