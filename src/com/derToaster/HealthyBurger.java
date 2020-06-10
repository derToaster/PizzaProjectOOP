package com.derToaster;



public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyExtra1 (String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyExtra2 (String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice =  super.itemizeHamburger();
        if (healthyExtra1Name != null){
            hamburgerPrice += healthyExtra1Price;
            System.out.println("Added "  + healthyExtra1Name + " for " + healthyExtra1Price + " extra");
        }

        if (healthyExtra2Name != null){
            hamburgerPrice += healthyExtra2Price;
            System.out.println("Added "  + healthyExtra2Name + " for " + healthyExtra2Price + " extra");
        }
        return hamburgerPrice;
    }
}
