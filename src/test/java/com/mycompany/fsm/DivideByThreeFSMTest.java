package com.mycompany.fsm;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivideByThreeFSMTest {
    
    DivideByThreeFSM fsm;
    
    public DivideByThreeFSMTest() {
        fsm = new DivideByThreeFSM();
    }
    
    /**
     * Test typical success cases against the language's built in libraries
     */
    @Test
    public void testCalcRemainder() {
        //remainder 0
        assertEquals(27 % 3, fsm.calcRemainder(Integer.toBinaryString(27)));
        assertEquals(129 % 3, fsm.calcRemainder(Integer.toBinaryString(129)));
        
        //remainder 1
        assertEquals(82 % 3, fsm.calcRemainder(Integer.toBinaryString(82)));
        assertEquals(85 % 3, fsm.calcRemainder(Integer.toBinaryString(85)));
        
        //remainder 2
        assertEquals(5 % 3, fsm.calcRemainder(Integer.toBinaryString(5)));
        assertEquals(32 % 3, fsm.calcRemainder(Integer.toBinaryString(32)));
    }
    
    /**
     * Test that inputs that aren't in binary are rejected
     */
    @Test(expected = NotBinaryException.class)
    public void testCalcRemainderNonBinary() {
        fsm.calcRemainder("1234567890");
    }
    @Test(expected = NotBinaryException.class)
    public void testCalcRemainderRandomLetters() {
        fsm.calcRemainder("(*$#%5");
    }
}
