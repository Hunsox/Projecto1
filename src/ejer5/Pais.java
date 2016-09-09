package ejer5;

import java.util.Date;
/**
 * La clase Pais representa un pais en el sistema
 * @author Diego Carrasco
 * @version 1.0 08/09/2016
 *
 */
public class Pais {

	private String nombre;
	private Integer Habitantes;
	private Integer metrosCuadrados;
	private Date fechaIndependencia;
	/**
	 * Contructor con todos los parametros
	 * @param nombre
	 * @param habitantes
	 * @param metrosCuadrados
	 * @param fechaIndependencia
	 */
	public Pais(String nombre, Integer habitantes, Integer metrosCuadrados, Date fechaIndependencia) {
		super();
		this.nombre = nombre;
		Habitantes = habitantes;
		this.metrosCuadrados = metrosCuadrados;
		this.fechaIndependencia = fechaIndependencia;             
		
		
	}
	public Pais() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getHabitantes() {
		return Habitantes;
	}
	public void setHabitantes(Integer habitantes) {
		Habitantes = habitantes;
	}
	public Integer getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(Integer metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	public Date getFechaIndependencia() {
		return fechaIndependencia;
	}
	public void setFechaIndependencia(Date fechaIndependencia) {
		this.fechaIndependencia = fechaIndependencia;
	}
	
	/**
	 * Funcion impresion realiza la impresion del eastado del objeto
	 * @return valor String del estado del objeto
	 */
	public String impresion (){
		return "el pais tiene "+this.nombre;
	}
}
