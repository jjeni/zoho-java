package Assignment4;

import java.util.ArrayList;

class Store {
    static String storeName;
    static String storeLocation;
    static ArrayList<Product> productList;

    Store(){
        productList = new ArrayList<>();
    }
    static void setStoreDetails(String name, String location){
        storeLocation = location;
        storeName = name;
    }

    static void addProduct(Product product){
        productList.add(product);
    }

    static void displayStoreDetails(){
        System.out.println("Store Name    : " + storeName);
        System.out.println("Store Location: " + storeLocation);
        System.out.println("===========================");
    }

    static void displayAllProducts(){
        for (Product p : productList){
            p.displayProduct();
        }
    }

    
}

class Product {
    int productId;
    String productName;
    int productPrice;
    int productQuantity;

    Product(int productId, String productName, int productPrice, int productQuantity){
        this.productId = productId;
        this.productName =productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    void displayProduct(){
        System.out.println("Product Name : " + productName);
        System.out.println("Product ID   : " + productId);
        System.out.println("Price        : " + productPrice);
        System.out.println("Quantity     : " + productQuantity);
        System.out.println("---------------------------");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Store.setStoreDetails("Lassom Clothing", "Chennai");
        Store myStore = new Store();

        Product p1 = new Product(101, "T-Shirt", 499, 50);
        Product p2 = new Product(102, "Hoodie", 899, 30);
        Product p3 = new Product(103, "Jeans", 799, 20);

        myStore.addProduct(p1);
        myStore.addProduct(p2);
        myStore.addProduct(p3);
        
        Store.displayStoreDetails();
        myStore.displayAllProducts();
    }
}


/*
 * Q6.class
 * Store.class
 * Product.class
 * Three 3 .class files are created.
 */