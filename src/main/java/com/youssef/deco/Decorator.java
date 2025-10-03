package com.youssef.deco;

import com.youssef.boisson.Boisson;

public abstract class Decorator extends Boisson {

    Boisson boisson;

    public Decorator(Boisson boisson)
    {
        this.boisson=boisson;
    }
    @Override
    public double cout() {
        return boisson.cout();
    }
    @Override
    public String getDescription() {
        return boisson.getDescription();
    }
}
