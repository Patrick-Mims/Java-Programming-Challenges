package edu.sfsu;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Retail> retail = new ArrayList<>();

        retail.add(new Retail("Jacket", 59.95, 12));
        retail.add(new Retail("Jeans", 34.95, 40));
        retail.add(new Retail("Shirt", 23.95, 20));

        for(Retail item: retail) {
            System.out.println(item.getDescription() + " " + item.getUnitsOnHand() + " " + item.getPrice());
        }
    }
}
/*
* Write a class named RetailItem that hold data about an item in a retail store.
*
* The class should have the following fields:
*   description.
*   The description field references a String object that holds a brief description of the item.
*   unitsOnHand.
*   The unitsOnHand field is an int variable that holds the number of units currently in inventory.
*   price.
*   The price field is a double that holds the item's retail price.
*
* Write a constructor that accepts arguments for each field, appropriate mutator methods that store values in these
* fields, and accessor methods that return the values in these fields.
*
* Once you have written the class:
* 1. write a separate program that creates three RetailItem objects and stores the following data in them:
*
*   Item #1     Jacket          12      59.95
*   Item #2     Designer Jeans  40      34.95
*   Item #3     Shirt           20      23.95
* */
