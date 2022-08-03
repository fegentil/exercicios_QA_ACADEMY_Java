import javax.swing.*;

public class Exercicio_08Easy {

    static double salario, salarioLiquido, impostoRenda;
    public static void main(String[] args) {

        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário:"));

        if  (salario >= 0 && salario<= 1903.98) { //Inicio Se
            impostoRenda = 0;
            salarioLiquido = salario - impostoRenda;
        }//Fim se

        if  (salario >= 1903.99 && salario<= 2826.65) { //Inicio Se
            impostoRenda = (salario * 0.075) - 142.79;
            salarioLiquido = salario - impostoRenda;
        }//Fim se

        if  (salario >= 2826.66 && salario<= 3751.05) { //Inicio Se
            impostoRenda = (salario * 0.015) - 354.80;
            salarioLiquido = salario - impostoRenda;
        }//Fim se

        if  (salario >= 3751.06 && salario<= 4664.68) { //Inicio Se
            impostoRenda = (salario * 0.225) - 636.13;
            salarioLiquido = salario - impostoRenda;
        }//Fim se

        salario = Double.parseDouble((JOptionPane.showInputDialog("informe ")));


        System.out.println("Seu salário Bruto será de R$:"+ salario);
        System.out.println ("Seu salário liquido será de R$:" + salarioLiquido);
        System.out.println  ("O valor a ser pago de IR de R$:" + impostoRenda);
    }
}
