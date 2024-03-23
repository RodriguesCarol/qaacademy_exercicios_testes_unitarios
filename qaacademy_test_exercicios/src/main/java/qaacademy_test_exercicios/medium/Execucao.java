package medium;

import javax.swing.JOptionPane;

public class Execucao {

    public static void main(String[] args) {

        // Exercicio01_medium exercicio01_medium = new Exercicio01_medium();
        // exercicio01_medium.retornaParImpar();

        // String valorInvestidoStg = JOptionPane.showInputDialog("Qual o valor investido?");
        // double valorInvestido = Double.parseDouble(valorInvestidoStg);
        
        // Exercici02_medium exercici02_medium =new Exercici02_medium();
        // double valorTotal = exercici02_medium.valorInvestidoJurosComposto(valorInvestido);
        // double valorJuros = exercici02_medium.valorJurosComposto(valorTotal, valorInvestido);
        // System.out.println("O valor investido é: " + valorInvestido);
        // System.out.println("O valor do juros é " + valorJuros);
        // System.out.println("O valor acumulado é: " + valorTotal);

        // String fatorialDigitadoStr = JOptionPane.showInputDialog("Digite um número que deseja ver o fatorial");
        // int fatorialDigitado= Integer.parseInt(fatorialDigitadoStr);
        
        // Exercicio03_medium exercicio03_medium = new Exercicio03_medium();
        // int valorFatorial = exercicio03_medium.retornaFatorial(fatorialDigitado);
        // System.out.println(valorFatorial);



        // Exercicio04_medium exercicio04_medium = new Exercicio04_medium();
        // exercicio04_medium.resultadoMultiplicacao();

        // Exercicio05_medium exercicio05_medium = new Exercicio05_medium();
        // int menorNumeroDigitado = exercicio05_medium.verificaMenorNumero();
        // System.out.println("O menor numero digitado é: " + menorNumeroDigitado);

        // Exercicio07_08_medium exercicio07_08_medium= new Exercicio07_08_medium();
        // String [] mesesAno = exercicio07_08_medium.criaVetorMeses();
        // exercicio07_08_medium.imprimirVetorMeses(mesesAno);

        // Exercicio09_medium exercicio09_medium = new Exercicio09_medium();
        // exercicio09_medium.recebeImprimeAlunosENumeros();

        Exercicio10_medium exercicio10_medium = new Exercicio10_medium();
        String elementoDigitadoSTG = JOptionPane.showInputDialog("Digite o elemento que imprimirá fibonacci");
        int elementodigitado = Integer.parseInt(elementoDigitadoSTG);
        int [] elementoFibonacci = exercicio10_medium.criaVetorFibonacci(elementodigitado);
        exercicio10_medium.imprimeFibonacci(elementoFibonacci);

    }
    
}
