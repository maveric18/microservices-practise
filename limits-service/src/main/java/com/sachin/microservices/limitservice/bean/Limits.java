package com.sachin.microservices.limitservice.bean;

public class Limits {

    private int maxLimit;
    private int minLimit;

    public Limits() {
    }

    public Limits(int maxLimit, int minLimit) {
        this.maxLimit = maxLimit;
        this.minLimit = minLimit;
    }

    public int getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(int maxLimit) {
        this.maxLimit = maxLimit;
    }

    public int getMinLimit() {
        return minLimit;
    }

    public void setMinLimit(int minLimit) {
        this.minLimit = minLimit;
    }
}
