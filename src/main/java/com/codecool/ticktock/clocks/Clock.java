package com.codecool.ticktock.clocks;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.TimerTask;

public abstract class Clock extends TimerTask {
    private static final int ONE_SECONDS_IN_MILISECONDS = 1000;

    protected String name;

    protected int adjustedClockTimeInSeconds;
    protected int passageOfSeconds;

    public Clock (String name) {
        this.passageOfSeconds = 0 ;
        this.setCorrectSpeed(); // all clocks are set correct
        this.name = name;
    }

    public void run(){
        clockTicking();
        sayTicking();
        System.out.println(printClock());
    }
    public void clockTicking(){
        passageOfSeconds++;
    }

    public void sayTicking (){
        // saying clock every minute
        if (LocalTime.now().getSecond() % 5 == 0){
            say();
        }
    }

    public abstract void say();


    public LocalTime getTime(){
        return LocalTime.now().plusSeconds(adjustedClockTimeInSeconds);
    }
    public String readTime(){
        return getTime().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public Clock adjustClockTimeInSeconds( int secondsToAdjust){
        adjustedClockTimeInSeconds = secondsToAdjust;
        return this;
    }

    public void setCorrectSpeed (){
        this.adjustedClockTimeInSeconds = 0;
    }

    public String printClock () {
        return new String(readTime() + " " + getName() + " elapsed: (" + getDuration() + ") ");
    }

    protected String getDuration (){
        Duration duration =  Duration.ofSeconds(passageOfSeconds);
        return LocalTime.MIDNIGHT.plus(duration).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
//        return new String(duration.toMinutes() + ":" + duration.toSeconds());
    }


    public String getName () {
        return name;
    }
}
