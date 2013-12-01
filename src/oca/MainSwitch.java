package oca;

/**
 *
 * @author skuarch
 */
public class MainSwitch {

    public static void main(String[] args) {

        String color = "green";

        switch (color) {

            case "blue":
                System.out.println("blue");
            case "red":
                System.out.println("red");
            case "black":
                System.out.println("black");                
            case "green":
                System.out.println("green");
            case "withe":
                System.out.println("withe");
            case "yellow":
                System.out.println("yellow");
            default:
                System.out.println("default");
        }

    }

}
