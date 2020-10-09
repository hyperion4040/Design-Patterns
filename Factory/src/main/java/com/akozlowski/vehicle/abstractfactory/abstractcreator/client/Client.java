package com.akozlowski.vehicle.abstractfactory.abstractcreator.client;

import com.akozlowski.vehicle.abstractfactory.abstractcreator.creator.CircleFactory;
import com.akozlowski.vehicle.abstractfactory.abstractcreator.creator.RectangleFactory;
import com.akozlowski.vehicle.abstractfactory.abstractcreator.creator.SquareFactory;
import com.akozlowski.vehicle.abstractfactory.abstractcreator.product.Shape;

public class Client {
    public static void main(String[] args) {
        //get an object of Circle and call its draw method.
        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();

        //get an object of Square and call its draw method.
        final Shape shape2 = new SquareFactory().getShape();
        shape2.draw();

        //get an object of Rectangle and call its draw method.
        final Shape shape3 = new RectangleFactory().getShape();
        shape3.draw();
    }
}
