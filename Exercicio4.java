//4. Ler um valor inteiro e exibir seu antecessor

import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        double a, res;

        a = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite um valor inteiro"
        ));
        res = a - 1;

        JOptionPane.showMessageDialog(null,
        String.format(
            "O antecessor de %.0f = %.0f",
            a, res
        ));
    }
}
