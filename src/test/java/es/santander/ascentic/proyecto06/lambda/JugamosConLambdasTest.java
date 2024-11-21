package es.santander.ascentic.proyecto06.lambda;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JugamosConLambdasTest {
    private List<Datos> ListaATransformar;

    @BeforeEach
    public void setup() {
        ListaATransformar = new ArrayList<>();
        ListaATransformar.add(new Datos(3,"Juan"));
        ListaATransformar.add(new Datos(80, "Antonio"));
    }
    // @Test
    // public void testTransformarSinLambdas(){
    //     ListaATransformar.forEach(new Consumer<Datos>() {
        
    //         @Override
    //         public void accept(Datos dato) {
    //             dato.setEdad(dato.getEdad() * 3);
                
    //         }
    //     });
    @Test
    public void testTransformarConLambdas(){
        ListaATransformar.forEach( 
            (dato)-> dato.setEdad(dato.getEdad() * 3)
        );
        assertEquals(ListaATransformar.get(0).getEdad(), 9);
        assertEquals(ListaATransformar.get(1).getEdad(), 240);
    }
}
