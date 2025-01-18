package Class;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestimentoTest {

    CarteiraInvestimento carteiraInvestimento;
    @BeforeEach
    void setUp() {
        carteiraInvestimento = new Investimento();
    }

    @Test
    void deveConseguirInvestir() {
        carteiraInvestimento.setSaldo(100.0f);
        carteiraInvestimento.investir(100.0f);
        assertEquals(200.0f, carteiraInvestimento.getSaldo());
    }
    @Test
    void naoDeveConseguirInvestirNegativo() {
        try{
            carteiraInvestimento.investir(-1.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Não é possível investir negativo ou 0", e.getMessage());
        }
    }

    @Test
    void deveConseguirResgatar() {
        carteiraInvestimento.setSaldo(100.0f);
        carteiraInvestimento.resgatar(50.0f);
        assertEquals(49.5f, carteiraInvestimento.getSaldo());
    }
    @Test
    void naoDeveConseguirResgatar() {
        carteiraInvestimento.setSaldo(100.0f);
        try{
            carteiraInvestimento.resgatar(101.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor sacado é maior que o saldo", e.getMessage());
        }
    }
    @Test
    void naoDeveConseguirResgatarNegativo() {
        try{
            carteiraInvestimento.resgatar(-10.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Não é possível resgatar negativo ou 0", e.getMessage());
        }
    }
    @Test
    void naoDeveConseguirResgatarSaldoInsuficienteTaxa() {
        carteiraInvestimento.setSaldo(1000.0f);
        try{
            carteiraInvestimento.resgatar(999.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Não tem saldo para a taxa de saque", e.getMessage());
        }
    }
}