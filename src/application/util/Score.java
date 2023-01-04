package application.util;

public class Score {

	public static int score = 0;
	
	static Db db = new Db();
	

	public static void checkAnswer1(String answer1) {

		if (answer1.equals(db.getA1answer())) {
			score++;
		}
	}

	public static void checkAnswer2(String answer2) {

		if (answer2.equals(db.getA2answer())) {
			score++;
		}
	}

	public static void checkAnswer3(String answer3) {

		if (answer3.equals(db.getA3answer())) {
			score++;
		}
	}

	public static void checkAnswer4(String answer4) {

		if (answer4.equals(db.getA4answer())) {
			score++;
		}
	}
	
	public static void checkAnswer5(String answer5) {

		if (answer5.equals(db.getA5answer())) {
			score++;
		}
	}
	
	public static String scoreToString() {
		return Integer.toString(score);	}

}
