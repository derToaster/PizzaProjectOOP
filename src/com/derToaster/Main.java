package com.derToaster;


public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Burger","Angus Beef",4.50,"Cheeseoregano");


        hamburger.addHamburgerAddition1("Cheddar",0.50);
        hamburger.addHamburgerAddition2("Jalapenos",0.55);
        hamburger.addHamburgerAddition3("Beef Patty",1.00);
        hamburger.addHamburgerAddition4("Bacon",0.55);


        System.out.println("the full price is " + hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("bacon",5.50);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHealthyExtra1("Egg",2.00);
        healthyBurger.addHealthyExtra2("Lettuce",0.50);

        System.out.println("Full price for the HealthyBurger = " + healthyBurger.itemizeHamburger());

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();

        System.out.println("The total price is " + deluxeHamburger.itemizeHamburger());

    }
}
