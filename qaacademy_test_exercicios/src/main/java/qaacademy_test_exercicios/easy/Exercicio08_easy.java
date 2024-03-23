package easy;

//import javax.swing.JOptionPane;

public class Exercicio08_easy {
    public Double calculaImpostoRenda(double salarioBruto) {
        Double imposto = 0.0;

        if (salarioBruto <= 1093.98) {
            imposto = (salarioBruto * 0) - 0;
            
        }
        if (salarioBruto >= 1093.98 && salarioBruto <= 2826.65) {
            imposto = (salarioBruto * 0.075) - 142.8;
            

        }
        if (salarioBruto >= 2826.65 && salarioBruto <= 3751.05) {
            imposto = (salarioBruto * 0.15) - 354.8;
            

        }
        if (salarioBruto >= 3751.05 && salarioBruto <= 4664.68) {
            imposto = (salarioBruto * 0.2250) - 636.13;
            

        }
        if (salarioBruto >= 4664.68) {
            imposto = (salarioBruto * 0.2750) - 869.36;
            
        }
        return imposto;
    }

    public Double calculaSalarioLiquido(double salarioBruto, double imposto) {

        return salarioBruto - imposto;

    }// fim main

}// fim classe
 // public static void main(String[] args) {
 // Double imposto= 0.0, salarioLiquido= 0.0, salarioBruto;
 // String salarioStg = JOptionPane.showInputDialog("Digite seu salário");
 // salarioBruto = Double.parseDouble(salarioStg);
 // if (salarioBruto <= 1093.98) {
 // imposto= (salarioBruto * 0) - 0;
 // salarioLiquido = salarioBruto - imposto;

// }
// if (salarioBruto >= 1093.98 && salarioBruto <=2826.65) {
// imposto = (salarioBruto * 0.075) - 142.8;
// salarioLiquido = salarioBruto - imposto;

// }
// if (salarioBruto >= 2826.65 && salarioBruto <=3751.05) {
// imposto = (salarioBruto * 0.15) - 354.8;
// salarioLiquido = salarioBruto - imposto;

// }
// if (salarioBruto >= 3751.05 && salarioBruto <=4664.68) {
// imposto = (salarioBruto * 0.2250) - 636.13;
// salarioLiquido = salarioBruto - imposto;

// }
// if (salarioBruto >= 4664.68 ) {
// imposto = (salarioBruto * 0.2750) - 869.36;
// salarioLiquido = salarioBruto - imposto;
// }
// System.out.println("O salario bruto é: " + salarioBruto);
// System.out.println("O salario Liquido é: " + salarioLiquido);
// System.out.println("O imposto é: " + imposto);
// }//fim main
