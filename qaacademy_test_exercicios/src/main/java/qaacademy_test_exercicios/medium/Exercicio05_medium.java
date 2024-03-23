package medium;

import javax.swing.JOptionPane;

public class Exercicio05_medium {
    public int verificaMenorNumero() {
        int numeroDigitado;
        int i = 1, menorNumero = 0;
        while (i <= 5) {

            numeroDigitado = lerNumeroDigitado();

            if (numeroDigitado < menorNumero || i == 1) {/// a leitura na condição é feita da direita para esquerda,
                                                         /// isto é, primeiro é validado se o i é igual a 1.
                menorNumero = numeroDigitado;

            }
            i++;

        }
        return menorNumero;

    }

    private int lerNumeroDigitado() {
        String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um número");
        int numeroDigitado = Integer.parseInt(numeroDigitadoStg);
        return numeroDigitado;
    }

}


// public static void main(String[] args) {
//     int i=1,numeroDigitado,menorNumero=0;
//     while (i<=5) {
//         String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um número");
//         numeroDigitado = Integer.parseInt(numeroDigitadoStg);

//         if (numeroDigitado < menorNumero || i==1) {/// a leitura na condição é feita da direita para esquerda, isto é, primeiro é validado se o i é igual a 1.
//             menorNumero = numeroDigitado;
    
            
//         }
//         i++;
        
        
//     }
//     System.out.println("O menor numero é: " + menorNumero);
// }