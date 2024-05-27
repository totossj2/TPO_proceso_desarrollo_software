package ControladorInformes;
import java.util.ArrayList;
import java.util.List;
import ControladorCurso.Curso;
import Docente.Docente;

public class ControladorInformes{

    private static ControladorInformes instance;

    private ControladorInformes() {
        // private constructor
    }

    public static ControladorInformes getInstance() {
        if (instance == null) {
            instance = new ControladorInformes();
        }
        return instance;
    }

    public void generarInforme(Curso curso, Docente docente, TipoDeInforme tipo ){
        List<Curso> cursosAsignados = docente.getCursosAsignados();
        FactoriaInforme factoriaInforme = new FactoriaInforme();
        Informe informe = factoriaInforme.generarInforme(tipo, cursosAsignados, curso);
        informe.generarInforme(curso, cursosAsignados);

    }
}