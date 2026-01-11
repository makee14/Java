import java.util.Scanner;

public class bmiSolver{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        while(true){
        
            System.out.println("\n============= BMI CALCULATOR ============\n");
            
            System.out.print("Height (m): ");
            double height = input.nextDouble();
            input.nextLine();
            
            System.out.print("Weight (kg): ");
            String weight_initial = input.nextLine();
            double weight = Double.parseDouble(weight_initial.strip());
            
            
            System.out.println("================ RESULTS ================\n");
            double bmi = weight/(height * height);
            System.out.println("BMI: " + String.format("%.2f", bmi));

            if (bmi <= 18.5){
                System.out.println("BMI Level: Underweight");
            } else if (bmi <= 24.9){
                    System.out.println("BMI Level: Normal");
                    }
              else if (bmi <= 29.9){
                    System.out.println("BMI Level: Overweight");
                    }
              else if (bmi <= 34.9){
                    System.out.println("BMI Level: Obese");
                    }
              else {
                    System.out.println("BMI Level: Extremely Obese");
                    }
                
            
            System.out.println("\n=============== TRY AGAIN? ==============\n");
            System.out.print("Enter 1 if \"YES;\" \nAny keys if \"NO\" \n>> ");
            String answer = input.nextLine();
            String ans = answer.strip();
            if (ans.equals("1")){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                continue;
            } else {
                System.out.println("\n>> Okay. Thank you for using my code. <<");
                System.out.println("\n=========================================\n");
                break;
            }
    }
}
}
