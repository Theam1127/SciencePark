package my.edu.tarc.sciencepark;

/**
 * Created by Yeap Theam on 4/28/2018.
 */

public class Item {
    String restaurant;
    String foodName;
    String venue;
    int quantity;
    double price;

    public Item(String restaurant, String foodName, String venue, int quantity, double price){
        this.restaurant = restaurant;
        this.foodName=foodName;
        this.venue=venue;
        this.quantity = quantity;
        this.price=price;
    }
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
               return String.format("Restaurant: %s\nFood: %s\nDelivery Location: %s\nTotal: RM %.2f\nStatus: %s",restaurant,foodName, venue, price*quantity,"Your food is on the way!");
    }
}
