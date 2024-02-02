import java.io.*;
import java.util.*;
public class Calcu_Project {
    public static void main(String[] args) throws IOException {
        myMain();
    }
        static void myMain() throws IOException {
            Scanner scanner = new Scanner(System.in);

            System.out.println("What do you want to use?\n 1: Calculator \n 2: Unit Converter");
            System.out.print("Enter your choice: ");
            int choiceA = Integer.parseInt(scanner.nextLine());
            switch (choiceA) {
                case 1:
                    calculator();
                    break;
                case 2:
                    conversion();
                    break;
                default:
                    System.out.println("Invalid choice. Ending Program...");
                    break;
            }
            System.out.println("Would you like to try again? [Y/N]: ");
            String choice = scanner.nextLine().toUpperCase();
            if (choice.equals("Y")) {
                myMain();
            } else {
                System.out.println("Thank you for using our concverter.");
            }
        scanner.close();
        }
    // Calculator
    static void calculator() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our calculator");
        String answer = "Y";
        // Loop for Calculator
        while (answer.equals("Y"))
        {
            System.out.print("Enter the first number:");
            double num1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the second number:");
            double num2 = Double.parseDouble(scanner.nextLine());
            // User choice of operator
            System.out.println("Choose one of the following operations:");
            System.out.println("1 - addition");
            System.out.println("2 - subtraction");
            System.out.println("3 - multiplication");
            System.out.println("4 - division");
            System.out.println("5 - modulo");
            int option = Integer.parseInt(scanner.nextLine());
            double result = 0;
            switch (option)
            {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;
                case 5:
                    result = num1 % num2;
                    break;
            }
            if ((option > 0) && (option < 6))
            {
                System.out.println("Result: " + result);
                String answer3;
                System.out.print("Would you like to add more?  [Y/N]: ");
                answer3 = scanner.nextLine().toUpperCase();
                if (answer3.equals("Y")){
                    String answer2 = "Y";
                    // Loop for second operator until user decides to stop calculating
                    while (answer2.equals("Y")){
                        System.out.println("Choose one of the following operations:");
                        System.out.println("1 - addition");
                        System.out.println("2 - subtraction");
                        System.out.println("3 - multiplication");
                        System.out.println("4 - division");
                        System.out.println("5 - modulo");
                        // User input
                        int option2 = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter Next Number: ");
                        double nextnum = Double.parseDouble(scanner.nextLine());
                        double result2 = 0;
                        switch (option2) {
                            case 1:
                                result2 = result + nextnum;
                                result = result2;
                                break;
                            case 2:
                                result2 = result - nextnum;
                                result = result2;
                                break;
                            case 3:
                                result2 = result * nextnum;
                                result = result2;
                                break;
                            case 4:
                                result2 = result / nextnum;
                                result = result2;
                                break;
                            case 5:
                                result2 = result % nextnum;
                                result = result2;
                                break;
                        }
                        // Output
                        if ((option2 > 0) && (option2 < 6)) {
                            System.out.println("Result: " + result2);
                        }
                        else {
                            break;
                        }
                        // User choice if wanted to continue
                        System.out.print("Would you like to continue? [Y/N]: ");
                        answer2 = scanner.nextLine().toUpperCase();
                    }
                }
            }
            else
            {
                break;
            }
            System.out.print("Would you like to make another calculation? [Y/N]: ");
            answer = scanner.nextLine().toUpperCase();
        }
        System.out.println("Thank you for using our calculator.");
    }

