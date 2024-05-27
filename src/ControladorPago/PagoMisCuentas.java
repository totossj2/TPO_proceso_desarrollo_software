package ControladorPago;

public class PagoMisCuentas implements MedioPago{

    public PagoMisCuentas(int codigo) {
        this.codigo = codigo;
    }

    private int codigo;

    private int monto;

    public void Pagar(Float monto) {
        System.out.println("Se realizo un pago por PagoMisCuentas de: "+monto+"hacia el codigo: "+codigo);
    }
}
