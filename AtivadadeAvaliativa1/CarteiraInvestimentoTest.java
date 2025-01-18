package Class;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarteiraInvestimentoTest {

    CarteiraInvestimento carteiraInvestimento;

    @BeforeEach
    void setUp(){
        carteiraInvestimento = new BolsaValores();
    }

    @Test
    void testeSetNegativo() {

        try{
            carteiraInvestimento.setSaldo(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Saldo não pode ser negativo", e.getMessage());
        }
    }
}