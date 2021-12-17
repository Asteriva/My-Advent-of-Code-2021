package Day3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


// Sorry for messy code
public class Main {

    static String data = "";
    static char takenNum;
    static int gammaDec;
    static int epsilonDec;
    static String gammaBin = "";
    static String epsilonBin = "";
    static int ones = 0;
    static int zeros = 0;

    static boolean tests = false;

    public static int scanner(int k) throws IOException {
        File ff = new File("src\\Day3\\input.txt");
        Scanner scan = new Scanner(ff);

        while (scan.hasNextLine()) {
            data = scan.next(); // 12 LENGTH
            takenNum = data.charAt(k);
            if (takenNum == '1') {
                ones++;
            } else {
                zeros++;
            }
        }

        if (ones > zeros) {
            return 1;
        } else {
            return 0;
        }

    }




    public static void main(String[] args) throws IOException {

        for (int kk = 0; kk <= 11; kk++) {
            zeros = 0;
            ones = 0;

            if (scanner(kk) == 1) {
                gammaBin = gammaBin + "1";
                epsilonBin = epsilonBin + "0";
            } else {
                gammaBin = gammaBin + "0";
                epsilonBin = epsilonBin + "1";
            }

            if (tests) {
                System.out.println("\nZeros " + kk + ": " + zeros);
                System.out.println("Ones " + kk + ": " + ones);
            }
        }

        System.out.println("\nGamma binary value: " + gammaBin);
        System.out.println("Epsilon binary value: " + epsilonBin);

        // https://www.javatpoint.com/java-binary-to-decimal
        epsilonDec = Integer.parseInt(epsilonBin,2); // Taking the Decimal values
        gammaDec = Integer.parseInt(gammaBin,2); // Taking the Decimal values

        System.out.println("\nGamma decimal value: " + gammaDec);
        System.out.println("Epsilon decimal value: " + epsilonDec);

        System.out.println("Part 1: " + epsilonDec * gammaDec);

        // I did not understand part 2
        // Edit: im lazy to do it and looks time-consuming LOL


    }
}
