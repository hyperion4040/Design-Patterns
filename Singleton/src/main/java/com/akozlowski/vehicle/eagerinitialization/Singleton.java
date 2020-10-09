package com.akozlowski.vehicle.eagerinitialization;

public class Singleton {
    // the private reference to one and only instance
    private static final Singleton uniqueInstance = new Singleton();

    // an instance attribute
    private int data = 0;

    /**
     * The Singleton constructor
     * Note that it is private!
     * No client can instantiate a Singleton object!
     */
    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(final int data) {
        this.data = data;
    }
}
