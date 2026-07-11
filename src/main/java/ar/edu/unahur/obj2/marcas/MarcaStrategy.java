package ar.edu.unahur.obj2.marcas;

import ar.edu.unahur.obj2.pais.Pais;

public abstract class MarcaStrategy {
    protected Double lupuloGr;
    protected Pais origen;
    
    public MarcaStrategy(Double lupuloGr, Pais origen) {
        this.lupuloGr = lupuloGr;
        this.origen = origen;
    }

//********************************************

    public Double getLupuloGr() {
        return lupuloGr;
    }

    public Pais getOrigen() {
        return origen;
    }
    
//********************************************
    
    public abstract Double calcularGraduacion();
}
