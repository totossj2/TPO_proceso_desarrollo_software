package Docente;

import ControladorCurso.ControladorCursos;
import ControladorCurso.Curso;
import ControladorInformes.ControladorInformes;
import ControladorInformes.ControladorInformes;
import java.util.ArrayList;
import java.util.List;

public class Docente{

    private String nombre;
    private String apellido;
    private int legajo;
    private ControladorCursos controladorCursos = ControladorCursos.getInstance();
    private ControladorInformes controladorInformes = ControladorInformes.getInstance();
    private List<Curso> cursosAsignados = new ArrayList();
    private List<String> Disponibilidad;
    private String preferencias;

    public Docente(String nombre, String apellido, int legajo,String preferencias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public void asignarDocente(Curso curso) {
        controladorCursos.asignarDocente(curso, this.legajo);
        cursosAsignados.add(curso);
    }

    public List<Curso> getCursosAsignados() {
        return cursosAsignados;

    }

    public void getCronograma() {
        System.out.println("Cronograma semanal de cursos.");
    }


    public List<String> getDisponibilidad() {
        return Disponibilidad;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getPreferencias() {
        return preferencias;
    }
}

