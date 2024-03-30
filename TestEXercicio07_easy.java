package qaacademy_test_exercicios;

import easy.Exercicio07_easy;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DecimalFormat;

public class TestEXercicio07_easy {
    static easy.Exercicio07_easy exercicio07Easy;
    static  DecimalFormat decimalFormat;
    @BeforeClass
    public static void before(){
        exercicio07Easy = new Exercicio07_easy();
        decimalFormat = new DecimalFormat("###0.00");
    }
    @Test
    public void TestePrimeiraFaixaInss(){
        String valorEsperado = "78,38";
        String valorAtual = decimalFormat.format(exercicio07Easy.calculaInss(1045.00));
        Assert.assertEquals(valorEsperado,valorAtual);
    }
    @Test
    public void TesteSegundaFaixaInss(){
        String valorEsperado = "94,05";
        String valorAtual = decimalFormat.format(exercicio07Easy.calculaInss(1045.01));
        Assert.assertEquals(valorEsperado,valorAtual);
    }
    @Test
    public void TesteSegundaFaixaInssCondicao(){
        String valorEsperado = "188,06";
        String valorAtual = decimalFormat.format(exercicio07Easy.calculaInss(2089.60));
        Assert.assertEquals(valorEsperado,valorAtual);
    }
    @Test
    public void TesteTerceiraFaixaInss(){
        String valorEsperado = "250,75";
        String valorAtual = decimalFormat.format(exercicio07Easy.calculaInss(2089.61));
        Assert.assertEquals(valorEsperado,valorAtual);
    }
    @Test
    public void TesteTerceiraFaixaInssCondicao(){
        String valorEsperado = "376,13";
        String valorAtual = decimalFormat.format(exercicio07Easy.calculaInss(3134.40));
        Assert.assertEquals(valorEsperado,valorAtual);
    }
    @Test
    public void TesteQuartaFaixaInss(){
        String valorEsperado = "438,82";
        String valorAtual = decimalFormat.format(exercicio07Easy.calculaInss(3134.41));
        Assert.assertEquals(valorEsperado,valorAtual);
    }
    @Test
    public void TesteQuartaFaixaInssCondicao(){
        String valorEsperado = "854,15";
        String valorAtual = decimalFormat.format(exercicio07Easy.calculaInss(6101.06));
        Assert.assertEquals(valorEsperado,valorAtual);
    }
    @Test
    public void TesteQuintaFaixaInss(){
        String valorEsperado = "854,15";
        String valorAtual = decimalFormat.format(exercicio07Easy.calculaInss(6101.07));
        Assert.assertEquals(valorEsperado,valorAtual);
    }
}
