package se.fronix.dialogrutor.ovning1;

import javax.swing.JOptionPane;

public class Ovning1 {

	
	public static void main(String args[])
	{
		String förnamn, efternamn, ålder;
		
		förnamn = JOptionPane.showInputDialog(null, "Skriv in ditt förnamn:", 
				"Vad är ditt förnamn?", JOptionPane.QUESTION_MESSAGE);
		
		efternamn = JOptionPane.showInputDialog(null, "Skriv in ditt efternamn:", 
				"Vad är ditt efternamn?", JOptionPane.QUESTION_MESSAGE);
		
		ålder = JOptionPane.showInputDialog(null, "Skriv in ålder:", 
				"Hur gammal är du?", JOptionPane.QUESTION_MESSAGE);
		
		int ålderInt = Integer.parseInt(ålder);
		
		
		if (ålderInt > 1 && ålderInt <= 7){
			JOptionPane.showMessageDialog(null, "Välkommen " + förnamn + " " + efternamn + 
					" du är " + ålderInt + " och ska därför gå i förskolan");
		}
		else if (ålderInt > 7 && ålderInt <= 13){
			JOptionPane.showMessageDialog(null, "Välkommen " + förnamn + " " + efternamn + 
					" du är " + ålderInt + " och ska därför gå i grundskolan(1-6)");
		}
		else if (ålderInt > 13 && ålderInt <= 16){
			JOptionPane.showMessageDialog(null, "Välkommen " + förnamn + " " + efternamn + 
					" du är " + ålderInt + " och ska därför gå i högstadiet(7-9)");
		}
		else if (ålderInt > 16 && ålderInt <= 18){
			JOptionPane.showMessageDialog(null, "Välkommen " + förnamn + " " + efternamn + 
					" du är " + ålderInt + " och ska därför gå i gymnasiet(1-3)");
		}else if (ålderInt < 1){
			JOptionPane.showMessageDialog(null, förnamn + " " + efternamn + 
					" är för liten för att börja förskolan.");
		}else if (ålderInt > 18){
			JOptionPane.showMessageDialog(null, förnamn + " " + efternamn + 
					" du är för gammal för att gå i gymnasiet.");
		}
		
		System.exit(0);
	}
}