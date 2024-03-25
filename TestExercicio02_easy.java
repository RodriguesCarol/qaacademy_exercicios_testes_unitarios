import easy.Exercicio02_easy;
import org.junit.Assert;
import org.junit.Test;

public class TestExercicio02_easy {
    @Test
    public void testeRetornaValor (){
        easy.Exercicio02_easy exercicio02Easy = new Exercicio02_easy();
        Assert.assertEquals(" O usuário digitou: test", exercicio02Easy.retornaPalavra("test"));

    }
}