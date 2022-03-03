//7. Ler a idade de uma pessoa expressa em anos, meses e dias e exibir a idade dessa
//pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {
        double idade, mes, dia, res;

        idade = Double.parseDouble(JOptionPane.showInputDialog(
            "Informe a sua idade em anos"
        ));

        mes = Double.parseDouble(JOptionPane.showInputDialog(
            "E quantos meses?"
        ));

        dia = Double.parseDouble(JOptionPane.showInputDialog(
            "E quantos dias ?"
        ));
        
        res = idade * 365 + mes * 30 + dia;

        JOptionPane.showMessageDialog(null, 
        String.format(
            "%.0f anos, %.0f meses e  %.0f dias = %.0f dias vividos",
            idade, mes, dia, res
        ));
    }
        
}
