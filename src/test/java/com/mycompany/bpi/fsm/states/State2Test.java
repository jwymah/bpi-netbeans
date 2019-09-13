package com.mycompany.bpi.fsm.states;

import com.mycompany.fsm.states.State1;
import com.mycompany.fsm.states.State2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class State2Test {
    State2 state = State2.getInstance();
    
    @Test
    public void output() {
        assertEquals(2, state.output());
    }
    
    @Test
    public void onInput0() {
        assertEquals(State1.getInstance(), state.next(0));
    }
    
    @Test
    public void onInput1() {
        assertEquals(State2.getInstance(), state.next(1));
    }
}
