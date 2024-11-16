package utils;

import java.io.PrintWriter;
import java.util.Arrays;

public class OutputUtils {
    private static PrintWriter pw;

    private OutputUtils() {}

    public static PrintWriter initPrintWriter() {
        if (pw == null) {
            pw = new PrintWriter(System.out);
        }
        return pw;
    }

    public static void printArray(byte[] array) {
        pw.println(Arrays.toString(array));
    }

    public static void printArray(int[] array) {
        pw.println(Arrays.toString(array));
    }

    public static void printArray(double[] array) {
        pw.println(Arrays.toString(array));
    }

    public static void printArray(long[] array) {
        pw.println(Arrays.toString(array));
    }

    public static void printArray(boolean[] array) {
        pw.println(Arrays.toString(array));
    }

    public static void printArray(char[] array) {
        pw.println(Arrays.toString(array));
    }

    public static void closePrintWriter() {
        pw.flush();
        pw.close();
    }
}
