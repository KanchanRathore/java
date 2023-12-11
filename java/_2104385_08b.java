import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class _2104385_08b extends JFrame implements ActionListener {
    TextField input, output;
    JRadioButton fahrenheitToCelsiusRadioButton, celsiusToFahrenheitRadioButton;
    JButton btn;
    public _2104385_08b(String title) {
        setTitle(title);
        setSize(200,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
        Label tempC = new Label("Enter temperature :");
        input = new TextField(10);
        btn = new JButton("Convert");
        output = new TextField(16);
        output.setEditable(false);
        fahrenheitToCelsiusRadioButton = new JRadioButton("Fahrenheit to Celsius");
        celsiusToFahrenheitRadioButton = new JRadioButton("Celsius to Fahrenheit");
        ButtonGroup group = new ButtonGroup();
        group.add(fahrenheitToCelsiusRadioButton);
        group.add(celsiusToFahrenheitRadioButton);
        btn.setActionCommand("btn");
        input.addActionListener(this);
        output.addActionListener(this);
        btn.addActionListener(this);
        add(tempC);
        add(input);
        add(new JLabel("Conversion:"));
        add(fahrenheitToCelsiusRadioButton);
        add(celsiusToFahrenheitRadioButton);
        add(btn);
        add(output);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        try {
            double temperature = Double.parseDouble(input.getText());
            double convertedTemperature;

            if (fahrenheitToCelsiusRadioButton.isSelected()) {
                convertedTemperature = (temperature - 32) * 5/9;
                output.setText("Result: " + convertedTemperature + "°C");
            } else if (celsiusToFahrenheitRadioButton.isSelected()) {
                convertedTemperature = (temperature * 9/5) + 32;
                output.setText("Result: " + convertedTemperature + "°F");
            }
        } catch (NumberFormatException ex) {
            output.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        _2104385_08b rn = new _2104385_08b("Temperature Converter");
    }
}
