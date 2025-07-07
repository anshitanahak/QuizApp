import java.util.*;

class Question {
    String questionText;
    String[] options;
    int correctAnswer;

    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public void displayQuestion() {
        System.out.println("\n" + questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctAnswer;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        // Adding questions
        questions.add(new Question("1. What are Java loops?", new String[]{
            "Statements to control flow", "Functions", "Data types", "Variables"}, 1));

        questions.add(new Question("2. What is enhanced for-loop?", new String[]{
            "A better while loop", "A loop that runs infinitely", "For-each loop in Java", "Loop using if-else"}, 3));

        questions.add(new Question("3. How do you handle multiple user inputs?", new String[]{
            "Scanner with nextInt()", "BufferedReader", "Array", "All of the above"}, 4));

        questions.add(new Question("4. How is a switch-case different from if-else?", new String[]{
            "Faster and cleaner in some cases", "Same as if-else", "Used only in loops", "Can’t be used in Java"}, 1));

        questions.add(new Question("5. What are collections in Java?", new String[]{
            "Group of variables", "Framework to store and manipulate data", "Type of arrays", "Java files"}, 2));

        questions.add(new Question("6. What is ArrayList?", new String[]{
            "Resizable array", "Fixed-length array", "Loop structure", "Keyword"}, 1));

        questions.add(new Question("7. How to iterate using iterators?", new String[]{
            "Using for loop", "Using while and hasNext()", "Using recursion", "Using switch"}, 2));

        questions.add(new Question("8. What is a Map?", new String[]{
            "Geographical structure", "Interface storing key-value pairs", "List", "Array"}, 2));

        questions.add(new Question("9. How to sort a list?", new String[]{
            "Using sort()", "Using loop", "Using scanner", "Using next()"}, 1));

        questions.add(new Question("10. How to shuffle elements?", new String[]{
            "Using Collections.shuffle()", "Using map()", "Using reverse()", "Using list.add()"}, 1));

        int score = 0;

        System.out.println("🎯 Welcome to the Java Quiz!");
        System.out.println("---------------------------");

        for (Question q : questions) {
            q.displayQuestion();
            System.out.print("Your answer (1-4): ");
            int userAnswer;
            try {
                userAnswer = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input. Skipping this question.");
                continue;
            }

            if (q.isCorrect(userAnswer)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong answer.");
            }
        }

        System.out.println("\n🎉 Quiz Finished!");
        System.out.println("You scored: " + score + " out of " + questions.size());
        scanner.close();
    }
}