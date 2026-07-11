package ar.edu.unahur.obj2.marcas;

import ar.edu.unahur.obj2.pais.Pais;
import ar.edu.unahur.obj2.reglamentacionMundial.Reglamentacion;

public abstract class CervezaDeGraduacionCalculada extends MarcaStrategy {

    public CervezaDeGraduacionCalculada(Double lupuloGr, Pais origen) {
        super(lupuloGr, origen);
    }

    // Template Method
    @Override
    public Double calcularGraduacion() {
        Double graduacionReglamentaria = Reglamentacion.getInstance().getGraduacionReglamentaria();
        Double valorMinimo = Math.min(graduacionReglamentaria, lupuloGr * 2);

        return calcularValor(valorMinimo);
    }

    // Hook del Template Method
    public abstract Double calcularValor(Double total);
}
