package ar.edu.unahur.obj2.personas;

import ar.edu.unahur.obj2.marcas.MarcaStrategy;

public class Checo extends Persona {

    public Checo(Double peso, Boolean escuchaMusicaTradicional, Double nivelDeAguante) {
        super(peso, escuchaMusicaTradicional, nivelDeAguante);
    }

//********************************************    

    @Override
    public Boolean leGustaLaMarca(MarcaStrategy cerveza) {
        return cerveza.calcularGraduacion() > 8.0;
    }
}
