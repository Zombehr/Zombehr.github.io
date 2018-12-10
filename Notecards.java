package Useful;

//import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Notecards {

	public static void main(String[] args) throws IOException{
		
		String studyingType = JOptionPane.showInputDialog("Would you like to quiz yourself/add new entries or just read the notecards? (enter quiz or read)");
		if(studyingType.charAt(0) == 'r' || studyingType.charAt(0) == 'R') {
			String newFiles = JOptionPane.showInputDialog("Do you need to make a new set of notecards?");
			
			if(newFiles.charAt(0) == 'y' || newFiles.charAt(0) == 'Y') {
				String keywordFileName = JOptionPane.showInputDialog("What would you like to name your keyword text file?");
				String definitionFileName = JOptionPane.showInputDialog("What would you like to name your definitions text file?");
		
				PrintWriter keywords = new PrintWriter(new FileWriter(keywordFileName + ".txt", true));
				PrintWriter definitions = new PrintWriter(new FileWriter(definitionFileName + ".txt", true));
		
				String definition, keyword;
		
				String answer;
		
				answer = JOptionPane.showInputDialog("Do you have new entries?");
		
				if(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y') {
					String numberOfEntries = JOptionPane.showInputDialog("How many entries do you have?");
			
					for(int i = 1; i <= Integer.parseInt(numberOfEntries); i++) {
						keyword = JOptionPane.showInputDialog("What is the keyword?");
						keywords.println(keyword);
				
						definition = JOptionPane.showInputDialog("What is the definition of the word?");
						definitions.println(definition);
					}
			
					keywords.close();
					definitions.close();
				}
		
				/*BufferedReader reader = new BufferedReader(new FileReader("NotecardKeywords.txt"));
				int lines = 0;
				while (reader.readLine() != null) lines++;
				reader.close();
			 	*/
		
				File file1 = new File (keywordFileName + ".txt");
				Scanner keywordOutput = new Scanner(file1);
		
				File file2 = new File (definitionFileName + ".txt");
				Scanner definitionOutput = new Scanner(file2);
		
				while(keywordOutput.hasNext()) {
					JOptionPane.showMessageDialog(null, "Keyword: " + keywordOutput.nextLine() + "\nDefinition: " + definitionOutput.nextLine());
				}
				
			keywordOutput.close();
			definitionOutput.close();
			JOptionPane.showMessageDialog(null, "Your files are located in: " + file1.getAbsolutePath());
			}
			else {
				String chosenKeywordFile = JOptionPane.showInputDialog("What is the name of the keyword text file you'll be using?");
				String chosenDefinitionFile = JOptionPane.showInputDialog("What is the name of the defintion text file you'll be using?");
		
				PrintWriter keywords = new PrintWriter(new FileWriter( chosenKeywordFile + ".txt", true));
				PrintWriter definitions = new PrintWriter(new FileWriter( chosenDefinitionFile + ".txt", true));
		
				String definition, keyword;
				String answer;
		
				answer = JOptionPane.showInputDialog("Do you have new entries?");
	
				if(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y') {
					String numberOfEntries = JOptionPane.showInputDialog("How many entries do you have?");
		
					for(int i = 1; i <= Integer.parseInt(numberOfEntries); i++) {
						keyword = JOptionPane.showInputDialog("What is the keyword?");
						keywords.println(keyword);
			
						definition = JOptionPane.showInputDialog("What is the definition of the word?");
						definitions.println(definition);
					}
		
					keywords.close();
					definitions.close();
				}
	
				/*BufferedReader reader = new BufferedReader(new FileReader("NotecardKeywords.txt"));
				int lines = 0;
				while (reader.readLine() != null) lines++;
				reader.close();
			 	*/
	
				File file1 = new File (chosenKeywordFile + ".txt");
				Scanner keywordOutput = new Scanner(file1);
	
				File file2 = new File (chosenDefinitionFile + ".txt");
				Scanner definitionOutput = new Scanner(file2);
			
				while(keywordOutput.hasNext()) {
					JOptionPane.showMessageDialog(null, "Keyword: " + keywordOutput.nextLine() + "\nDefinition: " + definitionOutput.nextLine());
				}
				keywordOutput.close();
				definitionOutput.close();
				JOptionPane.showMessageDialog(null, "Your files are located in: " + file1.getAbsolutePath());
			}
		}
		else {
		
			String newFiles = JOptionPane.showInputDialog("Do you need to make a new set of notecards?");
		
			if(newFiles.charAt(0) == 'y' || newFiles.charAt(0) == 'Y') {
				String keywordFileName = JOptionPane.showInputDialog("What would you like to name your keyword text file?");
				String definitionFileName = JOptionPane.showInputDialog("What would you like to name your definitions text file?");
		
				PrintWriter keywords = new PrintWriter(new FileWriter( keywordFileName + ".txt", true));
				PrintWriter definitions = new PrintWriter(new FileWriter( definitionFileName + ".txt", true));
		
				String definition, keyword;
		
				String answer;
		
				answer = JOptionPane.showInputDialog("Do you have new entries?");
		
				if(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y') {
					String numberOfEntries = JOptionPane.showInputDialog("How many entries do you have?");
			
					for(int i = 1; i <= Integer.parseInt(numberOfEntries); i++) {
						keyword = JOptionPane.showInputDialog("What is the keyword?");
						keywords.println(keyword);
				
						definition = JOptionPane.showInputDialog("What is the definition of the word?");
						definitions.println(definition);
					}
			
					keywords.close();
					definitions.close();
				}
		
				/*BufferedReader reader = new BufferedReader(new FileReader("NotecardKeywords.txt"));
				int lines = 0;
				while (reader.readLine() != null) lines++;
				reader.close();
			 	*/
		
				File file1 = new File (keywordFileName + ".txt");
				Scanner keywordOutput = new Scanner(file1);
		
				File file2 = new File (definitionFileName + ".txt");
				Scanner definitionOutput = new Scanner(file2);
		
				String preference = JOptionPane.showInputDialog("Would you like to see the keywords and guess the definition, or the other way around?");
				if(preference.charAt(0) == 'k' || preference.charAt(0) == 'K') {	
					while(keywordOutput.hasNext()) {
						String guess = JOptionPane.showInputDialog("Please enter the definition for " + keywordOutput.nextLine());
			
						if(guess.equalsIgnoreCase(definitionOutput.nextLine())) 
							JOptionPane.showMessageDialog(null, "Congratulations!");
						else
							JOptionPane.showMessageDialog(null, "Not quite, the correct definition is " + definitionOutput.nextLine());
					}
				}
				else {
					while(definitionOutput.hasNext()) {
						String guess = JOptionPane.showInputDialog("Please enter the keyword for " + definitionOutput.nextLine());
			
						if(guess.equalsIgnoreCase(keywordOutput.nextLine())) 
							JOptionPane.showMessageDialog(null, "Congratulations!");
						else
						JOptionPane.showMessageDialog(null, "Not quite, the correct definition is " + keywordOutput.nextLine());
					}
				}
				keywordOutput.close();
				definitionOutput.close();
				JOptionPane.showMessageDialog(null, "Your files are located in: " + file1.getAbsolutePath());
			}
			else {
				String chosenKeywordFile = JOptionPane.showInputDialog("What is the name of the keyword text file you'll be using?");
				String chosenDefinitionFile = JOptionPane.showInputDialog("What is the name of the defintion text file you'll be using?");
			
				PrintWriter keywords = new PrintWriter(new FileWriter(chosenKeywordFile + ".txt", true));
				PrintWriter definitions = new PrintWriter(new FileWriter(chosenDefinitionFile + ".txt", true));
			
				String definition, keyword;
				String answer;
			
				answer = JOptionPane.showInputDialog("Do you have new entries?");
		
				if(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y') {
					String numberOfEntries = JOptionPane.showInputDialog("How many entries do you have?");
			
					for(int i = 1; i <= Integer.parseInt(numberOfEntries); i++) {
						keyword = JOptionPane.showInputDialog("What is the keyword?");
						keywords.println(keyword);
				
						definition = JOptionPane.showInputDialog("What is the definition of the word?");
						definitions.println(definition);
					}
			
					keywords.close();
					definitions.close();
				}
		
				/*BufferedReader reader = new BufferedReader(new FileReader("NotecardKeywords.txt"));
				int lines = 0;
				while (reader.readLine() != null) lines++;
				reader.close();
				*/
		
				File file1 = new File (chosenKeywordFile + ".txt");
				Scanner keywordOutput = new Scanner(file1);
		
				File file2 = new File (chosenDefinitionFile + ".txt");
				Scanner definitionOutput = new Scanner(file2);
		
				String preference = JOptionPane.showInputDialog("Would you like to see the keywords and guess the definition, or the other way around?");
				if(preference.charAt(0) == 'k' || preference.charAt(0) == 'K') {	
					while(keywordOutput.hasNext()) {
						String guess = JOptionPane.showInputDialog("Please enter the definition for " + keywordOutput.nextLine());
			
						if(guess.equalsIgnoreCase(definitionOutput.nextLine())) 
							JOptionPane.showMessageDialog(null, "Congratulations!");
						else
							JOptionPane.showMessageDialog(null, "Not quite, the correct definition is " + definitionOutput.nextLine());
					}
				}
				else {
					while(definitionOutput.hasNext()) {
						String guess = JOptionPane.showInputDialog("Please enter the keyword for " + definitionOutput.nextLine());
			
						if(guess.equalsIgnoreCase(keywordOutput.nextLine())) 
							JOptionPane.showMessageDialog(null, "Congratulations!");
						else {
						JOptionPane.showMessageDialog(null, "Not quite, the correct keyword is " + keywordOutput.nextLine());
					
						}
					}
				}
				keywordOutput.close();
				definitionOutput.close();
				JOptionPane.showMessageDialog(null, "Your files are located in: " + file1.getParent());
			}
		
			System.exit(0);
		}
	}
}
