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

        @Test
        public void firstTenNumbers() {

                String letter_X = "__   __ \n" +
                                "\\ \\ / / \n" +
                                " \\ V /  \n" +
                                "  > <   \n" +
                                " / . \\  \n" +
                                "/_/ \\_\\ \n";
                String letter_IX = " _____  __   __ \n" +
                                "|_   _| \\ \\ / / \n" +
                                "  | |    \\ V /  \n" +
                                "  | |     > <   \n" +
                                " _| |_   / . \\  \n" +
                                "|_____| /_/ \\_\\ \n";

                String value_X = RomanPrinter.print(10);
                String value_IX = RomanPrinter.print(9);

                assertEquals(letter_X, value_X);
                assertEquals(letter_IX, value_IX);
        }

        @Test
        public void firstTwentyNumbers() {

                String letter_XX = "__   __ __   __ \n" +
                                "\\ \\ / / \\ \\ / / \n" +
                                " \\ V /   \\ V /  \n" +
                                "  > <     > <   \n" +
                                " / . \\   / . \\  \n" +
                                "/_/ \\_\\ /_/ \\_\\ \n";
                String letter_XVI = "__   __ __      __  _____  \n" +
                                "\\ \\ / / \\ \\    / / |_   _| \n" +
                                " \\ V /   \\ \\  / /    | |   \n" +
                                "  > <     \\ \\/ /     | |   \n" +
                                " / . \\     \\  /     _| |_  \n" +
                                "/_/ \\_\\     \\/     |_____| \n";

                String value_XX = RomanPrinter.print(20);
                String value_XVI = RomanPrinter.print(16);

                assertEquals(letter_XX, value_XX);
                assertEquals(letter_XVI, value_XVI);
        }

        @Test
        public void firstFiftyNumbers() {

                String letter_L = " _       \n" +
                                "| |      \n" +
                                "| |      \n" +
                                "| |      \n" +
                                "| |____  \n" +
                                "|______| \n";
                String letter_XXV = "__   __ __   __ __      __ \n" +
                                "\\ \\ / / \\ \\ / / \\ \\    / / \n" +
                                " \\ V /   \\ V /   \\ \\  / /  \n" +
                                "  > <     > <     \\ \\/ /   \n" +
                                " / . \\   / . \\     \\  /    \n" +
                                "/_/ \\_\\ /_/ \\_\\     \\/     \n";

                String value_L = RomanPrinter.print(50);
                String value_XXV = RomanPrinter.print(25);

                assertEquals(letter_L, value_L);
                assertEquals(letter_XXV, value_XXV);
        }

        @Test
        public void firstHundredNumbers() {

                String letter_C = "  _____  \n" +
                                " / ____| \n" +
                                "| |      \n" +
                                "| |      \n" +
                                "| |____  \n" +
                                " \\_____| \n";
                String letter_LIX = " _        _____  __   __ \n" +
                                "| |      |_   _| \\ \\ / / \n" +
                                "| |        | |    \\ V /  \n" +
                                "| |        | |     > <   \n" +
                                "| |____   _| |_   / . \\  \n" +
                                "|______| |_____| /_/ \\_\\ \n";

                String value_C = RomanPrinter.print(100);
                String value_LIX = RomanPrinter.print(59);

                assertEquals(letter_C, value_C);
                assertEquals(letter_LIX, value_LIX);
        }

        @Test
        public void firstFivehundredNumbers() {

                String letter_D = " _____   \n" +
                                "|  __ \\  \n" +
                                "| |  | | \n" +
                                "| |  | | \n" +
                                "| |__| | \n" +
                                "|_____/  \n";
                String letter_CDXCIX = "  _____   _____   __   __   _____   _____  __   __ \n" +
                                " / ____| |  __ \\  \\ \\ / /  / ____| |_   _| \\ \\ / / \n" +
                                "| |      | |  | |  \\ V /  | |        | |    \\ V /  \n" +
                                "| |      | |  | |   > <   | |        | |     > <   \n" +
                                "| |____  | |__| |  / . \\  | |____   _| |_   / . \\  \n" +
                                " \\_____| |_____/  /_/ \\_\\  \\_____| |_____| /_/ \\_\\ \n";
                String letter_CL = "  _____   _       \n" +
                                " / ____| | |      \n" +
                                "| |      | |      \n" +
                                "| |      | |      \n" +
                                "| |____  | |____  \n" +
                                " \\_____| |______| \n";

                String value_D = RomanPrinter.print(500);
                String value_CDXCIX = RomanPrinter.print(499);
                String value_CL = RomanPrinter.print(150);

                assertEquals(letter_D, value_D);
                assertEquals(letter_CDXCIX, value_CDXCIX);
                assertEquals(letter_CL, value_CL);
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
