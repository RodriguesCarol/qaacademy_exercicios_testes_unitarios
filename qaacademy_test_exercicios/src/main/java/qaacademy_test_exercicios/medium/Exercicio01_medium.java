package medium;

public class Exercicio01_medium {
    public void retornaParImpar() {

        int i = 0;

        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println("O número " + i + " é: Par");

            } else {
                System.out.println("O número " + i + " é: Ímpar");
            }
            i++;
        }

    }

}


// public static void main(String[] args) {
//     int i = 0;

//     while (i <= 100) {
//         if (i % 2 == 0) {
//             System.out.println("O número "  + i + " é: Par");

//         } else {
//             System.out.println("O número " + i + " é: Ímpar");
//         }
//         i++;
//     }
// }