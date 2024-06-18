package com.examen.figurasgeometricas.model;

/**
 *
 * @author Kevin
 */
public class Mrectangulo extends FiguraGeometrica{
    private double altura;
    private double base;

    public Mrectangulo(double altura,double base) {
        this.altura = altura;
        this.base = base;
    }
    
    public double Area() {
        return base*altura;
    }
    
    public double Perimetro(){
        return (2*base)+(2*altura);
    }
}
