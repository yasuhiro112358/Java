package com.nabeyasu.myapp14;

public class MathScore extends Score {
    MathScore(int score) {
        super("Math", score);
    }

    @Override
    protected String getResult() {
        return this.score >= 50 ? "Pass" : "Fail";
    }
}
