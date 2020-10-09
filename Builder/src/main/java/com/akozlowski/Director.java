package com.akozlowski;

public class Director {
    private Builder builder;

    public void construct(final Builder builder) {
        this.builder = builder;
        this.builder.buildBody();
        this.builder.addHeadlights();
        this.builder.insertWheels();
    }
}
