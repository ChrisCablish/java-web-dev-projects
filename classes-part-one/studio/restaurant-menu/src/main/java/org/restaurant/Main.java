package org.restaurant;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

//        MenuItem(double p, String d, String c, boolean iN)

        MenuItem turkeySandwich = new MenuItem(10.00, "Turkey Sandwich", "Entree", true);
        MenuItem fishTacos = new MenuItem(9.00, "Fish Tacos", "Entree", true);
        MenuItem pizza = new MenuItem(9.00, "This is pizza", "Appetizer", true);

        ArrayList<MenuItem> itemHolder = new ArrayList<>();

        itemHolder.add(turkeySandwich);
        itemHolder.add(fishTacos);
        itemHolder.add(pizza);


        Menu menu = new Menu(new Date(), itemHolder);

        System.out.println(menu.getItems());

    }
}
