package classroom;

public class Asignatura {

    String nombre;
    String n = nombre;
    int codigoInterno;
    int codigoExterno;
    Tipo tipo;

    Asignatura() {
        this("Sin nombre",Tipo.FUNDAMENTACION);
        /// sobra
        ///this(0);
    }

  ///  Asignatura(int codigoInterno,Tipo tipo) {					   ///2 recibe lo mismo que 3 (int, tipo)
  ///      this("Sin nombre", codigoInterno, 0,tipo);
  ///  }

    Asignatura(int codigoExterno,Tipo tipo) {                   ///3 recibe lo mismo que 2 (int, tipo)
        this("Sin nombre", 0, codigoExterno,tipo);
    }

    Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0,tipo);
    }

    Asignatura(String nombre, int codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    void cambiarDatos(int codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    void cambiarDatos(int codigoInterno) {      /// 4 igual que antes, recibe lo mismo que 5
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoInterno;
    }

///    void cambiarDatos(int codigoExterno) {   /// 5 igual que antes, recibe lo mismo que 4
///        this.codigoExterno = codigoExterno;
///    }

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
