package com.codecool.ticktock.clocks;

import java.sql.SQLOutput;

public class AlarmClock extends Clock{
    protected int sleepTimeInSeconds;

    public AlarmClock ( String name ) {
        super(name);
    }

    public void run(){
        clockTicking();
        sayTicking();
        System.out.println(printClock());
        activateAlarm();
    }

    private void activateAlarm () {
        if (sleepTimeInSeconds == 0){
            System.out.println(name + " >> " + "ALARM !! ALARM !! ");
        }
        sleepTimeInSeconds--;
    }


    @Override
    public void say () {
        System.out.println(name + " >> Buzzz");
    }

    public AlarmClock setAlarm( int sleepTimeInSeconds){
        this.sleepTimeInSeconds = sleepTimeInSeconds;
        return this;
    }
}
