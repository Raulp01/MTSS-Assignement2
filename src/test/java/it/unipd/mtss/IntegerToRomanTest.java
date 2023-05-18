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

    @Test
    public void TestPrimi10Numeri() {

        String num7;
        String num8;
        String num9;
        String num10;

        num7 = IntegerToRoman.convert(7);
        num8 = IntegerToRoman.convert(8);
        num9 = IntegerToRoman.convert(9);
        num10 = IntegerToRoman.convert(10);

        assertEquals("VII", num7);
        assertEquals("VIII", num8);
        assertEquals("IX", num9);
        assertEquals("X", num10);

    }

    @Test
    public void TestPrimi20Numeri() {

        String num11;
        String num18;
        String num20;

        num11 = IntegerToRoman.convert(11);
        num18 = IntegerToRoman.convert(18);
        num20 = IntegerToRoman.convert(20);

        assertEquals("XI", num11);
        assertEquals("XVIII", num18);
        assertEquals("XX", num20);
    }

    @Test
    public void TestPrimi50Numeri() {

        String num40;
        String num50;

        num40 = IntegerToRoman.convert(40);
        num50 = IntegerToRoman.convert(50);

        assertEquals("XL", num40);
        assertEquals("L", num50);

    }

    @Test
    public void TestPrimi100Numeri() {

        String num90;
        String num100;

        num90 = IntegerToRoman.convert(90);
        num100 = IntegerToRoman.convert(100);

        assertEquals("XC", num90);
        assertEquals("C", num100);

    }

    public void TestPrimi500Numeri() {

        String num400;
        String num500;

        num400 = IntegerToRoman.convert(400);
        num500 = IntegerToRoman.convert(500);

        assertEquals("CD", num400);
        assertEquals("D", num500);

    }

    @Test(expected = IllegalArgumentException.class)
    public void OutofRangeMin() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void OutofRangeMax() {
        IntegerToRoman.convert(501);
    }

}