//conversion
static void conversion() throws IOException {

    Scanner scanner = new Scanner(System.in);
    System.out.println("A. Volume");
    System.out.println("B. Length");
    System.out.println("C. Weight and Mass");
    System.out.print("Please choose what you want to convert: ");
    String choice;
    choice = scanner.nextLine().toUpperCase();
    switch (choice) {
        case "A":
            volume();
            break;
        case "B":
            length();
            break;
        case "C":
            mass();
            break;
        default:
            System.out.println("Invalid Choice :'<");
            break;
    }
}
static void volume() throws IOException {
    Scanner scanner = new Scanner(System.in);
    String from, to;
        double convertTo = 0, convertFrom = 0, num;
        // if 1n = liters
        double literTocubicMeter = 1000;
        double literTocubicCentimeters = 0.0001;
        double literTocubicDecimeter = 0.01;
        double literTocubicMilimeters = 0.000001;
        double literTocubicYards = 764.554857984;
        double literTocubicFeet = 28.316846592;
        double literTocubicinches = 0.16387064;
        double literToMililiters = 0.001;
        double literToLiter = 1;

        // if 1 liters = n
        double cubicMetersToLiter = 0.001;
        double cubicCentimetersToLiter = 100000;
        double cubicDecimetersToLiter = 100;
        double cubicMilimetersToLiter = 1000000;
        double cubicYardsToLiter = 0.0013079506;
        double cubicInchesToLiter = 61.0237440947;
        double miliLitersToLiter = 1000;

        //main code block
        System.out.println("Welcome to our Volume Converter!");
        System.out.println("Enter the unit you want to convert.");
        System.out.println("A. Cubic meter");
        System.out.println("B. Cubic centimeter");
        System.out.println("C. Cubic decimeter");
        System.out.println("D. Cubic milimeters");
        System.out.println("E. Cubic yards");
        System.out.println("F. Cubic feet");
        System.out.println("G. Cubic inches");
        System.out.println("H. Liters");
        System.out.println("I. Mililiters");
        System.out.print("I want to convert from: ");
        from = scanner.nextLine().toUpperCase();
        System.out.println("Enter the unit you want to convert into.");
        System.out.println("A. Cubic meter");
        System.out.println("B. Cubic centimeter");
        System.out.println("C. Cubic decimeter");
        System.out.println("D. Cubic milimeters");
        System.out.println("E. Cubicyards");
        System.out.println("F. Cubic feet");
        System.out.println("G. Cubic inches");
        System.out.println("H. Liters");
        System.out.println("I. Mililiters");
        System.out.print("I want to convert it to: ");
        to = scanner.nextLine().toUpperCase();
        System.out.print("Enter the number you want to convert: ");
        num = scanner.nextDouble();

        switch (from) {
            case "A":
                convertFrom = literTocubicMeter;
                break;
            case "B":
                convertFrom = literTocubicCentimeters;
                break;
            case "C":
                convertFrom = literTocubicDecimeter;
                break;
            case "D":
                convertFrom = literTocubicMilimeters;
                break;
            case "E":
                convertFrom = literTocubicYards;
                break;
            case "F":
                convertFrom = literTocubicFeet;
                break;
            case "G":
                convertFrom = literTocubicinches;
                break;
            case "H":
                convertFrom = literToLiter;
                break;
            case "I":
                convertFrom = literToMililiters;
                break;
            default:
                System.out.println("Invalid choice. Ending Program...");
                break;
        }
        switch (to) {
            case "A":
                convertTo = cubicMetersToLiter;
                break;
            case "B":
                convertTo = cubicCentimetersToLiter;
                break;
            case "C":
                convertTo = cubicDecimetersToLiter;
                break;
            case "D":
                convertTo = cubicMilimetersToLiter;
                break;
            case "E":
                convertTo = cubicYardsToLiter;
                break;
            case "F":
                convertTo = cubicMetersToLiter;
                break;
            case "G":
                convertTo = cubicInchesToLiter;
                break;
            case "H":
                convertTo = literToLiter;
               break;
            case "I":
                convertTo = miliLitersToLiter;
                break;
            default:
                System.out.println("Invalid choice. Ending Program...");
                break;
        }
    double result = num * convertFrom * convertTo;
    System.out.printf("= %.10f\n", result);
}
static void length() throws IOException {

    Scanner scanner = new Scanner(System.in);
    String from,to;
    double mm,cm,m,km,inch,ft,yd,mi,mm2,cm2,km2,inch2,ft2,yd2,mi2;
    double convertTo = 0, convertFrom = 0,num;

        /*conversion to meter*/
        m = 1;
        mm = 0.001;
        cm = 0.01;
        km = 1000;
        inch = 0.0254;
        ft = 0.3048;
        yd = 0.9144;
        mi = 1609.34;
        /*conversion from meter*/
        mm2 = 1000;
        cm2 = 100;
        km2 = 0.001;
        inch2 = 39.3701;
        ft2 = 3.28084;
        yd2 = 1.09361;
        mi2 = 0.000621371;


    System.out.println("welcome to our Length Conversion!");

    System.out.println("Enter unit you want to convert");
    System.out.println("A: Milimeter(mm)");
    System.out.println("B: Centimeter(cm)");
    System.out.println("C: Meter(m)");
    System.out.println("D: Kilometer(km)");
    System.out.println("E: Inches(inch)");
    System.out.println("F: Feet(ft)");
    System.out.println("G: Yard(yd)");
    System.out.println("H: Mile(mi)");
    System.out.print("I want to convert from: ");
    from = scanner.nextLine().toUpperCase();

    System.out.println("Enter unit you want to convert");
    System.out.println("A: Milimeter(mm)");
    System.out.println("B: Centimeter(cm)");
    System.out.println("C: Meter(m)");
    System.out.println("D: Kilometer(km)");
    System.out.println("E: Inches(inch)");
    System.out.println("F: Feet(ft)");
    System.out.println("G: Yard(yd)");
    System.out.println("H: Mile(mi)");
    System.out.print("I want to convert it to: ");
    to = scanner.nextLine().toUpperCase();

    System.out.print("Enter units: ");
    num = scanner.nextDouble();

    switch(from){
        case "A":
            convertFrom = mm;
             break;
        case "B":
            convertFrom = cm;
              break;
        case "C":
            convertFrom = m;
            break;
        case "D":
            convertFrom = km;
            break;
        case "E":
            convertFrom = inch;
            break;
        case "F":
            convertFrom = ft;
            break;
        case "G":
            convertFrom = yd;
            break;
        case "H":
            convertFrom = mi;
            break;
        default:
            System.out.println("Invalid choice. Ending Program...");
            break;
    }
    switch(to){
        case "A":
            convertTo = mm2;
            break;
        case "B":
            convertTo = cm2;
            break;
        case "C":
            convertTo = m;
            break;
        case "D":
            convertTo = km2;
            break;
        case "E":
            convertTo = inch2;
            break;
        case "F":
            convertTo = ft2;
            break;
        case "G":
            convertTo = yd2;
            break;
        case "H":
            convertTo = mi2;
            break;
        default:
            System.out.println("Invalid choice. Ending Program...");
            break;
        }
        double result = num * convertFrom * convertTo;
        System.out.printf("= %.10f\n", result);
}

