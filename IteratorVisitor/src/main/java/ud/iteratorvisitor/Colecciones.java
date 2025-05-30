package ud.iteratorvisitor;

import java.util.*;

public class Colecciones {

    public static List<Estudiante> getEstudiantesArrayList() {
        List<Estudiante> lista = new ArrayList<>();
        lista.add(new Estudiante("20231020014", "Ana", "Calle 11 #12-45", null)); 
        lista.add(new Estudiante("E2001", "Luis", "Calle 2 #45-8", "12345"));     
        lista.add(new Estudiante("20241123456", "Carlos", "Cra 5 #23-99", "78945")); 
        return lista;
    }

    public static Set<Estudiante> getEstudiantesTreeSet() {
        Set<Estudiante> set = new TreeSet<>(Comparator.comparing(Persona::getCodigo));
        set.add(new Estudiante("20231234567", "Carla", null, "54321"));  
        set.add(new Estudiante("20239998888", "Pablo", "Calle 4", "98765")); 
        set.add(new Estudiante("1234", "Luisa", "Calle 99", "45678"));   
        return set;
    }

    public static List<Profesor> getProfesoresArrayList() {
        List<Profesor> lista = new ArrayList<>();
        lista.add(new Profesor("1234", "María", "Cra 10", "11111")); 
        lista.add(new Profesor("5678", "Jorge", "Cra 15", null));    
        lista.add(new Profesor("999", "Sandra", "Av 9", "55555"));   
        return lista;
    }

    public static Set<Profesor> getProfesoresTreeSet() {
        Set<Profesor> set = new TreeSet<>(Comparator.comparing(Persona::getCodigo));
        set.add(new Profesor("8888", "Lucía", "Av 20", "22222"));       
        set.add(new Profesor("7777", null, "Av 25", "33333"));          
        set.add(new Profesor("PROF", "Camilo", "Calle 77", "66666"));   
        return set;
    }
}
