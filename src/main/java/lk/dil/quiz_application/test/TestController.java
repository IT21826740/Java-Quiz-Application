package lk.dil.quiz_application.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@RestController
public class TestController {


   /* @PostMapping(value = "/test-answers")
    //need to get answers from terminal and check with testAnswer array list each index
    public void getCorrectAnswer(@RequestBody TestAnswers correctAnswer) {


        /*List<TestAnswers> testAnswersList = new ArrayList<>();
        TestAnswers a1 = new TestAnswers("B");
        TestAnswers a2 = new TestAnswers("D");

        testAnswersList.add(a1);
        testAnswersList.add(a2);


    }*/

    @GetMapping(value = "/test-questions")
    public List<TestQuestions> getAllQuestions() {

        int totalQuestionsAttempted = 0;
        int correctAnswersCount = 0;

        List<TestQuestions> testQuestionsList = new ArrayList<>();
        List<TestAnswers> testAnswersList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        TestQuestions q1 = new TestQuestions("(1). aaaaaa?");
        TestQuestions q2 = new TestQuestions("(2). bbbbbb?");
        testQuestionsList.add(q1);
        testQuestionsList.add(q2);

        TestAnswers a1 = new TestAnswers("B");
        TestAnswers a2 = new TestAnswers("D");
        testAnswersList.add(a1);
        testAnswersList.add(a2);

        int currentQuestionIndex = 0;

        while (currentQuestionIndex < testQuestionsList.size()) {
            // Display current question
            System.out.println("Question " + (currentQuestionIndex + 1) + ": "
                    + testQuestionsList.get(currentQuestionIndex).getTestQuestion());

            // Prompt for user input
            System.out.print("Enter your answer or '*' to exit : ");
            String userAnswer = scanner.nextLine().trim();

            // Validate input
            if (!userAnswer.matches("^[A-Da-d*]$")) {
                System.out.println("Invalid input! Please enter a single character from A to D (or a to d), or '*' to exit.\n");
                continue;  // Prompt the same question again
            }

            // Check if the user wants to exit
            if (userAnswer.equals("*")) {
                System.out.println("You chose to exit the quiz.");
                break;
            }

            // Check the user's answer
            String correctAnswer = testAnswersList.get(currentQuestionIndex).getAnswer();
            totalQuestionsAttempted++;  // Increment total questions attempted

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct! Moving to the next question.\n");
                correctAnswersCount++;  // Increment correct answers count
            } else {
                System.out.println("Incorrect. The correct answer is: " + correctAnswer + "\n");
            }

            currentQuestionIndex++;  // Move to the next question
        }

        // Display the final score
        System.out.println("Quiz Over!");
        System.out.println("You answered " + correctAnswersCount + " out of "
                + totalQuestionsAttempted + " questions correctly.");

        System.out.println("Thank you for playing!");

        scanner.close();
        return testQuestionsList;
    }

}

