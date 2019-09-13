package com.mycompany.fsm.states;

public class State0 implements IState {
    
    private static State0 instance = null;
    
    public static State0 getInstance() {
        if (instance == null) {
            instance = new State0();
        }
        return instance;
    }

    @Override
    public IState next(int i) {
        if (i == 0) {
            return this;
        }
        return State1.getInstance();
    }

    @Override
    public int output() {
        return 0;
    }
}
