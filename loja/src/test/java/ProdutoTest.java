import br.com.alura.loja.Produto;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import org.junit.Assert;
public class ProdutoTest {
    @Test
    public void test() {
        Produto p =  new Produto("teste", BigDecimal.TEN);
        Assert.assertEquals("teste",p.getNome());
        Assert.assertEquals(BigDecimal.TEN,p.getPreco());
    }
}
