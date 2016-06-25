package de.renesesgoer.mathematics;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Mathematics {
  
  public static void main(String[] args) {
    
    JFrame frame = new JFrame("ggT berechnen");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout(FlowLayout.LEFT));
   
    frame.add(new JLabel("Number 1: "));
    final JTextField firstNumber = new JTextField(10);
    frame.add(firstNumber);
    frame.add(new JLabel("  Number 2: "));
    final JTextField secondNumber = new JTextField(10);
    frame.add(secondNumber);
    JButton button = new JButton("Calculate");
    frame.add(button);
    JLabel resultLabel = new JLabel();
    frame.add(resultLabel);
    
    button.addActionListener(new ActionListener() {
      @Override public void actionPerformed(ActionEvent event) {
        try { // calculation
          int num1 = Integer.parseInt(firstNumber.getText());
          int num2 = Integer.parseInt(secondNumber.getText());
          resultLabel.setText(Integer.toString(getGreatestCommonDivisor(num1, num2)));
        }
        catch (NumberFormatException ex) {
          resultLabel.setText("Ganzzahlwerte eingeben!");
        }
      }
    });
    
    frame.setSize(800,60);
    frame.setVisible(true);
  }
  
  /*
   * Calculates the greatest common divisor 
   */
  static int getGreatestCommonDivisor(int num1, int num2) {
    
    int rest1 = (num1 > num2) ? num2 : num1; // smaller number (later the larger rest)
    int rest2 = (num1 > num2) ? (num1 % num2) : (num2 % num1); // larger number (later the new, smaller rest)
    
    if (num1 == num2) { // if both numbers are equal
      return num1;
    }
    else if (rest2 == 0) { // larger divided by smaller has no rest
      return rest1;
    }
    else { // if numbers are not equal
      while (rest2 != 0) {
        int temp = rest2;
        rest2 = rest1 % rest2;
        rest1 = temp;
      }
    }
    return rest1;
    
  }
  
}
