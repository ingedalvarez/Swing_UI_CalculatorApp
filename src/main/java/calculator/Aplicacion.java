package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplicacion {
    private JPanel root;
    private JPanel cabezera;
    private JLabel lblDisplay;
    private JButton btnReset;
    private JPanel Botonera;
    private JButton btnSiete;
    private JButton btnOcho;
    private JButton btnNueve;
    private JButton btnDivision;
    private JButton btnCuatro;
    private JButton btnCinco;
    private JButton btnSeis;
    private JButton btnMultiplicacion;
    private JButton btnUno;
    private JButton btnPunto;
    private JButton btnDos;
    private JButton btnTres;
    private JButton btnResta;
    private JButton btnCero;
    private JButton btnIgual;
    private JButton btnSuma;

    public Aplicacion() {
        btnPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = lblDisplay.getText() + ((JButton) e.getSource()).getText();
                lblDisplay.setText(text);
            }
        });
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblDisplay.setText("");
            }
        });
        ActionListener listenerDigitos = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //to get the reference to the source object of the event using the getSource() method
                String text = lblDisplay.getText() + ((JButton) e.getSource()).getText();
                lblDisplay.setText(text);
            }
        };
        btnSiete.addActionListener(listenerDigitos);
        btnOcho.addActionListener(listenerDigitos);
        btnNueve.addActionListener(listenerDigitos);
        btnCuatro.addActionListener(listenerDigitos);
        btnCinco.addActionListener(listenerDigitos);
        btnSeis.addActionListener(listenerDigitos);
        btnUno.addActionListener(listenerDigitos);
        btnDos.addActionListener(listenerDigitos);
        btnTres.addActionListener(listenerDigitos);
        btnCero.addActionListener(listenerDigitos);

        ActionListener listenerOperaciones = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultado = calcular(lblDisplay.getText());
                lblDisplay.setText(resultado);
                if (e.getSource() != btnIgual) {
                    String text = lblDisplay.getText() + ((JButton) e.getSource()).getText();
                    lblDisplay.setText(text);
                }
            }
        };
        btnDivision.addActionListener(listenerOperaciones);
        btnMultiplicacion.addActionListener(listenerOperaciones);
        btnResta.addActionListener(listenerOperaciones);
        btnIgual.addActionListener(listenerOperaciones);
        btnSuma.addActionListener(listenerOperaciones);
    }

    public static String[] splitOperaciones(String ops) {
        return ops.split("[+X/\\-]");


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicacion");
        frame.setContentPane(new Aplicacion().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public String calcular(String operacion) {
        String[] ops = splitOperaciones(operacion);
        String result = null;
        if (ops.length == 1) {
            result = ops[0];
        } else {
            float val1 = Float.parseFloat(ops[0]);
            float val2 = Float.parseFloat(ops[1]);
            float ans = 0;

            if (operacion.contains("+")) {
                ans = val1 + val2;

            } else if (operacion.contains("-")) {
                ans = val1 - val2;

            } else if (operacion.contains("X")) {
                ans = val1 * val2;

            } else if (operacion.contains("/")) {
                ans = val1 / val2;

            }
            result = String.valueOf(ans);
        }

        return result;
    }


}
