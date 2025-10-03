package com.youssef.boisson;

public class Expresso extends Boisson{
    @Override
    public double cout() {
        return 20;
    }
    public Expresso()
    {
        description=super.description+"de Expresso";
    }



}
