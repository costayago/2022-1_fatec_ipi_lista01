// 10. O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
// porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o
// percentual do distribuidor seja de 28% e os impostos de 45%, ler o custo de fábrica de um
// carro, calcular e escrever o custo final ao consumidor.

import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        Double percentualDistribuidor = 0.28, imposto = 0.48, custoFab, res;

        custoFab = Double.parseDouble(JOptionPane.showInputDialog(
            "Informe o custo de fabrica do automovel"
        ));

        res = (custoFab * percentualDistribuidor) + (custoFab * imposto) + custoFab;

        JOptionPane.showMessageDialog(null,
        String.format(
            "O valor do automovel novo para consumidor e de R$ %.2f ",
            res
        ));
    }
}