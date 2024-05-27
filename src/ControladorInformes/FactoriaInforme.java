package ControladorInformes;
import ControladorCurso.Curso;

import java.util.List;

public class FactoriaInforme {
    public Informe generarInforme(TipoDeInforme tipoDeInforme, List<Curso> cursosAsignados, Curso curso){
        return switch (tipoDeInforme) {
            case PDF -> new PDF(curso, cursosAsignados);
            case Excel -> new Excel(curso, cursosAsignados);
        };
    }
}
