package com.akozlowski.vehicle.example.creator;

import com.akozlowski.vehicle.example.product.actionmovie.ActionMovie;
import com.akozlowski.vehicle.example.product.actionmovie.BollywoodActionMovie;
import com.akozlowski.vehicle.example.product.comedymovie.BollywoodComedyMovie;
import com.akozlowski.vehicle.example.product.comedymovie.ComedyMovie;

public class BollywoodMovieFactory implements MovieFactory {
    @Override
    public ActionMovie getActionMovie() {
       return new BollywoodActionMovie();
    }

    @Override
    public ComedyMovie getComedyMovie() {
        return new BollywoodComedyMovie();
    }
}
