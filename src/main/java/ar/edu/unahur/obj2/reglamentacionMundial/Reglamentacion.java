package ar.edu.unahur.obj2.reglamentacionMundial;

public class Reglamentacion {
    private static Reglamentacion instance = new Reglamentacion();
    private Double graduacionReglamentaria = 0.1;

    private Reglamentacion(){
    }

//********************************************

    public static Reglamentacion getInstance() {
        return instance;
    }

    public Double getGraduacionReglamentaria() {
        return graduacionReglamentaria;
    }


    public void setGraduacionReglamentaria(Double graduacionNueva) {
        graduacionReglamentaria = graduacionNueva;
    }
}
