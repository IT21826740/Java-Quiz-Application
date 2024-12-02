package lk.dil.quiz_application;

import jakarta.validation.Valid;
import lk.dil.quiz_application.test.TestQuestions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
public class QuizController {

    @GetMapping(value = "/questions")
    public List<Questions> getQuestions() {
        int totalQuestionsAttempted = 0;
        int correctAnswersCount = 0;
        List<Questions> questionList = new ArrayList<>();
        List<Answers> answersList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        questionList.add(new Questions(" What is the default value of a boolean in Java?\r\n" +
                "A. true\r\n" +
                "B. false\r\n" +
                "C. null\r\n" +
                "D. 0\r\n"));

        questionList.add(new Questions(" Which of the following is not a Java keyword?\r\n" +
                "A. static\r\n" +
                "B. new\r\n" +
                "C. goto\r\n" +
                "D. main\r\n"));

        questionList.add(new Questions(" What is the size of an int in Java?\r\n" +
                "A. 16 bits\r\n" +
                "B. 32 bits\r\n" +
                "C. 64 bits\r\n" +
                "D. 8 bits\r\n"));

        questionList.add(new Questions(" Which method is used to start a thread in Java?\r\n" +
                "A. run()\r\n" +
                "B. start()\r\n" +
                "C. init()\r\n" +
                "D. execute()\r\n"));

        questionList.add(new Questions(" Which of the following is a checked exception in Java?\r\n" +
                "A. NullPointerException\r\n" +
                "B. ClassCastException\r\n" +
                "C. IOException\r\n" +
                "D. ArrayIndexOutOfBoundsException\r\n"));

        questionList.add(new Questions(" What does the final keyword mean when applied to a class?\r\n" +
                "A. The class can be subclassed\r\n" +
                "B. The class cannot be subclassed\r\n" +
                "C. The class variables are static\r\n" +
                "D. The class cannot contain methods\r\n"));

        questionList.add(new Questions(" What is the output of the following code?\r\n" +
                "public class Test {\r\n" +
                "   public static void main(String[] args) {\r\n" +
                "       int x = 5;\r\n" +
                "       x = x++ + ++x;\r\n" +
                "       System.out.println(x);\r\n" +
                "   }\r\n" +
                "}\r\n" +
                "A. 11\r\n" +
                "B. 12\r\n" +
                "C. 10\r\n" +
                "D. 13\r\n"));

        questionList.add(new Questions(" Which of the following is a marker interface?\r\n" +
                "A. Serializable\r\n" +
                "B. Comparable\r\n" +
                "C. Runnable\r\n" +
                "D. Cloneable\r\n"));

        questionList.add(new Questions("  How does Java achieve platform independence?\r\n" +
                "A. By compiling directly to machine code\r\n" +
                "B. By using the Java Virtual Machine (JVM)\r\n" +
                "C. By using C as the underlying language\r\n" +
                "D. By using a platform-specific compiler\r\n"));

        questionList.add(new Questions(" Which collection class allows you to store key-value pairs and allows duplicate values?\r\n" +
                "A. HashMap\r\n" +
                "B. HashSet\r\n" +
                "C. TreeSet\r\n" +
                "D. ArrayList\r\n"));


        questionList.add(new Questions("Which of the following is true about inheritance in Java?\r\n" +
                "A. A class can inherit multiple classes.\r\n" +
                "B. A class can extend only one class but implement multiple interfaces.\r\n" +
                "C. Interfaces cannot be inherited.\r\n" +
                "D. You cannot use the super keyword with inheritance.\r\n"));

        questionList.add(new Questions(" What is the purpose of the super keyword in Java?\r\n" +
                "A. To call the parent class constructor\r\n" +
                "B. To create a new superclass\r\n" +
                "C. To create a new subclass\r\n" +
                "D. To implement an interface\r\n"));

        questionList.add(new Questions(" What is method overloading?\r\n" +
                "A. Defining multiple methods with the same name but different parameters\r\n" +
                "B. Two methods with the same name and parameters in different classes\r\n" +
                "C. Defining a method with more than one return type\r\n" +
                "D. Using final with methods\r\n"));

        questionList.add(new Questions(" What is method overriding in Java?\r\n" +
                "A. Two methods with different names but the same signature\r\n" +
                "B. A subclass redefining a method from its superclass\r\n" +
                "C. Declaring multiple methods with the same name in one class\r\n" +
                "D. Methods that return multiple values\r\n"));

        questionList.add(new Questions(" Which of the following is not an access modifier in Java?\r\n" +
                "A. public\r\n" +
                "B. protected\r\n" +
                "C. default\r\n" +
                "D. transient\r\n"));

        questionList.add(new Questions(" Which interface must be implemented to create a thread in Java?\r\n" +
                "A. Runnable\r\n" +
                "B. Threadable\r\n" +
                "C. Executor\r\n" +
                "D. Callable\r\n"));

        questionList.add(new Questions(" What is the purpose of the synchronized keyword?\r\n" +
                "A. To make variables immutable\r\n" +
                "B. To ensure thread safety\r\n" +
                "C. To stop a thread\r\n" +
                "D. To restart a thread\r\n"));

        questionList.add(new Questions(" What is the state of a thread when yield() is called?\r\n" +
                "A. Blocked\r\n" +
                "B. Runnable\r\n" +
                "C. Dead\r\n" +
                "D. Waiting\r\n"));

        questionList.add(new Questions("( What method is used to pause a thread for a specified time?\r\n" +
                "A. wait()\r\n" +
                "B. sleep()\r\n" +
                "C. pause()\r\n" +
                "D. hold()\r\n"));

        questionList.add(new Questions(" Which method can stop a thread safely?\r\n" +
                "A. stop()\r\n" +
                "B. terminate()\r\n" +
                "C. Use of a flag with interrupt()\r\n" +
                "D. kill()\r\n"));

        questionList.add(new Questions(" Which exception is thrown when an array is accessed with an illegal index?\r\n" +
                "A. NullPointerException\r\n" +
                "B. ArrayIndexOutOfBoundsException\r\n" +
                "C. ClassCastException\r\n" +
                "D. IllegalArgumentException\r\n"));

        questionList.add(new Questions(" Which block must be included in a try-catch-finally structure?\r\n" +
                "A. try\r\n" +
                "B. catch\r\n" +
                "C. finally\r\n" +
                "D. Both catch and finally\r\n"));

        questionList.add(new Questions(" What is the parent class of all exceptions in Java?\r\n" +
                "A. RuntimeException\r\n" +
                "B. Throwable\r\n" +
                "C. Exception\r\n" +
                "D. Error\r\n"));

        questionList.add(new Questions(" Which of the following is an unchecked exception?\r\n" +
                "A. IOException\r\n" +
                "B. SQLException\r\n" +
                "C. NullPointerException\r\n" +
                "D. FileNotFoundException\r\n"));

        questionList.add(new Questions(" What happens if a finally block has a return statement?\r\n" +
                "A. It overrides any previous return from try or catch.\r\n" +
                "B. It causes a compilation error.\r\n" +
                "C. It is ignored completely.\r\n" +
                "D. It executes but does not override the previous return.\r\n"));

        questionList.add(new Questions(" Which collection class is used to store key-value pairs and maintains insertion order?\r\n" +
                "A. HashMap\r\n" +
                "B. LinkedHashMap\r\n" +
                "C. TreeMap\r\n" +
                "D. Hashtable\r\n"));

        questionList.add(new Questions(" Which of the following does not allow duplicate elements?\r\n" +
                "A. ArrayList\r\n" +
                "B. HashSet\r\n" +
                "C. LinkedList\r\n" +
                "D. Vector\r\n"));

        questionList.add(new Questions(" How do you convert an Array to a List in Java?\r\n" +
                "A. Arrays.toList()\r\n" +
                "B. List.of()\r\n" +
                "C. Arrays.asList()\r\n" +
                "D. Collections.toList()\r\n"));

        questionList.add(new Questions(" Which class implements the Queue interface in Java?\r\n" +
                "A. HashMap\r\n" +
                "B. LinkedList\r\n" +
                "C. TreeSet\r\n" +
                "D. Vector\r\n"));

        questionList.add(new Questions(" What is the time complexity for accessing an element by index in an ArrayList?\r\n" +
                "A. O(1)\r\n" +
                "B. O(n)\r\n" +
                "C. O(log n)\r\n" +
                "D. O(n^2)\r\n"));

        questionList.add(new Questions(" What is a lambda expression in Java?\r\n" +
                "A. A concise way to implement interfaces with a single abstract method\r\n" +
                "B. A type of exception\r\n" +
                "C. A feature of older Java versions\r\n" +
                "D. A method to create objects\r\n"));

        questionList.add(new Questions(" What is the purpose of the default keyword in interfaces?\r\n" +
                "A. To declare default access level\r\n" +
                "B. To provide a method with a default implementation\r\n" +
                "C. To make the interface final\r\n" +
                "D. To initialize variables\r\n"));

        questionList.add(new Questions(" Which functional interface is used in lambda expressions for returning a value?\r\n" +
                "A. Runnable\r\n" +
                "B. Predicate\r\n" +
                "C. Supplier\r\n" +
                "D. Callable\r\n"));

        questionList.add(new Questions(" What is the difference between == and equals() in Java?\r\n" +
                "A. == checks reference equality, equals() checks value equality.\r\n" +
                "B. Both check value equality.\r\n" +
                "C. equals() checks reference equality, == checks value equality.\r\n" +
                "D. Both check reference equality.\r\n"));

        questionList.add(new Questions(" What is the purpose of the volatile keyword?\r\n" +
                "A. It allows caching of variables by threads.\r\n" +
                "B. It makes variables thread-safe by ensuring visibility across threads.\r\n" +
                "C. It is used to stop threads.\r\n" +
                "D. It prevents variable modification.\r\n"));

        questionList.add(new Questions(" Which class is used to read input from a file in Java?\r\n" +
                "A. FileInputStream\r\n" +
                "B. BufferedWriter\r\n" +
                "C. FileReader\r\n" +
                "D. PrintWriter\r\n"));

        questionList.add(new Questions(" Which method is used to write data to a file in FileWriter?\r\n" +
                "A. write()\r\n" +
                "B. append()\r\n" +
                "C. flush()\r\n" +
                "D. store()\r\n"));

        questionList.add(new Questions(" What does the flush() method do in Java I/O?\r\n" +
                "A. Clears the file\r\n" +
                "B. Writes buffered data to the output stream\r\n" +
                "C. Closes the stream\r\n" +
                "D. Reads data into the buffer\r\n"));

        questionList.add(new Questions(" Which stream is used for reading binary data in Java?\r\n" +
                "A. DataOutputStream\r\n" +
                "B. InputStream\r\n" +
                "C. BufferedReader\r\n" +
                "D. OutputStream\r\n"));

        questionList.add(new Questions(" What is the correct way to close a file in Java?\r\n" +
                "A. file.close();\r\n" +
                "B. close(file);\r\n" +
                "C. file.flush();\r\n" +
                "D. System.close(file);\r\n"));

        questionList.add(new Questions(" What is the role of BufferedReader in Java I/O?\r\n" +
                "A. Reads data line by line\r\n" +
                "B. Writes data to the buffer\r\n" +
                "C. Reads only one character at a time\r\n" +
                "D. Used for binary data\r\n"));

        questionList.add(new Questions(" What is the primary purpose of Java garbage collection?\r\n" +
                "A. Reclaim memory occupied by unreachable objects\r\n" +
                "B. Organize memory allocation\r\n" +
                "C. Create objects automatically\r\n" +
                "D. Monitor thread execution\r\n"));

        questionList.add(new Questions(" How can you request garbage collection in Java?\r\n" +
                "A. System.gc()\r\n" +
                "B. Runtime.exit()\r\n" +
                "C. GarbageCollector.invoke()\r\n" +
                "D. Thread.stop()\r\n"));

        questionList.add(new Questions(" What is the final state of an object eligible for garbage collection?\r\n" +
                "A. Accessible\r\n" +
                "B. Inaccessible\r\n" +
                "C. Active\r\n" +
                "D. Pending Finalization\r\n"));

        questionList.add(new Questions(" Which type of reference prevents an object from being garbage collected?\r\n" +
                "A. WeakReference\r\n" +
                "B. SoftReference\r\n" +
                "C. Strong Reference\r\n" +
                "D. PhantomReference\r\n"));

        questionList.add(new Questions(" What does the JVM do during garbage collection?\r\n" +
                "A. Compiles Java code\r\n" +
                "B. Reclaims memory from unreachable objects\r\n" +
                "C. Executes threads\r\n" +
                "D. Manages file I/O\r\n"));


        // Creating answer objects for each question
        Answers answer1 = new Answers("B"); // What is the default value of a boolean in Java?
        Answers answer2 = new Answers("D"); // Which of the following is not a Java keyword?
        Answers answer3 = new Answers("B"); // What is the size of an int in Java?
        Answers answer4 = new Answers("B"); // Which method is used to start a thread in Java?
        Answers answer5 = new Answers("C"); // Which of the following is a checked exception in Java?
        Answers answer6 = new Answers("B"); // What does the final keyword mean when applied to a class?
        Answers answer7 = new Answers("B"); // What is the output of the following code?
        Answers answer8 = new Answers("A"); // Which of the following is a marker interface?
        Answers answer9 = new Answers("B"); // How does Java achieve platform independence?
        Answers answer10 = new Answers("A"); // Which collection class allows you to store key-value pairs and allows duplicate values?
        Answers answer11 = new Answers("B"); // Which of the following is true about inheritance in Java?
        Answers answer12 = new Answers("A"); // What is the purpose of the super keyword in Java?
        Answers answer13 = new Answers("A"); // What is method overloading?
        Answers answer14 = new Answers("B"); // What is method overriding in Java?
        Answers answer15 = new Answers("D"); // Which of the following is not an access modifier in Java?
        Answers answer16 = new Answers("A"); // Which interface must be implemented to create a thread in Java?
        Answers answer17 = new Answers("B"); // What is the purpose of the synchronized keyword?
        Answers answer18 = new Answers("B"); // What is the state of a thread when yield() is called?
        Answers answer19 = new Answers("B"); // What method is used to pause a thread for a specified time?
        Answers answer20 = new Answers("C"); // Which method can stop a thread safely?
        Answers answer21 = new Answers("B"); // Which exception is thrown when an array is accessed with an illegal index?
        Answers answer22 = new Answers("D"); // Which block must be included in a try-catch-finally structure?
        Answers answer23 = new Answers("B"); // What is the parent class of all exceptions in Java?
        Answers answer24 = new Answers("C"); // Which of the following is an unchecked exception?
        Answers answer25 = new Answers("A"); // What happens if a finally block has a return statement?
        Answers answer26 = new Answers("B"); // Which collection class is used to store key-value pairs and maintains insertion order?
        Answers answer27 = new Answers("B"); // Which of the following does not allow duplicate elements?
        Answers answer28 = new Answers("C"); // How do you convert an Array to a List in Java?
        Answers answer29 = new Answers("B"); // Which class implements the Queue interface in Java?
        Answers answer30 = new Answers("A"); // What is the time complexity for accessing an element by index in an ArrayList?
        Answers answer31 = new Answers("A"); // What is a lambda expression in Java?
        Answers answer32 = new Answers("B"); // What is the purpose of the default keyword in interfaces?
        Answers answer33 = new Answers("C"); // Which functional interface is used in lambda expressions for returning a value?
        Answers answer34 = new Answers("A"); // What is the difference between == and equals() in Java?
        Answers answer35 = new Answers("B"); // What is the purpose of the volatile keyword?
        Answers answer36 = new Answers("C"); // Which class is used to read input from a file in Java?
        Answers answer37 = new Answers("A"); // Which method is used to write data to a file in FileWriter?
        Answers answer38 = new Answers("B"); // What does the flush() method do in Java I/O?
        Answers answer39 = new Answers("B"); // Which stream is used for reading binary data in Java?
        Answers answer40 = new Answers("A"); // What is the correct way to close a file in Java?
        Answers answer41 = new Answers("A"); // What is the role of BufferedReader in Java I/O?
        Answers answer42 = new Answers("A"); // What is the primary purpose of Java garbage collection?
        Answers answer43 = new Answers("A"); // How can you request garbage collection in Java?
        Answers answer44 = new Answers("B"); // What is the final state of an object eligible for garbage collection?
        Answers answer45 = new Answers("C"); // Which type of reference prevents an object from being garbage collected?
        Answers answer46 = new Answers("B"); // What does the JVM do during garbage collection?

        answersList.add(answer1);
        answersList.add(answer2);
        answersList.add(answer3);
        answersList.add(answer4);
        answersList.add(answer5);
        answersList.add(answer6);
        answersList.add(answer7);
        answersList.add(answer8);
        answersList.add(answer9);
        answersList.add(answer10);
        answersList.add(answer11);
        answersList.add(answer12);
        answersList.add(answer13);
        answersList.add(answer14);
        answersList.add(answer15);
        answersList.add(answer16);
        answersList.add(answer17);
        answersList.add(answer18);
        answersList.add(answer19);
        answersList.add(answer20);
        answersList.add(answer21);
        answersList.add(answer22);
        answersList.add(answer23);
        answersList.add(answer24);
        answersList.add(answer25);
        answersList.add(answer26);
        answersList.add(answer27);
        answersList.add(answer28);
        answersList.add(answer29);
        answersList.add(answer30);
        answersList.add(answer31);
        answersList.add(answer32);
        answersList.add(answer33);
        answersList.add(answer34);
        answersList.add(answer35);
        answersList.add(answer36);
        answersList.add(answer37);
        answersList.add(answer38);
        answersList.add(answer39);
        answersList.add(answer40);
        answersList.add(answer41);
        answersList.add(answer42);
        answersList.add(answer43);
        answersList.add(answer44);
        answersList.add(answer45);
        answersList.add(answer46);

        System.out.println("Welcome to the Java Quiz!");
        System.out.println("====================================");
        System.out.println("Instructions:");
        System.out.println("1. You will be asked a series of questions.");
        System.out.println("2. Enter the letter (A, B, C, or D) that corresponds to your answer.");
        System.out.println("3. To exit the quiz at any time, type '*'.");
        System.out.println("4. Only valid inputs are 'A', 'B', 'C', or 'D'.");
        System.out.println("====================================\n");

        int currentQuestionIndex = 0;
        int answerIndex = 0;
        while (currentQuestionIndex < questionList.size()) {
            // Display current question with its index
            System.out.println("Question " + (currentQuestionIndex + 1) + ": "
                    + questionList.get(currentQuestionIndex).getQuestion());

            // Prompt for user input
            System.out.print("Enter your answer (or '*' to exit): ");
            String userAnswer = scanner.nextLine();

            // Validate input
            if (!userAnswer.matches("^[A-Da-d*]$")) {
                System.out.println("Invalid input! Please enter a single character from A to D, or '*' to exit.\n");
                continue;  // Prompt the same question again
            }

            // Check if the user wants to exit
            if (userAnswer.equals("*")) {
                System.out.println("You chose to exit the quiz.");
                break;
            }

            // Check the user's answer
            String correctAnswer = answersList.get(currentQuestionIndex).getAnswer();
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
                + totalQuestionsAttempted + " questions correctly.\n\n");

        scanner.close();
        System.out.println(" *****   Thank you for playing!   *****");
        return questionList;
    }
}