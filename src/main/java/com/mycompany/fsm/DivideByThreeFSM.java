package com.mycompany.fsm;

import com.mycompany.fsm.states.State0;
import com.mycompany.fsm.states.IState;

public class DivideByThreeFSM {
    
    /**
     * Find the remainder of the number when divided by 3
     * Numbers are assumed to be positive
     * @param s -> string with the base 2 representation of the number
     * @return 0, 1, or 2
     */
    public int calcRemainder(String s) {
        if (!isBinary(s)) {
            throw new NotBinaryException(String.format("%s is not in binary number format.", s));
        }
            
        IState state = State0.getInstance();
        
        for (int i = 0; i < s.length(); i++) {
            int bit = Character.getNumericValue(s.charAt(i));
            state = state.next(bit);
        }
        return state.output();
    }
    
    public boolean isBinary(String s) {
        return s.matches("[01]*");
    }
}
