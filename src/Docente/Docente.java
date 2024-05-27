package Docente;

import ControladorCurso.ControladorCursos;
import ControladorCurso.Curso;
import ControladorInformes.ControladorInformes;
import ControladorInformes.ControladorInformes;
import java.util.ArrayList;
import java.util.List;
import ControladorCurso.Turnos;

public class Docente{

    private String nombre;
    private String apellido;
    private int legajo;
    private ControladorCursos controladorCursos = ControladorCursos.getInstance();
    private ControladorInformes controladorInformes = ControladorInformes.getInstance();
    private List<Curso> cursosAsignados = new ArrayList();
    private List<String> Disponibilidad;
    private Turnos preferencia;

    public Docente(String nombre, String apellido, int legajo,Turnos preferencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.preferencia = preferencia;
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

    public Turnos getPreferencia() {
        return preferencia;
    }

    public String getNombre(){
        return nombre +" " +apellido;
    }
}

