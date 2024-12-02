package lk.dil.quiz_application;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Answers {
    @NotNull(message = "Answer is required")
    @Pattern(
            regexp = "^[a-dA-D]$\n",
            message = "Invalid Answer"
    )
    private String answer;

    public Answers(String answer) {
        this.answer = answer;
    }

}

