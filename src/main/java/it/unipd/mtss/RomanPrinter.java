////////////////////////////////////////////////////////////////////
// [RAUL] [PIANON] [2045040]
// [LUCA] [LA ROTONDA] [2042784]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    public static String printAsciiArt(String romanNumber) {
        if (romanNumber.isEmpty() || romanNumber.length() >= 13) {
            throw new IllegalArgumentException();
        }
        HashMap<Character, String> romanHash = new HashMap<Character, String>();
        String romanAscii = "";
        for (int i = 0; i < 6; ++i) {
            String romanLine = "";
            int j = 0;
            romanHash.put('I', LetterI(i));
            romanHash.put('V', LetterV(i));
            romanHash.put('X', LetterX(i));
            romanHash.put('L', LetterL(i));
            romanHash.put('C', LetterC(i));
            romanHash.put('D', LetterD(i));
            romanHash.put('M', LetterM(i));
            while (j < romanNumber.length()) {
                char roman_letter = romanNumber.charAt(j);
                romanLine += romanHash.get(roman_letter);
                j++;
            }
            romanAscii += romanLine + "\n";
            romanHash.clear();
        }
        return romanAscii;
    }

    private static String LetterI(int i) {
        String letterI[][] = { { " _____  " },
                { "|_   _| " },
                { "  | |   " },
                { "  | |   " },
                { " _| |_  " },
                { "|_____| " } };
        letterI[i][0].replace("\n", "");
        return letterI[i][0];
    }

    private static String LetterV(int i) {
        String letterV[][] = { { "__      __ " },
                { "\\ \\    / / " },
                { " \\ \\  / /  " },
                { "  \\ \\/ /   " },
                { "   \\  /    " },
                { "    \\/     " } };
        letterV[i][0].replace("\n", "");
        return letterV[i][0];
    }

    private static String LetterX(int i) {
        String letterX[][] = { { "__   __ " },
                { "\\ \\ / / " },
                { " \\ V /  " },
                { "  > <   " },
                { " / . \\  " },
                { "/_/ \\_\\ " } };
        letterX[i][0].replace("\n", "");
        return letterX[i][0];
    }

    private static String LetterL(int i) {
        String letterL[][] = { { " _       " },
                { "| |      " },
                { "| |      " },
                { "| |      " },
                { "| |____  " },
                { "|______| " } };
        letterL[i][0].replace("\n", "");
        return letterL[i][0];
    }

    private static String LetterC(int i) {
        String letterC[][] = { { "  _____  " },
                { " / ____| " },
                { "| |      " },
                { "| |      " },
                { "| |____  " },
                { " \\_____| " } };

        letterC[i][0].replace("\n", "");
        return letterC[i][0];
    }

    private static String LetterD(int i) {
        String letterD[][] = { { " _____   " },
                { "|  __ \\  " },
                { "| |  | | " },
                { "| |  | | " },
                { "| |__| | " },
                { "|_____/  " } };
        letterD[i][0].replace("\n", "");
        return letterD[i][0];
    }

    private static String LetterM(int i) {
        String letterM[][] = { { " __  __  " },
                { "|  \\/  | " },
                { "| \\  / | " },
                { "| |\\/| | " },
                { "| |  | | " },
                { "|_|  |_| " } };
        letterM[i][0].replace("\n", "");
        return letterM[i][0];
    }
}
