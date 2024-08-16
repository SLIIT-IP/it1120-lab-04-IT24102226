import java.util.Scanner;

public class IT24102226Lab4Q3 {
       public static void main(String []args) {
               Scanner input = new Scanner(System.in);
               System.out.print("Enter a number: ");
               int no = input.nextInt();

               String msg;
               msg=(no<0)? "negative" : (no>0)? "positive" : "The number is zero"; 

               System.out.println(msg);
              
        }
}

