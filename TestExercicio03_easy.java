package qaacademy_test_exercicios;

import easy.Exercicio03_easy;
import org.junit.Assert;
import org.junit.Test;


public class TestExercicio03_easy {
    @Test
    public void testeRetornoPalavrasTrocadas (){
       easy.Exercicio03_easy exercicio03Easy = new Exercicio03_easy();
        String mensagemEsperada = "O primeiro valor digitado é: Rodrigues\nO segundo valor digitado é: Carol";
        String mensagemAtual = exercicio03Easy.retornaPalavrasTrocadas("Carol", "Rodrigues");
        //System.out.println("O primeiro valor digitado é: Rodrigues \nO segundo valor digitado é: Carol");//String valorAtual= ;
       Assert.assertEquals(mensagemEsperada, mensagemAtual);



    }
}
