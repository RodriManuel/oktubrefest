package ar.edu.unahur.obj2.marcas;

import ar.edu.unahur.obj2.pais.Pais;

public class RojaStrategy extends CervezaDeGraduacionCalculada {

    public RojaStrategy(Double lupuloGr, Pais origen) {
        super(lupuloGr, origen);
    }

    @Override
    public Double calcularValor(Double total) {
        return total * 1.25;
    }
}
