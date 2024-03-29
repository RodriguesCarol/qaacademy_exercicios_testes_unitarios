package easy;
//import javax.swing.JOptionPane;

public class Exercicio05_easy {// inicio
    public Integer retornaSoma(int primeiroNumero, int segundoNumero, int terceiroNumero ) {
       int soma =  primeiroNumero + segundoNumero + terceiroNumero;
       return soma;
    }
    public Integer retornaSubratacao(int primeiroNumero, int segundoNumero, int terceiroNumero ) {
        int subtracao = primeiroNumero - segundoNumero - terceiroNumero;
        return subtracao;
     }
     public Integer retornaMultiplicacao(int primeiroNumero, int segundoNumero, int terceiroNumero ) {
        int multiplicacao = primeiroNumero * segundoNumero * terceiroNumero;
        return multiplicacao;
     }
     public Integer retornaMedia(Integer soma ) {
        Integer media;
        media = soma /3;
        return media;
     }

    
    
}///fim

// public static void main(String[] args) {
//     int primeiroNumero, segundoNumero, terceiroNumero, soma, subtracao, multiplicacao, media;

//     String primeiroNumeroDigitado = JOptionPane.showInputDialog("Digite aqui o primeiro número");
//     String segundoNumeroDigitado = JOptionPane.showInputDialog("Digite aqui o segundo número");
//     String terceiroNumeroDigitado = JOptionPane.showInputDialog("Digite aqui o terceironúmero");
//     primeiroNumero = Integer.parseInt(primeiroNumeroDigitado);
//     segundoNumero = Integer.parseInt(segundoNumeroDigitado);
//     terceiroNumero = Integer.parseInt(terceiroNumeroDigitado);
    
    //  soma =  primeiroNumero + segundoNumero + terceiroNumero;
    // subtracao = primeiroNumero - segundoNumero - terceiroNumero;
    // multiplicacao = primeiroNumero * segundoNumero * terceiroNumero;
    // media = primeiroNumero + segundoNumero + terceiroNumero/3;

//     System.out.println("A soma dos três números é : " + soma);
//     System.out.println("A subtração dos três números é : " + subtracao);
//     System.out.println("A multiplicação dos três números é : " + multiplicacao);
//     System.out.println("A média dos três números é : " + media);



// }
