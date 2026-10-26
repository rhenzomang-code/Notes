import java.util.Random;

public class Omang {
    public static void main(String[] args) {
        //its not like scanner that has System.in inside of the (), there's nothing inside
        //because it is random so it doesn't need System.in I think
        Random random = new Random();

        //I think this one doesn't need an assigned value because it is random afterall
        double number;
        
        // because inside the () is the number ranging from whatever you want
        //though still the same of scanner.nextInt();  function
        //this one will just generate from numbers 0 and 1 but will high numbers of decimal portions only
        number = random.nextDouble();   

        //simply just print out the number it'll get
        System.out.print(number);
    }
}