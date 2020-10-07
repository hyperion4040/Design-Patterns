package com.akozlowski.example.creator;

import com.akozlowski.example.product.actionmovie.ActionMovie;
import com.akozlowski.example.product.actionmovie.BollywoodActionMovie;
import com.akozlowski.example.product.actionmovie.HollywoodActionMovie;
import com.akozlowski.example.product.comedymovie.BollywoodComedyMovie;
import com.akozlowski.example.product.comedymovie.ComedyMovie;

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
