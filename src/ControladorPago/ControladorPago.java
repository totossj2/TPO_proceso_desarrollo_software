package ControladorPago;

import ControladorAlumno.ControladorAlumno;
import ControladorAlumno.Alumno;

import java.util.*;

public class ControladorPago {

    private static ControladorPago instance;

    private List<Pago> listaPagos;

    private ControladorPago() {
        controladorAlumno = ControladorAlumno.getInstance();
    }

    public static ControladorPago getInstance() {
        if (instance == null) {
            instance = new ControladorPago();
        }
        return instance;
    }

    ControladorAlumno controladorAlumno;

    public void guardarPago(Pago pago){
        listaPagos.add(pago);
    }//falta pulir

    public void pagar(Alumno alumno, MedioPago medioPago){
        Float monto = controladorAlumno.montoPagar(alumno.getLegajo());
        medioPago.Pagar(monto);
    }
}