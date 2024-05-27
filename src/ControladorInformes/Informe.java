package ControladorInformes;

import ControladorCurso.Curso;

import java.util.List;

public interface Informe {

    void generarInforme(Curso curso, List<Curso> cursosAsignados);
}
