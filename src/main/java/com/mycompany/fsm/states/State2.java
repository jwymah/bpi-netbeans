package com.mycompany.fsm.states;

public class State2 implements IState {
    
    private static State2 instance = null;
    
    public static State2 getInstance() {
        if (instance == null) {
            instance = new State2();
        }
        return instance;
    }

    @Override
    public IState next(int i) {
        if (i == 0) {
            return State1.getInstance();
        }
        return State2.getInstance();
    }

    @Override
    public int output() {
        return 2;
    }
}
