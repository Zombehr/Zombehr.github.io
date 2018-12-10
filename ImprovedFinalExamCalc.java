package personal_package;
import javax.swing.JOptionPane;

public class ImprovedFinalExamCalc 
{
	public static void main(String[] args) {
		String answer;
		answer = JOptionPane.showInputDialog("Do you have a specific grade percentage you need in the class?");
		if(answer.charAt(0) == 'Y' || answer.charAt(0) == 'y')
		{		
			String currentGrade;
			currentGrade = JOptionPane.showInputDialog("What is your current percentage?");
			float current = Float.parseFloat(currentGrade);
			float pCurrent = (current/100);
		
			String gradeRequired;
			gradeRequired = JOptionPane.showInputDialog("What percentage do you need to get in the class?");
			float required = Float.parseFloat(gradeRequired);
			float pRequired = (required/100);
			
			String finalWeight;
			finalWeight = JOptionPane.showInputDialog("What is the weight of the final exam?");
			float weight = Float.parseFloat(finalWeight);
			float pWeight = (weight/100);
			
			float neededGrade = ((pRequired - (1-pWeight)*pCurrent)/pWeight)*100;
			JOptionPane.showMessageDialog(null, "You need a " + neededGrade + "% on the final.");
		}
		else
		{
			float gradeForA, gradeForB, gradeForC, gradeForD;
			float a = (float) .9, b= (float) .8, c=(float) .7, d=(float) .6;
			String currentGrade;
			currentGrade = JOptionPane.showInputDialog("What is your current percentage?");
			float current = Float.parseFloat(currentGrade);
			float pCurrent = (current/100);
			
			String finalWeight;
			finalWeight = JOptionPane.showInputDialog("What is the weight of the final exam?");
			float weight = Float.parseFloat(finalWeight);
			float pWeight = (weight/100);
			
			gradeForA = ((a - (1-pWeight)*pCurrent)/pWeight)*100;
			gradeForB = ((b - (1-pWeight)*pCurrent)/pWeight)*100;
			gradeForC = ((c - (1-pWeight)*pCurrent)/pWeight)*100;
			gradeForD = ((d - (1-pWeight)*pCurrent)/pWeight)*100;
			JOptionPane.showMessageDialog(null, "You need: " + gradeForA + "% for an A\n You need: " +
			gradeForB + "% for a B\n You need: " + gradeForC +"% for a C\n You need: " + gradeForD + 
			"% for a D\n Otherwise you fail the class.");
		}
	}
}