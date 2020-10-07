package com.akozlowski.example.creator;

import com.akozlowski.example.product.actionmovie.ActionMovie;
import com.akozlowski.example.product.comedymovie.ComedyMovie;

public interface MovieFactory {
    ActionMovie getActionMovie();

    ComedyMovie getComedyMovie();
}
