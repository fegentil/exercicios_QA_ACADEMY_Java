import javax.swing.*;

public class Exercicio_06easy {
// Criar variaveis fora do main para ser global e poder usar em todos

    static double primeiraNota, segundaNota, mediaNotas;
    public static void main(String[] args) {

        primeiraNota = Double.parseDouble((JOptionPane.showInputDialog("informe a primeira nota")));
        segundaNota = Double.parseDouble((JOptionPane.showInputDialog("informe a segunda nota")));
        mediaNotas = (primeiraNota+segundaNota) / 2;

        if (mediaNotas > 5) {//Inicio SE
            System.out.println(("aprovado !"));
        } //Fim SE

        if (mediaNotas < 5) {
            System.out.println("Reprovado");}

        else if (mediaNotas == 5) {
            System.out.println("Ficou para exame!");

        }


    }
}//Fim do algoritimo
