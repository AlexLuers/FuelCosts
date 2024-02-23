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
        double gallons = 0;
        double milesPerGallon = 0;
        double gasPrice = 0;
        double fullTank;
        double fullTankCost;
        boolean done = false;
        
        do
        {
            System.out.println("How many gallons of gas can your vehicle hold?");
            if (in.hasNextDouble())
            {
                gallons = in.nextDouble();
            }
            else
            {   
                System.out.println("Invalid input. Please try again.");
            }
        }while(!done);
        do
        {
            System.out.println("How many miles per gallon does your vehicle get?");
            if (in.hasNextDouble())
            {
                milesPerGallon = in.nextDouble();
            }
            else
            {   
                System.out.println("Invalid input. Please try again.");
            }
        }while(!done);
        do
        {
            System.out.println("What is the price of gas on your area?");
            if (in.hasNextDouble())
            {
                gasPrice = in.nextDouble();
            }
            else
            {   
                System.out.println("Invalid input. Please try again.");
            }
        }while(!done);    
        fullTank = gallons * milesPerGallon;
        System.out.println("You could go " + fullTank + "miles on a full tank of gas.");
        fullTankCost = 100 / gasPrice;
        System.out.println("It would cost you $" + fullTankCost + "to go 100 miles");
   }    
