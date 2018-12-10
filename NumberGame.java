package personal_package;
import javax.swing.JOptionPane;
import java.util.Random;
import java.io.*;
import java.util.Scanner;

public class NumberGame 
{
	public static void main(String[] args)throws IOException 
	{
		PrintWriter output = new PrintWriter(new FileWriter("Scores.txt", true));
		int n, guess, totalGuess = 0;
		Random rand = new Random();
		n = rand.nextInt(100)+1;
		
		String answer;
		answer = JOptionPane.showInputDialog("What number am I thinking of?");
		guess = Integer.parseInt(answer);
		
		while (guess != n)
		{
			if (guess < n)
			{
				JOptionPane.showMessageDialog(null, "Too low! Guess again.");
				answer = JOptionPane.showInputDialog("What number am I thinking of?");
				guess = Integer.parseInt(answer);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Too high! Guess again.");
				answer = JOptionPane.showInputDialog("What number am I thinking of?");
				guess = Integer.parseInt(answer);
			}
			totalGuess++;
		}
		output.println(totalGuess);
		output.close();
		File file = new File ("Scores.txt");
		Scanner highestscore = new Scanner(file);
		int highscore = highestscore.nextInt();
		while (highestscore.hasNextInt())
		{
			int number = highestscore.nextInt();
			
			if (number < highscore)
			{
				highscore = number;
			}
		}
		JOptionPane.showMessageDialog(null, "Congratulations! You guessed the correct number, " 
		+ n + " in " + totalGuess + " tries!\nThe highscore is currently: " + highscore + " guesses.");
		highestscore.close();
		System.exit(0);
	}
}