package com.mycompany.fsm.states;

public class State1 implements IState {
    
    private static State1 instance = null;
    
    public static State1 getInstance() {
        if (instance == null) {
            instance = new State1();
        }
        return instance;
    }

    @Override
    public IState next(int i) {
        if (i == 0) {
            return State2.getInstance();
        }
        return State0.getInstance();
    }

    @Override
    public int output() {
        return 1;
    }
}
