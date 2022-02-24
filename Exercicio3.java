//3. Calcular o pagamento de comissão de vendedores de peças, levando-se em
//consideração que sua comissão será de 5% do total da venda e que você tem os seguintes
//dados: preço unitário da peça e quantidade vendida.

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        double c = 0.05, p, q, res;

        p = Double.parseDouble(JOptionPane.showInputDialog(
            "Informe o valor da peça unitaria"
        ));

        q = Double.parseDouble(JOptionPane.showInputDialog(
            "Qual foi a quatidade de pecas vendidas?"
        ));

        res = (p * q) * c;

        JOptionPane.showMessageDialog(null,
        String.format(
            "A sua comissao vai ser = R$ %.2f",
            res
        )
        );
    }
}
