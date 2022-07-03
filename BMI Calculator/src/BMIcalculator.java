import java.util.Scanner;

public class BMIcalculator {

//    weight (1lb)/ height (in)^2 * 703

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in pounds: ");
        double height = input.nextDouble();

        System.out.println("Weight: "+ weight);
        System.out.println("Height: "+ height);

        double bmi = weight / Math.pow(height,2) * 703;

        System.out.println("Your BMI is :  "+ bmi);
    }
}
