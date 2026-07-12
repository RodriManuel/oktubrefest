package ar.edu.unahur.obj2.personas;

import ar.edu.unahur.obj2.marcas.MarcaStrategy;

public class Aleman extends Persona {

    public Aleman(Double peso, Boolean escuchaMusicaTradicional, Double nivelDeAguante) {
        super(peso, escuchaMusicaTradicional, nivelDeAguante);
    }

//********************************************    

    @Override
    public Boolean leGustaLaMarca(MarcaStrategy cerveza) {
        return Boolean.TRUE;
    }
}
