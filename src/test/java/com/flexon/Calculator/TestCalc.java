package com.flexon.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalc {
        @Test
        public void testAdd() {

            int x = 15;
            int y = 35;
            int result = 50;

            int expected = Calc.add(x, y);
            Assert.assertEquals(result, expected);

        }
        @Test
        public void testSubstract(){

            int x = 15;
            int y = 30;
            int result = -15;

            int expected = Calc.sub(x,y);
            Assert.assertEquals(result, expected);
        }
    }
