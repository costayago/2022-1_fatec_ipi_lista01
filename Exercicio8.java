// 8. Ler o número total de eleitores de um município, o número de votos brancos, nulos e
// válidos. Calcular e escrever o percentual que cada um representa em relação ao total de
//eleitores.

import javax.swing.JOptionPane;

public class Exercicio8 {
    public static void main(String[] args) {
        double nEleitores, nVotosBranco, nulos, validos, res1, res2, res3;

        nEleitores = Double.parseDouble(JOptionPane.showInputDialog(
            "Informe o numero de eleitores do municipio"
        ));

        validos = Double.parseDouble(JOptionPane.showInputDialog(
            "Informe o numero de votos validos"
        ));

        nVotosBranco = Double.parseDouble(JOptionPane.showInputDialog(
            "Informe o total de votos em branco"
        ));

        nulos = Double.parseDouble(JOptionPane.showInputDialog(
            "Informe o total de votos nulos"
        ));

        res1 = (validos / nEleitores) * 100.0; 
        res2 = (nVotosBranco / nEleitores) * 100.0;
        res3 = (nulos / nEleitores) * 100.0;

        JOptionPane.showMessageDialog(null,
        String.format(
            "Os votos validos representam %.2f %%, em branco %.2f %% e nulos %.2f %% do total de %.0f eleitores.",
            res1, res2, res3, nEleitores
        ));
    }
    
}
