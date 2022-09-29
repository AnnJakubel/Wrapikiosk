package ee.annjakubel.ui;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    public UserInterface() {
    }

    Scanner scanner = new Scanner(System.in);

    public String askTortillaType() {
        System.out.println("What kind of tortilla?");
        System.out.println("1.wheat  2.wholegrain  3.no tortilla(give me a salad)");
        String tortillaType = scanner.nextLine();
        return tortillaType;
    }

    public String askMeatType() {
        System.out.println("What kind of meat?");
        System.out.println("1.kebab  2.chicken  3.ham  4.salami  5.tofu (no meat)");
        String meatType = scanner.nextLine();
        return meatType;
    }

    public ArrayList<String> askVeggies() {
        ArrayList<String> veggies = new ArrayList<>();

        while(veggies.size() < 4) {
            System.out.println("");
            System.out.println("Would you like vegetables?");
            System.out.println("Y/N");
            String answer = scanner.nextLine().toLowerCase();

            if (answer.equals("n")) {
                break;
            } else if (answer.equals("y")) {
                System.out.println("Choose vegetable:");
                String input = scanner.nextLine();
                veggies.add(input);
                continue;
            } else {
                System.out.println("Invalid input");
                System.out.println("Try again");
                continue;
            }
        }

        System.out.println("That's all for veggies!");
        System.out.println("");
        return veggies;
    }

    public String askSauceType() {
        System.out.println("What kind of sauce?");
        System.out.println("1.BBQ  2.mayo  3.ketchup  4.mustard  5.ranch  6.caesar  7.no sauce");
        String sauceType = scanner.nextLine();
        return sauceType;
    }
}
