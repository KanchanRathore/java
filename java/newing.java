import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class newing {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;

    private JFrame frame;
    private JLabel scoreLabel;
    private JButton blueButton;
    private JButton greenButton;
    private JButton pinkButton;
    private Color currentBackgroundColor;

    public newing() {
        frame = new JFrame("Color Change");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        currentBackgroundColor = Color.WHITE;

        scoreLabel = new JLabel("My Score: 0");
        frame.add(scoreLabel, BorderLayout.NORTH);

        blueButton = new JButton("Blue");
        greenButton = new JButton("Green");
        pinkButton = new JButton("Pink");

        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentBackgroundColor == Color.BLUE) {
                    scoreLabel.setText("My Score: " + (Integer.parseInt(scoreLabel.getText().split(": ")[1]) + 3));
                } else {
                    scoreLabel.setText("My Score: " + (Integer.parseInt(scoreLabel.getText().split(": ")[1]) - 3));
                }
                frame.getContentPane().setBackground(Color.BLUE);
                currentBackgroundColor = Color.BLUE;
            }
        });

        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentBackgroundColor == Color.GREEN) {
                    scoreLabel.setText("My Score: " + (Integer.parseInt(scoreLabel.getText().split(": ")[1]) + 3));
                } else {
                    scoreLabel.setText("My Score: " + (Integer.parseInt(scoreLabel.getText().split(": ")[1]) - 3));
                }
                frame.getContentPane().setBackground(Color.GREEN);
                currentBackgroundColor = Color.GREEN;
            }
        });

        pinkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentBackgroundColor == Color.PINK) {
                    scoreLabel.setText("My Score: " + (Integer.parseInt(scoreLabel.getText().split(": ")[1]) + 3));
                } else {
                    scoreLabel.setText("My Score: " + (Integer.parseInt(scoreLabel.getText().split(": ")[1]) - 3));
                }
                frame.getContentPane().setBackground(Color.PINK);
                currentBackgroundColor = Color.PINK;
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(blueButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(pinkButton);
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new newing();
    }
}
