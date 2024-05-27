package Docente;

import ControladorCurso.Curso;
import ControladorCurso.Turnos;

import java.util.List;

public class Cronograma {
    /**
    protected Curso curso;
    protected Docente docente;
    private List<Cronograma> cronograma;
    private List<Docente> docentes;
    private List<Curso> cursos;

    public List<Cronograma> getCronograma() {
        return cronograma;
    }

    public boolean chequearDisponibilidad(List<String> Disponibilidad, String turno) {
        return Disponibilidad.contains(turno);
    }

    public boolean verificarPreferencia(Turnos turno, int legajo) {
        for (Docente docente : docentes) {
            if (docente.getLegajo() == legajo) {
                return (docente.getPreferencias() == turno);
            }
        }
        return false;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void asignarCursosXDocente(Curso curso, Docente docente){
        for (Docente d: docentes){
            if(docente.getLegajo() == docente.getLegajo()) {
                if (!docente.getPreferencias().contains(curso.getTurno().name())) {
                    docente.getCursosAsignados().add(curso);
                    return;
                } else {
                    System.out.println("No es preferencia del docente");
                }
            } else {
                System.out.println("No se encontro ese docente");
            }
        }
    }**/

    private Docente docente;
    private Curso curso;
    private boolean cumplePreferencia;

    public Cronograma(Docente docente, Curso curso) {
        this.docente = docente;
        this.curso = curso;
        preferencia = docente.getPreferencia();
        horario = curso.getTurno();
        setCumplePreferencia(docente, curso);
    }

    Turnos preferencia;

    Turnos horario;

    public void setCumplePreferencia(Docente docente, Curso curso) {
        if (docente.getPreferencia() != curso.getTurno()) {
            cumplePreferencia = false ;
        }
        cumplePreferencia = true;
    }

    public void printCronograma (){
        System.out.println("Cronograma de curso: " + curso.getNombre() + " " + curso.getTurno() + " Docente: "+docente.getNombre());
    }


}

