////////////////////////////////////////////////////////////////////
// [RAUL] [PIANON] [2045040]
// [LUCA] [LA ROTONDA] [2042784]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {

        String roman = "";

        if (number <= 0 || number >= 51) {
            throw new IllegalArgumentException();
        }
        
        if(number >= 50) {
            roman = roman + "L";
            number = number - 50;
        }
        
        if (number >= 40) {
            roman = roman + "XL";
            number = number - 40;
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
