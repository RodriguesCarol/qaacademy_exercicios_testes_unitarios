package medium;

import javax.swing.JOptionPane;

public class Exercicio06_medium {
    public static void main(String[] args) {
        int numerodigitado;
        String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um numero");
        numerodigitado = Integer.parseInt(numeroDigitadoStg);
        System.out.println("O número digitado é: " + numerodigitado);

    }// fim do main

}// fim de classe
