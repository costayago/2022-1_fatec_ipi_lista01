// 9. Ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e exibir
// o valor do novo salário.

import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
        double salario, reajuste, res;

        salario = Double.parseDouble(JOptionPane.showInputDialog(
            "Informe o salario atual"
        ));

        reajuste = Double.parseDouble(JOptionPane.showInputDialog(
            "Informe o percetual de reajuste"
        ));

        res = (salario * reajuste) + salario;

        JOptionPane.showMessageDialog(null,
        String.format(
            "O novo salario sera de: R$ %.2f ",
            res
        ));

    }
}
