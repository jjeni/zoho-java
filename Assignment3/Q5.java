package Assignment3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {
        Store.setStoreDetails("Lassom Clothing", "Chennai");
        Store myStore = new Store();

        Product p1 = new Product(101, "T-Shirt", 499.0, 50);
        Product p2 = new Product(102, "Hoodie", 899.0, 30);
        Product p3 = new Product(103, "Jeans", 799.0, 20);

        myStore.addProduct(p1);
        myStore.addProduct(p2);
        myStore.addProduct(p3);
        
        Store.displayStoreDetails();
        myStore.displayAllProducts();


    }
}

class Store {
    static String storeName;
    static String storeLocation;
    static ArrayList<Product> productList;

    Store(){
        productList = new ArrayList<>();
    }

    static void setStoreDetails(String name, String location){
        storeName = name;
        storeLocation = location;
    }

    static void displayStoreDetails(){
        System.out.println("Store Name    : " + storeName);
        System.out.println("Store Location: " + storeLocation);
        System.out.println("===========================");
    }
    void addProduct(Product product){
        productList.add(product);
    }

    public void displayAllProducts() {
        System.out.println("All Products in Store:");
        for (Product p : productList) {
            p.displayProduct();
        }
    }

}

class  Product  {
    int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity){
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    
    void displayProduct(){
        System.out.println("Product Name : " + productName);
        System.out.println("Product ID   : " + productID);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("---------------------------");
    }

}