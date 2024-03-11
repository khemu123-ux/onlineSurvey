package veritech;
import java.util.ArrayList;
import java.util.List;

public class Survey {

		
		    private String title;
		    private List<Question> questions;

		    public Survey(String title) {
		        this.title = title;
		        this.questions = new ArrayList<>();
		    }

		    public String getTitle() {
		        return title;
		    }

		    public void setTitle(String title) {
		        this.title = title;
		    }

		    public List<Question> getQuestions() {
		        return questions;
		    }

		    public void setQuestions(List<Question> questions) {
		        this.questions = questions;
		    }

		    public void addQuestion(Question question) {
		        questions.add(question);
		    }
		}

		class Question {
		    private String text;
		    private QuestionType type;

		    public Question(String text, QuestionType type) {
		        this.text = text;
		        this.type = type;
		    }

		
		    public String getText() {
		        return text;
		    }

		    public void setText(String text) {
		        this.text = text;
		    }

		    public QuestionType getType() {
		        return type;
		    }

		    public void setType(QuestionType type) {
		        this.type = type;
		    }
		}

		
		enum QuestionType {
		    MULTIPLE_CHOICE,
		    TEXT_INPUT,
		    RATING_SCALE
		}

	


