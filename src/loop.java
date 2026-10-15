import java.util.Scanner;

public class loop {
    public static  void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input;
        System.out.println("Type exit to quit");

        while (true){
            input=scanner.nextLine();
            if(input.equalsIgnoreCase("exit")){
                System.out.println("Exiting program");
                break;
            }
            System.out.println("You typed " +input);
        }
        scanner.close();
    }
}
