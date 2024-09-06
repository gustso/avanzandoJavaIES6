package ar.edu.ies6.main;

import java.time.LocalDate;

import ar.edu.ies6.model.Alumno;
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
	}

}
