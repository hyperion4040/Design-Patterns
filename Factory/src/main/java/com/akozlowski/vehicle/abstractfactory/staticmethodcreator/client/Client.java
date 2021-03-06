package com.akozlowski.vehicle.abstractfactory.staticmethodcreator.client;


import com.akozlowski.vehicle.abstractfactory.staticmethodcreator.creator.ShapeFactory;
import com.akozlowski.vehicle.abstractfactory.staticmethodcreator.product.Shape;

public class Client {

    public static void main(String[] args) {

        //get an object of Circle and call its draw method.
        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw();

        //get an object of Square and call its draw method.
        final Shape shape2 = ShapeFactory.getShape("SQUARE");
        shape2.draw();

        //get an object of Rectangle and call its draw method.
        final Shape shape3 = ShapeFactory.getShape("RECTANGLE");
        shape3.draw();
    }
}
