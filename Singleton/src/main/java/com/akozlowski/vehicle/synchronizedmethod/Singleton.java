package com.akozlowski.vehicle.synchronizedmethod;

public class Singleton {
    // the private reference to one and only instance
    private static Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    /**
     * The Singleton constructor
     * Note that it is private!
     * No client can instantiate a Singleton object!
     */
    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

    public void setData(final int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
