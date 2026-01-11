import java.util.Scanner;

public class MinToYearsAndDays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (true){
            // Prompt user for mins
            System.out.println("\n================ Minutes to Year(s) and Day(s) Converter ================");
            System.out.print(">>> Enter a minute (whole number only): ");
            long user = sc.nextLong();
            sc.nextLine();
            //  1440 mins == 1 days  >> /365 = years
            double years = ((user / 1440.0) / 365);
            // >> % 1yr = remainders or the days then * to 365 days
            double remainingDays = (years % 1) * 365.0;
            System.out.println(">>> " + user + " mins is equivalent to " + ((int)(years)) + " years and " +  (int)Math.round(remainingDays) +  " days.");
            System.out.println("=========================================================================");
            
            System.out.print("Wanna try again? \n>>> Press 1 if \'YES\', any keys if \'NOT\': ");
            String response = sc.nextLine();
            if (response.equals("1")){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                continue;
            } else {
                System.out.println("\nOkay. See you next time.");
              System.out.println("=========================================================================");
                break;
            }
    }
    }
}
