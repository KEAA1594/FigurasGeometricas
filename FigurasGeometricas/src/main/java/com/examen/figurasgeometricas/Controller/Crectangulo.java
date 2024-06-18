package com.examen.figurasgeometricas.Controller;

import com.examen.figurasgeometricas.model.Mrectangulo;

/**
 *
 * @author Kevin
 */
public class Crectangulo {
    public double [] operaciones(double altura,double base){
        Mrectangulo rectangulo = new Mrectangulo(altura,base);
        
        double [] results = {rectangulo.Area(),rectangulo.Perimetro()};
        return results;
    }
}
