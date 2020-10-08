package com.akozlowski.billpugh;

public class Singleton {
    // an instance attribute
    private int data = 0;

    /**
     * The Singleton constructor
     * Note that it is private!
     * No client can instantiate a Singleton object!
     */
    private Singleton() {
    }

    private static class SingletonHelper {
        // Nested class is referenced after the getInstance() is called
        private static final Singleton uniqueInstance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.uniqueInstance;
    }

    public void setData(final int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
