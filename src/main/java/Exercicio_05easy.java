import javax.swing.*;

public class Exercicio_05easy {

    static int valorInformado1, valorInformado2, valorInformado3, soma, subtração, multiplicação, divisaomedia;
    public static void main(String[] args) {
        valorInformado1 = Integer.parseInt(JOptionPane.showInputDialog("insira um numero "));
        valorInformado2 = Integer.parseInt(JOptionPane.showInputDialog("insira um numero "));
        valorInformado3 = Integer.parseInt(JOptionPane.showInputDialog("insira um numero "));

        soma = valorInformado1 + (valorInformado2 + valorInformado3);
        subtração = (valorInformado1 - valorInformado2) - valorInformado3;
        multiplicação = (valorInformado1*valorInformado2)*valorInformado3;
        divisaomedia = soma / 3;

        System.out.println("valores: "+"\n Soma:" + soma +"\n subtração: "+subtração +
                "\n multiplicação: "+ multiplicação+ "\n média:" + divisaomedia);
    }
}


// o \n funciona como quebra de linha para exibir o resultado.
// System.out.println exibe a tela para usuario