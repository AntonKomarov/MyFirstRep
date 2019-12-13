package com.anton.FactoryMethod;

public class CreatorVar extends Creator{
    @Override
    public Var factoryMethod() {
        return new VarScalar();
    }
}
