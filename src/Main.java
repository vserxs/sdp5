import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score:");
        int score = scanner.nextInt();

        System.out.println("Choose grading system:");
        System.out.println("1 - Letter Grade");
        System.out.println("2 - Pass or Fail");
        System.out.println("3 - Ten-Point Grade");

        System.out.println("Your choice:");
        int choice = scanner.nextInt();

        GradeStrategy strategy;

        if (choice == 1) {
            strategy = new LetterGradeStrategy();
        } else if (choice == 2) {
            strategy = new PassFailStrategy();
        } else if (choice == 3) {
            strategy = new TenPointGradeStrategy();
        } else {
            System.out.println("Invalid choice");
            return;
        }

        GradeCalculator calculator = new GradeCalculator(strategy);
        String result = calculator.calculateGrade(score);
        System.out.println("Result:" + result);

    }
}