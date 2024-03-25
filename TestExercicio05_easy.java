package qaacademy_test_exercicios;

import easy.Exercicio05_easy;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Optional;

public class TestExercicio05_easy {
    static Exercicio05_easy exercicio05Easy; // Criação de uariável Global // "Dado que estou...."

    @BeforeClass
    public static void before() {
        exercicio05Easy = new Exercicio05_easy();
    }

    @Test
    public void testSoma() {
        Integer esperado = 6;
        Assert.assertEquals(esperado, exercicio05Easy.retornaSoma(2, 2, 2));
    }

    @Test
    public void testSubtrai() {
        Integer esperado = -2;
        Assert.assertEquals(esperado, exercicio05Easy.retornaSubratacao(2, 2, 2));
    }
    @Test
    public void testMultiplica() {
        Integer esperado = 8;
        Assert.assertEquals(esperado, exercicio05Easy.retornaMultiplicacao(2, 2, 2));
    }
    @Test
    public void testMedia() {
       Integer soma = 2+2+2;
       Integer esperado = 2;
       Assert.assertEquals(esperado, exercicio05Easy.retornaMedia(soma));
    }
}
