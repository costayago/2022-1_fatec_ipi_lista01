// 1. Ler a cotação do dólar e a quantidade de dólares. Converter para real e mostrar o
//resultado.

import javax.swing.JOptionPane; 

public class Exercicio1{
    public static void main(String[] args) {
        double d, q, res; 

        d = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o valor da cotacao do dolar hoje"
        ));

        q = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite a quantidade"
        ));

        res = d * q;

        JOptionPane.showMessageDialog(null, 
        String.format(
            " %.2f Dollares = %.2f Reais",
            q, res
        )
        );

    }
}