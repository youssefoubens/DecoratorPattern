package com.youssef.deco;

import com.youssef.boisson.Boisson;

public class Choco extends Decorator{


    public Choco(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return super.cout()+10;
    }
    @Override
    public String getDescription() {
        return super.getDescription()+" Choco";
    }
}
