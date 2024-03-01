package co.edu.uniquindio.Clases.builder1;

import co.edu.uniquindio.Clases.builder1.model.Personaje;
import co.edu.uniquindio.Clases.builder1.model.PersonajeBuilder;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nombre = pedirDatoString("Ingrese el nombre");
        String genero = pedirDatoString("Ingrese el tipo el genero");
        String raza = pedirDatoString("Ingrese la raza");
        String edad = pedirDatoString("Ingrese la edad");
        String peinado = pedirDatoString("Ingrese el tipo de peinado");

        Personaje personaje1 = Personaje.builder()
                .

        Personaje personaje2 = personaje(nombre, genero, raza, null, null);

    }

    private static String pedirDatoString(String mensaje){
        String dato = JOptionPane.showInputDialog(mensaje);
        return dato;
    }

    private static Personaje personaje(String nombre, String genero, String raza, String edad, String peinado){
        Personaje personaje = Personaje.builder()
                .nombre(nombre)
                .genero(genero)
                .raza(raza)
                .edad(edad)
                .tipoPeinado(peinado)
                .build();

        return personaje;
    }
}