package com.akozlowski.vehicle.example.creator;

import com.akozlowski.vehicle.example.product.actionmovie.ActionMovie;
import com.akozlowski.vehicle.example.product.actionmovie.HollywoodActionMovie;
import com.akozlowski.vehicle.example.product.comedymovie.ComedyMovie;
import com.akozlowski.vehicle.example.product.comedymovie.HollywoodComedyMovie;

public class HollywoodMovieFactory implements MovieFactory {
    @Override
    public ActionMovie getActionMovie() {
        return new HollywoodActionMovie();
    }

    @Override
    public ComedyMovie getComedyMovie() {
        return new HollywoodComedyMovie();
    }
}
