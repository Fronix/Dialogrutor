package se.fronix.dialogrutor.ovning1;

import javax.swing.JOptionPane;

public class Ovning1 {

	
	public static void main(String args[])
	{
		String f�rnamn, efternamn, �lder;
		
		f�rnamn = JOptionPane.showInputDialog(null, "Skriv in ditt f�rnamn:", 
				"Vad �r ditt f�rnamn?", JOptionPane.QUESTION_MESSAGE);
		
		efternamn = JOptionPane.showInputDialog(null, "Skriv in ditt efternamn:", 
				"Vad �r ditt efternamn?", JOptionPane.QUESTION_MESSAGE);
		
		�lder = JOptionPane.showInputDialog(null, "Skriv in �lder:", 
				"Hur gammal �r du?", JOptionPane.QUESTION_MESSAGE);
		
		int �lderInt = Integer.parseInt(�lder);
		
		
		if (�lderInt > 1 && �lderInt <= 7){
			JOptionPane.showMessageDialog(null, "V�lkommen " + f�rnamn + " " + efternamn + 
					" du �r " + �lderInt + " och ska d�rf�r g� i f�rskolan");
		}
		else if (�lderInt > 7 && �lderInt <= 13){
			JOptionPane.showMessageDialog(null, "V�lkommen " + f�rnamn + " " + efternamn + 
					" du �r " + �lderInt + " och ska d�rf�r g� i grundskolan(1-6)");
		}
		else if (�lderInt > 13 && �lderInt <= 16){
			JOptionPane.showMessageDialog(null, "V�lkommen " + f�rnamn + " " + efternamn + 
					" du �r " + �lderInt + " och ska d�rf�r g� i h�gstadiet(7-9)");
		}
		else if (�lderInt > 16 && �lderInt <= 18){
			JOptionPane.showMessageDialog(null, "V�lkommen " + f�rnamn + " " + efternamn + 
					" du �r " + �lderInt + " och ska d�rf�r g� i gymnasiet(1-3)");
		}else if (�lderInt < 1){
			JOptionPane.showMessageDialog(null, f�rnamn + " " + efternamn + 
					" �r f�r liten f�r att b�rja f�rskolan.");
		}else if (�lderInt > 18){
			JOptionPane.showMessageDialog(null, f�rnamn + " " + efternamn + 
					" du �r f�r gammal f�r att g� i gymnasiet.");
		}
		
		System.exit(0);
	}
}