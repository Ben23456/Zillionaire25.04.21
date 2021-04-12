package sample;

public class Game {
    public void main(String[] args) {
        QuestionController qc = new QuestionController();
        Question s1 = new Question(4,"How Old Is Messi","22","27","33","19");
        qc.addQuestions(s1);
        Question s2 = new Question(2,"Who Won the 2019 Masters","Dustin Johnson","Rory Mcilroy","Tiger Woods","Jordan Spieth");
        qc.addQuestions(s2);
        Question s3 = new Question(8,"Who won the 1998 Word Cup","Brazil","Germany","France","England");
        qc.addQuestions(s3);
        Question s4 = new Question(9,"What Town Was Ruby Player Sam Tomkins Born in?","St Helens","Wakefield","WIgan","London");
        qc.addQuestions(s4);
        Question s5 = new Question(6,"Who won the 2019 French Open?","Roger Federer","Novak Djocovic","Rafael Nadal","Gael Monfils");
        qc.addQuestions(s5);

    }
}
