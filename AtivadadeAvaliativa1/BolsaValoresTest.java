package Class;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BolsaValoresTest {

    CarteiraInvestimento carteiraInvestimento;
    @BeforeEach
    void setUp() {
        carteiraInvestimento = new BolsaValores();
    }

    @Test
    void deveConseguirInvestir() {
        carteiraInvestimento.setSaldo(100.0f);
        carteiraInvestimento.investir(100.0f);
        assertEquals(150.0f, carteiraInvestimento.getSaldo());
    }
    @Test
    void naoDeveConseguirInvestir() {
        carteiraInvestimento.setSaldo(49.0f);
        try{
            carteiraInvestimento.investir(51.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Não possui saldo suficiente para taxa", e.getMessage());
        }
    }
    @Test
    void naoDeveConseguirInvestirNegativo() {
        try{
            carteiraInvestimento.investir(-10.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Não é possível investir negativo ou 0", e.getMessage());
        }
    }

    @Test
    void deveConseguirResgatar() {
        carteiraInvestimento.setSaldo(100.0f);
        carteiraInvestimento.resgatar(100.0f);
        assertEquals(0.0f, carteiraInvestimento.getSaldo());
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
}