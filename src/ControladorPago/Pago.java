package ControladorPago;

import java.util.*;

public class Pago implements MedioPago{

    private MedioPago medioPago;

    public Pago() {
    }

    public Pago(MedioPago medioPago) {
        this.medioPago = medioPago;
    }

    private float monto;

    public void Pagar(Float monto) {
        medioPago.Pagar(monto);
    }

}

