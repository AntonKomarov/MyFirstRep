package com.anton.FactoryMethod;

public class CreatorVec extends Creator{
    @Override
    public Var factoryMethod() {
        return new VarVector();
    }
}
