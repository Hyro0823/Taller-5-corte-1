package poo;

public class Carro {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	int peso_total;
	boolean asientos_cuero, climatizador;
	
	String color;
	public Carro() {
		ruedas = 4;
		largo = 4000;
		ancho = 1800;
		motor = 1600;
		peso_plataforma = 500;
		
	}
	public String dime_largo() {
		return "el largo del coche es: " + largo;
	}
	public void determine_color() {
		
		color= "azul";
	}
	
	public String dime_color() {
		return "el color del automovil es: " + color;
	}
}
