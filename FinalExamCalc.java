package personal_package;
import javax.swing.JOptionPane;

public class FinalExamCalc 
{
	public static void main(String[] args)
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
}