package grocery;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroceryList groceryList = new GroceryList();

        int choice; //instance declaration:

        do{
            System.out.println("Yapılmak istenen operasyonu seçin(0: quit, 1: ekleme, 2: çıkarma)");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("eklenmesini istedğiniz elamanları giriniz.(birden fazlaysa virgül kullanın)");
                    String itemsToAdd = scanner.nextLine();
                    groceryList.addItems(itemsToAdd);
                    break;
                case 2:
                    System.out.println("silinmesini istedğiniz elamanları giriniz.(birden fazlaysa virgül kullanın)");
                    String itemsToRemove = scanner.nextLine();
                    groceryList.removeItems(itemsToRemove);
                    break;
            }
            groceryList.printSorted();
        } while (choice != 0);
        scanner.close();
    }
}
