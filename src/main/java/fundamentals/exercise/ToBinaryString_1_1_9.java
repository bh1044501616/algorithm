package fundamentals.exercise;

import edu.princeton.cs.algs4.StdOut;

public class ToBinaryString_1_1_9 {

    public static String toBinaryString(int decimal) {
        StringBuilder binaryString = new StringBuilder();
        int currentResult = decimal;
        while (currentResult > 0) {
            binaryString.insert(0, currentResult % 2);
            currentResult /= 2;
        }
        return binaryString.toString();
    }

    public static void main(String[] args) {
        StdOut.println(toBinaryString(2));
    }
}
