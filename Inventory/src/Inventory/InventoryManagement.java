package Inventory;
import java.util.ArrayList;

import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    Product(int id, String name, double price, int qty) {
        productId = id;
        productName = name;
        this.price = price;
        quantity = qty;
    }
}
public class InventoryManagement {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1.Add Product");
            System.out.println("2.Update Quantity");
            System.out.println("3.Display Products");
            System.out.println("4.Total Inventory Value");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    list.add(new Product(id, name, price, qty));
                    System.out.println("Product Added");
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int pid = sc.nextInt();
                    boolean found=false;
                    for (Product p : list) {
                        if (p.productId == pid) {
                            System.out.print("Enter New Quantity: ");
                            p.quantity = sc.nextInt();
                            System.out.println("enter new amount : ");
                            p.price=sc.nextDouble();
                            System.out.println("Quantity and price Updated");
                            found=true;
                        }
                    }
                    if(found==false) {
                    	System.out.println("Invalid Product ID");
                    }
                    break;

                case 3:
                	System.out.println("\nProductID"+"   "+"Name"+"   "+"Price"+"   "+"Quantity");
                	System.out.println("------------------------------");
                    for (Product p : list) {
                        System.out.println(p.productId + " \t"+ p.productName + "\t "+ p.price + " \t" + p.quantity);
                        }
                    break;

                case 4:
                    double total = 0;
                    for (Product p : list) {
                        total += p.price * p.quantity;
                    }
                    System.out.println("Total Inventory Value: " + total);
                    break;
                    
                case 5:
                    System.out.print("Enter Product ID: ");
                    int pid1 = sc.nextInt();
                    boolean found1 = false;
                    for (int i = 0; i < list.size(); i++) {
                        Product p = list.get(i);
                        if (p.productId == pid1) {
                            list.remove(i);
                            System.out.println("deleted successfully");
                            found1 = true;
                            break;
                        }
                    }
                    if (!found1) {
                        System.out.println("Invalid Product ID");
                    }
                    break;
            }
        } while (choice != 6);

        System.out.println("Program Ended");

    }
}
