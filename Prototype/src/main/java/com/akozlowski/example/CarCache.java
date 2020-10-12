package com.akozlowski.example;

import com.akozlowski.prototype.Rectangle;
import com.akozlowski.prototype.Shape;
import com.akozlowski.prototype.Square;

import java.util.Dictionary;
import java.util.Hashtable;

public class CarCache {

    private static final Dictionary<String, BasicCar> carMap = new Hashtable<>();

    private CarCache() {
    }

    public static BasicCar getShape(final String name) {
        final BasicCar carType = carMap.get(name);
        return (BasicCar) carType.clone();
    }

    public static void loadCache() {


        final Nano nano = new Nano();
        carMap.put(nano.getName(), nano);
    }
}
