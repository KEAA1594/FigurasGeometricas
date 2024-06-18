package com.examen.figurasgeometricas;

import com.examen.figurasgeometricas.view.figuras;

/**
 *
 * @author Kevin
 */
public class FigurasGeometricas {

    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new figuras().setVisible(true);
            }
        });
    }
}
