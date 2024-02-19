/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fuelcosts;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class FuelCosts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //declaring the variables
        double gallons;
        double milesPerGallon;
        double gasPrice;
        boolean done = true;
        
       do
       { 
            System.out.println("How many gallons of gas can your vehicle hold?");
            gallons = in.nextDouble();
       }while(!done);
       do
       {     
            System.out.println("How many miles per gallon does you vehicle get?");
            milesPerGallon = in.nextDouble();
       }while(!done);
       do
       { 
           System.out.println("What is the price of gas in your area?");
            gasPrice = in.nextDouble();
       }while(!done);
       if (in.hasNextDouble());
       {
           
       }
       else
       {
            System.out.println("That is not a valid input!");
       }
    }
    
}
