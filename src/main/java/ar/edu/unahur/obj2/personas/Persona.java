package ar.edu.unahur.obj2.personas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.marcas.Jarra;
import ar.edu.unahur.obj2.marcas.MarcaStrategy;

public abstract class Persona {
    protected Double peso;
    protected Boolean escuchaMusicaTradicional;
    protected Double nivelDeAguante;
    protected List<Jarra> jarrasConsumidas = new ArrayList<>();

    public Persona(Double peso, Boolean escuchaMusicaTradicional, Double nivelDeAguante) {
        this.peso = peso;
        this.escuchaMusicaTradicional = escuchaMusicaTradicional;
        this.nivelDeAguante = nivelDeAguante;
    }

//********************************************

    public Double getPeso() {
        return peso;
    }

    public Boolean getEscuchaMusicaTradicional() {
        return escuchaMusicaTradicional;
    }

    public Double getNivelDeAguante() {
        return nivelDeAguante;
    }

//********************************************

    public Boolean estaEbria() {
        Double alcoholEnSangre = jarrasConsumidas.stream()
                                                 .mapToDouble(Jarra::calcularContenidoDeAlcohol)
                                                 .sum();

        return (alcoholEnSangre * peso) > nivelDeAguante; 
    }

    public abstract Boolean leGustaLaMarca(MarcaStrategy cerveza);
}
