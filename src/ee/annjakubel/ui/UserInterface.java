package ee.annjakubel.ui;

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
}
