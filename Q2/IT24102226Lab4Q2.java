import java.util.Scanner;

public class IT24102226Lab4Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the exam marks (0-100): ");
        double examMarks = input.nextDouble();
       
        System.out.print("Enter the lab submission marks (0-100): ");
        double labMarks = input.nextDouble();
        
        System.out.print("Enter the percentage of the exam marks in final grade (0-100): ");
        double examPercentage = input.nextDouble();
       
        System.out.print("Enter the percentage of the lab submission marks in final grade (0-100): ");
        double labPercentage = input.nextDouble();

        
        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100.");
            return;
        }

        
        double finalMark = (examMarks * (examPercentage / 100)) + (labMarks * (labPercentage / 100));

        
        System.out.printf("The final mark is: %.2f%n", finalMark);
    }

    
    private static double getValidMarks(Scanner scanner) {
        double marks;
        while (true) {
            marks = scanner.nextDouble();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.print("Invalid input. Enter marks between 0 and 100: ");
            }
        }
        return marks;
    }

  
    private static double getValidPercentage(Scanner scanner) {
        double percentage;
        while (true) {
            percentage = scanner.nextDouble();
            if (percentage >= 0 && percentage <= 100) {
                break;
            } else {
                System.out.print("Invalid input. Enter percentage between 0 and 100: ");
            }
        }
        return percentage;
    }
}
