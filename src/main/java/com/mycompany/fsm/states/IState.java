package com.mycompany.fsm.states;

public interface IState {
    public IState next(int i);
    public int output();
}
