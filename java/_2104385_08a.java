import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class _2104385_08a extends JFrame implements ActionListener {
    int marks = 0;
    JButton btn, btn1, btn2;
    JLabel lb, lb2;

    public _2104385_08a(String title) {
        setTitle(title);
        getContentPane().setBackground(Color.WHITE);
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn = new JButton("Blue");
        btn.setBackground(Color.blue);
        btn1 = new JButton("Green");
        btn1.setBackground(Color.GREEN);
        btn2 = new JButton("Pink");
        btn2.setBackground(Color.PINK);
        lb = new JLabel("Click:");
        lb2 = new JLabel("Score:");
        btn.setActionCommand("btn");
        btn1.setActionCommand("btn1");
        btn2.setActionCommand("btn2");
        setLayout(new FlowLayout());
        add(lb);
        add(btn);
        add(btn1);
        add(btn2);
        add(lb2);
        setVisible(true);
        btn.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("btn"))
            getContentPane().setBackground(Color.BLUE);
        if(e.getActionCommand().equals("btn1"))
            getContentPane().setBackground(Color.GREEN);
        if(e.getActionCommand().equals("btn2"))
            getContentPane().setBackground(Color.RED);
        repaint();
        if (btn.getBackground().equals(getContentPane().getBackground())||btn1.getBackground().equals(getContentPane().getBackground())||btn2.getBackground().equals(getContentPane().getBackground())) {
            marks = marks+3;
        }
        else {
            marks = 0;
        }
        lb2.setText("Score: " + marks);
    }
    public static void main(String[] args) {
        _2104385_08a g  = new _2104385_08a("Guess my background color?");

    }

}

