import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartaoTest {
    @Test
    void deveRetornarCartaoComum() {
        CartaoComum cartaoComum = new CartaoComum();
        cartaoComum.setNome("teste 1");
        cartaoComum.setNumero(123456789);
        cartaoComum.setCredito(4000);

        assertEquals("Cartão Comum", cartaoComum.verificarPerfil());

    }

    @Test
    void deveRetornarCartaoVIP() {
        CartaoVip cartaoVip = new CartaoVip();
        cartaoVip.setNome("teste 2");
        cartaoVip.setNumero(1234567);
        cartaoVip.setCredito(6000);

        assertEquals("Cartão VIP", cartaoVip.verificarPerfil());

    }

    @Test
    void deveRetornarInformacoes() {
        CartaoVip cartaoVip = new CartaoVip();
        cartaoVip.setNome("teste 3");
        cartaoVip.setNumero(123123123);
        cartaoVip.setCredito(8000);

        assertEquals("Cartao{nome='teste 3', numero=123123123' ,Tipo: Cartão VIP}", cartaoVip.toString());

    }
}