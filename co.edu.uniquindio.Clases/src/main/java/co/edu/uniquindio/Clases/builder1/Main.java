package co.edu.uniquindio.Clases.builder1;

import co.edu.uniquindio.Clases.builder1.model.Personaje;
import co.edu.uniquindio.Clases.builder1.model.PersonajeBuilder;

public class Main {
    public static void main(String[] args) {

        personaje();

    }

    private static void personaje(){

        Personaje elfo = Personaje.builder()
                .nombre("Korzo")
                .genero("Masculino")
                .edad("28")
                .tipoPeinado("Cresta")
                .raza("Elfo")
                .build();

        Personaje enano = Personaje.builder()
                .nombre("Trozard")
                .edad("200")
                .raza("Enano")
                .build();
    }
}