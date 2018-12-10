package statics_project;
import javax.swing.JOptionPane;

public class Moment 
{
	public static void main(String[] args)
	{
		String response;
		response = JOptionPane.showInputDialog("Do you need to use: \n1. FD \nor \n2. rXF");
		if (response.equals("1"))
		{
			String input;
			input = JOptionPane.showInputDialog("Do you need the magnitude of the force?");
			if (input.charAt(0) == 'Y' || input.charAt(0) == 'y')
			{
				float i;
				float j;
				float k;
				String I;
				String J;
				String K;
				String d;
				float D;
				double magnitude;
				double moment;
	
				I = JOptionPane.showInputDialog("What is the i component of your force?");
				i = Float.parseFloat(I);
				
				J = JOptionPane.showInputDialog("What is the j component of your force?");
				j = Float.parseFloat(J);
				
				K = JOptionPane.showInputDialog("What is the k component of your force?");
				k = Float.parseFloat(K);
				
				magnitude = Math.sqrt(i*i+j*j+k*k);
				
				d = JOptionPane.showInputDialog("What is the perpendicular distance (d)?");
				D = Float.parseFloat(d);
				
				moment = magnitude*D;
				JOptionPane.showMessageDialog(null, "The moment is: \n" + moment);
				System.exit(0);
			}
			else
			{
				String mag;
				double magnitude;
				String D;
				float d;
				double moment;
				
				D = JOptionPane.showInputDialog("What is the perpendicular distance (d)?");
				d = Float.parseFloat(D);
				
				mag = JOptionPane.showInputDialog("What is the magnitude of the force (F)?");
				magnitude = Float.parseFloat(mag);
				
				moment = magnitude * d;
				JOptionPane.showMessageDialog(null, "The moment is: \n" + moment);
				System.exit(0);
			}
		}
		else if (response.equals("2"))
		{
			float i;
			float j;
			float k;
			float i1;
			float j1;
			float k1;
			float solutionI;
			float solutionJ;
			float solutionK;
			double magnitude;
			
			String I;
			I = JOptionPane.showInputDialog("What is the i direction of your first vector?");
			i = Float.parseFloat(I);
			
			String J;
			J = JOptionPane.showInputDialog("What is the j direction of your first vector?");
			j = Float.parseFloat(J);
			
			String K;
			K = JOptionPane.showInputDialog("What is the k direction of your first vector?");
			k = Float.parseFloat(K);
			
			String I1;
			I1 = JOptionPane.showInputDialog("What is the i direction of your second vector?");
			i1 = Float.parseFloat(I1);
			
			String J1;
			J1 = JOptionPane.showInputDialog("What is the j direction of your second vector?");
			j1 = Float.parseFloat(J1);
			
			String K1;
			K1 = JOptionPane.showInputDialog("What is the k direction of your second vector?");
			k1 = Float.parseFloat(K1);
			
			solutionI = (j*k1-k*j1);
			solutionJ = -(i*k1-k*i1);
			solutionK = (i*j1-j*i1);
			JOptionPane.showMessageDialog(null, "The cross product's result is: \n" + solutionI + " i \n" + 
			solutionJ +" j \n" + solutionK + " k \n");
			
			String answer;
			answer = JOptionPane.showInputDialog("Do you need to know the magnitude of the cross product?");
			if (answer.charAt(0) == 'Y' || answer.charAt(0) == 'y')
			{
				magnitude = Math.sqrt((solutionI*solutionI) + (solutionJ*solutionJ) + 
						(solutionK*solutionK));
				JOptionPane.showMessageDialog(null, "The magnitude is: \n" + magnitude);
			}	
			else
				System.exit(0);
		}
		System.exit(0);
	}
}