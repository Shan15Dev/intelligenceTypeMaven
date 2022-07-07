package ch.bbw.intelligencetypemaven.model;

public class Answer {
    private String[] answers;
    private String[] type;

    public Answer(String[] answers, String[] type) {
        this.answers = answers;
        this.type = type;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }
}
