package com.codecool.ticktock;

import com.codecool.ticktock.clocks.AlarmClock;
import com.codecool.ticktock.clocks.Clock;
import com.codecool.ticktock.clocks.FactoryClock;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class ClockShop {
    private static List<Clock> clocks;

    public static void main ( String[] args ) {
        clocks = createTestClocks();

        Timer timer = new Timer();
        timer.schedule(new PassageOfTime(clocks), 0, 1000);

    }

    private static List<Clock>  createTestClocks(){
        return List.of (
            FactoryClock.getInstance("Watch", "Black").adjustClockTimeInSeconds(-7),
                ((AlarmClock) FactoryClock.getInstance("AlarmClock")).setAlarm(5),
            FactoryClock.getInstance("WallClock").adjustClockTimeInSeconds(25),
            FactoryClock.getInstance("BigBen")
        );
    }

}
