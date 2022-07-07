package ch.bbw.intelligencetypemaven.model;

public class Questions {
    private String question;
    private Answer answers;

    public Questions(String question, Answer answers) {
        this.question = question;
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswers() {
        return answers;
    }

    public void setAnswers(Answer answers) {
        this.answers = answers;
    }
}
