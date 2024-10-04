package src.MyApp14;

public abstract class Score implements Loggable {
    private String subject;
    protected int score;

    Score(String subject, int score) {
        this.subject = subject;
        this.score = score;
        this.log();
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

    protected abstract String getResult();

    @Override
    public void log() {
        System.out.println("Instance created: " + this.subject);
    }
}
