////////////////////////////////////////////////////////////////////
// [RAUL] [PIANON] [2045040]
// [LUCA] [LA ROTONDA] [2042784]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {

        String roman = "";

        if (number <= 0 || number >= 7) {
            throw new IllegalArgumentException();
        }


        if (number <= 6) {
            String array1[] = { "", "I", "II", "III", "IV", "V", "VI"};
            roman = roman + array1[number];
        }

        /* Debug
        System.out.println(roman);
        */
        
        return roman;

    }

}
