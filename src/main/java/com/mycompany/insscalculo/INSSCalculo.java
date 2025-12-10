package com.mycompany.insscalculo;

import java.util.Scanner;

public class INSSCalculo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada (R$): ");
        double valorHora = input.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = input.nextDouble();

        // Cria o objeto da classe Salario
        salario salario1 = new salario(valorHora, horasTrabalhadas);

        double bruto = salario1.calcularSalarioBruto();
        double inss = salario1.calcularINSS();
        double liquido = salario1.calcularSalarioLiquido();

        System.out.println("\n--- RESUMO SALARIAL ---");
        System.out.printf("Salário Bruto: R$ %.2f%n", bruto);
        System.out.printf("Desconto INSS: R$ %.2f%n", inss);
        System.out.printf("Salário Líquido: R$ %.2f%n", liquido);

        input.close();
    }
}
