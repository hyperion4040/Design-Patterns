package com.akozlowski.example.creator;

public class MovieProducer {
    public static MovieFactory getMovieFactory(final String producerName) {
        if (producerName == null) {
            return null;
        }

        if (producerName.equals("Hollywood")) {
            return new HollywoodMovieFactory();
        } else if (producerName.equals("Bollywood")) {
            return new BollywoodMovieFactory();
        } else {
            return null;
        }
    }
}
