package com.codecool.ticktock;

import com.codecool.ticktock.clocks.Clock;

import java.time.Duration;
import java.util.List;
import java.util.TimerTask;

public class PassageOfTime extends TimerTask {
    int counter;

    List<Clock> clocks;

    public PassageOfTime (List<Clock> clocks) {
        this.clocks = clocks;
        counter = 0;
    }

    @Override
    public void run () {
        printClocks();
    }

    protected void printClocks(){

        for (Clock c : clocks){
            clearConsole();
            c.run();
        }
    }

    protected void addClock( Clock c){
        clocks.add(c);
    }

    protected void removeClock( Clock c){
        clocks.remove(c);
    }


    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }


}
