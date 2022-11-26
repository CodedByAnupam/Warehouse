/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anupam_pathak
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

//    private double inBal;
    private ChangeHistory his;

    public ProductWarehouseWithHistory(String name, double capacity, double inBal) {
        super(name, capacity);
        this.his = new ChangeHistory();
//        this.inBal = inBal;
        this.setBalance(inBal);
        this.his.add(inBal);
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.his.add(this.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double realAmount = super.takeFromWarehouse(amount);
        this.his.add(this.getBalance());
        return realAmount;
    }

    public String history() {
        return this.his.toString();
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.his.maxValue());
        System.out.println("Smallest amount of product: " + this.his.minValue());
        System.out.println("Average: " + this.his.average());
    }

}
