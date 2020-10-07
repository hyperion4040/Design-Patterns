package com.akozlowski.abstractcreator.client;

import com.akozlowski.abstractcreator.factory.CircleFactory;
import com.akozlowski.abstractcreator.factory.RectangleFactory;
import com.akozlowski.abstractcreator.factory.SquareFactory;
import com.akozlowski.abstractcreator.product.Shape;

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
