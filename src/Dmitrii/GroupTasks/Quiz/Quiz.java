package Dmitrii.GroupTasks.Quiz;

public interface Quiz {
    int NUMBER_OF_ASKED_QUESTIONS = 10;

    public abstract void setQuestions();
    public int answer(int index);

    public int getRandomNumber();

    public void generateQuestions();

    public void answeredCorrect();

    public void calculateScore();

    public void start();

}
