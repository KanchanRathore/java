import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _2104385_8b extends JFrame implements ActionListener {
    private JTextField inputField, resultField;
    private JRadioButton fahrenheitToCelsiusRadioButton, celsiusToFahrenheitRadioButton;

    public _2104385_8b() {
        setTitle("Temperature Converter");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel inputLabel = new JLabel("Enter Temperature:");
        inputField = new JTextField(10);
        JButton convertButton = new JButton("Convert");
        resultField = new JTextField(15);
        resultField.setEditable(false);

        fahrenheitToCelsiusRadioButton = new JRadioButton("Fahrenheit to Celsius");
        celsiusToFahrenheitRadioButton = new JRadioButton("Celsius to Fahrenheit");
        ButtonGroup group = new ButtonGroup();
        group.add(fahrenheitToCelsiusRadioButton);
        group.add(celsiusToFahrenheitRadioButton);

        convertButton.addActionListener(this);

        add(inputLabel);
        add(inputField);
        add(new JLabel("Conversion:"));
        add(fahrenheitToCelsiusRadioButton);
        add(celsiusToFahrenheitRadioButton);
        add(convertButton);
        add(resultField);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double temperature = Double.parseDouble(inputField.getText());
            double convertedTemperature;

            if (fahrenheitToCelsiusRadioButton.isSelected()) {
                convertedTemperature = (temperature - 32) * 5/9;
                resultField.setText("Result: " + convertedTemperature + "°C");
            } else if (celsiusToFahrenheitRadioButton.isSelected()) {
                convertedTemperature = (temperature * 9/5) + 32;
                resultField.setText("Result: " + convertedTemperature + "°F");
            }
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new _2104385_8b());
    }
}

