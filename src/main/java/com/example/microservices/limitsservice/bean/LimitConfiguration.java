package com.example.microservices.limitsservice.bean;

public class LimitConfiguration {

    private int maximim;
    private int minimu;

    public LimitConfiguration(int maximim, int minimu) {
        this.maximim = maximim;
        this.minimu = minimu;
    }

    protected LimitConfiguration(){}

    public int getMaximim() {
        return maximim;
    }

    public int getMinimu() {
        return minimu;
    }
}
