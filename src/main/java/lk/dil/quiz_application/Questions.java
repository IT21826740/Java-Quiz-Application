package lk.dil.quiz_application;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Questions {
    private String question;

    public Questions(String question) {
        this.question = question;
    }
}