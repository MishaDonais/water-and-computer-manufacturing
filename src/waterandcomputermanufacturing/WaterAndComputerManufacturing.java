/*
 * Created by Misha Donais
 * Created on October 2nd 2018
 * To calculate the amount of water used to manufacture any number of computer/monitor combos
 */
package waterandcomputermanufacturing;

//imports
import java.util.Scanner;
/**
 *
 * @author misha
 */
public class WaterAndComputerManufacturing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner 
        Scanner keyedInput = new Scanner(System.in);
        
        //Variable declaration
        final double WATERPERCOMBO = 1.5;
        
        //Prompts and inputs
        System.out.println("enter the number of PC/monitor combos you have");
        double numberOfCombos = keyedInput.nextDouble();
        
        //Calculations
        double totalWaterUsed = WATERPERCOMBO*numberOfCombos;
        System.out.println("Your compuiter systems took " + totalWaterUsed + " litres of water to manufacture");
        
    }
    
}
