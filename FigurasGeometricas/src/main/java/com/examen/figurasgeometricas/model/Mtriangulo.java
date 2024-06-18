package com.examen.figurasgeometricas.model;

/**
 *
 * @author Kevin
 */
public class Mtriangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Mtriangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double Perimetro() {
        return base*3;
    }
    
    public double Perimetro(double l) {
        return (l*2)+base;
    }
    
    public double Perimetro(double l1,double l2) {
        return l1+l2+base;
    }

    public double Area() {
        return base*altura/2;
    }
}
