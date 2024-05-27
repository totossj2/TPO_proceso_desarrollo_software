package ControladorPago;

import java.util.*;

public class MercadoPago implements MedioPago{

    public MercadoPago( int cvu, String alias) {
        this.cvu = cvu;
        this.alias = alias;
    }

    private int cvu;

    private String alias;

    public void Pagar(Float monto) {
        System.out.println("El monto" + monto + "fue pagado con Mercado Pago hacia el alias: "+alias);
    }

}