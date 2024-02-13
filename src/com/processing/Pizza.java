package com.processing;

import java.util.Arrays;

public class Pizza {
    private Crust   crust;
    private Cheese cheese;
    private Sauce sauce;
    private Topping[] toppings;

    public Pizza(Crust crust, Cheese cheese, Sauce sauce, Topping[] toppings) {
        this.crust = crust;
        this.cheese = cheese;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public Pizza(Pizza pizza) {
        this.crust = new Crust(new Cheese(pizza.getCrust().getCheese().getType()));
        this.cheese = new Cheese(pizza.getCheese().getType());
        this.sauce = new Sauce(pizza.getSauce().getColor());

        Topping [] originalToppings = pizza.getToppings();

        this.toppings = new Topping[originalToppings.length];
        for (int i = 0; i < toppings.length; i++){
            toppings[i] =new Topping(originalToppings[i].getType());
        }
    }

    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Topping[] getToppings() {
        return toppings;
    }

    public void setToppings(Topping[] toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "crust=" + crust +
                ", cheese=" + cheese +
                ", sauce=" + sauce +
                ", toppings=" + Arrays.toString(toppings) +
                '}';
    }
}
