import javax.swing.*;

public class Exercicio_07Easy {

    static double salario, inss;
    public static void main(String[] args) {

        salario = Double.parseDouble(JOptionPane.showInputDialog("Valor do salário"));

        if (salario <= 1045.00) {//inicio SE
            inss = salario * 0.075;
        } // Fim se

        if (salario >= 1045.01 && salario <= 2089.60) {
            inss = salario * 0.09;
        }

        if (salario >= 2089.61 && salario <= 3134.40) {
            inss = salario * 0.12;
        }

        if (salario >= 3134.41 && salario <= 6101.06) {
            inss = salario * 0.14;
        }
        else {
            inss = salario * 0.14;

        }
        System.out.println("O valor a ser pago de INSS é" +inss);


        }
}
