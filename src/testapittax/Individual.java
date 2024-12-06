/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testapittax;

/**
 *
 * @author HP
 */
public class Individual extends TaxPayer{

    //hardcode values
    private double taxSlabs[] = {300000, 500000, 800000};
    private double taxRates[] = {0.05, 0.1, 0.15};
    
    private double income;

    public Individual() {
    }

    public Individual(String taxPayerId, String taxPayerType, double income) {
        super(taxPayerId, taxPayerType);
        this.income = income;
    }
    
    public double getAPI_TAX(){
        double apiTax = 0.0;
        
        if(income > 0){
            if(income > taxSlabs[2]){
                //above 8m
                apiTax += (income - taxSlabs[2]) * taxRates[2];
            }
            else if(income > taxSlabs[1]){
                //above 5-8m
                apiTax += (income - taxSlabs[1]) * taxRates[1];
            }
            else if(income > taxSlabs[0]){
                //above 3-5m
                apiTax += (income - taxSlabs[0]) * taxRates[0];
            }
            else{
                //above 0-3m
                apiTax += 0.0;
            }
        }
        return apiTax;
    }
    
    @Override
    public String getTaxId() {
        return "TAXINDIVIDUAL";
    }

    @Override
    public String getTaxType() {
        return "Individual";
    }

    @Override
    public double calculateTax() {
        return getAPI_TAX();
    }
}
