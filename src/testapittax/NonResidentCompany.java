/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testapittax;

/**
 *
 * @author HP
 */
public class NonResidentCompany extends Company{

    public NonResidentCompany() {
    }

    public NonResidentCompany(String taxPayerId, String taxPayerType, double localIncome, double foreignIncome) {
        super(taxPayerId, taxPayerType, localIncome, foreignIncome);
    }
    
    public double getLocalTax(){
        double calcLocalTax = 0.0;
        
        calcLocalTax = super.getLocalIncome() * localRate;
                
        return calcLocalTax;
    }
        
    @Override
    public String getTaxId() {
        return "TAXNONRESIDENTCOMPANY";
    }

    @Override
    public String getTaxType() {
        return "Residental Company";
    }

    @Override
    public double calculateTax() {
       return getLocalTax();
    }
    
}
