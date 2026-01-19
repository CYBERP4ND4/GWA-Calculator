import java.util.Scanner;

public class GWACalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] grade = new float[8];
        float sum = 0;

        System.out.println("Enter your average for 8 subjects");

        for (int i = 0; i < grade.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            grade[i] = input.nextFloat();
        }

        for (int i = 0; i < grade.length; i++) {
            sum += grade[i];
        }
        float average = sum / grade.length;
        System.out.printf("Your GWA for this period is : %.2f", average);
    }
}
