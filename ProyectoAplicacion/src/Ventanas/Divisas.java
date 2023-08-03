package Ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author yeiso
 */
public final class Divisas extends javax.swing.JPanel {

    Hashtable<Object, ImageIcon> mElementos;

    // Medida de los iconos
    int width = 32;
    int height = 32;

    // Iconos de la ComboBox
    private final String colombia = "/Banderas/Colombia.png";
    private final String japon = "/Banderas/Japon.png";
    private final String usa = "/Banderas/USA.png";
    private final String CoreaSur = "/Banderas/CoreaSur.png";
    private final String Europa = "/Banderas/Europea.png";
    private final String Reino = "/Banderas/Reino.png";

    public Divisas() {
        initComponents();
        mElementos = new Hashtable<>();
        initCombo();
        initCambio();

    }

    // Creando la ComboBox de la divisa 1
    public void initCombo() {
        jMonedas.addItem("EUR");
        jMonedas.addItem("USD");
        jMonedas.addItem("JPY");
        jMonedas.addItem("COP");
        jMonedas.addItem("GBP");
        jMonedas.addItem("KRW");

        agregarElemento("COP", getIcono(colombia));
        agregarElemento("JPY", getIcono(japon));
        agregarElemento("USD", getIcono(usa));
        agregarElemento("GBP", getIcono(Reino));
        agregarElemento("EUR", getIcono(Europa));
        agregarElemento("KRW", getIcono(CoreaSur));

        jComboBoxRender mJComboBoxRender = new jComboBoxRender(mElementos);
        jMonedas.setRenderer(mJComboBoxRender);
    }

    // Creando comboBox de la divisa 2
    private void initCambio() {
        jCambio.addItem("EUR");
        jCambio.addItem("USD");
        jCambio.addItem("JPY");
        jCambio.addItem("COP");
        jCambio.addItem("GBP");
        jCambio.addItem("KRW");

        agregarElemento("COP", getIcono(colombia));
        agregarElemento("JPY", getIcono(japon));
        agregarElemento("USD", getIcono(usa));
        agregarElemento("GBP", getIcono(Reino));
        agregarElemento("EUR", getIcono(Europa));
        agregarElemento("KRW", getIcono(CoreaSur));

        jComboBoxRender mJComboBoxRende = new jComboBoxRender(mElementos);
        jCambio.setRenderer(mJComboBoxRende);
    }

    // Funcion de agregar elementos a la combobox
    public void agregarElemento(String akey, ImageIcon aImageIcon) {
        mElementos.put(akey, aImageIcon);
    }

