package com.codingnomads.part_03;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.

 **/
class ShoppingCartController{

    public static void main(String[] args) {

            Store sevenEleven = new Store();
            sevenEleven.setStoreName("7/11");
            sevenEleven.setLocation("neighborhoodOne");
            System.out.println(sevenEleven.toString());

            ShoppingCart largeCart = new ShoppingCart("shampoo",20,5);
            largeCart.setTotalItems(9);
            System.out.println(largeCart.toString());
            System.out.println("This shopping cart contains only " + largeCart.getItemName());
            System.out.println("This shopping car has as many as " + largeCart.getTotalItems() + largeCart.getItemName() + "at " + largeCart.getItemPrice() + " dollars each.");

        }
}

class Store {
    private String storeName;
    private String location;

    public Store(){

    };

    public Store(String location){
        this.location = location;
    }

    public void setStoreName(String storeName){
        this.storeName = storeName;
    }

    public void setLocation(String location){
        this.location = location;
    }

    @Override
    public String toString(){
        return storeName + " in " + location +": "
                ;
    }


}

class ShoppingCart{
    private String itemName;
    private int itemPrice;
    private int totalItems;


    public ShoppingCart(String itemName, int itemPrice, int totalItems) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.totalItems = totalItems;
    }

    public String getItemName(){
        return itemName;
    };

    public int getItemPrice(){
        return itemPrice;
    }

    public int getTotalItems(){
        return totalItems;
    }

    public void setTotalItems(int totalItems){
        this.totalItems = totalItems;
    }

    @Override
    public String toString() {
        return "ShoppingCart {" +
                "item = '" + itemName +"\'" +
                ", price = '" + itemPrice +"\'" +
                ", number of items = '" + totalItems +"\'";

    }

}

