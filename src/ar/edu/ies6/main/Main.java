package ar.edu.ies6.main;

import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.
import java.util.List;

import ar.edu.ies6.model.Alumno;
import ar.edu.ies6.util.ListadoAlumnos;
import ar.edu.ies6.util.Localidad;

public class Main {
	
	public static void main(String[] args) {
		//nada o casi nada
		//usando el constructor por defecto
		Alumno unAlumno = new Alumno();
		unAlumno.setApellido("Sosa");
		unAlumno.setNombre("Gustavo");
		unAlumno.setFechaNac(LocalDate.now());
		unAlumno.setLocalidad(Localidad.LOS_LAPACHOS);
		
		//constructor con parámetros
		Alumno otroAlumno = new Alumno("Gustavo","Sosa",LocalDate.now(),Localidad.MONTERRICO);
		
		System.out.println(unAlumno.toString());
		System.out.println(otroAlumno.toString());
		
		//almacen de datos TEMPORARIO
		//arreglo
		Alumno[] alumnos = new Alumno[10]; 
		
		//vector de tipo Lista		
		//List<Alumno> almacenDeAlumnos = new ArrayList<Alumno>();
		
		ListadoAlumnos.almacenDeAlumnos.add(unAlumno);
		//almacenDeAlumnos.add(unAlumno);
		ListadoAlumnos.almacenDeAlumnos.add(otroAlumno);
		//almacenDeAlumnos.add(otroAlumno);
		ListadoAlumnos.almacenDeAlumnos.add(new Alumno("Juan","Perez", LocalDate.now(),Localidad.PERICO));
		//almacenDeAlumnos.add(new Alumno("Juan","Perez", LocalDate.now(),Localidad.PERICO));
		//System.out.println(almacenDeAlumnos);
		int tamano = ListadoAlumnos.almacenDeAlumnos.size();
		System.out.println("El almancen tiene: "+ tamano +" objetos");
		
		for(int i = 0; i < tamano; i++) {
			//System.out.println(ListadoAlumnos.almacenDeAlumnos.get(i).toString());
			System.out.println(ListadoAlumnos.almacenDeAlumnos.get(i).getLocalidad());
		}
		
		//for ( a: ListadoAlumnos.almacenDeAlumnos.)
		//ListadoAlumnos.almacenDeAlumnos.forEach(p -> ());
		
	}

}
