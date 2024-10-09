package org.example;

public class TennisCoach implements Coach{

    SportsKit sportsKit;

    public void setSportsKit(SportsKit sportsKit) {
        this.sportsKit = sportsKit;
    }

    @Override
    public String sayHello() {
        return "Hello from tennis coach";
    }

    @Override
    public String getSportsKit() {
        return sportsKit.kitGranted();
    }
}
