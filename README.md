# Java Quiz Application  

Welcome to the **Java Quiz Application**! This simple quiz app is built using Java Spring Boot and offers a fun, interactive way to test your knowledge with multiple-choice questions.

## Features  
- Accepts answers in the form of single characters: A, B, C, D.  
- Option to exit the quiz anytime by typing `*`.  
- Real-time feedback on answers.  
- Summary of your score at the end of the quiz.

## Requirements  
- Java 8 or higher  
- Spring Boot  
- Maven or Gradle  
- Postman ( for API testing )  

## How to Run the Application  

### Using the Terminal  
1. **Clone the repository:**  
   ```bash  
   git clone https://github.com/IT21826740/Java-quiz-app.git
   cd Java-quiz-app 
   ```  

2. **Build the project:**  
   ```bash  
   ./mvn clean install  
   ```  

3. **Run the application:**  
   ```bash  
   ./mvn spring-boot:run  
   ```  

4. The application will start on port `7575`. You should see the following message in the terminal:  
   ```  
   Welcome to the Java Quiz!  
   ====================================  
   Instructions:  
   1. You will be asked a series of questions.  
   2. Enter the letter (A, B, C, or D) that corresponds to your answer.  
   3. To exit the quiz at any time, type '*'.  
   4. Only valid inputs are 'A', 'B', 'C', or 'D'.  
   ====================================  
   ```  

### Using Postman  
1. **Start the application** as mentioned above.  
2. Open **Postman** and send a `GET` request to the following endpoint:  
   ```  
   http://localhost:7575/questions  
   ```  
   This will return a list of quiz questions in JSON format.  

## Example API Response  
```json  
[  
  { "question": "What is the default value of a boolean in Java?", "options": "A. true, B. false, C. null, D. 0" },  
  { "question": "Which of the following is not a Java keyword?", "options": "A. static, B. new, C. goto, D. main" },  
  { "question": "What is the size of an int in Java?", "options": "A. 16 bits, B. 32 bits, C. 64 bits, D. 8 bits" }  
]  
```  

## Fun Fact  
> **If you don't know how to use the terminal or Postman, are you even a software engineer?** 😉  

## Thank You!  
Enjoy the quiz and see how many questions you can get right.😊  

![Screenshot From 2024-12-02 10-43-30](https://github.com/user-attachments/assets/d5f3a7aa-1134-42c6-9466-46d725698f6a)

![Screenshot From 2024-12-02 10-47-56](https://github.com/user-attachments/assets/ac771441-de47-4f8d-8ca6-2bdda59bf34a)

-- LEARN SPRINGBOOT & JAVA  2024@DIL -- 
