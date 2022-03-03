// 6. Ler a idade de uma pessoa expressa em anos e exibir expressa em dias (considere que
//um ano tem 365 dias

import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        double ano = 365, idade, res;

    idade = Double.parseDouble(JOptionPane.showInputDialog(
        "Qual a sua idade ?"
    ));

    res = idade * ano; 

    JOptionPane.showMessageDialog(null,
    String.format(
        "%.0f anos em dias e %.0f ",
        idade, res
    ));

    }
}