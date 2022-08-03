import javax.swing.*;

public class Exercicio_04easy {//Inicio algoritimo
    static int numeroDigitado, resultado;
    public static void main(String[] args) {//Inicio Algoritimo

         numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("insira um numero que sera multiplicado:"));
               resultado = numeroDigitado * 2;
         System.out.println("O dobro do valor digitado é :" + resultado);


    }
}// Fim Algoritmo

