import java.util.Scanner;

public class Omang {
  public static void main(String[] args) {

    // SHOPPING CART PROGRAM

    Scanner scanner = new Scanner(System.in);

    String item; 
    double price;
    int quantity;
    char curreny = '$'
    double total;

    System.out.print("What item would you like to buy? ");
    item = scanner.nextLine();

    System.out.print(item);
     
    scanner.close();

  }
}