package sample;

import java.util.Arrays;
import java.util.List;

public class Question implements Comparable<Question> {
    private String name;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private int difficulty;

    public Question(int difficulty, String name, String choice1, String choice2, String choice3, String choice4) {
        this.difficulty = difficulty;
        this.name = name;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.choice4 = choice4;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return String.format(" %1s | %2s | %2s | %2s | %2s|  |  |",
                this.name ,this.choice1, this.choice2, this.choice3, this.choice4);
    }


    @Override
    public int compareTo(Question o) {
        return 0;
    }

}