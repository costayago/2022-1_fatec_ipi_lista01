//11. Uma revendedora de carros usados paga a seus funcionários vendedores um salário
//fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor
//das vendas por ele efetuadas. Ler o número de carros por ele vendidos, o valor total de
//suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcular e exibir o
//salário final do vendedor.

import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args) {
        double carrosvendidos, totalvendas, salariofixo;
        double comissaoporcarro, comissaoporvenda = 0.05, res;

        carrosvendidos = Double.parseDouble(
            JOptionPane.showInputDialog(
            "Informe a quantidade de carros vendidos "
        ));

        totalvendas = Double.parseDouble(
            JOptionPane.showInputDialog(
            "Informe o valor total de suas vendas"
        ));

        salariofixo = Double.parseDouble(
            JOptionPane.showInputDialog(
            "Informe o salario fixo do funcionario"
        ));

        comissaoporcarro = Double.parseDouble(
            JOptionPane.showInputDialog(
            "Informe o valor da comissao fixa por carro vendido em porcentagem"
        )); 

        res = salariofixo + (
            carrosvendidos * comissaoporcarro) + (
            totalvendas * comissaoporvenda);

        JOptionPane.showMessageDialog(null,
        String.format(
            "O valor total do salario sera de %.2f",
            res
        ));

    }
}
