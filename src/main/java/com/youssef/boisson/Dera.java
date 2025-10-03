package com.youssef.boisson;

public class Dera extends Boisson{

    public Dera()
    {
        description=super.description+"de dera";
    }

    @Override
    public double cout() {
        return 12;
    }
}
