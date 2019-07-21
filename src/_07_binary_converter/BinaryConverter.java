package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener{
public static void main(String[] args) {
	BinaryConverter binary = new BinaryConverter();
	binary.setup();
	
}
JFrame f = new JFrame();
JPanel p = new JPanel();
JTextField t = new JTextField(20);
JButton b = new JButton("Convert"); 
JLabel l = new JLabel("8 bit converter:");
void setup() {

	b.addActionListener(this);
	p.add(b);
	p.add(l);
	p.add(t);
	f.add(p);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.pack();
	
}
String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String text = t.getText();
	text = convert(text);
	l.setText(text);
	f.pack();
}
}
