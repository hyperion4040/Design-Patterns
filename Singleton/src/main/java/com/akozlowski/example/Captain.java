package com.akozlowski.example;

public class Captain {

    private Captain() {
    }

    public static Captain getInstance() {
        return CaptainHelper.captain;
    }

    private static class CaptainHelper{
        private static final Captain captain = new Captain();
    }
}
