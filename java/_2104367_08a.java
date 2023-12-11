import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _2104367_08a extends JFrame implements ActionListener {
    private JButton pinkButton, yellowButton, greenButton;
    private JLabel resultLabel;

    public _2104367_08a() {
        // Set the layout manager
        setLayout(new FlowLayout());

        // Create buttons
        pinkButton = new JButton("Pink");
        yellowButton = new JButton("Yellow");
        greenButton = new JButton("Green");

        // Add action listeners to buttons
        pinkButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        // Add buttons to the frame
        add(pinkButton);
        add(yellowButton);
        add(greenButton);

        // Create label to display result
        resultLabel = new JLabel();

        // Add label to the frame
        add(resultLabel);

        // Set default close operation and frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Color Change Frame");
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int  result = 0; // Default result is "NO"

        if (e.getSource() == pinkButton) {
            getContentPane().setBackground(Color.RED);
            if (getContentPane().getBackground() == Color.PINK) {
                result = 3;
            }
        } else if (e.getSource() == yellowButton) {
            getContentPane().setBackground(Color.YELLOW);
            if (getContentPane().getBackground() == Color.YELLOW) {
                result = 3;
            }
        } else if (e.getSource() == greenButton) {
            getContentPane().setBackground(Color.GREEN);
            if (getContentPane().getBackground() == Color.GREEN) {
                result = 3;
            }
        }

        resultLabel.setText("Score: " + result);
    }

    public static void main(String[] args) {
        new _2104367_08a();
    }
}

