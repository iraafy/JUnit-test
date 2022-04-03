import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SistemBankTest {
    @Test
    public void testDeposit() {
        SistemBank b = new SistemBank();
        b.Deposit(5);
        b.Deposit(7);

        Float expectedResult = 62f;
        assertEquals((Float) expectedResult, (Float) b.saldo);
    }

    @Test
    public void testTarikTunai() {
        SistemBank b = new SistemBank();
        b.Deposit(5);
        b.TarikTunai(4);
        b.Deposit(5);

        Float expectedResult = 56f;

        assertEquals((Float) expectedResult, (Float) b.saldo);
    }
}