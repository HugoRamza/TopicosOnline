package parcial2.hilosbanco;

public class CuentaBanco {

    // Saldo Inicial de la cuenta de 100 pesos
    private int saldo = 100;

    // Metodo para obtener el saldo de la cuenta
    // regresa el saldo
    public int Saldo() {
        return saldo;
    }

    // Metodo para hacer un retiro de la cuenta
    public void Retiro(int cantidad) {
        saldo = saldo - cantidad;
    }
}
