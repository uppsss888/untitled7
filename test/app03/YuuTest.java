package app03;

import org.junit.Test;

import static org.junit.Assert.*;

public class YuuTest {
Yuu y=new Yuu();
    @Test
    public void sum() {

          //  assertTrue(4.5==y.div(9,2));
            assertTrue(1.7==y.div(17,10));
//assertEquals(4,y.div(16,4));



    }

    @Test
    public void div() {
        assertTrue(4==y.div(16,4));
    }
}