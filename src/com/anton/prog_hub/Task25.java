package com.anton.prog_hub;

class Task25 extends Exception{ }
class Y extends Task25{}
class Ca {
    void doSomething() throws Y{}
}

class Da extends Ca{
    void doSomething() throws Y{}
}
