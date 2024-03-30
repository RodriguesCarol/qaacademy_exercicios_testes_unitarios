package easy;
//import javax.swing.JOptionPane;

public class Exercicio07_easy {// inicio clase
    public Double calculaInss(Double salario) {
        if (salario <= 1045.00) {
            salario = salario * 0.075;
        }
        if (salario >= 1045.01 && salario <= 2089.60) {
            salario = salario * 0.09;
        }
        if (salario >= 2089.61 && salario <= 3134.40) {
            salario = salario * 0.012;
        }
        if (salario >= 3134.41 && salario <= 6101.06) {
            salario = salario * 0.014;
        }
        if (salario > 6101.06) {
            salario = 6101.06 * 0.014;
        }
        return salario;

    }
   
}//fim classe


/////Pontos de atenção
///Double.parseDouble
/// salario >= XXXXX <= salario



// public static void main(String[] args) {//inicio metodo
//     double salario =0.0 ;
//     String salarioStg = JOptionPane.showInputDialog("Digite um valor");
//     salario = Double.parseDouble(salarioStg);
//     if (salario <= 1045.00) {
//         salario = salario * 0.075;
//         }
//     if (salario >= 1045.01 && salario <= 2089.60) {
//             salario = salario * 0.09;
//         }
//     if (salario >= 2089.61 && salario <= 3134.40){
//         salario = salario * 0.012;
//         }
//     if (salario >= 3134.41 && salario <= 6101.06) {
//         salario = salario * 0.014;
//         }
//     if (salario > 6101.06) {
//         salario = 6101.06 *0.014;
//         }
    
//       System.out.println(" O salario de Inss é: " + salario);

// }//fim metodo

