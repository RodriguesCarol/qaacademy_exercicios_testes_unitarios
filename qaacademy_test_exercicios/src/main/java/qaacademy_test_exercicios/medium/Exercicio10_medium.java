package medium;

public class Exercicio10_medium {
    public int[] criaVetorFibonacci(int elemento) {
        int i = 2;

        int fibonacci[]; /// forma
        fibonacci = new int[elemento];// objeto
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        while (i < elemento) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;

        }

        return fibonacci;

    }

    public void imprimeFibonacci(int[] vetor) {
        int i = 0;
        while (i < vetor.length) { /////.length metodo que rtorna o tamanho do vetor. ex: vetor de tamanho 10 retornara ele por completo.
            System.out.println(vetor[i]);
            i++;

        }
    }

}
// public static void main(String[] args) {
//     int i = 2, elemento = 10;
    
//     int fibonacci[]; /// forma
//     fibonacci = new int[elemento];// objeto
//     fibonacci[0] = 0;
//     fibonacci[1] = 1;
    
//     while (i < elemento) {
//         fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
//         i++;

//     }
//     i = 0;
//     while (i < elemento) {
//         System.out.println(fibonacci[i]);
//         i++;

//     }

// }

