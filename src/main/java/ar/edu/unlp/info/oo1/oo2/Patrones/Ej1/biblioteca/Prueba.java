package ar.edu.unlp.info.oo1.oo2.Patrones.Ej1.biblioteca;

public class Prueba {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		System.out.println(biblioteca.exportarSocios());
	}
}
