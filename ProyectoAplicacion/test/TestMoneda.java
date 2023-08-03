
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class TestMoneda {

    public static void main(String[] args) {
        // Crear un JFrame (ventana) para la interfaz gráfica
        JFrame frame = new JFrame("Convertidor de Monedas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));

        // Crear los componentes gráficos
        JLabel labelCantidad = new JLabel("Ingrese la cantidad a convertir:");
        JTextField campoCantidad = new JTextField(10);

        JLabel labelMonedaOrigen = new JLabel("Seleccione la moneda de origen:");
        JComboBox<String> comboBoxMonedaOrigen = new JComboBox<>(new String[]{"EUR", "USD", "GBP", "JPY", "CAD", "AUD"});

        JLabel labelMonedaDestino = new JLabel("Seleccione la moneda de destino:");
        JComboBox<String> comboBoxMonedaDestino = new JComboBox<>(new String[]{"USD", "GBP", "JPY", "CAD", "AUD"});

        JButton botonConvertir = new JButton("Convertir");
        JTextArea resultado = new JTextArea(5, 20);

        // Agregar los componentes al JFrame
        frame.add(labelCantidad);
        frame.add(campoCantidad);
        frame.add(labelMonedaOrigen);
        frame.add(comboBoxMonedaOrigen);
        frame.add(labelMonedaDestino);
        frame.add(comboBoxMonedaDestino);
        frame.add(botonConvertir);
        frame.add(resultado);

        // Definir la acción al hacer clic en el botón "Convertir"
        botonConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double cantidad = Double.parseDouble(campoCantidad.getText());
                String monedaOrigen = (String) comboBoxMonedaOrigen.getSelectedItem();
                String monedaDestino = (String) comboBoxMonedaDestino.getSelectedItem();

                // Calcular la conversión utilizando el código anterior
                Map<String, Double> tasasDeConversion = new HashMap<>();
                tasasDeConversion.put("USD", 1.18); // 1 EUR = 1.18 USD
                tasasDeConversion.put("GBP", 0.85); // 1 EUR = 0.85 GBP
                tasasDeConversion.put("JPY", 130.92); // 1 EUR = 130.92 JPY
                tasasDeConversion.put("CAD", 1.48); // 1 EUR = 1.48 CAD
                tasasDeConversion.put("AUD", 1.60); // 1 EUR = 1.60 AUD

                double tasaConversion = tasasDeConversion.get(monedaDestino) / tasasDeConversion.get(monedaOrigen);
                double cantidadConvertida = cantidad * tasaConversion;

                // Probando eliminando anotacion Cientifica
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                String resultadoFormateado = decimalFormat.format(cantidadConvertida);

                resultado.setText(cantidad + " " + monedaOrigen + " equivale a " + resultadoFormateado + " " + monedaDestino);
            }
        });

        // Mostrar el JFrame
        frame.setVisible(true);
    }
}
