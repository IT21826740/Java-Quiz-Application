package lk.dil.quiz_application.test;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestQuestions {
    private String testQuestion;

    public TestQuestions(String testQuestion) {
        this.testQuestion = testQuestion;
    }

    public TestQuestions() {
    }


}
