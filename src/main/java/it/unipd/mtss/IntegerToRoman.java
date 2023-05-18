////////////////////////////////////////////////////////////////////
// [RAUL] [PIANON] [2045040]
// [LUCA] [LA ROTONDA] [2042784]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {

        String roman = "";

        if (number <= 0 || number >= 4) {
            throw new IllegalArgumentException();
        }


        if (number <= 3) {
            String array1[] = { "", "I", "II", "III"};
            roman = roman + array1[number];
        }

        /* Debug
        System.out.println(roman);
        */
        
        return roman;

    }

}
