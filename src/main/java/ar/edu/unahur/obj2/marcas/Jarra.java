package ar.edu.unahur.obj2.marcas;

public class Jarra {
    private Double litrosDeCerveza;
    private MarcaStrategy marcaDeCerveza;

    public Jarra(Double litrosDeCerveza, MarcaStrategy marcaDeCerveza) {
        this.litrosDeCerveza = litrosDeCerveza;
        this.marcaDeCerveza = marcaDeCerveza;
    }

//********************************************

    public Double getLitrosDeCerveza() {
        return litrosDeCerveza;
    }

    public MarcaStrategy getMarcaDeCerveza() {
        return marcaDeCerveza;
    }

//********************************************

    public Double calcularContenidoDeAlcohol() {
        return litrosDeCerveza * marcaDeCerveza.calcularGraduacion();
    }
}
