package com.codecool.ticktock.clocks;

public class BigBen extends Clock{

    private static BigBen instance = null;

    private BigBen () {
        super("Big Ben");
        name = "Big Ben";
    }

    public static BigBen getInstance () {
        if (instance == null){
            instance =  new BigBen();
        }
        return instance;
    }


    @Override
    public void say () {
        System.out.println(name + " >> Big Ben");
    }
}
