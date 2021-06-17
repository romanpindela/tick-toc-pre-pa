package com.codecool.ticktock.clocks;

public class FactoryClock {

    public static Clock getInstance ( String clockType ){
        return switch(clockType.toLowerCase()){
            case "wallclock" -> new WallClock("WallClock");
            case "alarmclock" -> new AlarmClock("AlarmClock");
            case "bigben" -> BigBen.getInstance();
            default -> throw new IllegalStateException("Unexpected value: " + clockType.toLowerCase());
        };
    }

    public static Clock getInstance ( String clockType, String color){
        return switch(clockType.toLowerCase()){
            case "watch" -> new Watch(clockType, color );
            default -> throw new IllegalStateException("Unexpected value: " + clockType.toLowerCase());
        };
    }
}
