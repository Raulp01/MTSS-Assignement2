////////////////////////////////////////////////////////////////////
// [RAUL] [PIANON] [2045040]
// [LUCA] [LA ROTONDA] [2042784]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void TestPrimi3Numeri() {

        String num1;
        String num2;
        String num3;

        num1 = IntegerToRoman.convert(1);
        num2 = IntegerToRoman.convert(2);
        num3 = IntegerToRoman.convert(3);

        assertEquals("I", num1);
        assertEquals("II", num2);
        assertEquals("III", num3);

    }
    
    @Test
    public void TestPrimi6Numeri() {

        String num4;
        String num5;
        String num6;

        num4 = IntegerToRoman.convert(4);
        num5 = IntegerToRoman.convert(5);
        num6 = IntegerToRoman.convert(6);

        assertEquals("IV", num4);
        assertEquals("V", num5);
        assertEquals("VI", num6);

    }
    
    @Test(expected = IllegalArgumentException.class)
    public void OutofRange() {
        IntegerToRoman.convert(7);
    }

}
