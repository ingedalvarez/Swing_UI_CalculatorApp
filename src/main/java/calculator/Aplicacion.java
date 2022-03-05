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
    private JButton brnIgual;
    private JButton btnSuma;

    public Aplicacion() {
        btnPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ActionListener listenerDigitos = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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

            }
        };
        btnDivision.addActionListener(listenerOperaciones);
        btnMultiplicacion.addActionListener(listenerOperaciones);
        btnResta.addActionListener(listenerOperaciones);
        brnIgual.addActionListener(listenerOperaciones);
        btnSuma.addActionListener(listenerOperaciones);
    }
}
