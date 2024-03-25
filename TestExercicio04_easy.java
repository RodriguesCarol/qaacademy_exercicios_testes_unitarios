package qaacademy_test_exercicios;

import easy.Exercicio04_easy;
import org.junit.Assert;
import org.junit.Test;

public class TestExercicio04_easy {
    @Test
    public void testeCalculaDobro(){
        easy.Exercicio04_easy exercicio04Easy = new Exercicio04_easy();
        Integer mensagemEsperada = 8;
        Integer mensagemAtual = exercicio04Easy.calculaDobro(4);
        Assert.assertEquals(mensagemEsperada,mensagemAtual);



    }
}
