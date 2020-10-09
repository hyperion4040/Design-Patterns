package com.akozlowski.vehicle.abstractfactory.concretecreator.client;


import com.akozlowski.vehicle.abstractfactory.concretecreator.product.Shape;
import com.akozlowski.vehicle.abstractfactory.concretecreator.creator.ShapeFactory;

public class Client {
    public static void main(String[] args) {

        final ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //get an object of Square and call its draw method.
        final Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        //get an object of Rectangle and call its draw method.
        final Shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.draw();
    }
}
