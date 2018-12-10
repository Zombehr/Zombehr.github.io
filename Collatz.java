package personal_package;

import javax.swing.JOptionPane;

public class Collatz {

	public static void main(String[] args) {

		String numb;
		numb = JOptionPane.showInputDialog("Enter a test number.");
		int n = Integer.parseInt(numb);
		int steps=0;
		
		while(n !=1) {
			if(n%2 == 0) {
				n = (n/2);
			} else {
				n = (3*n) + 1;
			}
			steps++;
		}
		JOptionPane.showMessageDialog(null, "Finished in " + steps + " steps.");
	}

}
