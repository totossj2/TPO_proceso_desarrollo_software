package ControladorInformes;

import ControladorCurso.Curso;

import java.util.ArrayList;
import java.util.List;

public class PDF implements Informe {

    public PDF (Curso curso,List<Curso> cursosAsignados ){
        Curso cursoActual = curso;
        List<Curso> CursosAsignados = cursosAsignados;
    }

    @Override
    public void generarInforme(Curso curso, List<Curso> cursosAsignados) {
        List<String> pdf = new ArrayList();
        for(Curso iterador : cursosAsignados){
            if(iterador.getNombre().equals(curso.getNombre())){
                String horario = iterador.getHorario();
                String aulaAsignada = iterador.getAulaAsignada();
                String cantAlumnos = iterador.getCantAlumnos();
                pdf.add(iterador.getNombre());
                pdf.add(horario);
                pdf.add(aulaAsignada);
                pdf.add(cantAlumnos);
            }
        }
        leerPDF(pdf);

    }

    private void leerPDF(List<String> pdf){
        for (String string : pdf) {
            System.out.println(string);
        }
    }
}