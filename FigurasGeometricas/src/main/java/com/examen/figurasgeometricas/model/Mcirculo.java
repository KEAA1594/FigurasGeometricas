package com.examen.figurasgeometricas.model;

/**
 *
 * @author Kevin
 */
public  class Mcirculo extends FiguraGeometrica{
    final private double PI = Math.PI;
    private double radio;
    
    public Mcirculo(double radio){
        this.radio = radio;
    }
    
    public double Area() {
        return PI*Math.pow(radio,2);
    }
    
    public double Perimetro(){
        return 2*PI*radio;
    }

}
