package ControladorPago;

public class Binance implements MedioPago{
    public Binance(String wallet) {
        this.wallet = wallet;
    }

    private String wallet;

    public void Pagar(Float monto) {
        System.out.println("Se realizo un pago por Binance de: "+monto+"hacia la wallet: "+wallet);
    }
}
