package medium;

public class Exercicio04_medium {
    public void resultadoMultiplicacao() {
        int i = 1, resultadoMultiplicacao = 1;
        while (i <= 1000) {
            resultadoMultiplicacao = resultadoMultiplicacao * i;
            System.out.println("O resultado da Multiplicação é: " + resultadoMultiplicacao);
            if (resultadoMultiplicacao >= 1000) {
                resultadoMultiplicacao = 1;
                System.out.println("Foi zerado");

            }
            i++;

        }
    }
}

// public static void main(String[] args) {
//     int i = 1, resultadoMultiplicacao = 1;
//     while (i <= 1000) {
//         resultadoMultiplicacao = resultadoMultiplicacao * i;
//         System.out.println("O resultado da Multiplicação é: "+ resultadoMultiplicacao);
//         if (resultadoMultiplicacao >= 1000) {
//             resultadoMultiplicacao = 1;

//         }
//         i++;

//     }
// }
