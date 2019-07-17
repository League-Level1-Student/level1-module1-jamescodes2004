package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
	Microwave m = new Microwave();	
	String f = JOptionPane.showInputDialog(null, "What is the flavor of the popcorn?");
	Popcorn p = new Popcorn(f);
	m.putInMicrowave(p);
	String ti = JOptionPane.showInputDialog(null, "How many minutes do you want to put the popcorn in the microwave?");
	int t = Integer.parseInt(ti);
	m.setTime(t);
	String b = JOptionPane.showInputDialog(null, "Do you want to start the microwave?");
	if (b.equals("yes")) {
		m.startMicrowave();
p.eat();
	}
	else {
		m.setTime(t);
		
	}
}
}