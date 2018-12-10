package statics_project;
import javax.swing.JOptionPane;

public class ResultantForce 
{
	public static void main(String[] args) 
	{
		double iHat = 0;
		double jHat = 0;
		double kHat = 0;
		double resultantForce;
		double alpha;
		double beta;
		double gamma;
		
		String answer;
		answer = JOptionPane.showInputDialog("How many forces are there?");
		int numberOfForces = Integer.parseInt(answer);
		while (numberOfForces <1)
		{
			JOptionPane.showMessageDialog(null, "ERROR: Please enter a valid number.");
			answer = JOptionPane.showInputDialog("How many forces are there?");
			numberOfForces = Integer.parseInt(answer);
		}
		for (int i = 1 ; i <= numberOfForces; i++)
		{
			String x = JOptionPane.showInputDialog("What is the i direction of force " + i + "?");
			float X = Float.parseFloat(x);
			
			String y = JOptionPane.showInputDialog("What is the j direction of force " + i + "?");
			float Y = Float.parseFloat(y);
			
			String z = JOptionPane.showInputDialog("What is the k direction of force " + i + "?");
			float Z = Float.parseFloat(z);
			
			iHat += X;
			jHat += Y;
			kHat += Z;
		}
		resultantForce = Math.sqrt(((iHat*iHat) + (jHat*jHat) + (kHat*kHat)));
		alpha = Math.acos(iHat/resultantForce)*57.2958;
		beta = Math.acos(jHat/resultantForce)*57.2958;
		gamma = Math.acos(kHat/resultantForce)*57.2958;
		JOptionPane.showMessageDialog(null, "The resultant force is " + iHat + "i " + jHat + "j " +
		 kHat + "k with a magnitude of " + resultantForce + ". \nThe coordinate direction angles are: " +
				"\n alpha = " +alpha + " degrees" + "\n beta = " + beta + " degrees" + "\n gamma = "
				+ gamma + " degrees");
		System.exit(0);
	}
}