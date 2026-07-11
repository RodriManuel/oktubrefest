package ar.edu.unahur.obj2.marcas;

import ar.edu.unahur.obj2.pais.Pais;

public class NegraStrategy extends CervezaDeGraduacionCalculada {

    public NegraStrategy(Double lupuloGr, Pais origen) {
        super(lupuloGr, origen);
    }

    @Override
    public Double calcularValor(Double total) {
        return total;
    }

}
