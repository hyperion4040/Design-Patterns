package com.akozlowski.example.creator;

import com.akozlowski.example.product.actionmovie.ActionMovie;
import com.akozlowski.example.product.actionmovie.HollywoodActionMovie;
import com.akozlowski.example.product.comedymovie.ComedyMovie;
import com.akozlowski.example.product.comedymovie.HollywoodComedyMovie;

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
