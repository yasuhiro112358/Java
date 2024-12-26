package com.nabeyasu.myapp14;

public class EnglishScore extends Score {
    EnglishScore(int score) {
        super("English", score);
    }

    @Override
    protected String getResult() {
        return this.score >= 60 ? "Pass" : "Fail";
    }
}
