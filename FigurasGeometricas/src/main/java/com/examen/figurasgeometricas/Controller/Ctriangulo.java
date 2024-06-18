 package com.examen.figurasgeometricas.Controller;

import com.examen.figurasgeometricas.model.Mtriangulo;

/**
 *
 * @author Kevin
 */
public class Ctriangulo {
    
    public double [] operaciones(double base,double altura){
        Mtriangulo triangulo = new Mtriangulo(base,altura);
        double []results = {triangulo.Area(),triangulo.Perimetro()};
        return results;
    }
    public double [] operaciones(double base,double altura,double lado1){
        Mtriangulo triangulo = new Mtriangulo(base,altura);
        double []results = {triangulo.Area(),triangulo.Perimetro(lado1)};
        return results;
    }
    public double [] operaciones(double base,double altura,double lado1,double lado2){
        Mtriangulo triangulo = new Mtriangulo(base,altura);
        double []results = {triangulo.Area(),triangulo.Perimetro(lado1,lado2)};
        return results;
    }
}
