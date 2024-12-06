/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testapittax;

/**
 *
 * @author HP
 */
public abstract class TaxPayer implements ITax{
    private String taxPayerId;
    private String taxPayerType;

    public TaxPayer() {
    }

    public TaxPayer(String taxPayerId, String taxPayerType) {
        this.taxPayerId = taxPayerId;
        this.taxPayerType = taxPayerType;
    }

    
    public String getTaxPayerId() {
        return taxPayerId;
    }

    public String getTaxPayerType() {
        return taxPayerType;
    }   
    
     // Abstract method for calculating tax
    public abstract double calculateTax();
}
