/* This program calculates the invoice of each flat
 * in the apartment building that has central heating system.
 * 
 * Student Name - Student ID: Emir BÜÇKÜN - 150119024 */

package hw4;

import java.util.Scanner;

public class Pro1_150119024 {
 public static void main(String args[]) {
     Scanner input = new Scanner(System.in);
     
     // Get number of flats
     int flatCount = input.nextInt();
     
     // Declare a flats double array with flat count 
     double[] flats = new double[flatCount];
     
     // Get consumption of each flat
     for (int i = 0; i < flatCount; i++){
         flats[i] = input.nextDouble();
     }
     
     // Get total bill amount
     double totalBill = input.nextDouble();
     input.close();
     
     // Calculate invoices for each flat
     double[] bills = calculateTheInvoice(flats, totalBill);
     
     // Print the results
     printBills(bills);
 }
 
 public static double[] calculateTheInvoice (double[] flats, double totalBill){
     double[] invoice = new double[flats.length];
     double flatSum = 0;
     
     // Find shared and personal bill amounts
     double shared = (totalBill * 3 / 10) / flats.length;
     double personal = totalBill - shared * flats.length;
     
     // Find the sum of consumption of each flat
     for (int i = 0; i < flats.length; i++){
         flatSum += flats[i];
     }
     
     // Calculate total invoice for each flat
     for (int i = 0; i < flats.length; i++){
         invoice[i] = shared + (flats[i] * personal / flatSum);
     }
     return invoice;
 }
 
 public static void printBills (double[] bills){
     for (int i = 0; i < bills.length; i++){
         System.out.println("Flat #" + (i + 1) + ": " + (int)(bills[i] * 100.0) / 100.0);
     }
 }
}
