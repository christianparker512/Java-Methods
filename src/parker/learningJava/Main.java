package parker.learningJava;

public class Main {

    public static void main(String[] args) {
//	boolean gameOver = true;
//	int score = 800;
//	int levelCompleted = 5;
//	int bonus = 100;

	calculateScore(true, 800, 5, 100);
	calculateScore(true, 10000, 8, 200);

//	if(gameOver){
//		int finalScore = score + (levelCompleted * bonus);
//		System.out.println("Your final score was " + finalScore);
//	}
}
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 10000;
			System.out.println("Your final score was " + finalScore);
		}
	}
}
