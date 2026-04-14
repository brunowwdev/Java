package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock(){
        return quantity*price;
    }

    public int AddProduct(int quantity){
       return  this.quantity += quantity;
    }

    public int RemoveProduct(int quantity){
        return this.quantity -= quantity;
    }
}
