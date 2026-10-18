
import java.util.Scanner;

public class NumberGuessingGame {
   public static void main(String[] args){
       Scanner scanner=new Scanner(System.in);
       int input;

       System.out.println("Enter a number to start guessing");


       while (true){
           int secretNumber=(int) (Math.random()*10) +1;
           input=scanner.nextInt();
           if (input==secretNumber){
               System.out.println("Congratulations,You WON");
               System.out.printf("You chose\"%d\"Computer chose\"%d\"" ,input,secretNumber);

           }else {
               System.out.println("You LOSE,Try Again");
               System.out.printf("You chose\"%d\"Computer chose\"%d\"" ,input,secretNumber);
           }
       }
   }
}