    // Funcion de los iconos 
    public ImageIcon getIcono(String path) {
        return new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage()
                .getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jresultado = new javax.swing.JTextArea();
        jtitulo3 = new javax.swing.JLabel();
        jtitulo2 = new javax.swing.JLabel();
        jtitulo1 = new javax.swing.JLabel();
        jBotonConvertir = new javax.swing.JButton();
        jBotonCambio = new javax.swing.JButton();
        jCambio = new javax.swing.JComboBox<>();
        jMonedas = new javax.swing.JComboBox<>();
        jIngreso = new javax.swing.JTextField();
        FondoDivisas = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jresultado.setEditable(false);
        jresultado.setColumns(20);
        jresultado.setFont(new java.awt.Font("Segoe UI", 1, 29)); // NOI18N
        jresultado.setRows(5);
        jresultado.setWrapStyleWord(true);
        jresultado.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jresultado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 154, 360, 60));

        jtitulo3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jtitulo3.setForeground(new java.awt.Color(0, 0, 0));
        jtitulo3.setText("a");
        add(jtitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 36, 30, -1));

        jtitulo2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jtitulo2.setForeground(new java.awt.Color(0, 0, 0));
        jtitulo2.setText("De: ");
        add(jtitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jtitulo1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jtitulo1.setForeground(new java.awt.Color(0, 0, 0));
        jtitulo1.setText("Cambio");
        add(jtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jBotonConvertir.setBackground(new java.awt.Color(35, 28, 228));
        jBotonConvertir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBotonConvertir.setText("Convertir");
        jBotonConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonConvertirActionPerformed(evt);
            }
        });
        add(jBotonConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 164, 100, 40));

        jBotonCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cambiar.png"))); // NOI18N
        jBotonCambio.setContentAreaFilled(false);
        jBotonCambio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBotonCambio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonCambio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cambiar.png"))); // NOI18N
        jBotonCambio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cambiar_35.png"))); // NOI18N
        jBotonCambio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBotonCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonCambioActionPerformed(evt);
            }
        });
        add(jBotonCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 60, 50));

        jCambio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCambio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCambioActionPerformed(evt);
            }
        });
        add(jCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 100, 40));

        jMonedas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMonedas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMonedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMonedasActionPerformed(evt);
            }
        });
        add(jMonedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 100, 40));

        jIngreso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIngresoActionPerformed(evt);
            }
        });
        jIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jIngresoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jIngresoKeyTyped(evt);
            }
        });
        add(jIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 62, 160, 40));

        FondoDivisas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Blanco.jpg"))); // NOI18N
        add(FondoDivisas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 620, 280));
    }// </editor-fold>//GEN-END:initComponents


    private void jMonedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMonedasActionPerformed

    }//GEN-LAST:event_jMonedasActionPerformed

    private void jCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCambioActionPerformed

    // Funcion del boton convertir y lo que hace.

    private void jBotonConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonConvertirActionPerformed
        jBotonConvertir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double cantidad = Double.parseDouble(jIngreso.getText());
                String monedaOrigen = (String) jMonedas.getSelectedItem();
                String monedaDestino = (String) jCambio.getSelectedItem();

                // Creando un map para guardar las conversiones
                Map<String, Double> tasasDeConversion = new HashMap<>();
                tasasDeConversion.put("USD", 1.10); // 1 EUR = 1.10 USD
                tasasDeConversion.put("GBP", 0.86); // 1 EUR = 0.86 GBP
                tasasDeConversion.put("JPY", 157.33); // 1 EUR = 157.33  JPY
                tasasDeConversion.put("COP", 4358.03); // 1 EUR = 4358 COP
                tasasDeConversion.put("KRW", 1414.78); // 1 EUR = 1414 KRW
                tasasDeConversion.put("EUR", 1.0); // 1 EUR = 1.0 EUR

                // Operacion de conversion 
                double tasaConversion = tasasDeConversion.get(monedaDestino) / tasasDeConversion.get(monedaOrigen);
                double cantidadConvertida = cantidad * tasaConversion;

                // Resetando formato para eliminar la anotacion cientifica y agregarles comas y puntos
                DecimalFormatSymbols symbols = new DecimalFormatSymbols();
                symbols.setGroupingSeparator(',');
                symbols.setDecimalSeparator('.');
                DecimalFormat decimalFormat = new DecimalFormat("#,##0.00", symbols);
                String resultadoFormateado = decimalFormat.format(cantidadConvertida);

                // Se imprime el resultado 
                jresultado.setText(" $ " + resultadoFormateado);
            }

        });
    }//GEN-LAST:event_jBotonConvertirActionPerformed

    //Permitiendo solo el ingreso de numero al Jlabel

    private void jIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jIngresoKeyTyped
        char[] p = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.'};
        int b = 0;
        for (int i = 0; i <= 10; i++) {
            if (p[i] == evt.getKeyChar()) {
                b = 1;
            }

        }
        if (b == 0) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jIngresoKeyTyped

    private void jIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIngresoActionPerformed

    }//GEN-LAST:event_jIngresoActionPerformed

    //Definiendo la funcion de apretar enter y esta active el boton convertir.

    private void jIngresoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jIngresoKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            jBotonConvertir.requestFocus();
            jBotonConvertir.doClick();
        }
    }//GEN-LAST:event_jIngresoKeyPressed

    // Boton de intercambio de divisas

    private void jBotonCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonCambioActionPerformed
        jBotonCambio.addActionListener((ActionEvent e) -> {
            intercambiarMonedas();
        });
    }//GEN-LAST:event_jBotonCambioActionPerformed

    // Funcion que intercambia las divisas 
    private void intercambiarMonedas() {

        // Intercambiar las monedas seleccionadas en los combo boxes
        String monedaOrigen = (String) jMonedas.getSelectedItem();
        String monedaDestino = (String) jCambio.getSelectedItem();

        jMonedas.setSelectedItem(monedaDestino);
        jCambio.setSelectedItem(monedaOrigen);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoDivisas;
    private javax.swing.JButton jBotonCambio;
    private javax.swing.JButton jBotonConvertir;
    private javax.swing.JComboBox<String> jCambio;
    private javax.swing.JTextField jIngreso;
    private javax.swing.JComboBox<String> jMonedas;
    private javax.swing.JTextArea jresultado;
    private javax.swing.JLabel jtitulo1;
    private javax.swing.JLabel jtitulo2;
    private javax.swing.JLabel jtitulo3;
    // End of variables declaration//GEN-END:variables

}
