package com.akozlowski.vehicle.example.creator;

import com.akozlowski.vehicle.example.product.actionmovie.ActionMovie;
import com.akozlowski.vehicle.example.product.comedymovie.ComedyMovie;

public interface MovieFactory {
    ActionMovie getActionMovie();

    ComedyMovie getComedyMovie();
}
