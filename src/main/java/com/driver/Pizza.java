package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

//    creating two new variables to store the prices of cheese and toppings .

    private int cheese;
    private int toppings;

    boolean isExtraCheeseAdded;
    boolean isExtraToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

//        initially setting all to false

        this.isBillGenerated = false;
        this.isExtraCheeseAdded = false;
        this.isExtraToppingsAdded = false;
        this.isTakeAwayAdded = false;
        this.bill = "";

        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }
        else {
            this.price = 400;
            this.toppings = 120;
        }
        this.cheese = 80;
        this.bill += "Base Price Of The Pizza:"+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheeseAdded)
        {
            this.price = this.price + cheese;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded){
            this.price = this.price + toppings;
            isExtraToppingsAdded = true;
        }
        // your code goes here
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            this.price += 20;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated)
        {
            if(isExtraCheeseAdded)
                this.bill += "Extra Cheese Added:"+this.cheese+"\n";
            if(isExtraToppingsAdded)
                this.bill += "Extra Toppings Added:"+this.toppings+"\n";
            if(isTakeAwayAdded)
                this.bill += "Paperbag Added:"+"20"+"\n";

//            printing the final amount

            this.bill += "Total Price:"+this.price+"\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
