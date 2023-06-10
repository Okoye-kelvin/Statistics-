import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.exit;

public class Bernouli_probability {
    static Scanner input = new Scanner(System.in);

    public static void Ber_Distribution() {
        System.out.println("\t.....BERNOULLI DISTRIBUTION.....");
        System.out.println("The Formula to finding Bernoulli Distribution is given below...");
        System.out.println("\t [P ^ X ( 1 - p) ^ 1 -x ]");
        System.out.println("where:");
        System.out.println("P = probability given");
        System.out.println("X = number of trials");
        float Probability;
        System.out.println("Enter Probability: ");
        Probability = input.nextFloat();
        float num_trials;
        System.out.println("Enter Trials: ");
        num_trials = input.nextFloat();
        float Bernoulli = (float) (pow(Probability, num_trials) * pow((1 - Probability), (1 - num_trials)));
        System.out.println("Bernoulli = " + Bernoulli);
        System.out.println("-----------------------------------------------------------------------\n");


        int Ber_Menu;
        System.out.println("1. Calculate Again ");
        System.out.println("2. Go to Menu");
        System.out.println("3. Done...");
        System.out.println("Give an input: ");
        Ber_Menu = input.nextInt();
        switch (Ber_Menu) {
            case 1 -> Ber_Distribution();
            case 2 -> Choice();
            case 3 -> exit(0);
        }


    }

    public static void Ber_Mean() {
        System.out.println("\t.....BERNOULLI MEAN.....");
        System.out.println("The Formula to finding Bernoulli Mean is given below...");
        System.out.println(" Mean = P");
        System.out.println(" I.E the mean is it probability");
        float Probability;
        System.out.println("Enter Probability: ");
        Probability = input.nextFloat();
        Float Mean = Probability;
        System.out.println("Mean X = " + Mean);
        System.out.println("-----------------------------------------------------------------------\n");

        int Ber_Menu;
        System.out.println("1. Calculate Again ");
        System.out.println("2. Go to Menu");
        System.out.println("3. Done...");
        System.out.println("Give an input: ");
        Ber_Menu = input.nextInt();
        switch (Ber_Menu) {
            case 1 -> Ber_Mean();
            case 2 -> Choice();
            case 3 -> exit(0);
        }
    }

    public static void Ber_Variance() {
        System.out.println("\t.....BERNOULLI VARIANCE.....");
        System.out.println("The Formula to finding Bernoulli Variance is given below...");
        System.out.println(" Variance = P ( 1 - P ) ");
        float Probability;
        System.out.println("Enter Probability: ");
        Probability = input.nextFloat();
        float Variance = Probability * (1 - Probability);
        System.out.println("Variance = " + Variance);
        System.out.println("-----------------------------------------------------------------------\n");

        int Ber_Menu;
        System.out.println("1. Calculate Again ");
        System.out.println("2. Go to Menu");
        System.out.println("3. Done...");
        System.out.println("Give an input: ");
        Ber_Menu = input.nextInt();
        switch (Ber_Menu) {
            case 1 -> Ber_Variance();
            case 2 -> Choice();
            case 3 -> exit(0);
        }

    }

    public static void Ber_SD() {
        System.out.println("\t.....STANDARD DEVIATION.....");
        System.out.println("The Formula to finding Standard Deviation is given below...");
        System.out.println(" Standard Deviation  = square root of Variance ");
        float Variance;
        System.out.println("Enter Variance: ");
        Variance = input.nextFloat();
        float S_deviation = (float) sqrt(Variance);
        System.out.println("S_Deviation = " + S_deviation);
        System.out.println("-----------------------------------------------------------------------\n");

        int Ber_Menu;
        System.out.println("1. Calculate Again ");
        System.out.println("2. Go to Menu");
        System.out.println("3. Done...");
        System.out.println("Give an input: ");
        Ber_Menu = input.nextInt();
        switch (Ber_Menu) {
            case 1 -> Ber_SD();
            case 2 -> Choice();
            case 3 -> exit(0);
        }
    }

    public static void Ber_CV() {
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

        int Ber_Menu;
        System.out.println("1. Calculate Again ");
        System.out.println("2. Go to Menu");
        System.out.println("3. Done...");
        System.out.println("Give an input: ");
        Ber_Menu = input.nextInt();
        switch (Ber_Menu) {
            case 1 -> Ber_CV();
            case 2 -> Choice();
            case 3 -> exit(0);
        }
    }

    public static void Choice(){
        System.out.println("\t------------------------------------");
        System.out.println("\t BERNOULLI PROBABILITY DISTRIBUTION");
        System.out.println("\t------------------------------------");
        System.out.println("NB: \t A condition is Bernoulli if a trial result to either a success of failure");
        System.out.println("    MENU:");
        System.out.println("1. calculate Bernoulli Distribution");
        System.out.println("2. Bernoulli Mean");
        System.out.println("3. Variance of Bernoulli");
        System.out.println("4. Standard deviation of Bernoulli");
        System.out.println("5. Coefficient of variation");
        System.out.println("6. Exit");
        System.out.println("-----------------------------------------------------------------------");


        System.out.println("Make your choice: ");

        int Input;
        Input = (int) input.nextDouble();
        switch (Input) {
            case 1 -> Ber_Distribution();
            case 2 -> Ber_Mean();
            case 3 -> Ber_Variance();
            case 4 -> Ber_SD();
            case 5 -> Ber_CV();
            case 6 -> exit(0);

            default -> System.out.println("you've made a wrong choice... ");
        }
    }

    public static void main(String[] args) {


        Choice();

     }


    }
