package lk.dil.quiz_application.test;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestAnswers {
    @NotNull(message = "Answer is required")
    @Pattern(
            regexp = "^[a-dA-D]$\n",
            message = "Invalid Answer"
    )
    private String answer;

    public TestAnswers(String answer) {
        this.answer = answer;
    }


}
