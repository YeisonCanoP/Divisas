import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TestTemperatura extends JFrame implements ActionListener {
    private JComboBox<String> comboBox1, comboBox2;
    private JLabel label1, label2;
    private JButton button;
    private JTextArea inputArea, outputArea;

    public TestTemperatura() {
        // Frame setup
        setTitle("Temperatura Converter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // ComboBoxes
        String[] temperatureUnits = {"Celsius", "Fahrenheit"};
        comboBox1 = new JComboBox<>(temperatureUnits);
        comboBox2 = new JComboBox<>(temperatureUnits);

        // Labels
        label1 = new JLabel("Input Temperatures:");
        label2 = new JLabel("Converted Temperatures:");

        // TextAreas
        inputArea = new JTextArea(5, 20);
        outputArea = new JTextArea(5, 20);
        outputArea.setEditable(false);

        // Scroll panes for TextAreas
        JScrollPane inputScrollPane = new JScrollPane(inputArea);
        JScrollPane outputScrollPane = new JScrollPane(outputArea);

        // Button
        button = new JButton("Convert");
        button.addActionListener(this);

        // Adding components to the frame
        add(label1);
        add(inputScrollPane);
        add(comboBox1);
        add(label2);
        add(outputScrollPane);
        add(comboBox2);
        add(new JLabel()); // Empty label for spacing
        add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            convertTemperatures();
        }
    }

    private void convertTemperatures() {
        String unit1 = (String) comboBox1.getSelectedItem();
        String unit2 = (String) comboBox2.getSelectedItem();
        String[] inputTemperatures = inputArea.getText().split("\\s+");
        List<Double> convertedTemperatures = new ArrayList<>();

        try {
            for (String inputTemperature : inputTemperatures) {
                double temperature = Double.parseDouble(inputTemperature);
                double result;

                if (unit1.equals("Celsius") && unit2.equals("Fahrenheit")) {
                    result = (temperature * 9 / 5) + 32;
                } else if (unit1.equals("Fahrenheit") && unit2.equals("Celsius")) {
                    result = (temperature - 32) * 5 / 9;
                } else {
                    result = temperature; // No conversion needed
                }

                convertedTemperatures.add(result);
            }

            StringBuilder outputText = new StringBuilder();
            for (double convertedTemperature : convertedTemperatures) {
                outputText.append(String.format("%.2f", convertedTemperature)).append("\n");
            }
            outputArea.setText(outputText.toString());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TestTemperatura());
    }
}

