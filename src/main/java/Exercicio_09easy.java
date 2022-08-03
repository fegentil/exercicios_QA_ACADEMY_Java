import javax.swing.*;

public class Exercicio_09easy {

    static double numeroDigitado, i = 1, resultado;
    public static void main(String[] args) {
        (numeroDigitado = Double.parseDouble(JOptionPane.showInputDialog(Digite o numero))

            if (numeroDigitado <= 10) {

                while ( i <= 10) {
                    resultado = numeroDigitado * i;
                    System.out.println( numeroDigitado + "x" + i + "" + resultado);
                    i++;
                }
            }

    }

}
