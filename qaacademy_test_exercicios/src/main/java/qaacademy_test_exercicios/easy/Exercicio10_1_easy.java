package easy;
public class Exercicio10_1_easy {//inicio classe
    public static void main(String[] args) {///inicio main
        double valorInvestimento, taxaJuros =0.05, valorTotal, valorJuros ;
        valorInvestimento = 1000.00;
        valorJuros = (10 * taxaJuros)*valorInvestimento;
        valorTotal = valorInvestimento + valorJuros;
        System.out.println("O valor investido é: " + valorInvestimento);
        System.out.println("O valor do juros é: " + valorJuros);
        System.out.println("O valor total é: "+ valorTotal);
        
    }///fim main
    
}///fim classe
