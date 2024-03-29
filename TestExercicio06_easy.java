package qaacademy_test_exercicios;

import easy.Exercicio06_easy;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestExercicio06_easy {
    static easy.Exercicio06_easy exercicio06Easy;

    @BeforeClass
    public static void before() {
        exercicio06Easy = new Exercicio06_easy();

    }

    @Test
    public void testAprovado() {
        String mensagemEsperad = "Aprovado!";
        String mensagemAtual = exercicio06Easy.verificaAprovacao(5., 6.);
        Assert.assertEquals(mensagemEsperad, mensagemAtual);

    }

    @Test
    public void testReprovado() {
        String mensagemEsperad = "Reprovado!";
        String mensagemAtual = exercicio06Easy.verificaAprovacao(4., 4.);
        Assert.assertEquals(mensagemEsperad, mensagemAtual);

    }

    @Test
    public void testExame() {
        String mensagemEsperad = "Exame!";
        String mensagemAtual = exercicio06Easy.verificaAprovacao(5.0,5.0);
        Assert.assertEquals(mensagemEsperad, mensagemAtual);

    }
    @Test
    public void testSemNota() {
        String mensagemEsperad = "Não foi possível calcular a sua nota!";
        String mensagemAtual = exercicio06Easy.verificaAprovacao(-1., -1.);
        Assert.assertEquals(mensagemEsperad, mensagemAtual);


    }
}






