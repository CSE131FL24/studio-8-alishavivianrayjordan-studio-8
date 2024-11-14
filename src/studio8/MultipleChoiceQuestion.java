package studio8;

public class MultipleChoiceQuestion extends Question {
	private String [] Choices; //instance variable
		 
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super (prompt, answer, points); 
		Choices = choices;
	}
	
	public void displayPrompt() {
		super.displayPrompt(); //calls method
		for (int i = 0; i < Choices.length; i++) {
			System.out.println(Choices[i]);
		}
		//FIXME
		
		/*
		 * Use the method from the base class to display the prompt,
		 * Then write more code to display all of the choices like so:
		 * 
		 * 1. Choice1
		 * 2. Choice2
		 * 3. Choice3
		 * ...
		 * N. ChoiceN
		 */
		//
	}
	
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("3"));//right
	}

}
