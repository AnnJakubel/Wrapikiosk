package ee.annjakubel;

import ee.annjakubel.ui.UserInterface;
import ee.annjakubel.wrap.Wrap;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Wrap wrap = new Wrap();
        UserInterface ui = new UserInterface();

        String tortillaType = ui.askTortillaType();
        wrap.setTortilla(tortillaType);
        while (wrap.getTortilla().equals("invalid")) {
            System.out.println("Invalid input. Please try again.");
            System.out.println("");
            String newTortillaType = ui.askTortillaType();
            wrap.setTortilla(newTortillaType);

        }

        System.out.println("");

        String meatType = ui.askMeatType();
        wrap.setMeat(meatType);
        while (wrap.getMeat().equals("invalid")) {
            System.out.println("Invalid input. Please try again.");
            System.out.println("");
            String newMeatType = ui.askMeatType();
            wrap.setMeat(newMeatType);
        }

        ArrayList<String> veggies = ui.askVeggies();
        wrap.setVeggies(veggies);


        //veggies (arrlist) and sauce for next time
    }
}
