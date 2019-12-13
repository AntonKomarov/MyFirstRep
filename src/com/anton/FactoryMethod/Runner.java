package com.anton.FactoryMethod;

public class Runner {
    public static void main(String[] args) {
        Creator[] creators = {new CreatorVar(), new CreatorVec()};

        for (Creator creator:creators){
            Var product = creator.factoryMethod();
            System.out.printf("Created {%s}\n", product.getClass());
        }
    }
}
