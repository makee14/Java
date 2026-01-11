import java.util.Scanner;

public class OddEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (true){
            System.out.println("====== ODD or EVEN Identifier =====\n");
            
            System.out.print("Enter a number: ");
            float num = sc.nextFloat();
            sc.nextLine();
            
            if (num % 2 == 0.0){
                System.out.println(">>> "+ num + " is an EVEN number. \n");
            } else {
                System.out.println(">>>" + num + " is an ODD number. \n");
            }
            
            System.out.print("Do you want to try again? \nPress 1 if yes, any key if no: ");
            String response = sc.nextLine().trim();
            if (response.equals("1")){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                continue;
            } else {
                System.out.println("Okay. Bye!");
                break;
            }
        }
    }
}
