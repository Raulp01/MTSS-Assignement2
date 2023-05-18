////////////////////////////////////////////////////////////////////
// [RAUL] [PIANON] [2045040]
// [LUCA] [LA ROTONDA] [2042784]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {

        String roman = "";

        if (number <= 0 || number >= 21) {
            throw new IllegalArgumentException();
        }

        while (number >= 10) {
            number -= 10;
            roman = roman + "X";
        }

        if (number > 0 && number < 10) {
            String array1[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
            roman = roman + array1[number];
        }

        /*
         * Debug System.out.println(roman);
         */

        return roman;

    }

}
