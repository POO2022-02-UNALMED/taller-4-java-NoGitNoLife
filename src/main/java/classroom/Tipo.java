package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);  /// no existe constructor Tipo(int), debe agregarse nombre o quitarlo en constructor
														   ///DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	private int codigo;  ///private int codigo;
	///private String nombre;
	
	Tipo(int codigo) {    ///constructor en modo publico, debe ser privado  
													/// public Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		///this.nombre = nombre;
	}
}
