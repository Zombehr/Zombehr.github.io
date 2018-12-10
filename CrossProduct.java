package statics_project;
import javax.swing.JOptionPane;

public class CrossProduct 
{
	public static void main(String[] args) 
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
}