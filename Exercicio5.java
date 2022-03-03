//5. Ler as dimensões de um retângulo (base e altura), calcular e escrever a área do
//retângulo.

import javax.swing.JOptionPane; 
public class Exercicio5 {
    public static void main(String[] args) {
        double b, a, res;

        b = Double.parseDouble(JOptionPane.showInputDialog(
            "Informe o valor da base do retangulo"
        ));

        a = Double.parseDouble(JOptionPane.showInputDialog(
            "Informe o valor da altura do retangulo"
        ));

        res = b * a;

        JOptionPane.showMessageDialog(null,
        String.format(
            "A area do retangulo = %.2f",
            res
        ));
    }
}
