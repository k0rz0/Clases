package co.edu.uniquindio.Clases.builder1.model;

public class PersonajeBuilder {
    protected String nombre;
    protected String raza;
    protected String edad;
    protected String tipoPeinado;
    protected String genero;

    public PersonajeBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    public PersonajeBuilder raza(String raza){
        this.raza = raza;
        return this;
    }
    public PersonajeBuilder edad(String edad){
        this.edad = edad;
        return this;
    }
    public PersonajeBuilder tipoPeinado(String tipoPeinado){
        this.tipoPeinado = PersonajeBuilder.this.tipoPeinado;
        return this;
    }
    public PersonajeBuilder genero(String genero){
        this.genero = genero;
        return this;
    }
    public Personaje build(){
        return new Personaje(nombre, raza, edad, tipoPeinado, genero);
    }

}
