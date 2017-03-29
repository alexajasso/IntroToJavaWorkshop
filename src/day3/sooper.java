package day3;

import javax.swing.JOptionPane;

public class sooper {
public static void main(String[] args) { 
String name = JOptionPane.showInputDialog("what is your name");	
JOptionPane.showMessageDialog(null,"Hello "+name);
String phone = JOptionPane.showInputDialog("what is your phone number");
String house = JOptionPane.showInputDialog("where do you live");
JOptionPane.showMessageDialog(null, " your phone number is " + phone + " and you live in "+ house)



}
}