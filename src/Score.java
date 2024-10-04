package src;

public class Score {
    private String subject;
    private int score;

    Score(String subject, int score) {
        this.subject = subject;
        this.score = score;
    }

    public String getSubject() {
        return this.subject;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getResult() {
        if (this.score >= 90) {
            return "S";
        } else if (this.score >= 80) {
            return "A";
        } else if (this.score >= 70) {
            return "B";
        } else if (this.score >= 60) {
            return "C";
        } else {
            return "D";
        }
    }
}
