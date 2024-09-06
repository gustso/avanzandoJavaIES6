package ar.edu.ies6.model;

import java.time.LocalDate;

import ar.edu.ies6.util.Localidad;

public class Alumno {

	//atributos
	private String nombre;
	private String apellido;
	private LocalDate fechaNac;
	private Localidad localidad;
	
	//constructores
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre, String apellido, LocalDate fechaNac, Localidad localidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.localidad = localidad;
	}

	
	//métodos accesores
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + ", localidad="
				+ localidad + "]";
	}	
	
}
