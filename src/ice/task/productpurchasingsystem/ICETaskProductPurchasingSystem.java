/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice.task.productpurchasingsystem;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
public class ICETaskProductPurchasingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
               
     String productName;
     int productQuantity;
     double productPricePerUnit;
     boolean membershipDiscount;
     
     
     System.out.println("Enter Product Name:");
     productName = input.nextLine();
     
     System.out.println("Enter Quantity of Product:");
     productQuantity = input.nextInt();
     input.nextLine();
     
     System.out.println("Enter Product Price per Unit:");
     productPricePerUnit = input.nextDouble();
     input.nextLine();
     
     System.out.println("Enter if you have a membership discount or not (yes) or (no)");
   String response = input.nextLine().trim().toLowerCase();
     membershipDiscount = response.equals("yes");
     
     double totalPrice = productQuantity * productPricePerUnit;
     System.out.println("");
     System.out.println("------PRODUCT PURCHASING SYSTEM------");
     System.out.println("Product Name: " + productName);
     System.out.println("Quantity of Product: " + productQuantity);
     System.out.println("Product Price per Unit: " + productPricePerUnit);
     System.out.println("Has Membership discount: " + membershipDiscount);
     System.out.println("Total Price of Products: " + "R"+ totalPrice);
     System.out.println("--------------------------------------");
     System.out.println("");

        
    }
    
}
