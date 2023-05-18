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

    @Test(expected = IllegalArgumentException.class)
    public void ReceiveEmptyString() {
        RomanPrinter.printAsciiArt("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void ReceiveTooLongString() {
        RomanPrinter.printAsciiArt("MDCCCLXXXVIII");
    }
}