static void mass() throws IOException {
    Scanner scanner = new Scanner(System.in);
    String from, to;
    double result, numConvert = 0, convertTo = 0;

    double OUNCE_to_OUNCE = numConvert;
    double OUNCE_to_GRAMS = 28.349;
    double OUNCE_to_MILLIGRAM = 28349.5;
    double OUNCE_to_KILOGRAM = 0.0283495;
    double OUNCE_to_POUNDS = 0.0625;

    double GRAMS_to_GRAMS = numConvert;
    double GRAMS_to_OUNCES = 0.03527396;
    double GRAMS_to_POUNDS = 0.002204620;
    double GRAMS_to_MILLIGRAM = 1000;
    double GRAMS_to_KILOGRAM = 0.001;

    double MILLIGRAM_to_MILLIGRAM = numConvert;
    double MILLIGRAM_to_KILOGRAM = 1e-6;
    double MILLIGRAM_to_GRAMS = 0.001;
    double MILLIGRAM_to_OUNCES = 3.5274e-5;
    double MILLIGRAM_to_POUNDS = 2.2046e-6;

    double POUND_to_POUNDS = numConvert;
    double POUND_to_OUNCES = 16;
    double POUND_to_KILOGRAMS = 0.4535924;
    double POUND_to_GRAMS = 453.5920;
    double POUND_to_MILLIGRAM = 453592;

    double KILOGRAM_to_KILOGRAM = numConvert;
    double KILOGRAM_to_POUNDS = 2.2046223;
    double KILOGRAM_to_OUNCE = 35.274;
    double KILOGRAM_to_GRAMS = 1000;
    double KILOGRAM_to_MILLIGRAM = 1000000;

    System.out.println("Welcome to our Mass Converter!");
    System.out.println("Enter the unit you want to convert.");
    System.out.println("A. Kilogram");
    System.out.println("B. Gram");
    System.out.println("C. Milligram");
    System.out.println("D. Pound");
    System.out.println("E. Ounce");
    System.out.print("I want to convert from: ");
    from = scanner.nextLine().toUpperCase();
    System.out.println("Enter the unit you want to convert into.");
    System.out.println("A. Kilogram");
    System.out.println("B. Gram");
    System.out.println("C. Milligram");
    System.out.println("D. Pound");
    System.out.println("E. Ounce");
    System.out.print("I want to convert it to: ");
    to = scanner.next().toUpperCase();
    System.out.print("Enter number to be converted: ");
    numConvert = scanner.nextDouble();

    switch (from) {
        case "A":
            switch (to) {
                case "A":
                    convertTo = KILOGRAM_to_KILOGRAM;
                    break;
                case "B":
                    convertTo = KILOGRAM_to_GRAMS;
                    break;
                case "C":
                    convertTo = KILOGRAM_to_MILLIGRAM;
                    break;
                case "D":
                    convertTo = KILOGRAM_to_POUNDS;
                    break;
                case "E":
                    convertTo = KILOGRAM_to_OUNCE;
                    break;
                default:
                    System.out.println("Incorrect input!");
                    break;
            }
            break;
        case "B":
            switch (to) {
                case "A":
                    convertTo = GRAMS_to_KILOGRAM;
                    break;
                case "B":
                    convertTo = GRAMS_to_GRAMS;
                    break;
                case "C":
                    convertTo = GRAMS_to_MILLIGRAM;
                    break;
                case "D":
                    convertTo = GRAMS_to_POUNDS;
                    break;
                case "E":
                    convertTo = GRAMS_to_OUNCES;
                    break;
                default:
                    System.out.println("Incorrect input!");
                    break;
            }
            break;
        case "C":
            switch (to) {
                case "A":
                    convertTo = MILLIGRAM_to_KILOGRAM;
                    break;
                case "B":
                    convertTo = MILLIGRAM_to_GRAMS;
                    break;
                case "C":
                    convertTo = MILLIGRAM_to_MILLIGRAM;
                    break;
                case "D":
                    convertTo = MILLIGRAM_to_POUNDS;
                    break;
                case "E":
                    convertTo = MILLIGRAM_to_OUNCES;
                    break;
                default:
                    System.out.println("Incorrect input!");
                    break;
            }
            break;
        case "D":
            switch (to) {
                case "A":
                    convertTo = POUND_to_KILOGRAMS;
                    break;
                case "B":
                    convertTo = POUND_to_GRAMS;
                    break;
                case "C":
                    convertTo = POUND_to_MILLIGRAM;
                    break;
                case "D":
                    convertTo = POUND_to_POUNDS;
                    break;
                case "E":
                    convertTo = POUND_to_OUNCES;
                    break;
                default:
                    System.out.println("Incorrect input!");
                    break;
            }
            break;
        case "E":
            switch (to) {
                case "A":
                    convertTo = OUNCE_to_KILOGRAM;
                    break;
                case "B":
                    convertTo = OUNCE_to_GRAMS;
                    break;
                case "C":
                    convertTo = OUNCE_to_MILLIGRAM;
                    break;
                case "D":
                    convertTo = OUNCE_to_POUNDS;
                    break;
                case "E":
                    convertTo = OUNCE_to_OUNCE;
                    break;
                default:
                    System.out.println("Incorrect input!");
                    break;
            }
            break;
        default:
            System.out.println("Incorrect input!");
            break;
    }
    result = numConvert * convertTo;
    System.out.printf("= %.10f\n", result);
}
}