package ee.annjakubel;

import ee.annjakubel.wrap.Wrap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Wrap wrap = new Wrap();

        System.out.println("What kind of tortilla?");
        System.out.println("1.wheat  2.wholegrain  3.no tortilla(give me a salad)");
        String tortillaType = scanner.nextLine();

        wrap.setTortilla(tortillaType);
        if (tortillaType == "invalid") {
            System.out.println("Invalid input, please try again.");
            
        }
    }
}
