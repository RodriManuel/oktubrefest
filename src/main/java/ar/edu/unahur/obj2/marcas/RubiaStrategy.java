package ar.edu.unahur.obj2.marcas;

import ar.edu.unahur.obj2.pais.Pais;

public class RubiaStrategy extends MarcaStrategy {

    private final Double graduacionParticular;

    public RubiaStrategy(Double lupuloGr, Pais origen, Double graduacionParticular) {
        super(lupuloGr, origen);
        this.graduacionParticular = graduacionParticular;
    }

//********************************************

    @Override
    public Double calcularGraduacion() {
        return graduacionParticular;
    }
}
