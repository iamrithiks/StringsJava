package iamrithikdev.web.app;

public class Main {

    public static void main(String[] args) {
        String myString = "I am Rithik";
        myString = myString + ", and I am learning Java. ";
        myString = myString + "\u00A9 2021";
        System.out.println("My String is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + " 49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);
    }
}
