import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Percentage Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100, 50);
        frame.setLayout(new GridLayout(4, 2));

        // Create the components
        JLabel totalLabel = new JLabel("Total Amount:");
        JTextField totalField = new JTextField();
        JLabel percentageLabel = new JLabel("Percentage:");
        JTextField percentageField = new JTextField();
        JButton calculateButton = new JButton("Calculate");
        JLabel resultLabel = new JLabel("Result:");

        // Add components to the frame
        frame.add(totalLabel);
        frame.add(totalField);
        frame.add(percentageLabel);
        frame.add(percentageField);
        frame.add(calculateButton);
        frame.add(resultLabel);

        // Action listener for the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get input values
                    double total = Double.parseDouble(totalField.getText());
                    double percentage = Double.parseDouble(percentageField.getText());

                    // Calculate percentage
                    double result = (total * percentage) / 100;

                    // Display result
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers.");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
