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
        List<String> excel = new ArrayList();
        for(Curso iterador : cursosAsignados){
            if(iterador.getNombre().equals(curso.getNombre())){
                String horario = iterador.getHorario();
                String aulaAsignada = iterador.getAulaAsignada();
                String cantAlumnos = iterador.getCantAlumnos();
                excel.add(iterador.getNombre());
                excel.add(horario);
                excel.add(aulaAsignada);
                excel.add(cantAlumnos);
            }
        }
        leerExcel(excel);

    }

    private void leerExcel(List<String> excel){
        for (String string : excel) {
            System.out.println(string);
        }
    }
}