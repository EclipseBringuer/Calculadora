package org.example;

public class Calculadora {
    private int num1;
    private int num2;
    private String tipo;

    public Calculadora(String operacion) {

        this.tipo = sacarTipo(operacion);
        this.num1 = Integer.valueOf(sacarNumeros(operacion)[0]);
        this.num2 = Integer.valueOf(sacarNumeros(operacion)[1]);
    }

    private String sacarTipo(String operacion) {
        String result = "";

        if (operacion.contains("+"))
            result = "+";
        else if (operacion.contains("-"))
            result = "-";
        else if (operacion.contains("*"))
            result = "*";
        else if (operacion.contains("/"))
            result = "/";

        return result;
    }

    private String[] sacarNumeros(String operacion) {
        String[] result = new String[2];
        switch (tipo) {
            case "+" -> result = operacion.split("\\+");
            case "-" -> result = operacion.split("-");
            case "*" -> result = operacion.split("\\*");
            case "/" -> result = operacion.split("/");
        }
        return result;
    }

    public String calcular() {
        int resultado = switch (tipo) {
            case "+" -> sumar(num1, num2);
            case "-" -> restar(num1, num2);
            case "*" -> multiplicar(num1, num2);
            case "/" -> dividir(num1, num2);
            default -> 0;
        };

        return resultado + "";
    }

    private int sumar(int num1, int num2) {
        return num1 + num2;
    }

    private int restar(int num1, int num2) {
        return num1 + num2;
    }

    private int dividir(int num1, int num2) {
        return num1 / num2;
    }

    private int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    private double potencia(int num1, int nuem2) {
        return Math.pow(num1, num2);
    }
}
