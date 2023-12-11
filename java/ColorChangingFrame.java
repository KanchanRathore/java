import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ColorChangingFrame extends JFrame {
    private Random random;
    private int score;
    private JLabel scoreLabel;

    public ColorChangingFrame() {
        random = new Random();
        score = 0;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        JButton button = new JButton("Change Color");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                getContentPane().setBackground(randomColor);
                repaint();

                if (button.getBackground().equals(randomColor) && randomColor.equals(Color.BLUE)) {
                    score = 3;
                } else {
                    score = 0;
                }

                scoreLabel.setText("Score: " + score);
            }
        });

        getContentPane().setBackground(Color.WHITE);
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(button);

        scoreLabel = new JLabel("Score: " + score);
        getContentPane().add(scoreLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ColorChangingFrame frame = new ColorChangingFrame();
                frame.setVisible(true);
            }
        });
    }
}