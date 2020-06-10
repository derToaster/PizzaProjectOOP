package com.derToaster;


public class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger() {
        super("Deluxe Burger", "Beef and Bacon", 14.99, "White");
        super.addHamburgerAddition1("Chips", 2.99);
        super.addHamburgerAddition2("Drink",4.99);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional Items to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional Items to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional Items to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional Items to a Deluxe Burger");
    }



}
