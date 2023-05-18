package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void firstThreeNumbers() {

        String letter_I = " _____  \n" +
                "|_   _| \n" +
                "  | |   \n" +
                "  | |   \n" +
                " _| |_  \n" +
                "|_____| \n";
        String letter_II = " _____   _____  \n" +
                "|_   _| |_   _| \n" +
                "  | |     | |   \n" +
                "  | |     | |   \n" +
                " _| |_   _| |_  \n" +
                "|_____| |_____| \n";
        String letter_III = " _____   _____   _____  \n" +
                "|_   _| |_   _| |_   _| \n" +
                "  | |     | |     | |   \n" +
                "  | |     | |     | |   \n" +
                " _| |_   _| |_   _| |_  \n" +
                "|_____| |_____| |_____| \n";

        String value_I = RomanPrinter.print(1);
        String value_II = RomanPrinter.print(2);
        String value_III = RomanPrinter.print(3);

        assertEquals(letter_I, value_I);
        assertEquals(letter_II, value_II);
        assertEquals(letter_III, value_III);
    }

    @Test
        public void firstSixNumbers() {

                String letter_IV = " _____  __      __ \n" +
                                "|_   _| \\ \\    / / \n" +
                                "  | |    \\ \\  / /  \n" +
                                "  | |     \\ \\/ /   \n" +
                                " _| |_     \\  /    \n" +
                                "|_____|     \\/     \n";
                String letter_V = "__      __ \n" +
                                "\\ \\    / / \n" +
                                " \\ \\  / /  \n" +
                                "  \\ \\/ /   \n" +
                                "   \\  /    \n" +
                                "    \\/     \n";
                String letter_VI = "__      __  _____  \n" +
                                "\\ \\    / / |_   _| \n" +
                                " \\ \\  / /    | |   \n" +
                                "  \\ \\/ /     | |   \n" +
                                "   \\  /     _| |_  \n" +
                                "    \\/     |_____| \n";

                String value_IV = RomanPrinter.print(4);
                String value_V = RomanPrinter.print(5);
                String value_VI = RomanPrinter.print(6);

                assertEquals(letter_V, value_V);
                assertEquals(letter_IV, value_IV);
                assertEquals(letter_VI, value_VI);
        }

    @Test(expected = IllegalArgumentException.class)
    public void ReceiveEmptyString() {
        RomanPrinter.printAsciiArt("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void ReceiveTooLongString() {
        RomanPrinter.printAsciiArt("MDCCCLXXXVIII");
    }
}
