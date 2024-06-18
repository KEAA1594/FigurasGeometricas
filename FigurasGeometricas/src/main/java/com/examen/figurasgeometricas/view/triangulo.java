package com.examen.figurasgeometricas.view;

import com.examen.figurasgeometricas.Controller.Ctriangulo;

/**
 *
 * @author Kevin
 */
public class triangulo extends javax.swing.JFrame {

    public triangulo() {
        initComponents();
        triangulo.this.lblLado1.setVisible(false);
        triangulo.this.lblLado2.setVisible(false);
        triangulo.this.txtFieldLado1.setVisible(false);
        triangulo.this.txtFieldLado2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtnEqui = new javax.swing.JRadioButton();
        rbtnIso = new javax.swing.JRadioButton();
        rbtnEsc = new javax.swing.JRadioButton();
        txtFieldAltura = new javax.swing.JTextField();
        lblAltura = new javax.swing.JLabel();
        lblBase = new javax.swing.JLabel();
        lblLado1 = new javax.swing.JLabel();
        lblLado2 = new javax.swing.JLabel();
        txtFieldBase = new javax.swing.JTextField();
        txtFieldLado1 = new javax.swing.JTextField();
        txtFieldLado2 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtFieldArea = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFieldPerimetro = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rbtnEqui.setText("Equilatero");
        rbtnEqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEquiActionPerformed(evt);
            }
        });

        rbtnIso.setText("Isoseles");
        rbtnIso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnIsoActionPerformed(evt);
            }
        });

        rbtnEsc.setText("Escaleno");
        rbtnEsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEscActionPerformed(evt);
            }
        });

        lblAltura.setText("Altura:");

        lblBase.setText("Base:");

        lblLado1.setText("Lado1:");

        lblLado2.setText("Lado2:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel5.setText("Area:");

        jLabel6.setText("Perimetro:");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo de Triangulo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(btnCalcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rbtnIso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtnEqui, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(rbtnEsc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLado1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFieldLado1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBase, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFieldBase, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtFieldPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLado2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldLado2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAltura)
                    .addComponent(jLabel7))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnEqui)
                    .addComponent(lblBase)
                    .addComponent(txtFieldBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnIso)
                    .addComponent(lblLado1)
                    .addComponent(txtFieldLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnEsc)
                    .addComponent(lblLado2)
                    .addComponent(txtFieldLado2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtFieldPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnRegresar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        triangulo.this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        triangulo.this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new figuras().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        String altura = triangulo.this.txtFieldAltura.getText();
        String base = triangulo.this.txtFieldBase.getText();
        String lado1 = triangulo.this.txtFieldLado1.getText();
        String lado2 = triangulo.this.txtFieldLado2.getText();
        if(!altura.equals("") && !base.equals("") && !lado1.equals("") && !lado2.equals("")){
            Ctriangulo triangulo = new Ctriangulo();
            double [] results = triangulo.operaciones(Double.parseDouble(altura),
                    Double.parseDouble(base),
                    Double.parseDouble(lado1),
                    Double.parseDouble(lado2));
            triangulo.this.txtFieldArea.setText(String.format("%.4f", results[0]));
            triangulo.this.txtFieldPerimetro.setText(String.format("%.4f", results[1]));
        }else if(!altura.equals("") && !base.equals("") && !lado1.equals("") && lado2.equals("")){
            Ctriangulo triangulo = new Ctriangulo();
            double [] results = triangulo.operaciones(Double.parseDouble(altura),
                    Double.parseDouble(base),
                    Double.parseDouble(lado1));
            triangulo.this.txtFieldArea.setText(String.format("%.4f", results[0]));
            triangulo.this.txtFieldPerimetro.setText(String.format("%.4f", results[1]));
        }else if(!altura.equals("") && !base.equals("") && lado1.equals("") && lado2.equals("")){
            Ctriangulo triangulo = new Ctriangulo();
            double [] results = triangulo.operaciones(Double.parseDouble(altura),
                    Double.parseDouble(base));
            triangulo.this.txtFieldArea.setText(String.format("%.4f", results[0]));
            triangulo.this.txtFieldPerimetro.setText(String.format("%.4f", results[1]));
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void rbtnEquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEquiActionPerformed
        triangulo.this.rbtnEsc.setSelected(false);
        triangulo.this.rbtnIso.setSelected(false);
        triangulo.this.lblLado1.setVisible(false);
        triangulo.this.lblLado2.setVisible(false);
        triangulo.this.txtFieldLado1.setVisible(false);
        triangulo.this.txtFieldLado2.setVisible(false);
    }//GEN-LAST:event_rbtnEquiActionPerformed

    private void rbtnIsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnIsoActionPerformed
        triangulo.this.rbtnEqui.setSelected(false);
        triangulo.this.rbtnEsc.setSelected(false);
        triangulo.this.lblLado1.setVisible(true);
        triangulo.this.lblLado2.setVisible(false);
        triangulo.this.txtFieldLado1.setVisible(true);
        triangulo.this.txtFieldLado2.setVisible(false);
    }//GEN-LAST:event_rbtnIsoActionPerformed

    private void rbtnEscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEscActionPerformed
        triangulo.this.rbtnEqui.setSelected(false);
        triangulo.this.rbtnIso.setSelected(false);
        triangulo.this.lblLado1.setVisible(true);
        triangulo.this.lblLado2.setVisible(true);
        triangulo.this.txtFieldLado1.setVisible(true);
        triangulo.this.txtFieldLado2.setVisible(true);
    }//GEN-LAST:event_rbtnEscActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblLado1;
    private javax.swing.JLabel lblLado2;
    private javax.swing.JRadioButton rbtnEqui;
    private javax.swing.JRadioButton rbtnEsc;
    private javax.swing.JRadioButton rbtnIso;
    private javax.swing.JTextField txtFieldAltura;
    private javax.swing.JTextField txtFieldArea;
    private javax.swing.JTextField txtFieldBase;
    private javax.swing.JTextField txtFieldLado1;
    private javax.swing.JTextField txtFieldLado2;
    private javax.swing.JTextField txtFieldPerimetro;
    // End of variables declaration//GEN-END:variables
}
