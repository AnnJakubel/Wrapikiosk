package ee.annjakubel.wrap;

import java.util.ArrayList;

//erinevad tortillatyybid, erinevad lihatyybid
//kuni 6 ekstrat
//1 kaste

public class Wrap {
    private String tortilla;
    private String meat;
    private ArrayList<String> veggies;
    private String sauce;

    public Wrap() {
    }

    public Wrap(String tortilla, String meat) {
        this.tortilla = tortilla;
        this.meat = meat;
        this.veggies = new ArrayList<>();
        this.sauce = "";
    }

    public String getTortilla() {

        return tortilla;
    }

    public void setTortilla(String tortillaType) {
        switch (tortillaType) {
            case "1":
                this.tortilla = "wheat";
                break;
            case "2":
                this.tortilla = "wholegrain";
                break;
            case "3":
                this.tortilla = "no tortilla";
                break;
            default:
                this.tortilla = "invalid";
                break;
        }
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meatType) {
        switch (meatType) {
            case "1":
                this.meat = "kebab";
                break;
            case "2":
                this.meat = "chicken";
                break;
            case "3":
                this.meat = "ham";
                break;
            case "4":
                this.meat = "salami";
                break;
            case "5":
                this.meat = "tofu";
                break;
            default:
                this.meat = "invalid";
                break;
        }
    }

    public ArrayList<String> getVeggies() {
        return veggies;
    }

    public void setVeggies(ArrayList<String> veggies) {
        this.veggies = veggies;
    }

    public String getSauce() {
        return sauce;
    }

    //TODO: sauce + main

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
}
