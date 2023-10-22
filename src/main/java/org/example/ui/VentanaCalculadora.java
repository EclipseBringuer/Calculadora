package org.example.ui;

import javax.swing.*;
import java.util.Objects;

public class VentanaCalculadora extends JFrame {
    private JPanel panel;
    private JTextField txtDisplay;
    private JButton btnVaciar;
    private JButton btnResultado;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JButton btnBorrar;
    private JButton btn1;
    private JButton btn4;
    private JButton btn7;
    private JButton btn00;
    private JButton btnSumar;
    private JButton btn2;
    private JButton btn5;
    private JButton btn8;
    private JButton btn0;
    private JButton btnSigno;
    private JButton btn3;
    private JButton btn6;
    private JButton btn9;
    private JButton btnDecimal;
    double a, b, result;
    private String operacion = "";

    public VentanaCalculadora() {
        this.setContentPane(panel);
        this.setResizable(false);
        this.setSize(320, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Que funcione la 'x' de la ventana
        this.setTitle("Calculadora!!!");//Titulo de la ventana
        this.setLocationRelativeTo(null);


        btnVaciar.addActionListener(ev -> {
            txtDisplay.setText("0");
        });

        btn0.addActionListener(ev -> {
            if (!Objects.equals(txtDisplay.getText(), "0"))
                txtDisplay.setText(txtDisplay.getText() + btn0.getText());
        });

        btn00.addActionListener(ev ->{
            if (!Objects.equals(txtDisplay.getText(), "0"))
                txtDisplay.setText(txtDisplay.getText() + btn00.getText());
        });

        btn1.addActionListener(ev -> {
            if (Objects.equals(txtDisplay.getText(), "0"))
                txtDisplay.setText(btn1.getText());
            else
                txtDisplay.setText(txtDisplay.getText() + btn1.getText());
        });

        btn2.addActionListener(ev -> {
            if (Objects.equals(txtDisplay.getText(), "0"))
                txtDisplay.setText(btn2.getText());
            else
                txtDisplay.setText(txtDisplay.getText() + btn2.getText());
        });

        btn3.addActionListener(ev -> {
            if (Objects.equals(txtDisplay.getText(), "0"))
                txtDisplay.setText(btn3.getText());
            else
                txtDisplay.setText(txtDisplay.getText() + btn3.getText());
        });

        btn4.addActionListener(ev -> {
            if (Objects.equals(txtDisplay.getText(), "0"))
                txtDisplay.setText(btn4.getText());
            else
                txtDisplay.setText(txtDisplay.getText() + btn4.getText());
        });

        btn5.addActionListener(ev -> {
            if (Objects.equals(txtDisplay.getText(), "0"))
                txtDisplay.setText(btn5.getText());
            else
                txtDisplay.setText(txtDisplay.getText() + btn5.getText());
        });

        btn6.addActionListener(ev -> {
            if (Objects.equals(txtDisplay.getText(), "0"))
                txtDisplay.setText(btn6.getText());
            else
                txtDisplay.setText(txtDisplay.getText() + btn6.getText());
        });

        btn7.addActionListener(ev -> {
            if (Objects.equals(txtDisplay.getText(), "0"))
                txtDisplay.setText(btn7.getText());
            else
                txtDisplay.setText(txtDisplay.getText() + btn7.getText());
        });

        btn8.addActionListener(ev -> {
            if (Objects.equals(txtDisplay.getText(), "0"))
                txtDisplay.setText(btn8.getText());
            else
                txtDisplay.setText(txtDisplay.getText() + btn8.getText());
        });

        btn9.addActionListener(ev -> {
            if (Objects.equals(txtDisplay.getText(), "0"))
                txtDisplay.setText(btn9.getText());
            else
                txtDisplay.setText(txtDisplay.getText() + btn9.getText());
        });

        btnSumar.addActionListener(ev -> {
            try {
                a = Double.parseDouble(txtDisplay.getText());
                operacion = "+";
                txtDisplay.setText("");
            }catch (Exception e){
                txtDisplay.setText("Not number!");
            }
        });

        btnRestar.addActionListener(ev -> {
            try {
                a = Double.parseDouble(txtDisplay.getText());
                operacion = "-";
                txtDisplay.setText("");
            }catch (Exception e){
                txtDisplay.setText("Not number!");
            }
        });

        btnMultiplicar.addActionListener(ev -> {
            try {
                a = Double.parseDouble(txtDisplay.getText());
                operacion = "*";
                txtDisplay.setText("");
            } catch (Exception e) {
                txtDisplay.setText("Not number!");
            }
        });

        btnDividir.addActionListener(ev -> {
            try {
                a = Double.parseDouble(txtDisplay.getText());
                operacion = "/";
                txtDisplay.setText("");
            }catch (Exception e){
                txtDisplay.setText("Not number!");
            }
        });

        btnBorrar.addActionListener(ev -> {
            String backspace = null;
            if (txtDisplay.getText().length() > 0) {
                StringBuilder strB = new StringBuilder(txtDisplay.getText());
                strB.deleteCharAt(txtDisplay.getText().length() - 1);
                backspace = String.valueOf(strB);
                txtDisplay.setText(backspace);
            }
        });

        btnSigno.addActionListener(ev -> {
            if (txtDisplay.getText().contains(".")) {
                double pm = Double.parseDouble(txtDisplay.getText());
                pm = pm * -1;
                txtDisplay.setText(String.valueOf(pm));
            } else {
                long PM = Long.parseLong(txtDisplay.getText());
                PM = PM * -1;
                txtDisplay.setText(String.valueOf(PM));
            }
        });

        btnResultado.addActionListener(ev -> {
            try {
                b = Double.parseDouble(txtDisplay.getText());
                if (operacion == "+") {
                    result = a + b;
                    txtDisplay.setText(String.valueOf(result));
                } else if (operacion == "-") {
                    result = a - b;
                    txtDisplay.setText(String.valueOf(result));
                } else if (operacion == "*") {
                    result = a * b;
                    txtDisplay.setText(String.valueOf(result));
                } else if (operacion == "/") {
                    result = a / b;
                    txtDisplay.setText(String.valueOf(result));
                }
            }catch (Exception e){
                txtDisplay.setText("Not number!");
            }
        });

        btnDecimal.addActionListener(ev -> {
            if (!txtDisplay.getText().contains("."))
                txtDisplay.setText(txtDisplay.getText() + btnDecimal.getText());
        });

    }

    public void load() {
        this.setVisible(true);
    }
}
