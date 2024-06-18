package com.examen.figurasgeometricas.Controller;

import com.examen.figurasgeometricas.model.Mcirculo;

/**
 *
 * @author Kevin
 */
public class Ccirculo {
    public double [] operaciones(double radio){
        Mcirculo circ = new Mcirculo(radio);
        double area = circ.Area();
        double perimetri = circ.Perimetro();
        double [] results = {circ.Area(),circ.Perimetro()};
        return results;
    }
}
