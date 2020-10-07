package com.akozlowski.abstractfactory.client;

import com.akozlowski.abstractfactory.product.color.Color;
import com.akozlowski.abstractfactory.creator.AbstractFactory;
import com.akozlowski.abstractfactory.creator.FactoryProducer;
import com.akozlowski.abstractfactory.product.shape.Shape;

public class Client {
    public static void main(String[] args) {
        // get shape factory
        final AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        final Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        final Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        final Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        // Get color factory
        final AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        final Color red = colorFactory.getColor("RED");
        red.fill();

        final Color blue = colorFactory.getColor("BLUE");
        blue.fill();

        final Color green = colorFactory.getColor("GREEN");
        green.fill();


    }
}
