/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testapittax;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TestApitTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TaxPayer[] payerObj = new TaxPayer[3];
        readData(payerObj);
        printData(payerObj);
    }

    public static void readData(TaxPayer[] payerObj) {
        payerObj[0] = new Individual();
        payerObj[1] = new ResidentCompany();
        payerObj[2] = new NonResidentCompany();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < payerObj.length; i++) {

            if (payerObj[i] instanceof Individual) {
                System.out.print("Enter TaxPayerId : ");
                String taxPayerId = input.nextLine();

                System.out.print("Enter TaxPayerType : ");
                String taxPayerType = input.nextLine();

                System.out.print("Enter Income(Rs.) : ");
                double income = input.nextDouble();
                input.nextLine(); // Consume the leftover newline

                payerObj[0] = new Individual(taxPayerId, taxPayerType, income);
            }

            if (payerObj[i] instanceof ResidentCompany) {
                System.out.print("Enter TaxPayerId : ");
                String taxPayerId = input.nextLine();

                System.out.print("Enter TaxPayerType : ");
                String taxPayerType = input.nextLine();

                System.out.print("Enter Local Income(Rs.) : ");
                double localIncome = input.nextDouble();
                input.nextLine(); // Consume the leftover newline
                
                System.out.print("Enter Foreign Income(Rs.) : ");
                double foreignIncome = input.nextDouble();
                input.nextLine(); // Consume the leftover newline

                payerObj[1] = new ResidentCompany(taxPayerId, taxPayerType, localIncome, foreignIncome);
            }
            
            if (payerObj[i] instanceof NonResidentCompany) {
                System.out.print("Enter TaxPayerId : ");
                String taxPayerId = input.nextLine();

                System.out.print("Enter TaxPayerType : ");
                String taxPayerType = input.nextLine();

                System.out.print("Enter Local Income(Rs.) : ");
                double localIncome = input.nextDouble();
                input.nextLine(); // Consume the leftover newline
                
                System.out.print("Enter Foreign Income(Rs.) : ");
                double foreignIncome = input.nextDouble();
                input.nextLine(); // Consume the leftover newline

                payerObj[2] = new NonResidentCompany(taxPayerId, taxPayerType, localIncome, foreignIncome);
            }
        }
    }

    public static void printData(TaxPayer[] payerObj) {
        System.out.println();
        System.out.println("TaxPayer Details");
        System.out.printf("%-15s\t%-15s\t%-10s\n",
                "TaxPayer ID", "TaxType", "Tax(Rs.)");

        // Print details for each product
        for (TaxPayer payer : payerObj) {
            System.out.printf("%-15s\t%-15s\t%-12.2f\n",
                    payer.getTaxPayerId(),
                    payer.getTaxPayerType(),
                    payer.calculateTax());
        }
    }
}
