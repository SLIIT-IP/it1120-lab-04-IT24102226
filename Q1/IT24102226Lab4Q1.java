import java.util.Scanner;

public class IT24102226Lab4Q1 {
        public static void main(String []args) {
          
               Scanner input = new Scanner(System.in);
               System.out.println("Enter a number: ");
               int number = input.nextInt();
 
               if (number > 0) {
                  System.out.println("The number is postive. ");
               } else if (number < 0) {
                  System.out.println("The number is negative. ");
               } else {
                  System.out.println("The number is zero. ");
               }

         }
}

    