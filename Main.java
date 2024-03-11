package veritech;

public class Main {

	    public static void main(String[] args) {
	        Survey survey = new Survey("Customer Satisfaction Survey");
	        survey.addQuestion(new Question("How satisfied are you with our service?", QuestionType.RATING_SCALE));
	        survey.addQuestion(new Question("What is your favorite feature?", QuestionType.TEXT_INPUT));
	        user user = new user("admin", "password", UserRole.ADMIN);
	        System.out.println("Survey Title: " + survey.getTitle());
	        System.out.println("Survey Questions:");
	        for (Question question : survey.getQuestions()) {
	            System.out.println("- " + question.getText());
	        }
	        System.out.println("User: " + user.getUsername() + ", Role: " + user.getRole());
	    }
	}


