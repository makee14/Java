import java.util.Scanner;

public class AccelerationSolver {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while (true){
        System.out.println("==============================================================");
        System.out.println("What do you want to solve? Choose the corresponding number.");
        System.out.println("[1] Acceleration");
        System.out.println("[2] Initial Velocity");
        System.out.println("[3] Final Velocity");
        System.out.println("[4] Time\n");
        
        System.out.print("Enter here: ");
        int response = sc.nextInt();
        sc.nextLine();
        double initialVelocity;
        double finalVelocity;
        double acceleration;
        double time;
        switch(response){
            case 1:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("============== MISSING: ACCELERATION ==============");
                System.out.print("Initial Velocity (m/s): ");
                initialVelocity = sc.nextDouble();
                System.out.print("Final Velocity (m/s): ");
                finalVelocity = sc.nextDouble();
                System.out.print("Time (s): ");
                time = sc.nextDouble();
                System.out.println( "\nThe average acceleration is " + String.format("%.4f",(finalVelocity - initialVelocity) / time) + " m/s^2");
                System.out.println("===================================================");
                break;
            case 2:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("============== MISSING: INITIAL VELOCITY ==============");
                System.out.print("Final Velocity (m/s): ");
                finalVelocity = sc.nextDouble();
                System.out.print("Acceleration (m/s^2): ");
                acceleration = sc.nextDouble();
                System.out.print("Time (s): ");
                time = sc.nextDouble();
                System.out.println( "\nThe initial velocity is " + String.format("%.4f",(finalVelocity - (acceleration * time))) + " m/s");
                System.out.println("=======================================================");
                break;          
            case 3:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("============== MISSING: FINAL VELOCITY ==============");            
                System.out.print("Initial Velocity (m/s): ");
                initialVelocity = sc.nextDouble();
                System.out.print("Acceleration (m/s^2): ");
                acceleration = sc.nextDouble();
                System.out.print("Time (s): ");
                time = sc.nextDouble();
                System.out.println( "\nThe final velocity is " + String.format("%.4f",(initialVelocity + (acceleration * time))) + " m/s");
                System.out.println("=====================================================");
                break;                      
            case 4:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("============== MISSING: TIME ==============");            
                System.out.print("Initial Velocity (m/s): ");
                initialVelocity = sc.nextDouble();
                System.out.print("Final Velocity (m/s): ");
                finalVelocity = sc.nextDouble();
                System.out.print("Acceleration (m/s^2): ");
                acceleration = sc.nextDouble();
                System.out.println( "\nThe missing time is " + String.format("%.4f",((finalVelocity - initialVelocity) / acceleration)) + " seconds");
                System.out.println("===========================================");
                break;       
            default:
                for(int x = 5; x > 0; x--){
                System.out.println("\n========== ERROR ==========");            
                System.out.println("     Invalid choices.");
                System.out.println("        Try again.    ");
                System.out.println("===========================\n");
                System.out.println(">>> Wait a second... " + x + " second");
                try{
                    Thread.sleep(1000);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                } catch (InterruptedException e){
                    e.printStackTrace();
                } } continue;

                 } // end of switch statements
        sc.nextLine();
        System.out.print("\nWant to try again? \nPress 1 if yes, any key if no: ");
        String tryAgain = sc.nextLine().trim();
        if (tryAgain.equals("1")){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            continue;
        } else {
            System.out.println("\nOkay. Bye.");
            break;
        }



    }
    }
}
