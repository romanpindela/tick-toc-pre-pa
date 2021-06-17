package com.codecool.ticktock.clocks;

import java.time.Duration;

public class Watch extends Clock{
    protected final String color;

    public Watch (String name, String color ) {
        super(name);
        this.color = color;
    }

    @Override
    public void say () {
        System.out.println(name + " >> Tick Tock");
    }

    public String printClock () {
        return new String(readTime() + " " + getColor() + " " + getName() + " elapsed: (" + getDuration() + ") ");
    }


    public String getColor () {
        return color;
    }
}
