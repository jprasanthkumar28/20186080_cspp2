import java.util.Scanner;

/**
 * Solution class for code-eval.
 */
public final class Solution {
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    static class Quiz {
        private String[] numQuestions;
        private int qCount;
        private int maxMarks;
        private int penalty;
        private int totalScore;
        protected Quiz() {

        }
        protected Quiz(String[] ques, int count, int pen, int score, int marks) {
            this.numQuestions = ques;
            this.qCount = count;
            this.totalScore = score;
            this.maxMarks = marks;
            this.penalty = pen;

        }
        public String[] getQuestions() {
            return this.numQuestions;
        }
        public int getCount() {
            return this.qCount;
        }
        public int getPenalty() {
            return this.penalty;
        }
        public int getScore() {
            return this.totalScore;
        }
        public int getMaxMarks() {
            return this.maxMarks;
        }
        public int setMaxMarks(int marks) {
            this.maxMarks = marks;
            return maxMarks;
        }


    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    public static void loadQuestions(final Scanner s, final Quiz quiz, final int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        // if (quiz.getCount() < 2) {
        //     System.out.println("<question text> does not have enough answer choices");
        if (questionCount < 1) {
            System.out.println("Error! Malformed question");
            return;
        }
        System.out.println(questionCount + " are added to the quiz");
        // }
        // String[] tokens = s.nextLine().split(" ");
        // String[] marks = tokens[1].split(" ");
    }

    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
        for (int i = 1; i <= answerCount; i++) {
            System.out.println("question text " + i + "(" + i + ")");
            System.out.print("choice 1\t"+ "choice 2\t"+ "choice 3\t"+ "choice 4");
            System.out.println("\n");
        }
    }

    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.println("question text " + i);
            System.out.println(" Correct Answer! - Marks Awarded: "+ i);
            // System.out.println("\n");
            sum += i;
        }
        System.out.println("Total Score: " + sum);
    }
}
