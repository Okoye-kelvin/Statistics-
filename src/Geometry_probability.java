import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.exit;

public class Geometry_probability {
    static Scanner input = new Scanner(System.in);

    public static void Geo_Distribution() {
        System.out.println("\t....GEOMETRY DISTRIBUTION.....");
        System.out.println("The Formula to finding Geometry Distribution is given below...");
        System.out.println("\t [ P ( 1 - p) ^( x - 1) ]");
        System.out.println("where:");
        System.out.println("P = probability given");
        System.out.println("X = number of trials");
        float Probability;
        System.out.println("Enter Probability: ");
        Probability = input.nextFloat();
        float num_trials;
        System.out.println("Enter Trials: ");
        num_trials = input.nextFloat();
        float Geometry = (float) (Probability  * pow((1 - Probability), ( num_trials - 1 )));
        System.out.println("Geometry = " + Geometry);
        System.out.println("-----------------------------------------------------------------------\n");


        int Geo_Menu;
        System.out.println("1. Calculate Again ");
        System.out.println("2. Go to Menu");
        System.out.println("3. Done...");
        System.out.println("Give an input: ");
        Geo_Menu = input.nextInt();
        switch (Geo_Menu) {
            case 1 -> Geo_Distribution();
            case 2 -> Choice();
            case 3 -> exit(0);
        }


    }

    public static void Geo_Mean() {
        System.out.println("\t.....GEOMETRY MEAN.....");
        System.out.println("The Formula to finding Geometry Mean is given below...");
        System.out.println("Mean = 1 / P ");
        float Probability;
        System.out.println("Enter Probability: ");
        Probability = input.nextFloat();
        Float Mean = 1 / Probability;
        System.out.println("Mean X = " + Mean);
        System.out.println("-----------------------------------------------------------------------\n");

        int Geo_Menu;
        System.out.println("1. Calculate Again ");
        System.out.println("2. Go to Menu");
        System.out.println("3. Done...");
        System.out.println("Give an input: ");
        Geo_Menu = input.nextInt();
        switch (Geo_Menu) {
            case 1 -> Geo_Mean();
            case 2 -> Choice();
            case 3 -> exit(0);
        }
    }

    public static void Geo_Variance() {
        System.out.println("\t.....GEOMETRY VARIANCE.....");
        System.out.println("The Formula to finding Geometry Variance is given below...");
        System.out.println(" Variance = ( 1 - P ) / p ^ 2 ");
        float Probability;
        System.out.println("Enter Probability: ");
        Probability = input.nextFloat();
        float Variance = (float) ((1 - Probability) / pow(Probability,2));
        System.out.println("Variance = " + Variance);
        System.out.println("-----------------------------------------------------------------------\n");

        int Geo_Menu;
        System.out.println("1. Calculate Again ");
        System.out.println("2. Go to Menu");
        System.out.println("3. Done...");
        System.out.println("Give an input: ");
        Geo_Menu = input.nextInt();
        switch (Geo_Menu) {
            case 1 -> Geo_Variance();
            case 2 -> Choice();
            case 3 -> exit(0);
        }

    }

    public static void Geo_SD() {
        System.out.println("\t.....STANDARD DEVIATION.....");
        System.out.println("The Formula to finding Standard Deviation is given below...");
        System.out.println(" Standard Deviation  = square root of Variance ");
        float Variance;
        System.out.println("Enter Variance: ");
        Variance = input.nextFloat();
        float S_deviation = (float) sqrt(Variance);
        System.out.println("S_Deviation = " + S_deviation);
        System.out.println("-----------------------------------------------------------------------\n");

        int Geo_Menu;
        System.out.println("1. Calculate Again ");
        System.out.println("2. Go to Menu");
        System.out.println("3. Done...");
        System.out.println("Give an input: ");
        Geo_Menu = input.nextInt();
        switch (Geo_Menu) {
            case 1 -> Geo_SD();
            case 2 -> Choice();
            case 3 -> exit(0);
        }
    }

    public static void Geo_CV() {
        System.out.println("\t.....COEFFICIENT of VARIATION.....");
        System.out.println("The Formula to finding coefficient of variation is given below...");
        System.out.println(" C.V  = (standard deviation/mean) * 100 ");
        float S_deviation;
        System.out.println("Enter S_deviation: ");
        S_deviation = input.nextFloat();
        float Mean;
        System.out.println("Enter Mean: ");
        Mean = input.nextFloat();
        float C_variation = (S_deviation / Mean) * 100;
        System.out.println("C.Variance = " + C_variation);
        System.out.println("-----------------------------------------------------------------------\n");

        int Geo_Menu;
        System.out.println("1. Calculate Again ");
        System.out.println("2. Go to Menu");
        System.out.println("3. Done...");
        System.out.println("Give an input: ");
        Geo_Menu = input.nextInt();
        switch (Geo_Menu) {
            case 1 -> Geo_CV();
            case 2 -> Choice();
            case 3 -> exit(0);
        }
    }

    public static void Choice(){
        System.out.println("\t------------------------------------");
        System.out.println("\t GEOMETRY PROBABILITY DISTRIBUTION");
        System.out.println("\t------------------------------------");
        System.out.println("NB: \t A condition is Geometry if one can success in the  first trial...");
        System.out.println("    MENU:");
        System.out.println("1. calculate Geometry Distribution");
        System.out.println("2. Geometry Mean");
        System.out.println("3. Variance of Geometry");
        System.out.println("4. Standard deviation of Geometry");
        System.out.println("5. Coefficient of variation");
        System.out.println("6. Exit");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Make your choice: ");

        int Input;
        Input = (int) input.nextDouble();
        switch (Input) {
            case 1 -> Geo_Distribution();
            case 2 -> Geo_Mean();
            case 3 -> Geo_Variance();
            case 4 -> Geo_SD();
            case 5 -> Geo_CV();
            case 6 -> exit(0);
            default -> System.out.println("you've made a wrong choice... ");
        }
    }

    public static void main(String[] args) {


        Choice();

    }


}
