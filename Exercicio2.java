//2. Ler 4 números, calcular o quadrado para cada um, somar todos os quadrados e mostrar o
//resultado.

import javax.swing.JOptionPane;
public class Exercicio2 {
    public static void main(String[] args) {
        double a, b, c, d, res;

        a = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o primeiro numero"
        ));
        b = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o segundo numero"
        ));
        c = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o terceiro numero"
        ));
        d = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o quarto numero"
        ));

        res = a * a + b * b + c * c + d * d;

        JOptionPane.showMessageDialog(null,
        String.format(
            "A soma de todos os quadrados = %.2f",
            res
        )
        );
    }
}
