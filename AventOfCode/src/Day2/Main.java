package Day2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File ff = new File("src\\Day2\\input.txt");
        Scanner scan = new Scanner(ff);

        String data;
        int forward = 0; // horizontal
        int depth = 0; // up decreases    down increases
        int depthP2 = 0; // forward * aim
        int aim = 0; // up decreases    down increases


        while (scan.hasNextLine()) {
            data = scan.next();
            switch (data) {
                case ("forward") -> {
                    data = scan.next();
                    forward = forward + Integer.parseInt(data);
                    depthP2 = depthP2 + ( aim * Integer.parseInt(data) );
                }
                case ("up") -> {
                    data = scan.next();
                    depth = depth - Integer.parseInt(data);
                    aim = aim - Integer.parseInt(data);
                }
                case ("down") -> {
                    data = scan.next();
                    depth = depth + Integer.parseInt(data);
                    aim = aim + Integer.parseInt(data);
                }
            }
        }

        System.out.println("Forward: " + forward);
        System.out.println("Depth: " + depth);
        System.out.println("Part 1: " + (forward * depth));
        System.out.println("\nAim: " + depthP2);
        System.out.println("Depth part 2: " + depthP2);
        System.out.println("Part 2: " + (forward * depthP2));





    }
}
