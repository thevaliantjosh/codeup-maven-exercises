import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringUtilsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter Something: ");
        String userInput = scanner.nextLine();

        if(!StringUtils.isNumeric(userInput)){
            System.out.printf("You Entered: \"%s\"%n", userInput);
            System.out.printf("\"%s\" is not a number%n", userInput);
        }
        System.out.printf("Flipped Case: %s%n", StringUtils.swapCase(userInput));
        System.out.printf("Reversed: %s%n", StringUtils.reverse(userInput));

    }
}
