/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testapittax;

/**
 *
 * @author HP
 */
public abstract class Company extends TaxPayer{
    private double localIncome;
    private double foreignIncome;
    
    //declaring constant   
    protected static final double localRate = 0.1;
    protected static final double foreignRate = 0.05;

    public Company() {
    }

    public Company(String taxPayerId, String taxPayerType, double localIncome, double foreignIncome) {
        super(taxPayerId, taxPayerType);
        setLocalIncome(localIncome);
        setForeignIncome(foreignIncome);
    }

    
    public double getLocalIncome() {
        return localIncome;
    }

    public void setLocalIncome(double localIncome) {
        this.localIncome = localIncome;
    }

    public double getForeignIncome() {
        return foreignIncome;
    }

    public void setForeignIncome(double foreignIncome) {
        this.foreignIncome = foreignIncome;
    }
}
