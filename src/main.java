import ControladorCarrera.Carrera;
import ControladorCurso.ControladorCursos;
import ControladorCurso.Curso;
import ControladorAlumno.Alumno;
import ControladorInscripciones.ControladorInscripciones;
import ControladorMateria.Materia;
import ControladorMateria.ControladorMateria;
import ControladorAlumno.ControladorAlumno;
import ControladorPago.ControladorPago;
import ControladorPago.Binance;
import ControladorPago.PagoMisCuentas;
import ControladorPago.MedioPago;
import ControladorPago.MercadoPago;
import ControladorInformes.ControladorInformes;
import Docente.Docente;
import ControladorInformes.FactoriaInforme;
import ControladorInformes.TipoDeInforme;
import ControladorInformes.Informe;




public class main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Comenzamos el testing: ");
        System.out.println();
        //Creacion de alumnos
        Alumno alumno1 = new Alumno(1,"Juan", "juanpedro@gmail.com", 452311314);
        Alumno alumno2 = new Alumno(2,"Pedro", "pedro@gmail.com",452311222);

        //Creacion de materias
        Materia programacionI = new Materia(1, "Programacion I", 40, "Programacion II", null);
        Materia programacionII = new Materia(2, "Programacion II", 42,"Programacion III", programacionI);
        Materia programacionIII = new Materia(3, "Programacion III", 45, null, programacionII);
        Materia calculoI = new Materia(4, "Calculo I", 35, null, null);

        //Creacion de carrera
        Carrera carrera = new Carrera("Ingenieria en Sistemas", 5, 120);

        ControladorMateria controladorMateria = ControladorMateria.getInstance();

        //Agrego materias a la carrera
        controladorMateria.agregarMateria(programacionI);
        controladorMateria.agregarMateria(programacionII);
        controladorMateria.agregarMateria(programacionIII);
        controladorMateria.agregarMateria(calculoI);

        ControladorCursos controladorCursos = ControladorCursos.getInstance();
        ControladorAlumno controladorAlumno = ControladorAlumno.getInstance();
        ControladorPago controladorPago = ControladorPago.getInstance();

        //Agrego alumnos
        controladorAlumno.agregarAlumno(alumno1);
        controladorAlumno.agregarAlumno(alumno2);

        //Materia aprobada por x alumno
        controladorAlumno.aprobarMateria(1, "Programacion I");

        //Agregamos cursos y asignamos docentes
        Curso curso1 = new Curso(1, 1, "Aula 1", "14:00-17:00", "Programacion I","Mañana","Lunes","30");
        controladorCursos.addCurso(curso1);
        Docente tua = new Docente("David", "Tua",12345678,"Mañana");
        tua.asignarDocente(curso1);

        Curso curso2 = new Curso(2, 2, "Aula 2", "18:00-20:00", "Programacion II","Noche","Martes","25");
        controladorCursos.addCurso(curso2);
        Docente aquino = new Docente("Felipe", "De Aquino",421231223,"Noche");
        tua.asignarDocente(curso2);

        Curso curso3 = new Curso(3, 3, "Aula 1", "18:00-20:00", "Programacion III","Tarde","Miercoles","20");
        controladorCursos.addCurso(curso3);
        Docente wehbe = new Docente("Ricardo", "Wehbe",427231223,"Mañana");
        wehbe.asignarDocente(curso3);

        Curso curso4 = new Curso(4, 4, "Aula 2", "14:00-17:00","Calculo I","Mañana","Jueves","40");
        controladorCursos.addCurso(curso4);
        Docente edga = new Docente("Edgardo", "Crespo",427211223,"Tarde");
        edga.asignarDocente(curso4);


        tua.getCursosAsignados();
        System.out.println("Mostramos el cronograma de cursos de un profesor");
        tua.getCronograma(); //Debe generar el cronograma
        System.out.println();

        System.out.println("Generamos informes:");
        ControladorInformes controladorInformes = ControladorInformes.getInstance();
        //controladorInformes.generarInforme(tua); //Debe generar informe de los dos materias a las que se encuentra inscrpto
        System.out.println();

        controladorAlumno.aprobarMateria(1, "Programacion I");

        ControladorInscripciones controladorInscripciones = ControladorInscripciones.getInstance();
        System.out.println("Registramos inscripciones: ");
        controladorInscripciones.inscribirse(1, 2); //Devuelve que se inscribio
        controladorInscripciones.inscribirse(1, 3); //Devuelve que no pudo inscribir
        controladorInscripciones.inscribirse(1, 4); //Devuelve que se inscribio
        System.out.println();

        System.out.println("Registramos el pago: ");
        MedioPago binance = new Binance("0x21");
        controladorPago.pagar(alumno1, binance); //Devuelve el monto total de cuanto se pago por todas las materias inscriptas


        System.out.println("Generar informe en PDF");


        controladorInformes.generarInforme(curso3, wehbe, TipoDeInforme.PDF);
    }
}