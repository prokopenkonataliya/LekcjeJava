package lekcje;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ModuloOperatorTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter set size (2-9): ");
        int size = scanner.nextInt();

        if ( size <2 || size>9 ) {
            throw new IllegalArgumentException("Size should be between 2 and 9");
        }

        printTable('+', size);
        System.out.println();

        printTable('*', size);
        System.out.println();
    }

    private static void printTable(char operator, int size) {
        printHeader(operator, size);
        printRows(operator, size);
    }

    private static void printHeader(char operator, int size) {
        String line = operator + " " + IntStream.range(0, size)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(line);
    }

    private static void printRows(char operator, int size) {
        IntStream.range(0, size)
                .mapToObj(row -> row + " " + IntStream.range(0, size)
                        .map(digit -> getValue(operator, row, digit, size))
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")))
                .forEach(System.out::println);
    }

    private static int getValue(char operator, int a, int b, int n) {
        return switch (operator) {
            // TODO Implement module operators below:
            case '+' -> 0;
            case '*' -> 0;
            default -> 0;
        };
    }

}
