package com.codecool.ticktock.clocks;

public class WallClock extends Clock{


    public WallClock ( String name ) {
        super(name);
    }

    @Override
    public void say () {
        System.out.println(name + " >> Cuckoo");
    }
}
