package com.akozlowski.example.client;

import com.akozlowski.example.creator.MovieFactory;
import com.akozlowski.example.product.actionmovie.ActionMovie;
import com.akozlowski.example.creator.MovieProducer;
import com.akozlowski.example.product.comedymovie.ComedyMovie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        final MovieFactory hollywood = MovieProducer.getMovieFactory("Hollywood");
        final ActionMovie hollywoodActionMovie = hollywood.getActionMovie();
        logger.info(hollywoodActionMovie.getActionMovie());

        final ComedyMovie hollywoodComedyMovie = hollywood.getComedyMovie();
        logger.info(hollywoodComedyMovie.getComedyMovie());

        final MovieFactory bollywood = MovieProducer.getMovieFactory("Bollywood");
        final ComedyMovie bollywoodComedyMovie = bollywood.getComedyMovie();
        logger.info(bollywoodComedyMovie.getComedyMovie());

        final ActionMovie bollywoodActionMovie = bollywood.getActionMovie();
        logger.info(bollywoodActionMovie.getActionMovie());

    }
}
