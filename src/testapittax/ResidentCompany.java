/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testapittax;

/**
 *
 * @author HP
 */
public class ResidentCompany extends Company{

    public ResidentCompany() {
    }

    public ResidentCompany(String taxPayerId, String taxPayerType, double localIncome, double foreignIncome) {
        super(taxPayerId, taxPayerType, localIncome, foreignIncome);
    }
    
    public double getIncomeTax(){
        double calcInconeTax = 0.0;
        
        calcInconeTax = super.getForeignIncome() * foreignRate + super.getLocalIncome() * localRate;
                
        return calcInconeTax;
    }
    
    @Override
    public String getTaxId() {
        return "TAXRESIDENTCOMPANY";
    }

    @Override
    public String getTaxType() {
        return "Resident Company";
    }

    @Override
    public double calculateTax() {
        return getIncomeTax();
    }
    
}
