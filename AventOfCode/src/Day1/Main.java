package Day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\Day1\\input.txt"));

        String currentLine = "188";
        String prevLine = "188";
        int[] inputArray = new int[2000];
        int currentSum = 0;
        int prevSum = 0;
        int count = 0;
        int increase = 0;
        int sumIncrease = 0;
        int lineCount = 0;


        while ((currentLine = br.readLine()) != null) {
            if (Integer.parseInt(currentLine) > Integer.parseInt(prevLine)) {
                increase++;
            }
            prevLine = currentLine;

            inputArray[lineCount] = Integer.parseInt(currentLine);
            lineCount++;
        }
        System.out.println("Part 1 is --> "+increase); // Answer of part 1

        while (count < 1998) {
            currentSum = inputArray[count] + inputArray[count+1] + inputArray[count+2];
            count++;
            if (prevSum != 0 ) {
                if (currentSum > prevSum) {
                    sumIncrease++;
                }
            }
            prevSum = currentSum;
        }
        System.out.println("Part 2 is --> "+sumIncrease); // Answer of part 2




    }
}
