package ar.edu.unahur.obj2.personas;

import ar.edu.unahur.obj2.marcas.MarcaStrategy;

public class Belga extends Persona {

    public Belga(Double peso, Boolean escuchaMusicaTradicional, Double nivelDeAguante) {
        super(peso, escuchaMusicaTradicional, nivelDeAguante);
    }

//********************************************

    @Override
    public Boolean leGustaLaMarca(MarcaStrategy cerveza) {
        return cerveza.getLupuloGr() > 4.0;
    }
}
