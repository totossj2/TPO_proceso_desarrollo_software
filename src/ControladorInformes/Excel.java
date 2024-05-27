package ControladorInformes;
import java.util.ArrayList;
import java.util.List;
import ControladorCurso.Curso;

public class Excel implements Informe {

    public Excel (Curso curso,List<Curso> cursosAsignados ){
        Curso cursoActual = curso;
        List<Curso> CursosAsignados = cursosAsignados;
    }


    @Override
    public void generarInforme(Curso curso, List<Curso> cursosAsignados) {
        List<String> informe = new ArrayList();
        for(Curso iterador : cursosAsignados){
            if(iterador.getNombre().equals(curso.getNombre())){
                String horario = iterador.getHorario();
                String aulaAsignada = iterador.getAulaAsignada();
                String cantAlumnos = iterador.getCantAlumnos();
                informe.add(iterador.getNombre());
                informe.add(horario);
                informe.add(aulaAsignada);
                informe.add(cantAlumnos);
            }
        }
        leerPDF(informe);
    }


    private void leerPDF(List<String> pdf){
        for (String string : pdf) {
            System.out.println(string);
        }
    }
}
