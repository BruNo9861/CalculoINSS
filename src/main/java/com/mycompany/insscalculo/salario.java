package com.mycompany.insscalculo;

public class salario {

    private double valorHora;
    private double horasTrabalhadas;

    // Construtor
    public salario(double valorHora, double horasTrabalhadas) {
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Método para calcular o salário bruto
    public double calcularSalarioBruto() {
        return valorHora * horasTrabalhadas;
    }

    // Método para calcular o desconto do INSS
    public double calcularINSS() {
        double salarioBruto = calcularSalarioBruto();
        double inss;

        if (salarioBruto <= 1412.00) {
            inss = salarioBruto * 0.075;
        } else if (salarioBruto <= 2666.68) {
            inss = salarioBruto * 0.09;
        } else if (salarioBruto <= 4000.03) {
            inss = salarioBruto * 0.12;
        } else if (salarioBruto <= 7786.02) {
            inss = salarioBruto * 0.14;
        } else {
            inss = 7786.02 * 0.14;
        }

        return inss;
    }

    // Método para calcular o salário líquido
    public double calcularSalarioLiquido() {
        return calcularSalarioBruto() - calcularINSS();
    }
}
