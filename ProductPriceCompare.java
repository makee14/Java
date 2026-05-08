import java.util.Scanner;

public class ProductPriceCompare{
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);

      while(true){
          System.out.flush();
          System.out.println("===== PRODUCT PRICE COMPARISON =====");
          
          System.out.print("Product name 1: ");
          String name1 = input.nextLine();
          String prodName1 = name1.toUpperCase();
          System.out.print("Volume (mL): ");
          int prodVol1 = input.nextInt();
          input.nextLine();
          System.out.print("Quantity: ");
          int prodQuantity1 = input.nextInt();
          input.nextLine();     
          System.out.print("Price: ");
          double prodPrice1 = input.nextDouble();
          input.nextLine();      
          //formula: score = (v*q)/p    higher score = better option
          double score1 = ((prodVol1 * prodQuantity1)/prodPrice1);

          System.out.print("\nProduct name 2: ");
          String name2 = input.nextLine();
          String prodName2 = name2.toUpperCase();
          System.out.print("Volume (mL): ");
          int prodVol2 = input.nextInt();
          input.nextLine();       
          System.out.print("Quantity: ");
          int prodQuantity2 = input.nextInt();
          input.nextLine();
          System.out.print("Price: ");
          double prodPrice2 = input.nextDouble();
          input.nextLine();
          double score2 = (prodVol2 * prodQuantity2)/prodPrice2;
          

          if(score1 > score2){
            System.out.println("\n========== SAFEST OPTION ==========");
            System.out.println("Product 1: " + prodName1);
            System.out.println("Volume: " + prodVol1);
            System.out.println("Quantity: " + prodQuantity1);
            System.out.println("Price: " + prodPrice1);
            System.out.println("\nProduct score: " + score1);

            System.out.println("\n========== OPPONENT SCORE ==========");
            System.out.println("Product 2: " + prodName2);
            System.out.println("Volume: " + prodVol2);
            System.out.println("Quantity: " + prodQuantity2);
            System.out.println("Price: " + prodPrice2);
            System.out.println("\nProduct score: " + score2);
          } else if(score2 > score1){
              System.out.println("\n========== SAFEST OPTION ==========");
              System.out.println("Product 2: " + prodName2);
              System.out.println("Volume: " + prodVol2);
              System.out.println("Quantity: " + prodQuantity2);
              System.out.println("Price: " + prodPrice2);
              System.out.println("\nProduct score: " + score2);

              System.out.println("\n========== OPPONENT SCORE =========");
              System.out.println("Product 1: " + prodName1);
              System.out.println("Volume: " + prodVol1);
              System.out.println("Quantity: " + prodQuantity1);
              System.out.println("Price: " + prodPrice1);
              System.out.println("\nProduct score: " + score1);
          } else{
                System.out.println("\n========== SAME SCORE ==========");
                System.out.println("Product 1: " + prodName1);
                System.out.println("Volume: " + prodVol1);
                System.out.println("Quantity: " + prodQuantity1);
                System.out.println("Price: " + prodPrice1);
                System.out.println("\nProduct score: " + score1);

                System.out.println("\nProduct 2: " + prodName2);
                System.out.println("Volume: " + prodVol2);
                System.out.println("Quantity: " + prodQuantity2);
                System.out.println("Price: " + prodPrice2);
                System.out.println("\nProduct score: " + score2);        
          }

        System.out.print("\nWant to try again? (press y if 'YES', any key if 'NO': ");
        String ans = input.nextLine();
        String answer = ans.toLowerCase().trim();

        if(answer.equals("y")){
          System.out.print("\033[H\033[2J");
          continue;
        } else { 
          System.out.println("\nOkay... Byeeeee!");
          break;
        }

        }

          
    }
}
