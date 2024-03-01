package co.edu.uniquindio.Clases.builder1.model;

public class Personaje {

    private String nombre;
    private String raza;
    private String edad;
    private String tipoPeinado;
    private String genero;

    public Personaje() {
    }

    public Personaje(String nombre,
                     String raza,
                     String edad,
                     String tipoPeinado,
                     String genero) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tipoPeinado = tipoPeinado;
        this.genero = genero;
    }

    public static PersonajeBuilder builder() {return new PersonajeBuilder();}

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getEdad() {
        return edad;
    }

    public String getTipoPeinado() {
        return tipoPeinado;
    }

    public String getGenero() {
        return genero;
    }
}
